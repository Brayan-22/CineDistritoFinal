/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author USER
 */
public class Asiento {
    private int codigoAsiento;
    private String tipoAsiento;
    private String estadoAsiento;

    public Asiento(int codigoAsiento,String tipoAsiento,String estadoAsiento) {
        this.codigoAsiento=codigoAsiento;
        this.tipoAsiento=tipoAsiento;
        this.estadoAsiento=estadoAsiento;
    }

    public int getCodigoAsiento() {
        return codigoAsiento;
    }

    public void setCodigoAsiento(int codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public String getEstadoAsiento() {
        return estadoAsiento;
    }

    public void setEstadoAsiento(String estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }
    
    
}
