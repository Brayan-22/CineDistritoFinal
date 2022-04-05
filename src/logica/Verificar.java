package lógica;

import java.util.IllegalFormatException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verificar {
	


	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	public static boolean esCorreo(String Correo) {
		Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher comparar=patron.matcher(Correo);
        return comparar.find();
		
	}
	
	public static boolean isAlphabetic(String cadena){
		try {
			String prueba = cadena;
			return true;
		} catch (IllegalFormatException nfe){
			return false;
		}
	}
	
	public static boolean esTexto(String Texto) {
		Pattern patron = Pattern.compile("[_A-Za-z]");
        Matcher comparar=patron.matcher(Texto);
        return comparar.find();
		
	}

	public static void estaEnBaseDeDatos() {
		
		System.out.println("Deberia revisar si esta en base de datos");
		
	}
	
	
}
