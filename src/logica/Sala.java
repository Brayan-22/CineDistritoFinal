/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Sala {
    private int codigoSala;
    private String pelicula;
    private ArrayList<Asiento> asientos;

    public Sala(int codigoSala,String pelicula) {
        this.codigoSala=codigoSala;
        this.pelicula=pelicula;
        asientos=new ArrayList<>();
    }
    private void añadirAsientos(){
        for (int i = 0; i < 60; i++) {
            asientos.add(new Asiento(codigoSala, pelicula, pelicula));
        }
    }
    public int getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(int codigoSala) {
        this.codigoSala = codigoSala;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }
    
    
}
