
package conexion;

import Entidades.Consulta;
import Entidades.Mascota;
import Entidades.Tratamiento;
import java.util.ArrayList;
import org.mariadb.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


public class ConsultaData {
    
   public static ArrayList<Consulta> buscarVisitasPorMascota(Mascota mascota) {
        ArrayList<Consulta> consultas = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        con = (Connection) Conectar.getConexion();
         
        String sql = "SELECT `fecha_visita`, `PrecioTotal`, `descripcion`, `tipo` FROM `consultas` WHERE id_mascota = ?";
        int idMascota = mascota.getIdMascota();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            rs = ps.executeQuery();
            while (rs.next()) {
                Consulta consulta = new Consulta();
                consulta.setFechaVisita(rs.getDate("fecha_visita"));
                consulta.setTipo(rs.getString ("tipo"));
                consulta.setDescripcion(rs.getString ("descripcion"));
                consulta.setCostoTotal(rs.getDouble("PrecioTotal"));
                
                consultas.add(consulta);
                System.out.println("consulta");
            }
        } catch (SQLException ex) {
            System.out.println("Error de conexión " + ex );;
        
        }
       
        return consultas;
    }  
      public static ArrayList<Mascota> buscarMascotasPorTratamiento(Tratamiento tratamiento) {
        ArrayList<Mascota> listaMascotas = new ArrayList<>();

        java.sql.Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int id_tratamiento = tratamiento.getIdTratamiento();
        String sql = "SELECT m.* FROM mascotas m INNER JOIN consultas c ON m.id_mascota = c.id_mascota WHERE c.id_tratamiento = ?";
        

        try {
            con = Conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_tratamiento);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idMascota = rs.getInt("id_mascota");
                int idCliente = rs.getInt("id_cliente");
                String alias = rs.getString("alias");
                String sexo = rs.getString("sexo");
                String especie = rs.getString("especie");
                String raza = rs.getString("raza");
                String colorPelo = rs.getString("color_pelo");
                Date fechaNacimiento = rs.getDate("fecha_nacimiento");
                double pesoActual = rs.getDouble("peso_actual");

                Mascota mascota = new Mascota(idMascota, idCliente, alias, sexo, especie, raza, colorPelo, fechaNacimiento, pesoActual);
                listaMascotas.add(mascota);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaMascotas;
    }
      public static void crearConsulta(Consulta consulta){
      java.sql.Connection con = null;
        con = Conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "INSERT INTO consultas(fecha_visita, PrecioTotal, descripcion, tipo, id_mascota, id_visita, id_tratamiento) VALUES (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(consulta.getFechaVisita().getTime()));
            ps.setDouble(2, consulta.getCostoTotal());
            ps.setString(3, consulta.getDescripcion());
            ps.setString(4, consulta.getTipo());
            ps.setInt(5, consulta.getIdMascota());
            ps.setInt(6, consulta.getIdVisita());
            ps.setInt(7, consulta.getIdtratmiento());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(" Error de conexion " + ex.getMessage());
        }
      
      
      
      }
}
