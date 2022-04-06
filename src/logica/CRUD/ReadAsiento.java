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
public class ReadAsiento implements Read{
    singletonConexion conexion;
    private final int idSala;
    private Statement st;
    private ResultSet rs;
    private ArrayList<ArrayList> array;
    public ReadAsiento(int idSala) {
        this.idSala=idSala;
    }
    
    @Override
    public ArrayList operacionCrud() {
        conexion=singletonConexion.getConexion();
        array = new ArrayList<>();
        String sql="select* from asiento where sala_idsala="+String.valueOf(idSala);
        try {
            conexion.conectar();
            st=conexion.getConnection().createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()) {                
                ArrayList arrayTemp= new ArrayList();
                arrayTemp.add(rs.getInt(1));
                arrayTemp.add(rs.getInt(2));
                arrayTemp.add(rs.getInt(3));
                arrayTemp.add(rs.getInt(4));
                arrayTemp.add(rs.getInt(5));
                array.add(arrayTemp);
            }
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return array;
    }
    
}
