<html>
<head>
	
</head>

<body>

   <h1>Crear Empleado</h1>
   <%@ page import = "servlet.*" %>
   <%@ page import = "java.lang.Math.*" %>

   <%
        Unico unico = Unico.getInstance();

        int idEmpleado = Math.abs(Integer.parseInt(request.getParameter("id")));
        String nombreEmpleado = request.getParameter("nombre");
        String habilidadEmpleado = request.getParameter("habilidad");

        if (unico.buscarEmpleado(id).idEmpleado == -100){
            unico.crearEmpleado(idEmpleado, nombreEmpleado,habilidadEmpleado);
        }else{%>
            <p>Ya Existe un empleado con el id <%= Integer.parseInt(request.getParameter("id"))</p>

        <%}
    
    %>
    <p>Se creo el empleado con el ID <%= Math.abs(Integer.parseInt(request.getParameter("id")))%></p>

    <a href = "crearEmpleado.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
	
</body>
</html>