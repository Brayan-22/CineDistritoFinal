/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.AbstractFactory;

import Logica.CRUD.Create;
import Logica.CRUD.CreateEmpleado;
import Logica.CRUD.Delete;
import Logica.CRUD.DeleteEmpleado;
import Logica.CRUD.Read;
import Logica.CRUD.ReadEmpleado;
import Logica.CRUD.Update;
import Logica.CRUD.UpdateEmpleado;

/**
 *
 * @author USER
 */
public class FabricaEmpleado implements AbstractFactoryCRUD{
    @SuppressWarnings("FieldMayBeFinal")
    private int idempleado;
    private String nombre;
    private String apellidos;
    private String contraseña;
    private String telefono;
    private String fecha_inin_cargo;
    private int id_tipo_cargo;
    private int id_multiplex;
    private String codigoempleado;
    
    
    /**
     * Constructor para insertar un empleado
     * @param idempleado define la cedula del empleado
     * @param nombre define el nombre del empleado
     * @param apellidos  define el/los apellidos del empleado
     * @param contraseña define la contraseña para el empleado
     * @param telefono define el telefono del empleado
     * @param fecha_inin_cargo define la fecha en la que empezo a trabajar el empleado
     * @param id_tipo_cargo define el tipo de cargo del empleado
     * @param id_multiplex define el multiplex en el que trabaja
     */
    public FabricaEmpleado(int idempleado,String nombre,String apellidos,String contraseña,String telefono,String fecha_inin_cargo,int id_tipo_cargo,int id_multiplex) {
        this.idempleado=idempleado;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.contraseña=contraseña;
        this.telefono=telefono;
        this.fecha_inin_cargo=fecha_inin_cargo;
        this.id_tipo_cargo=id_tipo_cargo;
        this.id_multiplex=id_multiplex;
    }

    //constructor para leer un registro segun el codigo de empleado y para eliminar un empleado
    /**
     * constructor para leer un registro de empleado o para eliminar un empleado
     * @param codigoempleado El parametro codigoempleado define el empleado al que se realizara la operacion
    */
    public FabricaEmpleado(String codigoempleado) {
        this.codigoempleado=codigoempleado;
    }
    
    /**
     * constructor para update empleado
     * @param codigoempleado define el codigo del empleado al cual se le actualizaran los datos
     * @param contraseña define la nueva contraseña del empleado
     */
    public FabricaEmpleado(String codigoempleado,String contraseña) {
        this.codigoempleado=codigoempleado;
        this.contraseña=contraseña;
    }
    
    
    @Override
    public Create crearRegistro() {
        return new CreateEmpleado(idempleado, nombre, apellidos, contraseña, telefono, fecha_inin_cargo, id_tipo_cargo, id_multiplex);
    }

    @Override
    public Delete deleteRegistro() {
        return new DeleteEmpleado(codigoempleado);
    }

    @Override
    public Read readRegistro() {
        return new ReadEmpleado(codigoempleado);
    }

    @Override
    public Update updateRegistro() {
        return new UpdateEmpleado(codigoempleado, contraseña);
    }
    
    
    
}
