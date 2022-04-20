package com.example.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/viewByIDServlet")
public class ViewByIDServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
try{
        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);

        Employee employee = EmployeeRepository.getEmployeeById(id);
        if(employee.getId() == 0) {
//            throw new Error("Incorrect id");
            throw new IOException("Incorrect id");
        }
        out.print(employee);
    } catch (Throwable e) {
    out.print("Not exist id");
    }
        out.close();
    }
}
