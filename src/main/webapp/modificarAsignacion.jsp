<html>
<head>
	
</head>

<body>
    <h1>Modificar Asignacion</h1>

    <%@ page import = "servlet.*" %>
   <%@ page import = "java.lang.Math.*" %>

   <%
        Unico unico = Unico.getInstance();

        
        int idProy = Math.abs(Integer.parseInt(request.getParameter("idProyecto")));
        String idemp1 = request.getParameter("idEmpleado1");
        String responsabilidades1 = request.getParameter("responsabilidades1");
        

        if (unico.buscarAsignacion(idProy).getIdProy() == -100){
           
            unico.editarAsignacion(idProy,idemp1,responsabilidades1);

        }
    
    %>

    <p>Se modifico la Asignacion asosiada al proyecto con el ID <%= Math.abs(Integer.parseInt(request.getParameter("idProyecto")))%></p>

    <a href = "modificarAsignacion.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
	


	
</body>
</html>