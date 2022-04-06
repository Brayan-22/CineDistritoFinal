/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Principal;

import Logica.AbstractFactory.AbstractFactoryCRUD;
import Logica.AbstractFactory.FabricaAsiento;
import Logica.CRUD.Read;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Sala {
    private int idMultiplex;
    private int codigoSala;
    private int id_pelicula;
    private int idSala;
    private ArrayList<Asiento> arrayAsientos;
    private ArrayList<ArrayList> arrayTemp;
    private AbstractFactoryCRUD miFabrica;
    private Read read;

    public Sala(int idSala,int idMultiplex,int codigoSala,int id_pelicula) {
        this.idSala=idSala;
        this.idMultiplex=idMultiplex;
        this.codigoSala=codigoSala;
        this.id_pelicula=id_pelicula;
        arrayAsientos=new ArrayList<>();
    }
    
    public void actualizasAsientos(){
        miFabrica=new FabricaAsiento(idSala);
        read=miFabrica.readRegistro();
        arrayTemp=read.operacionCrud();
        for (int i = 0; i < arrayTemp.size(); i++) {
            Asiento asientoTemp = new Asiento((int)arrayTemp.get(i).get(0), 
                    (int)arrayTemp.get(i).get(1), 
                    (int)arrayTemp.get(i).get(2), 
                    (int)arrayTemp.get(i).get(3), 
                    (int)arrayTemp.get(i).get(4));
            arrayAsientos.add(asientoTemp);
        }
    }
    public int getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(int codigoSala) {
        this.codigoSala = codigoSala;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public ArrayList<Asiento> getArrayAsientos() {
        return arrayAsientos;
    }

    public void setArrayAsientos(ArrayList<Asiento> arrayAsientos) {
        this.arrayAsientos = arrayAsientos;
    }

    

    public int getIdMultiplex() {
        return idMultiplex;
    }

    public void setIdMultiplex(int idMultiplex) {
        this.idMultiplex = idMultiplex;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }
    
    
}
