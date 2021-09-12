package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    protected Connection conexion;

    protected void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("driver cargado");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8", "root", "admin");
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }

    protected void desconectar() {
        try {
            conexion.close();
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}


    