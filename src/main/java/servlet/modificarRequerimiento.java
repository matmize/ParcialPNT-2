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

public class modificarRequerimiento extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Unico unico = Unico.getInstance();



        int codigoR = Integer.parseInt(req.getParameter("codigoR"));
        int codigoP1 = Integer.parseInt(req.getParameter("codigoP1"));
        String descripcion1 = req.getParameter("descripcion1");
        String actividades1 = req.getParameter("actividades1");
        String tiempoR1 = req.getParameter("tiempoR1");
        ServletOutputStream out;

        String rpta = "No existe un producto con el codigo " + codigoR;
        String rpta1 = "Se ha editado el producto con el codigo" + codigoR;
      


        if (unico.buscarRequerimiento(codigoR).getCodigoR() != -100){
            unico.editarRequerimiento(codigoR,codigoP1,descripcion1,actividades1,tiempoR1);
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
