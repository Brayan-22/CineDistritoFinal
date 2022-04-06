/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Principal;

import Logica.AbstractFactory.AbstractFactoryCRUD;
import Logica.AbstractFactory.FabricaSala;
import Logica.CRUD.Read;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Multiplex {
    private int idMultiplex;
    private String nombreMultiplex;
    private ArrayList<Sala> arraySalas;
    private ArrayList<ArrayList> arrayTemp;
    private AbstractFactoryCRUD miFabrica;
    private Read read;
    public Multiplex(int idMultiplex,String nombreMultiplex) {
        this.idMultiplex=idMultiplex;
        this.nombreMultiplex=nombreMultiplex;
        arraySalas=new ArrayList<>();
    }
    public void actualizarSalas(){
        miFabrica=new FabricaSala(idMultiplex);
        read=miFabrica.readRegistro();
        arrayTemp=read.operacionCrud();
        for (int i = 0; i < arrayTemp.size(); i++) {
            Sala salaTemp= new Sala((int)arrayTemp.get(i).get(0), (int)arrayTemp.get(i).get(1), (int)arrayTemp.get(i).get(2), (int)arrayTemp.get(i).get(3));
            arraySalas.add(salaTemp);
        }
    }

    public int getIdMultiplex() {
        return idMultiplex;
    }

    public void setIdMultiplex(int idMultiplex) {
        this.idMultiplex = idMultiplex;
    }

    public String getNombreMultiplex() {
        return nombreMultiplex;
    }

    public void setNombreMultiplex(String nombreMultiplex) {
        this.nombreMultiplex = nombreMultiplex;
    }

    public ArrayList<Sala> getArraySalas() {
        return arraySalas;
    }

    public void setArraySalas(ArrayList<Sala> arraySalas) {
        this.arraySalas = arraySalas;
    }
    
    
}
