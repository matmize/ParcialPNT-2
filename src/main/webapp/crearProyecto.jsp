<html>
<head>
	
</head>

<body>
    <%@page import = "servlet.html" %>

    <%

    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("nombre");
    int presupuesto = Integer.parseInt(request.getParameter("presupuesto"));
    String tiempo = request.getParameter("tiempo");

    Unico u =Unico.crear();
    

    out.println("el Unico me devuelve" + u.getContador());
    
    
    
    
    %>

    
	
</body>
</html>