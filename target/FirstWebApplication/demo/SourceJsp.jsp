<html>
    <body>
        <h3>Application variable is defining</h3>

        <%!
            String name = "Donald Trump";
            String password = "Corona Virus";
        %>
        <%
            application.setAttribute ("name", name);
            application.setAttribute ("password", password);
        %>

        <%-- This is a JSP comment --%>

        <a href="/FirstWebApplication/demo/DestinationJsp.jsp">Click here</a>
    </body>
</html>