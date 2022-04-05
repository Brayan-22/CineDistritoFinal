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
public class ReadPeliculas implements Read{
    singletonConexion conexion;
    private ArrayList<ArrayList> array;
    private Statement st;
    private ResultSet rs;
    
    
    @Override
    public ArrayList operacionCrud() {
        String sql="select* from pelicula";
        conexion=singletonConexion.getConexion();
        array= new ArrayList();
        try {
            conexion.conectar();
            st=conexion.getConnection().createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()) {  
                ArrayList arrayTemp= new ArrayList();
                arrayTemp.add(rs.getInt(1));
                arrayTemp.add(rs.getString(2));
                arrayTemp.add(rs.getString(3));
                arrayTemp.add(rs.getString(4));
                arrayTemp.add(rs.getString(5));
                arrayTemp.add(rs.getString(6));
                arrayTemp.add(rs.getBlob(7));
                array.add(arrayTemp);
            }
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return array;
    }
    
}
