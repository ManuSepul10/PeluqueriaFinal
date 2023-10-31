package conexion;

import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class usuarioData {

    public static Usuario IngresoUsuario(String usuario, int contraseña) {
        Usuario usu = new Usuario();
        try {
            Connection con = null;
            con = Conectar.getConexion();
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = "SELECT * FROM `usuario` WHERE usuario=? AND contraseña=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setInt(2, contraseña);
            rs = ps.executeQuery();

            if (!rs.next()) {
                return usu=null;
            } else {
                usu.setNombre(rs.getString("usuario"));
                usu.setContraseña(rs.getInt("contraseña"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(usuarioData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usu;
    }

}
