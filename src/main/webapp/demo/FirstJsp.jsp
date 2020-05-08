<html>
    <title>Current Date & Time</title>
    <body>

        <%!
        int index = 0, a = 0, b = 1;
        public int count () {
              return (a+b);
        }
        %>

        <%@ page import="java.util.Date" %>
        <h3> Current date & time: <%= new Date() %> </h3>
    </body>
</html>