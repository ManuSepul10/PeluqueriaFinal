/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import Entidades.Mascota;
import Vistas.PanelCliente;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class MascotaData {

    public static ArrayList<Mascota> listarMascotasPorCliente(int documento) {
        ArrayList<Mascota> listaMascotas = new ArrayList<>();

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT M.* "
                + "FROM mascotas M "
                + "INNER JOIN clientes C ON M.id_cliente = C.id_cliente "
                + "WHERE C.documento = ?";

        try {
            con = Conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, documento);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idMascota = rs.getInt("id_mascota");
                String alias = rs.getString("alias");
                String sexo = rs.getString("sexo");
                String especie = rs.getString("especie");
                String raza = rs.getString("raza");
                String colorPelo = rs.getString("color_pelo");
                Date fechaNacimiento = rs.getDate("fecha_nacimiento");
                double pesoActual = rs.getDouble("peso_actual");

                Mascota mascota = new Mascota(idMascota, documento, alias, sexo, especie, raza, colorPelo, fechaNacimiento, pesoActual);
                listaMascotas.add(mascota);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaMascotas;
    }

    public static void guardarMascota(Mascota mascota) {
        Connection conexion = null;
        PreparedStatement ps = null;

        try {
            conexion = Conectar.getConexion();

            String sql = "INSERT INTO mascotas (id_cliente, alias, sexo, especie, raza, color_pelo, fecha_nacimiento, peso_actual) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            ps = conexion.prepareStatement(sql);
            ps.setInt(1, mascota.getIdCliente());

            ps.setString(2, mascota.getAlias());
            ps.setString(3, mascota.getSexo());
            ps.setString(4, mascota.getEspecie());
            ps.setString(5, mascota.getRaza());
            ps.setString(6, mascota.getColorPelo());
            ps.setDate(7, new java.sql.Date(mascota.getFechaNacimiento().getTime()));

            ps.setDouble(8, mascota.getPesoActual());

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Mascota guardada con éxito.");
            } else {
                System.err.println("No se pudo guardar la mascota.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al guardar la mascota: " + e.getMessage());
        }
    }

    public static Mascota obtenerMascotaPorID(int idMascota) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Mascota mascota = null;

        try {
            con = Conectar.getConexion();
            String sql = "SELECT * FROM mascotas WHERE id_mascota = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            rs = ps.executeQuery();

            if (rs.next()) {
                // Recupera los datos de la mascota
                int idCliente = rs.getInt("id_cliente");
                String alias = rs.getString("alias");
                String sexo = rs.getString("sexo");
                String especie = rs.getString("especie");
                String raza = rs.getString("raza");
                String colorPelo = rs.getString("color_pelo");
                Date fechaNacimiento = rs.getDate("fecha_nacimiento");
                double pesoActual = rs.getDouble("peso_actual");

                mascota = new Mascota(idMascota, idCliente, alias, sexo, especie, raza, colorPelo, fechaNacimiento, pesoActual);
                System.out.println(mascota);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mascota;
    }

    public static void eliminarMascota(int id_mascota) {
        Connection conexion = null;
        PreparedStatement ps = null;

        try {
            conexion = Conectar.getConexion();

            String sql = "DELETE FROM mascotas WHERE id_mascota = ?";

            ps = conexion.prepareStatement(sql);
            ps.setInt(1, id_mascota);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Mascota eliminada con éxito.");
            } else {
                System.err.println("No se encontró una mascota con el código especificado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al eliminar la mascota: " + e.getMessage());
        }
    }

    public static void modificarMascota(int idMascota, String nuevoAlias, String nuevoSexo, String nuevaEspecie, String nuevaRaza, String nuevoColorPelo, Date nuevaFechaNacimiento, double nuevoPesoActual) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conectar.getConexion();
            String sql = "UPDATE mascotas SET alias = ?, sexo = ?, especie = ?, raza = ?, color_pelo = ?, fecha_nacimiento = ?, peso_actual = ? WHERE id_mascota = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, nuevoAlias);
            ps.setString(2, nuevoSexo);
            ps.setString(3, nuevaEspecie);
            ps.setString(4, nuevaRaza);
            ps.setString(5, nuevoColorPelo);
            ps.setDate(6, new java.sql.Date(nuevaFechaNacimiento.getTime()));
            ps.setDouble(7, nuevoPesoActual);
            ps.setInt(8, idMascota);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Mascota modificada con éxito.");
            } else {
                System.err.println("No se pudo modificar la mascota.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al modificar la mascota: " + e.getMessage());
        } finally {
            // Cierra los recursos (ResultSet, PreparedStatement, Connection) en un bloque finally
        }
    }
    public static ArrayList<Mascota> listarMascota() {
        ArrayList<Mascota> listarMascotas = new ArrayList<>();

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM mascotas";

        try {
            con = Conectar.getConexion();
            ps = con.prepareStatement(sql);
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

                Mascota mascota = new Mascota(idMascota,idCliente, alias, sexo, especie, raza, colorPelo, fechaNacimiento, pesoActual);
                listarMascotas.add(mascota);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listarMascotas;
    }

}
