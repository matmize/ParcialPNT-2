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
    name = "eliminarProyecto",
    urlPatterns = {"/eliminarP"}
)

public class eliminarProyecto extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Unico unico = Unico.getInstance();

        int codigo = Integer.parseInt(req.getParameter("idProyecto"));
        int codigo1 = Integer.parseInt(req.getParameter("codigoR"));
        

        String rpta = " No existe un producto con el codigo " + codigo;
        String rpta1 = " Se ha eliminado el producto con el codigo " + codigo + 
        "  Y el requerimiento con Codigo " + codigo1;
        String rpta2 = " el Codigo del Requerimiento  " +codigo1 +"  no coincide con el codigo del Proyecto " + codigo;

        ServletOutputStream out;

        if (unico.buscarProyecto(codigo).getIdProyecto() != -100){
            if (unico.buscarRequerimiento(codigo1).getCodigoR() != -100){
                unico.eliminarProyecto(codigo);
                unico.eliminarRequerimiento(codigo1);
                out = resp.getOutputStream();
                out.write(rpta1.getBytes());

            }else if {
                out = resp.getOutputStream();
                out.write(rpta2.getBytes());
            }
           
        }else{
            out = resp.getOutputStream();
            out.write(rpta.getBytes());

            
        }

        
        out.flush();
        out.close();

    }


}