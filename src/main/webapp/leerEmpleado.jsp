
<html>
    <head>
        <h1>Leer Empleado</h1>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
    </head>
    
    <body>
    
       
       <%@ page import = "servlet.*" %>
       <%@ page import = "java.lang.Math.*" %>
    
       <%
            Unico unico = Unico.getInstance();
    
            int id = Math.abs(Integer.parseInt(request.getParameter("id")));
    
            if (unico.buscarEmpleado(id).idEmpleado == -100){%>
                <p>No existe el empleado con ID<%= Integer.parseInt(request.getParameter("id"))%></p>
            <%}else{%>
                <Table>
                    <tr><td><Strong>ID Empleado : </Strong></td> <tr><td><Strong><%= unico.buscarEmpleado(id).idEmpleado%> </Strong></td>
                    <tr><td><Strong>Nombre Empleado : </Strong></td><tr><td><Strong><%= unico.buscarEmpleado(id).nombreEmpleado%> </Strong></td>
                    <tr><td><Strong>Habilidad Empleado : </Strong></td><tr><td><Strong><%= unico.buscarEmpleado(id).habilidades%> </Strong></td>
                    


                </Table>
    
            <%}
        
        %>
        
    
        <a href = "leerEmpleado.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
        
    </body>
    </html>