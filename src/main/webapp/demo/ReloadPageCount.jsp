<html>
<title>Number of Reloads</title>
<head>Number of hits to a page</head><br>
    <body>
        <%! int ctr = 0; %>
        <%!
            int count () {
                return (++ctr);
            }
        %>
        <h3><%= count () %></h3>
    </body>
</html>