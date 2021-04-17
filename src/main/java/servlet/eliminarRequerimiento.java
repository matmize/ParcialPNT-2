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
    name = "eliminarRequerimiento",
    urlPatterns = {"/eliminarR"}
)

public class eliminarRequerimiento extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Unico unico = Unico.getInstance();

        int codigoR = Integer.parseInt(req.getParameter("codigoR"));
        

        String rpta = " No existe un producto con el codigo " + codigoR;
        String rpta1 = " Se ha eliminado el producto con el codigo " + codigoR;

        ServletOutputStream out;

        if (unico.buscarRequerimiento(codigoR).getCodigoR() != -100){
            unico.eliminarRequerimiento(codigoR);
            out = resp.getOutputStream();
            out.write(rpta1.getBytes());

            

        }else{
            out = resp.getOutputStream();
            out.write(rpta.getBytes());

            
        }

        
        out.flush();
        out.close();

    }