/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.controller;

import bank.jpa.controller.AccountJpaController;
import bank.jpa.controller.HistoryJpaController;
import bank.jpa.controller.exceptions.NonexistentEntityException;
import bank.jpa.controller.exceptions.RollbackFailureException;
import bank.model.Account;
import bank.model.History;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.Entity;
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
@PersistenceUnit(unitName = "MePU")
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
        Account accountLogin = (Account) session.getAttribute("Login");
        
        if (request.getParameter("withdraw")!=null) {
            int amountWithdraw=parseInt(request.getParameter("withdraw"));
            
            AccountJpaController ajc = new AccountJpaController(utx, emf);
            Account accountWithdraw=ajc.findAccount(accountLogin.getAccountid());
            
            if (accountWithdraw!=null) {
                accountWithdraw.setBalance(accountWithdraw.getBalance()-amountWithdraw);
                try {
                    ajc.edit(accountWithdraw);
                
                
                
                HistoryJpaController hjc = new HistoryJpaController(utx, emf);
                History hist=new History(hjc.getHistoryCount()+1);
                
                hist.setAmount(amountWithdraw);
                hist.setBalance(accountWithdraw.getBalance()-amountWithdraw);
                hist.setMethod("Deposit");
                hist.setAccountid(accountWithdraw);
                hist.setTime(new Date());
                
                
                    hjc.create(hist);
                    
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(DepositServlet.class.getName()).log(Level.SEVERE, null, ex);
                } catch (RollbackFailureException ex) {
                    Logger.getLogger(DepositServlet.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(DepositServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                session.setAttribute("message", "Complete");
                session.setAttribute("Login", accountWithdraw);
                response.sendRedirect("MyAccount");
                return;
            }
            session.setAttribute("message", "Uncomplete");
        }
        getServletContext().getRequestDispatcher("/Withdraw").forward(request, response);
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
