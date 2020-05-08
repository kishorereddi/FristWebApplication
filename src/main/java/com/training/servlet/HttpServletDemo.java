package com.training.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HttpServletDemo extends HttpServlet {

    public void init(ServletConfig config) {
        System.out.println("Servlet is being initialized");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //http://localhost:8080/ServletDateDemo/HttpServletDemo

        PrintWriter writer = response.getWriter();
        Date date = new Date();
        writer.println("<html><h1>Hello</h1>");
        writer.println("<br><h3>" + date.toString() + "</h3></html>");
        writer.close();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String studentName = request.getParameter("studentName");
        String studentDept = request.getParameter("studentDept");

        PrintWriter writer = response.getWriter();
        writer.println("<html>Entered Student details are: <br> Student name: " + studentName
                + "<br> Student Department: " + studentDept + "</html>");
        writer.flush();
    }

    public void destroy() {
        System.out.println("Servlet is being destroyed");
    }
}