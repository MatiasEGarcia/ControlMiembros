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
            switch(accion){
                case "editar":
                    this.pagEditarMiembro(request, response);
                    break;
                case "eliminar":
                    this.eliminarMiembro(request, response);
                    break;
                default:
                    this.accionDefault(request, response);
            }
           
        }else{
            this.accionDefault(request, response);
        }
        
    }
    
    //Primera pagina de la aplicacion
    private void accionDefault(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Miembro> miembros= new MiembroDaoJDBC().listar();
        HttpSession sesion= request.getSession();
        sesion.setAttribute("miembros", miembros);
        sesion.setAttribute("cantidadMiembros",miembros.size());
        
        response.sendRedirect("miembros.jsp");
        
    }

    private void pagEditarMiembro(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int idMiembro=Integer.parseInt(request.getParameter("idMiembro"));
        Miembro miembroEditar= new MiembroDaoJDBC().encontrar(new Miembro(idMiembro));
        
        request.setAttribute("miembroEditar", miembroEditar);
        request.getRequestDispatcher("editar.jsp").forward(request, response);
    }
    
     private void eliminarMiembro(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        int idMiembro= Integer.parseInt(request.getParameter("idMiembro"));
        Miembro miembro=new Miembro(idMiembro);

        int registrosModificados= new MiembroDaoJDBC().eliminar(miembro);
        System.out.println("registrosModificados = " + registrosModificados);
        
        this.accionDefault(request, response);
    }
    
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String accion=request.getParameter("accion");
        
        if(accion!=null){
            switch(accion){
                case "modificar":
                    this.modificarMiembro(request, response);
                    break;
                case "agregar":
                    this.agregarMiembro(request, response);
                    break;
                default:
                    this.accionDefault(request, response);
            }
        }else{
            this.accionDefault(request, response);
        }
               
    }

    private void modificarMiembro(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        int idMiembro= Integer.parseInt(request.getParameter("idMiembro"));
        String nombre= request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String email=request.getParameter("email");
        String telefono=request.getParameter("telefono");
        String membresia=request.getParameter("membresia");
        
        Miembro miembro=new Miembro(idMiembro, nombre, apellido, email, telefono, membresia);
        
        int regristrosModificados=new MiembroDaoJDBC().actualizar(miembro);
        
        this.accionDefault(request, response);
    }

    private void agregarMiembro(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String email=request.getParameter("email");
        String telefono=request.getParameter("telefono");
        String membresia=request.getParameter("membresia");
        
        Miembro miembro=new Miembro(nombre, apellido, email, telefono, membresia);
        
        int registrosModificados=new MiembroDaoJDBC().agregar(miembro);
        
        this.accionDefault(request, response);
        
    }  

   
}
