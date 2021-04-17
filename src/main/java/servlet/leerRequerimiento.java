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
    name = "leerRequerimiento",
    urlPatterns = {"/leerR"}
)

public class leerRequerimiento extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Unico unico = Unico.getInstance();

        int codigo = Integer.parseInt(req.getParameter(("codigoR")));
        

        String rpta = "NO existe un producto con el codigo " + codigo;
        String rpta1 = "";

        if (unico.buscarRequerimiento(codigo).getCodigoR() == -100){
            ServletOutputStream out = resp.getOutputStream();
            out.write(rpta.getBytes());

            out.flush();
            out.close();

        }else  {

            
            rpta1 = "Codigo del Requerimiento: " + unico.buscarRequerimiento(codigo).getCodigoR() +
             "  codigo del Proyecto  : " + unico.buscarRequerimiento(codigo).getCodigoP() + 
            "  Descripcion : " + unico.buscarRequerimiento(codigo).getDescripcion() + 
            "  Actividades  "+ unico.buscarRequerimiento(codigo).getActividades() +
            "  Tiempo : " + unico.buscarRequerimiento(codigo).getTiempoR();


            ServletOutputStream out = resp.getOutputStream();
            out.write(rpta1.getBytes());

            out.flush();
            out.close();
        }

    }


}
