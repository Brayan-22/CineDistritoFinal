/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.CRUD;

import Persistencia.singletonConexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class DeleteEmpleado implements Delete{
    singletonConexion conexion;
    private final String codigoempleado;
    private PreparedStatement pst;
    
    public DeleteEmpleado(String codigoempleado) {
        this.codigoempleado = codigoempleado;
    }
    
    
    @Override
    public void operacionCrud() {
        conexion=singletonConexion.getConexion();
        String sql="delete from empleado where codigoempleado='?'";
        try {
            conexion.conectar();
            pst=conexion.getConnection().prepareStatement(sql);
            pst.setString(1, codigoempleado);
            pst.execute();
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "El empleado no existe");
        }
    }
    
    
}
