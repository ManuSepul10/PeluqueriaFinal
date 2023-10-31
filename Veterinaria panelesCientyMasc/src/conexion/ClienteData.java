package conexion;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteData {

    public static void cargarCliente(Cliente persona) {
        Connection con = null;
        con = Conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "INSERT INTO clientes( documento, apellido, nombre, direccion, telefono,nombre_alternativo ) VALUES (?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, persona.getDocumento());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getNombre());
            ps.setString(4, persona.getDireccion());
            ps.setString(5, persona.getTelefono());
            ps.setString(6, persona.getPersonaAlternativa());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(" Error de conexion " + ex.getMessage());
        }
    }

    public static void modificarCliente(Cliente cliente) {
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConexion();
        try {
            String sql = "UPDATE Clientes SET documento = ?, apellido = ?, nombre = ?, direccion = ?, telefono = ?, nombre_alternativo = ? WHERE  documento=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getDocumento());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getTelefono());
            ps.setString(6, cliente.getPersonaAlternativa());
            ps.setInt(7, cliente.getDocumento());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(" Error de coneccion " + ex.getMessage());
        }
    }

    public static void eliminarCliente(int documento) {
        Connection con = null;
        con = Conectar.getConexion();

        try {
            String sql = "DELETE FROM Clientes WHERE documento = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, documento);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(" Error de coneccion " + ex.getMessage());
        }
    }

    public static ArrayList<Cliente> buscarClientesPorApellido(String apellido) {
        Connection con = null;
        con = Conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM clientes WHERE apellido LIKE ?";
        ArrayList<Cliente> clientes = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + apellido + "%"); // Usar % para buscar coincidencias parciales
            rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setDocumento(rs.getInt("documento"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setPersonaAlternativa(rs.getString("nombre_alternativo"));
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            System.out.println("Error de conexión " + ex.getMessage());
        }

        return clientes;
    }

    
    public static Cliente buscarClientePorDocumento(int documento) {
        Connection con = null;
        con = Conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM clientes WHERE documento = ?";
        Cliente cliente = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, documento);
            rs = ps.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setDocumento(rs.getInt("documento"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setPersonaAlternativa(rs.getString("nombre_alternativo"));
            }

        } catch (SQLException ex) {
            System.out.println(" Error de conexión " + ex.getMessage());

        }

        return cliente;
    }
//    public static ArrayList<Cliente> buscarClientesPorApellido(String apellido) {
//        apellido = apellido.toLowerCase();
//        ArrayList<Cliente> clientes = new ArrayList<>();
//        Connection con = null;
//        con = Conectar.getConexion();
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//
//        String sql = "SELECT * FROM clientes WHERE apellido = ?";
//        
//
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setString(1, apellido);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                Cliente cliente = new Cliente();
//                cliente.setIdCliente(rs.getInt("id_cliente"));
//                cliente.setDocumento(rs.getInt("documento"));
//                cliente.setApellido(rs.getString("apellido"));
//                cliente.setNombre(rs.getString("nombre"));
//                cliente.setDireccion(rs.getString("direccion"));
//                cliente.setTelefono(rs.getString("telefono"));
//                cliente.setPersonaAlternativa(rs.getString("nombre_alternativo"));
//
//                clientes.add(cliente);
//                System.out.println(cliente);
//            }
//
//        } catch (SQLException ex) {
//            System.out.println(" Error de conexión " + ex.getMessage());
//           
//
//        }
//
//        return clientes;
//    }
}
