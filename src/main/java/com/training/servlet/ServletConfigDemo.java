package com.training.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletConfigDemo extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {

        servletResponse.setContentType("text/html");
        PrintWriter printWriter = servletResponse.getWriter();

        ServletConfig config = getServletConfig();
        String userName = config.getInitParameter("db_user_name");
        String password = config.getInitParameter("db_password");

        printWriter.println("<h3> Database Username retrieved from Config(xml) is: " + userName + "</h3>");
        printWriter.println("<h3> Database Password retrieved from Config(xml) is: " + password + "</h3>");

        printWriter.close();
    }
}
