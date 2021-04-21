<html>
<head>
	<link rel="stylesheet" href="asignacion.css" type="text/css">
</head>

<body>
    <h1>Modificar Asignacion</h1>

    <%@ page import = "servlet.*" %>
   <%@ page import = "java.lang.Math.*" %>

   <%
        Unico unico = Unico.getInstance();

        
        int idProy = Math.abs(Integer.parseInt(request.getParameter("idProyecto")));
        int idemp1 =  Math.abs(Integer.parseInt(request.getParameter("idEmpleado1")));
        int requerimiento1 = Math.abs(Integer.parseInt(request.getParameter("requerimiento1")));
        

        if (unico.buscarAsignacion(idProy).getIdProy() != -100){
           
            unico.editarAsignacion(idProy,idemp1,requerimiento1);

        }
    
    %>

    <p>Se modifico la Asignacion asosiada al proyecto con el ID <%= Math.abs(Integer.parseInt(request.getParameter("idProyecto")))%></p>

    <a href = "modificarAsignacion.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
    <a href = "asignacion.html"><button type = "button" >CRUD Asignacion</button></a>
	


	
</body>
</html>