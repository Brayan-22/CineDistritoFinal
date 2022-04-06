/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.AbstractFactory;

import Logica.CRUD.Create;
import Logica.CRUD.Delete;
import Logica.CRUD.Read;
import Logica.CRUD.ReadSalas;
import Logica.CRUD.Update;

/**
 *
 * @author USER
 */
public class FabricaSala implements AbstractFactoryCRUD{
    private final int idmultiplex;
    
    /**
     * Constructor para leer las salas de un multiplex especificos
     * @param idmultiplex define el id del multiplex
     */
    public FabricaSala(int idmultiplex) {
        this.idmultiplex=idmultiplex;
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
        return new ReadSalas(idmultiplex);
    }

    @Override
    public Update updateRegistro() {
        System.err.println("Funcionalidad no necesaria(por ahora:) )");
        return null;
    }
    
}
