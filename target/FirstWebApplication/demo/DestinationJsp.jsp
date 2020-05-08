<html>
    <body>

        <h3>Destination Page:</h3>

        <%!
            String name;
            String password;
        %>
        <%
            name = (String)application.getAttribute ("name");
            password = (String)application.getAttribute ("password");
        %>

        <h5>Name :: <%= name %></h5>
        <h5>Password :: <%= password %></h5>

        <JSP:include page="/webapp/demo/Header.jsp"/>

    </body>
</html>