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
    name = "leerProyecto",
    urlPatterns = {"/leerP"}
)

public class leerProyecto extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Unico unico = Unico.getInstance();

        int codigo = Integer.parseInt(req.getParameter(("idProyecto")));
        

        String rpta = "NO existe un producto con el codigo " + codigo;
        String rpta1 = "";

        if (unico.buscarProyecto(codigo).getIdProyecto() == -100){
            ServletOutputStream out = resp.getOutputStream();
            out.write(rpta.getBytes());

            out.flush();
            out.close();

        }else{

            
            rpta1 = "Codigo : " + unico.buscarProyecto(codigo).getIdProyecto() + "  Nombre del Cliente  : " + unico.buscarProyecto(codigo).getNombreC() + 
            "  Presupuesto : " + unico.buscarProyecto(codigo).getPresupuesto() + "  Tiempo : " + unico.buscarProyecto(codigo).getTiempo();


            ServletOutputStream out = resp.getOutputStream();
            out.write(rpta1.getBytes());

            out.flush();
            out.close();
        }

    }


}
