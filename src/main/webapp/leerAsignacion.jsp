<html>
    <head>
        <h1>Leer Asignacion</h1>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
        <link rel="stylesheet" href="asignacion.css" type="text/css">
    </head>
    
    <body>
    
       
       <%@ page import = "servlet.*" %>
       <%@ page import = "java.lang.Math.*" %>
    
       <%
            Unico unico = Unico.getInstance();
    
            int id = Math.abs(Integer.parseInt(request.getParameter("idProyecto")));
                
            if (unico.buscarAsignacion(id).getIdProy() == -100){%>
                <p>No existe la Asignacion que esta buscando </p>
            <%}else{%>
                <Table>
                
                    
                    <tr><td><Strong>ID Proyecto : </Strong></td> <tr><td><Strong><%= unico.buscarAsignacion(id).getIdProy()%> </Strong></td>
                    <tr><td><Strong>ID Empleado : </Strong></td> <tr><td><Strong><%= unico.buscarAsignacion(id).getIdemp()%> </Strong></td>
                    <tr><td><Strong>Requerimiento : </Strong></td><tr><td><Strong><%= unico.buscarAsignacion(id).getRequerimientos()%> </Strong></td>
                    


                </Table>
    
            <%}
        
        %>
        
    
        <a href = "leerAsignacion.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
        <a href = "asignacion.html"><button type = "button" >CRUD Asignacion</button></a>
        
    </body>
    </html>