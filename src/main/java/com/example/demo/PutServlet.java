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
        String str;
//        String sid = request.getParameter("id");
//        int id = Integer.parseInt(sid);
        try {
        str = request.getParameter("id");
        int id = Integer.parseInt(str);
        if(id < 0) {
            throw new IOException("id must be >= 0");
        }

        String brand = request.getParameter("brand");
        String country = request.getParameter("country");
        String type = request.getParameter("type");
        String power = request.getParameter("power");

        str = request.getParameter("square");
        int square = Integer.parseInt(str);
        if(square < 0) {
            throw new IOException("square must be >= 0");
        }
        str = request.getParameter("price");
        int price = Integer.parseInt(str);
        if(price < 0) {
            throw new IOException("price must be >= 0");
        }


//        String square = request.getParameter("square");
//        String price = request.getParameter("price");


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
            log("<==Response==>: **Updating of record is successfully**");
        } else {
            out.println("Response: Sorry! unable to update record");
            log("<==Response==>: **Updating of record is unsuccessfully.Incorrect value**");
        }
        } catch (Throwable e) {
            out.print("Response: Please write correct value");
        }
        out.close();
    }
}
