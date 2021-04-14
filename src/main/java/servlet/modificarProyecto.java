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
    name = "modificarProyecto",
    urlPatterns = {"/modificarP"}
)

public class modificarProyecto extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Unico unico = Unico.getInstance();

        int idProyecto= Integer.parseInt(req.getParameter("idProyecto"));
        String nombreC1 = req.getParameter("nombreC1");
        int presupuesto1 = Integer.parseInt(req.getParameter("presupuesto1"));
        String tiempo1 = req.getParameter("tiempo1");

        String rpta = "No existe un producto con el codigo " + idProyecto;
        String rpta1 = "Se ha editado el producto con el codigo" + idProyecto;
        ServletOutputStream out;


        if (unico.buscarProyecto(idProyecto).getIdProyecto() != -100){
            unico.editarProyecto(idProyecto,nombreC1,presupuesto1,tiempo1);
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
