/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.CRUD;

import Persistencia.singletonConexion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CreateEmpleado implements Create{
    
    singletonConexion conexion;
    private final int idempleado;
    private final String nombre;
    private final String apellidos;
    private final String contraseña;
    private final String telefono;
    private final String fecha_inin_cargo;
    private final int id_tipo_cargo;
    private final int id_multiplex;
    private String codigoEmpleado;
    private PreparedStatement pst;
    private String sql="insert into empleado(idempleado,nombre,apellidos,contraseña,telefono,fecha_inin_cargo,id_tipo_cargo,id_multiplex,codigoempleado) values(?,?,?,?,?,?,?,?,?)";

    public CreateEmpleado(int idempleado,String nombre,String apellidos,String contraseña,String telefono,String fecha_inin_cargo,int id_tipo_cargo,int id_multiplex) {
        this.idempleado=idempleado;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.contraseña=contraseña;
        this.telefono=telefono;
        this.fecha_inin_cargo=fecha_inin_cargo;
        this.id_tipo_cargo=id_tipo_cargo;
        this.id_multiplex=id_multiplex;
        this.codigoEmpleado=nombre.substring(0, 4)+multiplex(id_multiplex)+String.valueOf(idempleado).substring(0, 5);
    }
    @Override
    public void operacionCrud() {
        conexion=singletonConexion.getConexion();
        conexion.conectar();
        try {
            pst=conexion.getConnection().prepareStatement(sql);
            pst.setInt(1, idempleado);
            pst.setString(2, nombre);
            pst.setString(3, apellidos);
            pst.setString(4, contraseña);
            pst.setString(5, telefono);
            pst.setString(6, fecha_inin_cargo);
            pst.setInt(7, id_tipo_cargo);
            pst.setInt(8, id_multiplex);
            pst.setString(9, codigoEmpleado);
            pst.execute();
            conexion.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La cedula que ingreso ya existe con otro empleado");
        }
    }
    private String multiplex(int multi){
        switch (multi) {
            case 1:
                return "titan";
            case 2:
                return "unice";
            case 3:
                return "plaza";
            case 4:
                return "granE";
            case 5:
                return "embaj";
            case 6:
                return "LasAm";
            default:
                return "";
        }
    }
    
}
