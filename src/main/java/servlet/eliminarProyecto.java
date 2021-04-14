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
        

        String rpta = " No existe un producto con el codigo " + codigo;
        String rpta1 = " Se ha eliminado el producto con el codigo " + codigo;

        ServletOutputStream out;

        if (unico.buscarProyecto(codigo).getIdProyecto() != -100){
            unico.eliminarProyecto(codigo);
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