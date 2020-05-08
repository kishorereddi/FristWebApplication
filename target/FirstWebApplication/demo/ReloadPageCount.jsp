<html>
<title>Number of Reloads</title>
<head>Number of visiting's to a browser</head><br>
    <body>
        <%! int ctr=0; %>
        <%!
            int count () {
                return (++ctr);
            }
        %>
        <h3><%= count () %></h3>
    </body>
</html>