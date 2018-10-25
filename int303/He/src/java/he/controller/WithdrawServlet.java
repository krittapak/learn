/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package he.controller;

import he.controller.exceptions.NonexistentEntityException;
import he.controller.exceptions.RollbackFailureException;
import he.model.Account;
import he.model.History;
import he.model.controller.AccountJpaController;
import he.model.controller.HistoryJpaController;
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
public class WithdrawServlet extends HttpServlet {
@PersistenceUnit (unitName = "HePU")
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
        HttpSession session=request.getSession(false);
        Account ac=(Account) session.getAttribute("Login");
        session.setAttribute("msg", "");
        
        if (request.getParameter("withdraw")!=null) {
            int withdraw=parseInt(request.getParameter("withdraw"));
            
            AccountJpaController ajc=new AccountJpaController(utx, emf);
            Account acc=ajc.findAccount(ac.getAccountid());
            
            acc.setBalance(acc.getBalance()-withdraw);
            
            HistoryJpaController hjc=new HistoryJpaController(utx, emf);
            History his=new History(hjc.getHistoryCount()+1);
            
            his.setAccountid(acc);
            his.setAmount(withdraw);
            his.setBalance(acc.getBalance());
            his.setMethod("withdraw");
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
            session.setAttribute("Login", acc);
            session.setAttribute("msg", "Withdrawed");
            response.sendRedirect("MyAccount");
           return;
        }
        getServletContext().getRequestDispatcher("/Withdraw.jsp").forward(request, response);
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
