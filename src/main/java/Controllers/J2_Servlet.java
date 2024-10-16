/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAO.J2DAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Person;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author huynguyen21
 */
@WebServlet(name = "J2_Servlet", urlPatterns = {"/J2_Servlet"})
public class J2_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet J2Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet J2Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //username = ten Person
        //password = sdt

        ArrayList<Person> listPerson = new ArrayList<>();
        Person ps1 = new Person("huy", 29, "0376866283");
        Person ps2 = new Person("hoa", 29, "0376866284");
        Person ps3 = new Person("huong", 29, "0376866285");
        listPerson.add(ps1);
        listPerson.add(ps2);
        listPerson.add(ps3);

        String msg = "";
        if (username.equals(ps1.getName()) && password.equals(ps1.getPhone())) {
            msg = "Success";
        } else {
            msg = "Failure";
        }
        //Goi hang - Dong goi du lieu
        request.setAttribute("list", listPerson);
        request.setAttribute("msg", msg);
        //Xac dinh noi gui den
        request.getRequestDispatcher("/J2_JSP.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet responseout.println("<p>Name:" + person.getName() + "</p>");
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        //bao mat thong tin hon so voi GET
        //
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
