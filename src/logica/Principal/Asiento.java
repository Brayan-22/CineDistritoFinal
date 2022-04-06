/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Principal;

/**
 *
 * @author USER
 */
public class Asiento {
    private int idAsiento;
    private int tipoAsiento;
    private int estadoAsiento;
    private int idSala;
    private int codigoAsiento;
    
    

    public Asiento(int idAsiento,int tipoAsiento,int estadoAsiento,int idSala,int codigoAsiento) {
        this.idSala=idSala;
        this.idAsiento=idAsiento;
        this.codigoAsiento=codigoAsiento;
        this.tipoAsiento=tipoAsiento;
        this.estadoAsiento=estadoAsiento;
    }
    

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public int getCodigoAsiento() {
        return codigoAsiento;
    }

    public void setCodigoAsiento(int codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }

    public int getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(int tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public int getEstadoAsiento() {
        return estadoAsiento;
    }

    public void setEstadoAsiento(int estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }
    
    
}
