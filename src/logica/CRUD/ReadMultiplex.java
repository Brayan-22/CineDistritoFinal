/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.CRUD;

import Persistencia.singletonConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ReadMultiplex implements Read{
    singletonConexion conexion;
    private Statement st;
    private ResultSet rs;
    private ArrayList array;
    @Override
    public ArrayList operacionCrud() {
        array=new ArrayList();
        conexion=singletonConexion.getConexion();
        String sql="select nombre_multiplex from multiplex";
        try {
            conexion.conectar();
            st=conexion.getConnection().createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                array.add(rs.getString(1));
            }
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return array;
    }
    
}
