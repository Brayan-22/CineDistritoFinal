/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Principal;

import Logica.AbstractFactory.AbstractFactoryCRUD;
import Logica.AbstractFactory.FabricaMultiplex;
import Logica.CRUD.Read;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Sistema {
    private AbstractFactoryCRUD miFabrica;
    private Read read;
    private ArrayList<Multiplex> arrayMultiplex;
    private ArrayList<ArrayList> arrayTemp;
    public Sistema() {
        miFabrica=new FabricaMultiplex();
        read=miFabrica.readRegistro();
        arrayMultiplex=new ArrayList<>();
        ingresarMultiplex();
    }
    private void ingresarMultiplex(){
        arrayTemp=read.operacionCrud();
        for(int i=0;i<6;i++){
            Multiplex multiplexTemp=new Multiplex((int)arrayTemp.get(i).get(0), (String)arrayTemp.get(i).get(1));
            arrayMultiplex.add(multiplexTemp);
        }
    }

    public ArrayList<Multiplex> getArrayMultiplex() {
        return arrayMultiplex;
    }
    
    
}
