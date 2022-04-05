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
public interface AbstractFactoryCRUD {
    public Create crearRegistro();
    public Delete deleteRegistro();
    public Read readRegistro();
    public Update updateRegistro();
}
