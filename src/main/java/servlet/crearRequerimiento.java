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
    name = "crearRequerimiento",
    urlPatterns = {"/crearR"}
)

public class crearRequerimiento extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Unico unico = Unico.getInstance();

        int codigoR = Integer.parseInt(req.getParameter("codigoR"));
        int codigoP = Integer.parseInt(req.getParameter("codigoP"));
        String descripcion = req.getParameter("descripcion");
        String actividades = req.getParameter("actividades");
        String tiempoR = req.getParameter("tiempoR");
        ServletOutputStream out;

        String rpta = "ya existe un Requerimiento con el codigo " + codigoR;
        String rpta1 = "Se ha creado un Requeremiento con el codigo" + codigoR;

        if (unico.buscarRequerimiento(codigoR).getCodigoR() == -100){
            unico.crearRequerimiento(codigoR,codigoP,descripcion,actividades, tiempoR);
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