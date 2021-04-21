<html>
<head>
	<link rel="stylesheet" href="asignacion.css" type="text/css">
</head>

<body>

   <h1>Crear Asignacion</h1>
   <%@ page import = "servlet.*" %>
   <%@ page import = "java.lang.Math.*" %>

   <%
        Unico unico = Unico.getInstance();

        
        int idProyecto = Math.abs(Integer.parseInt(request.getParameter("idProyecto")));
        int idEmpleado = Math.abs(Integer.parseInt(request.getParameter("idEmpleado")));
        int requerimiento = Math.abs(Integer.parseInt(request.getParameter("requerimiento")));
        
        if (unico.buscarAsignacion(idProyecto).getIdProy() == -100){
            unico.crearAsignacion(idProyecto,idEmpleado,requerimiento);
            
        }else{%>
            <p>Ya Existe una asignacion con el id <%= Integer.parseInt(request.getParameter("idProyecto"))%></p>

        <%}
    
    %>
    <p>Se creo la Asignacion con el ID <%= Math.abs(Integer.parseInt(request.getParameter("idProyecto")))%></p>

    <a href = "crearAsignacion.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
    <a href = "asignacion.html"><button type = "button" >CRUD Asignacion</button></a>
	
</body>
</html>