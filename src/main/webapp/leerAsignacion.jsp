<html>
    <head>
        <h1>Leer Asignacion</h1>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
    </head>
    
    <body>
    
       
       <%@ page import = "servlet.*" %>
       <%@ page import = "java.lang.Math.*" %>
    
       <%
            Unico unico = Unico.getInstance();
    
            int id = Math.abs(Integer.parseInt(request.getParameter("id")));
                
            if (unico.buscarAsignacion(id).idProyecto == -100){%>
                <p>No existe la Asignacion con ID<%= Integer.parseInt(request.getParameter("idProyecto"))%></p>
            <%}else{%>
                <Table>
                
                    <tr><td><Strong>ID Empleado : </Strong></td> <tr><td><Strong><%= unico.buscarAsignacion(id).idEmpleado%> </Strong></td>
                    <tr><td><Strong>ID Asignacion : </Strong></td> <tr><td><Strong><%= unico.buscarAsignacion(id).idProyecto%> </Strong></td>
                    <tr><td><Strong>Horas : </Strong></td><tr><td><Strong><%= unico.buscarAsignacion(id).horas%> </Strong></td>
                    <tr><td><Strong>Responsabilidades : </Strong></td><tr><td><Strong><%= unico.buscarAsignacion(id).responsabilidades%> </Strong></td>
                    


                </Table>
    
            <%}
        
        %>
        
    
        <a href = "leerAsignacion.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
        
    </body>
    </html>