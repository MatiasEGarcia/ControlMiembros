
package datos;

import dominio.Miembro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MiembroDaoJDBC {
    
    private static final String SELECT="SELECT id_miembro, nombre, apellido, telefono, email, t_membresia FROM miembro";
    
    private static final String SELECT_BY_ID="SELECT id_miembro, nombre, apellido, telefono, email, t_membresia FROM miembro WHERE id_miembro=?";
    
    private static final String INSERT="INSERT into miembro nombre, apellido, telefono, email, t_membresia VALUES (?, ?, ?, ?, ?)";
    
    private static final String UPDATE="UPDATE miembro SET nombre=?, apellido=?, telefono=?, email=?, t_membresia=? WHERE id_miembro=?";
    
    private static final String DELETE="DELETE FROM miembro WHERE id_miembro=?";
    
    
    public List<Miembro> listar(){
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        Miembro miembro=null;
        List<Miembro> miembros= new ArrayList<>();
        
        try {
            conn=Conexion.getConection();
            stmt=conn.prepareStatement(SELECT);
            rs=stmt.executeQuery();
            
            while(rs.next()){
                String nombre=rs.getString("nombre");
                String apellido=rs.getString("apellido");
                String telefono=rs.getString("telefono");
                String email=rs.getString("email");
                String tMembresia=rs.getString("t_membresia");
                
                miembro=new Miembro(nombre, apellido, telefono, email, tMembresia);
                
                miembros.add(miembro);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        
        return miembros;
    }
    
    public Miembro encontrar(Miembro miembro){
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        
        try {
            conn=Conexion.getConection();
            stmt=conn.prepareStatement(SELECT_BY_ID);
            stmt.setInt(1, miembro.getIdMiembro());
            rs=stmt.executeQuery();
            
            rs.absolute(1);
            
            String nombre= rs.getString("nombre");
            String apellido= rs.getString("apellido");
            String telefono= rs.getString("telefono");
            String email= rs.getString("email");
            String tMembresia= rs.getString("t_membresia");
            
            miembro.setNombre(nombre);
            miembro.setApellido(apellido);
            miembro.setTelefono(telefono);
            miembro.setEmail(email);
            miembro.setTMembresia(tMembresia);
            
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        
        return miembro;
    }
    
    public void agregar(Miembro miembro){
        Connection conn=null;
        PreparedStatement stmt=null;
        
        try {
            conn=Conexion.getConection();
            stmt=conn.prepareStatement(INSERT);
            
            stmt.setString(1, miembro.getNombre());
            stmt.setString(2, miembro.getApellido());
            stmt.setString(3, miembro.getTelefono());
            stmt.setString(4, miembro.getEmail());
            stmt.setString(5, miembro.getTMembresia());
            
            stmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            Conexion.close(conn);
            Conexion.close(stmt);
        }
        
    }
    
    public void actualizar(Miembro miembro){
        Connection conn=null;
        PreparedStatement stmt=null;
        
        try {
            conn=Conexion.getConection();
            stmt=conn.prepareStatement(UPDATE);
            
            stmt.setString(1, miembro.getNombre());
            stmt.setString(2, miembro.getApellido());
            stmt.setString(3, miembro.getTelefono());
            stmt.setString(4, miembro.getEmail());
            stmt.setString(5, miembro.getTMembresia());
            stmt.setInt(6, miembro.getIdMiembro());
            
            stmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            Conexion.close(conn);
            Conexion.close(stmt);
        }
        
    }
    
    public void eliminar(Miembro miembro){
        Connection conn=null;
        PreparedStatement stmt=null;
        
        try {
            conn=Conexion.getConection();
            stmt=conn.prepareStatement(DELETE);
            
            stmt.setInt(1, miembro.getIdMiembro());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            Conexion.close(conn);
            Conexion.close(stmt);
        }
     
        
    }
    
    
}
