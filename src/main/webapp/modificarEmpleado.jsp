<html>
<head>
	
</head>

<body>
    <h1>Modificar Empleado</h1>

    <%@ page import = "servlet.*" %>
   <%@ page import = "java.lang.Math.*" %>

   <%
        Unico unico = Unico.getInstance();

        int id = Math.abs(Integer.parseInt(request.getParameter("id")));
        int cc = Math.abs(Integer.parseInt(request.getParameter("cc1")));
        String nombre = request.getParameter("nombre1");
        String formacion = request.getParameter("formacionAca1");
        String habilidad = request.getParameter("habilidad1");
        

        if (unico.buscarEmpleado(id).getIdEmpleado() == -100){
           
            unico.editarEmpleado(id,cc,nombre,formacion,habilidad);

        }
    
    %>

    <p>Se modifico al empleado con el ID <%= Math.abs(Integer.parseInt(request.getParameter("id")))%></p>

    <a href = "modificarEmpleado.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
	


	
</body>
</html>