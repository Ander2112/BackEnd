<%-- 
    Document   : vistaCliente
    Created on : 11/09/2021, 9:55:51 a. m.
    Author     : wilde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../font/css/font-awesome.min.css"><!-- comment -->
        <link rel="stylesheet" href="../bootstrap/css/bootstrap-reboot.min.css">
        <title>Cliente</title>
    </head>
    <%
        String user ="";
        String admin ="";
        HttpSession objSesion = request.getSession();
        String usuario;
        if(objSesion.getAttribute("usuario") != null && objSesion.getAttribute("nivel").equals("Cliente")){
            usuario = objSesion.getAttribute("usuario").toString();
            user = "<label>" + usuario +"</label>";
            
        } else if(objSesion.getAttribute("usuario")!=null && objSesion.getAttribute("nivel").equals("Administrador")){
            usuario = objSesion.getAttribute("usuario").toString();
            user = "<label>" + usuario +"</label>";
            admin = "<label> El administrador tiene acceso total a todo<br>" 
                    +"<a href ='vistaAdministrador.jsp'"
                    +"class = 'btn btn-primary'><span class = 'fa fa-eye'</span>"
                    + "vistaAdministrador</a>" +"</label>";
        } else{
            out.println("<script> location.replace(../index.html),</script>");
        }
    %>
    <body>
    <center>
        <h1>Vista del Cliente</h1>
        <% //out.print(admin); %>
        <div>
            <h1>Bienvenido <% out.println(user);%></h1>
        </div>
            <a href="cerrarsesion.jsp" class="btn btn-danger"><span class="fa fa-sign-out"></span>Cerrar Sesión</a>
    </center>
    </body>
</html>
