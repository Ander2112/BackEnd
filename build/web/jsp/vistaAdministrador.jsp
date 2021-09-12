<%-- 
    Document   : VistaAdministrador
    Created on : 11/09/2021, 11:09:56 a. m.
    Author     : wilde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<%@page import="mintic.edu.modelo.Usuario"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vista Administrador</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" 
              rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    </head>
    <body>
        <%/*
            Usuario objUsuario = new Usuario();
            HttpSession objSesion = request.getSession();
            objUsuario = (Usuario)objSesion.getAttribute("objUsuario");*/
        %>
        <ul class="nav">
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="#">Usuarios</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">Clientes</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">Proveedores</a>
  </li>
  <li class="nav-item">
    <a class="nav-link " href="#">Productos</a>
  </li>
  <li class="nav-item">
    <a class="nav-link " href="#">Ventas</a>
  </li>
  <li class="nav-item">
    <a class="nav-link " href="#">Reportes</a>
  </li>
</ul>
    </body>
</html>
