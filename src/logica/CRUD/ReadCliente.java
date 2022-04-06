/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.CRUD;

import Persistencia.singletonConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ReadCliente implements Read{
    singletonConexion conexion;
    private ArrayList array;
    private final String correo;
    private Statement st;
    private ResultSet rs;
    
    
    public ReadCliente(String correo) {
        this.correo=correo;
        array=null;
    }
    
    @Override
    public ArrayList operacionCrud() {
        array=new ArrayList();
        String sql="select idcliente,correo,contraseña,nombre from cliente where correo='"+correo+"';";
        conexion=singletonConexion.getConexion();
        try {
            conexion.conectar();
            st=conexion.getConnection().createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                array.add(rs.getInt(1));
                array.add(rs.getString(2));
                array.add(rs.getString(3));
                array.add(rs.getString(4));
            }
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se encuentra registrado");
        }
        return array;
    }
    
}
