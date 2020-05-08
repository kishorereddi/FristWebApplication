package com.training.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class FirstServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //Set response content type
        servletResponse.setContentType("text/html");
        //Access stream object and add details
        PrintWriter printWriter = servletResponse.getWriter();
        Date date = new Date();
        printWriter.print("Current date and time is: " + date.toString());

        //Close the stream
        printWriter.close();
    }
}
