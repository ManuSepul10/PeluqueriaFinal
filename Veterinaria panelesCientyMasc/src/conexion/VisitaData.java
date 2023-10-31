/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import Entidades.Mascota;
import Entidades.Visita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Statement;

/**
 *
 * @author Cristian
 */
public class VisitaData {

    public static double[] consultaPeso(int idMascota) {
        Connection con = null;
        con = Conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        double[] pesoVector = new double[10];
        ArrayList<Double> listapesos = new ArrayList<>();
        try {

            String sql = "SELECT pesoMascota FROM visitas WHERE id_mascota=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            rs = ps.executeQuery();
            int i=0;

            while (rs.next()) {
                if (i<10) {
                        pesoVector[i] = rs.getDouble("pesoMascota");
                    i++;  
                } 
            }

        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pesoVector;
    }

    public static int cargarVisita(Visita visita, int idMascota) {
        Connection con = null;
        con = Conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql="INSERT INTO visitas( id_mascota, fecha_visita, peso_promedio, detalles, forma_pago, precio_visita, pesoMascota, PrecioTratamiento, precioTotal) VALUES (?,?,?,?,?,?,?,?,?)";
        int idVisita=0;
        try {
            ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMascota);
            ps.setDate(2,  new java.sql.Date(visita.getFechaVisita().getTime()));
            ps.setDouble(3, visita.getPesoPromedio());
            ps.setString(4, visita.getDetalles());
            ps.setString(5, visita.getFormaPago());
            ps.setDouble(6, visita.getPrecioVisita());
            ps.setDouble(7, visita.getPeso());
            ps.setDouble(8, visita.getPrecioTRatamiento());
            ps.setDouble(9, visita.getPrecioTotal());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
             if (rs.next()) {
             idVisita = rs.getInt(1);
            return idVisita;
        } else {
            return idVisita;
        }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
return idVisita;
    }
    
    public static void modificarPesoMascota(Mascota mascota, double pesoActual) {
        Connection con = null;
        PreparedStatement ps = null;
int idMascota=mascota.getIdMascota();
        try {
            con = Conectar.getConexion();
            String sql = "UPDATE mascotas SET  peso_actual = ? WHERE id_mascota = ?";
            ps = con.prepareStatement(sql);
      
            ps.setDouble(1,pesoActual );
            ps.setInt(2, idMascota);

             ps.executeUpdate();

            
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al modificar el peso de la mascota: " + e.getMessage());
        } finally {
            // Cierra los recursos (ResultSet, PreparedStatement, Connection) en un bloque finally
        }
    }

}
