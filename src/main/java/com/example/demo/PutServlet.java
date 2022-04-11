package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/putServlet")
public class PutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);

        String brand = request.getParameter("brand");
        String country = request.getParameter("country");
        String type = request.getParameter("type");
        String power = request.getParameter("power");
        String square = request.getParameter("square");
        String price = request.getParameter("price");


        Employee employee = new Employee();
        employee.setId(id);
        employee.setBrand(brand);
        employee.setCountry(country);
        employee.setType(type);
        employee.setPower(power);
        employee.setSquare(square);
        employee.setPrice(price);

        int status = EmployeeRepository.update(employee);

        if (status > 0) {
            response.sendRedirect("viewServlet");
        } else {
            out.println("Sorry! unable to update record");
        }
        out.close();
    }
}
