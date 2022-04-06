/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.AbstractFactory;

import Logica.CRUD.Create;
import Logica.CRUD.Delete;
import Logica.CRUD.Read;
import Logica.CRUD.ReadAsiento;
import Logica.CRUD.Update;

/**
 *
 * @author USER
 */
public class FabricaAsiento implements AbstractFactoryCRUD{
    private int idSala;
    
    /**
     * Constructor para obtener los asientos segun el id de la sala
     * @param idSala define el id de la sala
     */
    public FabricaAsiento(int idSala) {
        this.idSala=idSala;
    }

    
    @Override
    public Create crearRegistro() {
        System.err.println("Funcionalidad no necesaria");
        return null;
    }

    @Override
    public Delete deleteRegistro() {
        System.err.println("Funcionalidad no necesaria");
        return null;
    }

    @Override
    public Read readRegistro() {
        return new ReadAsiento(idSala);
    }

    @Override
    public Update updateRegistro() {
        System.err.println("Funcionalidad no necesaria por ahora :)");
        return null;
    }
    
}
