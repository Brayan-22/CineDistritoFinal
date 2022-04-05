/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.AbstractFactory;

import Logica.CRUD.Create;
import Logica.CRUD.CreateCliente;
import Logica.CRUD.Delete;
import Logica.CRUD.DeleteCliente;
import Logica.CRUD.Read;
import Logica.CRUD.ReadCliente;
import Logica.CRUD.Update;
import Logica.CRUD.UpdateCliente;

/**
 *
 * @author USER
 */
public class FabricaCliente implements AbstractFactoryCRUD{
    private int idcliente;
    private String nombre;
    private String apellidos;
    private String contraseña;
    private String correo;
    
    
    /**
     * Constructor para insertar un nuevo cliente
     * @param idcliente define el id del cliente
     * @param nombre define el nombre del cliente 
     * @param apellidos define el/los apellidos del cliente
     * @param contraseña define la contraseña que tendra el cliente
     * @param correo define el correo del cliente
     */
    public FabricaCliente(int idcliente,String nombre,String apellidos,String contraseña,String correo) {
        this.idcliente=idcliente;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.contraseña=contraseña;
        this.correo=correo;
    }
    
    /**
     * Constructor para eliminar un registro de cliente
     * @param idcliente define el id del cliente al que se eliminara el registro
     */
    public FabricaCliente(int idcliente) {
        this.idcliente=idcliente;
    }
    /**
     * Constructor para leer un registro de cliente
     * @param correo 
     */
    public FabricaCliente(String correo) {
        this.correo=correo;
    }
    
    
    @Override
    public Create crearRegistro() {
        return new CreateCliente(idcliente, nombre, apellidos, contraseña, correo);
    }

    @Override
    public Delete deleteRegistro() {
        return new DeleteCliente(idcliente);
    }

    @Override
    public Read readRegistro() {
        return new ReadCliente(correo);
    }

    @Override
    public Update updateRegistro() {
        return new UpdateCliente();
    }
    
}
