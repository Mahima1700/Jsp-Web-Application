<%-- 
    Document   : page2
    Created on : 25 Feb 2025, 3:30:04 pm
    Author     : Remote
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page2</title>
    </head>
    <body style="background:red;">
        <div>
             <h1>This is Page 2</h1>
        </div>
        <%
            out.println("wait.....redirecting....");
            //redirecting
            //response.sendRedirect("page3.jsp");
            response.sendRedirect("https://en.wikipedia.org/wiki/LinkedIn");
            %>

    </body>
</html>
