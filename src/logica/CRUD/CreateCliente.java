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
public class CreateCliente implements Create{
    singletonConexion conexion;
    private final int idcliente;
    private final String nombre;
    private final String apellidos;
    private final String contraseña;
    private final String correo;
    private final String sql="insert into cliente(idcliente,nombre,apellidos,contraseña,correo) values(?,?,?,?,?)";
    private PreparedStatement pst;
    
    public CreateCliente(int idcliente,String nombre,String apellidos,String contraseña,String correo) {
        this.idcliente=idcliente;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.contraseña=contraseña;
        this.correo=correo;
    }
    
    @Override
    public void operacionCrud() {
        conexion=singletonConexion.getConexion();
        try {
            conexion.conectar();
            pst=conexion.getConnection().prepareStatement(sql);
            pst.setInt(1, idcliente);
            pst.setString(2, nombre);
            pst.setString(3, apellidos);
            pst.setString(4, contraseña);
            pst.setString(5, correo);
            pst.execute();
            conexion.desconectar();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "La cedula que ingreso ya existe con otro cliente");
        }
    }
    
}
