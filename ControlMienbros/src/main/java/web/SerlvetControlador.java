/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import datos.MiembroDaoJDBC;
import dominio.Miembro;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class SerlvetControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String accion = request.getParameter("accion");
        
        if(accion!=null){
            
        }else{
            this.accionDefault(request, response);
        }
        
    }
    
    //Primera pagina de la aplicacion
    private void accionDefault(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Miembro> miembros= new MiembroDaoJDBC().listar();
        HttpSession sesion= request.getSession();
        sesion.setAttribute("miembros", miembros);
        sesion.setAttribute("cantidadDeMiembros",miembros.size());
        
        response.sendRedirect("miembros.jsp");
        
    }
    
}
