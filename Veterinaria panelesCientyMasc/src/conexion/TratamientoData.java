/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import Entidades.Mascota;
import Entidades.Tratamiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cristian
 */
public class TratamientoData {
    
       public static ArrayList<Tratamiento> listarTratamiento() {
        ArrayList<Tratamiento> listatrTratamientos = new ArrayList<>();

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM tratamientos WHERE activo=1";

        try {
            con = Conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idTratamiento=rs.getInt("id_tratamiento");
                String tipo = rs.getString("tipo");
                String descripcion = rs.getString("descripcion");
                double importe = rs.getDouble("importe");
                boolean activo= rs.getBoolean("activo");

                Tratamiento tratamiento = new Tratamiento(idTratamiento, tipo, descripcion, importe, activo);
                listatrTratamientos.add(tratamiento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listatrTratamientos;
    }
     public static void modificarTratamiento(Tratamiento trata) {
        Connection con = null;
        PreparedStatement ps = null;
         ResultSet rs = null;
        try {
            con = Conectar.getConexion();
            String sql = "UPDATE tratamientos SET tipo = ?, descripcion = ?, importe = ?, activo = ? WHERE id_tratamiento=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, trata.getTipo());
            ps.setString(2, trata.getDescripcion());
            ps.setDouble(3, trata.getPrecio());
            ps.setBoolean(4, trata.isEstado());
            ps.setInt(5, trata.getIdTratamiento());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al modificar la mascota: " + e.getMessage());
        } finally {
            // Cierra los recursos (ResultSet, PreparedStatement, Connection) en un bloque finally
        }
    }
     
     public static void cargarTratamiento(Tratamiento trata) {
        Connection con = null;
        con = Conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

       String sql = "INSERT INTO tratamientos(tipo,descripcion,importe,activo) VALUES (?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, trata.getTipo());
            ps.setString(2, trata.getDescripcion());
            ps.setDouble(3,trata.getPrecio());
            ps.setBoolean(4, trata.isEstado());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro de conexion");
        }
        }
       public static ArrayList<Tratamiento> listarTodosTratamiento() {
        ArrayList<Tratamiento> listatrTratamientos = new ArrayList<>();

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM tratamientos";

        try {
            con = Conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idTratamiento=rs.getInt("id_tratamiento");
                System.out.println("id tratamiento: "+idTratamiento);
                String tipo = rs.getString("tipo");
                String descripcion = rs.getString("descripcion");
                double importe = rs.getDouble("importe");
                boolean activo= rs.getBoolean("activo");

                Tratamiento tratamiento = new Tratamiento(idTratamiento, tipo, descripcion, importe, activo);
                listatrTratamientos.add(tratamiento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listatrTratamientos;
    }
}
