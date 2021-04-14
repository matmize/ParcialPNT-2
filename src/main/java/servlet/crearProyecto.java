package servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.Math;

@WebServlet(
    name = "crearProyecto",
    urlPatterns = {"/crearP"}
)

public class crearProyecto extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Unico unico = Unico.getInstance();

        int idProyecto = Integer.parseInt(req.getParameter("idP"));
        String nombreC = req.getParameter("nombreC");
        String presupuesto = req.getParameter("presupuesto");
        int tiempo = Integer.parseInt(req.getParameter("tiempo"));
        
        ServletOutputStream out;

        String rpta = "ya existe un Proyecto con el codigo " + idProyecto;
        String rpta1 = "Se ha creado un producto con el codigo" + idProyecto;

        if (unico.buscarProyecto(idProyecto).getIdProyecto() == -100){
            unico.crearProyecto(idProyecto,nombreC,presupuesto,tiempo);
            out = resp.getOutputStream();
            out.write(rpta1.getBytes());

            

        }else{
            out = resp.getOutputStream();
            out.write(rpta.getBytes());

            
        }
        
        out.flush();
        out.close();
    }
}