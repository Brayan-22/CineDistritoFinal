
import facade.Fachada;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Launcher {
    private Fachada miFachada;

    public Launcher() {
        miFachada=new Fachada();
        miFachada.iniciar();
    }
    
    public static void main(String[] args) {
        new Launcher();
    }
}
