/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.CRUD;

import Persistencia.singletonConexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class UpdateEmpleado implements Update{
    singletonConexion conexion;
    private PreparedStatement pst;
    private final String codigoEmpleado;
    private final String nuevaContraseña;
    public UpdateEmpleado(String codigoEmpleado,String nuevaContraseña) {
        this.codigoEmpleado=codigoEmpleado;
        this.nuevaContraseña=nuevaContraseña;
    }
    @Override
    public void operacionCrud(){
        String sql="update empleado set contraseña=? where codigoempleado=?";
        conexion=singletonConexion.getConexion();
        conexion.conectar();
        try {
            pst=conexion.getConnection().prepareStatement(sql);
            pst.setString(1, nuevaContraseña);
            pst.setString(2, codigoEmpleado);
            pst.execute();
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
