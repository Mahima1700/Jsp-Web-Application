
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        
        <% //fetch the number
           String n1 = request.getParameter("n1");
           String n2 = request.getParameter("n2");
           
            //converting String to integer
               int a= Integer.parseInt(n1);
               int b= Integer.parseInt(n2);
               int c= a/b;
              

        %>
        
        
        <h1>Result  is : <%= c  %>
        </h1>
       
    </body>
</html>
