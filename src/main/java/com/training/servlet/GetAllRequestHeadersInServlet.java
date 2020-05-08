package com.training.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class GetAllRequestHeadersInServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String empId = req.getParameter("empId");
        String browserDetails = req.getHeader("user-agent");

        PrintWriter writer = res.getWriter();
        res.setContentType("text/plain");
        Enumeration<String> headerNames = req.getHeaderNames();
        writer.println("All Headers : ");
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            writer.println("Header Name: "+ headerName);

            Enumeration<String> headers = req.getHeaders(headerName);
            while (headers.hasMoreElements()) {
                String headerValue = headers.nextElement();
                writer.println("Header Value: " + headerValue);
            }
        }
        writer.flush();
        writer.close();
    }
}