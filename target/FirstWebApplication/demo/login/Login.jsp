<%
String uname = request.getParameter ("uname");
String pwd = request.getParameter ("pwd");
if (uname.equals ("user") && pwd.equals ("pwd")) {
%>
    <jsp:forward page="Success.jsp"></jsp:forward>
<% }
else
{ %>
    <h5>Login failed</h5>
    <jsp:include page= "Login.html"></jsp:include>
<% } %>