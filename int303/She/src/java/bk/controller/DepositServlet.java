/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bk.controller;

import bk.controller.exceptions.NonexistentEntityException;
import bk.controller.exceptions.RollbackFailureException;
import bk.model.Account;
import bk.model.History;
import bk.model.controller.AccountJpaController;
import bk.model.controller.HistoryJpaController;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

/**
 *
 * @author Krittapak
 */
public class DepositServlet extends HttpServlet {
@PersistenceUnit(unitName = "ShePU")
EntityManagerFactory emf;

@Resource
UserTransaction utx;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("Login")==null) {
            response.sendRedirect("Login");
            return;
        }
        request.setAttribute("msg", "");
        HttpSession session = request.getSession(false);
        Account ac=(Account) session.getAttribute("Login");
        
        if (request.getParameter("deposit")!=null) {
            int deposit=parseInt(request.getParameter("deposit"));
            
            AccountJpaController ajc= new AccountJpaController(utx, emf);
            Account acc=ajc.findAccount(ac.getAccountid());
            acc.setBalance(deposit+ac.getBalance());
            
            HistoryJpaController hjc=new HistoryJpaController(utx, emf);
            History his=new History(hjc.getHistoryCount()+1);
            his.setAccountid(acc);
            his.setAmount(deposit);
            his.setBalance(acc.getBalance());
            his.setMethod("deposit");
            his.setTime(new Date());
            
            try {
                ajc.edit(acc);
                hjc.create(his);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(DepositServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RollbackFailureException ex) {
                Logger.getLogger(DepositServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(DepositServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("msg", "deposited");
            session.setAttribute("Login", acc);
            getServletContext().getRequestDispatcher("/MyAccount").forward(request, response);
            
        }
        
        getServletContext().getRequestDispatcher("/Deposit.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
