
import Logica.AbstractFactory.*;
import Logica.CRUD.Create;
import Logica.CRUD.Delete;
import Logica.CRUD.Read;
import Logica.CRUD.Update;
import Logica.Principal.Multiplex;
import Logica.Principal.Sistema;

import facade.*;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



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
    private Sistema sistema;
    public Launcher(){
        miFachada=new Fachada();
        miFachada.iniciar();
    }
    
    
    public static void main(String[] args) {
        new Launcher();
    }
}
