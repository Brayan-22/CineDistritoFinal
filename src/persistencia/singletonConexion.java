package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class singletonConexion{
    private Connection conexion;
    private String password;
    private String user;
    private static singletonConexion INSTANCE=null;
    
    private singletonConexion(){
        password="123456";
        user="root";
    }
    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/cine",user,password);
        } catch (SQLException |ClassNotFoundException e) {
            System.err.println("Error en conexion(conectar):" +e);
        }
    }
    private synchronized static void createInstance(){
        if(INSTANCE==null){
            INSTANCE=new singletonConexion();
        }
    }
    public static singletonConexion getConexion(){
        if (INSTANCE==null) {
            createInstance();
        }
        return INSTANCE;
    }
    public void desconectar() throws SQLException{
        try {
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public Connection getConnection(){
        return conexion;
    }
}

