/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.AbstractFactory;

import Logica.CRUD.*;

/**
 *
 * @author USER
 */
public class FabricaMultiplex implements AbstractFactoryCRUD{

    @Override
    public Create crearRegistro() {
        return null;
    }

    @Override
    public Delete deleteRegistro() {
        return null;
    }

    @Override
    public Read readRegistro() {
        return new ReadMultiplex();
    }

    @Override
    public Update updateRegistro() {
        return null;
    }
    
}
