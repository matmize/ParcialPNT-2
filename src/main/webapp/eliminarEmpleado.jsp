


<!DOCTYPE html>

<html>
<head>
    <title>Eliminar Empleado</title>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
    <link rel="stylesheet" href="empleado.css" type="text/css">
</head>

<body>
    
    <h1>Eliminar Empleado</h1>
    <%@page import = "servlet.*" %>
    <%@ page import = "java.lang.Math.*" %>
    <%
        Unico unico = Unico.getInstance();


        int id = Math.abs(Integer.parseInt(request.getParameter("id")));

   
        if (unico.buscarEmpleado(id).getIdEmpleado() != -100) {
           unico.eliminarEmpleado(id); %>
            
    
            <p>Se elimino correctamente el Empleado y a la asignacion a la cual pertenecia</p>
             
        <%}else{%>

            <p>No existe el empleado con ID <%= Math.abs(Integer.parseInt(request.getParameter("id")))%></p>

        <%}
    %>
    <a href = "eliminarEmpleado.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
    <a href = "empleado.html"><button type = "button" >CRUD Empleado</button></a>
</body>
</html>