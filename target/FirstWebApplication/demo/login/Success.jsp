<jsp:include page= "Header.jsp"></jsp:include>
<center>
    <h5>Login Successful</h5>
    <h4>Welcome Mr. <%= request.getParameter("uname") %></h4>
</center>
<jsp:include page= "Footer.jsp"></jsp:include>