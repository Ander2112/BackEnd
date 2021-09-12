<%-- 
    Document   : cerrarsesion
    Created on : 11/09/2021, 5:52:10 p. m.
    Author     : wilde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<%
    HttpSession objSesion = request.getSession();
    objSesion.invalidate();
    out.print("<script>location.replace('../index.html');</script>");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    </body>
</html>
