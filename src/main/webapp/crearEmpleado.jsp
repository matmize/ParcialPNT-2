<html>
<head>
	
</head>

<body>

   <h1>Crear Empleado</h1>
   <%@ page import = "servlet.*" %>
   <%@ page import = "java.lang.Math.*" %>

   <%
        Unico unico = Unico.getInstance();

        int id = Math.abs(Integer.parseInt(request.getParameter("id")));
        int cc = Math.abs(Integer.parseInt(request.getParameter("cc")));
        String nombre = request.getParameter("nombre");
        String formacion = request.getParameter("formacion");
        String habilidad = request.getParameter("habilidad");

        if (unico.buscarEmpleado(id).getIdEmpleado == -100){
            unico.crearEmpleado(id,cc,nombre,formacion,habilidad);
        }else{%>
            <p>Ya Existe un empleado con el id <%= Integer.parseInt(request.getParameter("id"))%></p>

        <%}
    
    %>
    <p>Se creo el empleado con el ID <%= Math.abs(Integer.parseInt(request.getParameter("id")))%></p>

    <a href = "crearEmpleado.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
	
</body>
</html>