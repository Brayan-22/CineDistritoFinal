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
public class DeleteCliente implements Delete{
    singletonConexion conexion;
    private PreparedStatement pst;
    private final int idcliente;
    public DeleteCliente(int idcliente) {
        this.idcliente=idcliente;
    }
    
    @Override
    public void operacionCrud() {
        String sql="delete from cliente where idcliente=?";
        conexion=singletonConexion.getConexion();
        try {
            conexion.conectar();
            pst=conexion.getConnection().prepareStatement(sql);
            pst.setInt(1, idcliente);
            pst.execute();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El cliente no existe");
        }
    }
    
}
