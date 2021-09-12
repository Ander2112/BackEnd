package mintic.edu.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UsuarioDAO extends conexion.Conexion{
    public String login(Usuario usu) throws Exception{
        String estado = "";
        ResultSet rs;
        try {
            this.conectar();
            String sql = "SELECT tipoUsuario, correo from usuario WHERE nombreUsuario=? and clave=?";
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, usu.getNombreUsuario());
            sentencia.setString(2, usu.getClave());
            rs = sentencia.executeQuery();
            if(rs.next()){
                estado = "true";
            }
            usu.setTipoUsuario(rs.getString("tipoUsuario"));
            usu.setCorreo(rs.getString("correo"));
        } catch (Exception e) {
            throw e;
        }
        return estado;
    }
}
