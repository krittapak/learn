/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package he.controller;

import he.model.Account;
import he.model.controller.AccountJpaController;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
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
public class LoginsServlet extends HttpServlet {
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
            if (request.getSession().getAttribute("Login")!=null) {
            response.sendRedirect("MyAccount");
            return;
        }
            
            String accountIdp=request.getParameter("accountId");
            String pinp=request.getParameter("pin");
            
            if (accountIdp != null && pinp != null) {
            int accountId=parseInt(accountIdp);
            int pin=parseInt(pinp);
            
                AccountJpaController ajpa=new AccountJpaController(utx, emf);
                Account ac=ajpa.findAccount(accountId);
                
                if (ac!=null) {
                    if (pin==ac.getPin()) {
                        request.getSession().setAttribute("Login", ac);
                        response.sendRedirect("MyAccount");
                        return;
                    }
                    request.setAttribute("message", "Invalid");
                    getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
                }
                request.setAttribute("message", "Not Found");
                getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
            
        }
            getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
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
