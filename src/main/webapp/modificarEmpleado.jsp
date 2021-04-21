<html>
<head>
	<link rel="stylesheet" href="empleado.css" type="text/css">
</head>

<body>
    <h1>Modificar Empleado</h1>

    <%@ page import = "servlet.*" %>
   <%@ page import = "java.lang.Math.*" %>

   <%
        Unico unico = Unico.getInstance();

        int idEmpleado = Math.abs(Integer.parseInt(request.getParameter("id")));
        int cc1 = Math.abs(Integer.parseInt(request.getParameter("cc1")));
        String nombre1 = request.getParameter("nombre1");
        String formacionAca1 = request.getParameter("formacionAca1");
        String habilidades1 = request.getParameter("habilidades1");
        

        if (unico.buscarEmpleado(idEmpleado).getIdEmpleado() != -100){
           
            unico.editarEmpleado(idEmpleado,cc1,nombre1,formacionAca1,habilidades1);

        }
    
    %>

    <p>Se modifico al empleado con el ID <%= Math.abs(Integer.parseInt(request.getParameter("id")))%></p>

    <a href = "modificarEmpleado.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
    <a href = "empleado.html"><button type = "button" >CRUD Empleado</button></a>
	


	
</body>
</html>