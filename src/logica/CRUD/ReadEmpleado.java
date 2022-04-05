/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.CRUD;

import Persistencia.singletonConexion;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author USER
 */
public class ReadEmpleado implements Read{
    singletonConexion conexion;
    private Statement st;
    private ResultSet rs;
    private ArrayList array;
    private final String codigoempleado;
    public ReadEmpleado(String codigoempleado) {
        this.codigoempleado=codigoempleado;
        array=null;
    }
    
    
    @Override
    public ArrayList operacionCrud() {
        array = new ArrayList();
        String sql="select codigoempleado,contraseña from empleado where codigoempleado='"+codigoempleado+"'";
        conexion=singletonConexion.getConexion();
        conexion.conectar();
        try {
            st=conexion.getConnection().createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                array.add(rs.getString(1));
                array.add(rs.getString(2));
            }
            conexion.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No esta registrado un empleado con las credenciales que ingreso");
        }
        return array;
    }

    
}
