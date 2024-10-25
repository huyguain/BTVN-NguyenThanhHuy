/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import DAO.J2DAO;
import jakarta.servlet.http.HttpSession;
import models.Person;

/**
 * @author huynguyen21
 */
public class J2Servlet extends HttpServlet {

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
        //Nhận thêm tác vụ

        HttpSession session = request.getSession();
        //Lay du lieu tu session ve
        ArrayList<Person> personList = new ArrayList<>();
        personList = (ArrayList<Person>) session.getAttribute("list");

        //processRequest(request, response);
        //ne se dua tat ca du lieu dau vao hien thi tren thanh url
        //vi du, thuc hien chuc nang login
        //username va password
        //Tim kiem do dung gi do co the viet code trong method GET
        PrintWriter out = response.getWriter();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        int first = Integer.parseInt(request.getParameter("sothunhat"));
        int second = Integer.parseInt(request.getParameter("sothuhai"));
        String calculation = request.getParameter("calculation");
        int result = switch (calculation) {
            case "sum" -> J2DAO.calculateSum(first, second);
            case "sub" -> J2DAO.calculateSub(first, second);
            case "mul" -> J2DAO.calculateMulti(first, second);
            case "div" -> J2DAO.calculateDiv(first, second);
            default -> 0;
        };

        out.println("Hello " + firstName + " " + lastName + ", result: " + result + ", Calculation: " + calculation);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
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
