package datos;

import dominio.Miembro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MiembroDaoJDBC {

    private static final String SQL_SELECT = "SELECT id_miembro, nombre, apellido, telefono, email, membresia FROM miembro";

    private static final String SQL_SELECT_BY_ID = "SELECT id_miembro, nombre, apellido, telefono, email, membresia FROM miembro WHERE id_miembro=?";

    private static final String SQL_INSERT = "INSERT INTO miembro (nombre, apellido, telefono, email, membresia) VALUES (?, ?, ?, ?, ?)";

    private static final String SQL_UPDATE = "UPDATE miembro SET nombre=?, apellido=?, telefono=?, email=?, membresia=? WHERE id_miembro=?";

    private static final String SQL_DELETE = "DELETE FROM miembro WHERE id_miembro=?";

    public List<Miembro> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Miembro miembro = null;
        List<Miembro> miembros = new ArrayList<>();

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idMiembro = rs.getInt("id_miembro");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                String membresia = rs.getString("membresia");

                miembro = new Miembro(idMiembro, nombre, apellido, telefono, email, membresia);

                miembros.add(miembro);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }

        return miembros;
    }

    public Miembro encontrar(Miembro miembro) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, miembro.getIdMiembro());
            rs = stmt.executeQuery();

            //rs.absolute(1);
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                String membresia = rs.getString("membresia");

                miembro.setNombre(nombre);
                miembro.setApellido(apellido);
                miembro.setTelefono(telefono);
                miembro.setEmail(email);
                miembro.setMembresia(membresia);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }

        return miembro;
    }

    public int agregar(Miembro miembro) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, miembro.getNombre());
            stmt.setString(2, miembro.getApellido());
            stmt.setString(3, miembro.getTelefono());
            stmt.setString(4, miembro.getEmail());
            stmt.setString(5, miembro.getMembresia());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(conn);
            Conexion.close(stmt);
        }
        return rows;
    }

    public int actualizar(Miembro miembro) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, miembro.getNombre());
            stmt.setString(2, miembro.getApellido());
            stmt.setString(3, miembro.getTelefono());
            stmt.setString(4, miembro.getEmail());
            stmt.setString(5, miembro.getMembresia());
            stmt.setInt(6, miembro.getIdMiembro());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(conn);
            Conexion.close(stmt);
        }
        return rows;
    }

    public int eliminar(Miembro miembro) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, miembro.getIdMiembro());
           
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(conn);
            Conexion.close(stmt);
        }
        return rows;

    }

}
