package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/saveServlet")
public class SaveServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        String brand = request.getParameter("brand");
        String country = request.getParameter("country");
        String type = request.getParameter("type");
        String power = request.getParameter("power");
        String square = request.getParameter("square");

        Employee employee = new Employee();

        employee.setBrand(brand);
        employee.setCountry(country);
        employee.setType(type);
        employee.setPower(power);
        employee.setSquare(square);

        //out.println(employee.toString());
        //out.println(EmployeeRepository.getConnection());

        int status = EmployeeRepository.save(employee);
        //out.println(status);

        if (status > 0) {
            out.print("Record saved successfully!");
        } else {
            out.println("Sorry! unable to save record");
        }
        out.close();
    }
}
