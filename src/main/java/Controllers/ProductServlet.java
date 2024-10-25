package Controllers;

import DAO.BrandDAO;
import DAO.ProductDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Brand;

import java.io.IOException;

@WebServlet("products")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int brandId = Integer.parseInt(request.getParameter("brandId"));

        Brand brand = BrandDAO.getBrandById(brandId);
        ProductDAO.addProduct(name, price, quantity, brand);
        response.sendRedirect("homepage.jsp");
    }
}
