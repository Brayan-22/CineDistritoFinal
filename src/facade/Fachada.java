package facade;

import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

import interfaz.VentanaAdmin;
import interfaz.VentanaCartelera;
import interfaz.VentanaCompraSilla;
import interfaz.VentanaEstablecerContraseña;
import interfaz.VentanaIngresoCliente;
import interfaz.VentanaInicio;
import interfaz.VentanaPago;
import interfaz.VentanaRecuperarContraseña;
import interfaz.VentanaRegistroCliente;
import interfaz.VentanaRegistroUsuario;
import interfaz.VentanaSnacks;
import interfaz.VistaControlador;
import interfaz.VentanaPeliculas.VentanaPeliculaEncanto;
import interfaz.VentanaPeliculas.VentanaPeliculaMoonfall;
import interfaz.VentanaPeliculas.VentanaPeliculaPaseo6;
import interfaz.VentanaPeliculas.VentanaPeliculaScream;
import interfaz.VentanaPeliculas.VentanaPeliculaSpiderman;
import lógica.Verificar;

public class Fachada {

	private VistaControlador interfaz;
	
	private Verificar verificar;
	
	private Component [] Componentes;
	
	
	
	
	public Fachada() {
		
		interfaz = new VistaControlador(this);
		
		
		
	}
	
	public void iniciar() {
		
				
		interfaz.setVisible(true);
		
	}
	
	// // // // // // // // // // VENTANA INICIO // // // // // // // // // // 
	public void salir() {
		JOptionPane.showMessageDialog(null, "¡Hasta luego!");
		System.out.println("Sesión Finalizada con éxito...");
		System.exit(0);
	}
	
	//de ventana inicio a cartelera
	public void cambiarPanel(VentanaInicio vi, VentanaCartelera vc) {
		
		
		
		String myPass = String.valueOf(vi.getPwdContraseña().getPassword()); 
		String myName = vi.getTxtNombre();
				
//Debe hacer la comprobación si es admin, o no; y si esta en la basse de datos
		if (myName.isEmpty() || myPass.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Porfavor, rellene todos los campos");
		
	}else {
		
		System.out.println("Usuario: "+myName);
		System.out.println("Contraseña: "+myPass);
		vi.setVisible(false);
		vc.setVisible(true);
	}
	
	
		
		
}
	// // // // // // // // // // VENTANA CARTELERA // // // // // // // // // //  
	public void cambiarPanel(VentanaCartelera vc, VentanaInicio vi) {
	
		System.out.println("Ha regresado a la ventana de inicio");
		vc.setVisible(false);
		vi.setVisible(true);
		
	}
	
	public void cambiarPeliculaEncanto(VentanaCartelera vc, VentanaPeliculaEncanto vpE) {

		System.out.println("Seleccionó: Encanto");
		vc.setVisible(false);
		vpE.setVisible(true);

	}
	
	public void cambiarPeliculaMoonfall(VentanaCartelera vc, VentanaPeliculaMoonfall vpM) {

		System.out.println("Seleccionó: Moonfall");
		vc.setVisible(false);
		vpM.setVisible(true);

	}
	
	public void cambiarPeliculaPaseo(VentanaCartelera vc, VentanaPeliculaPaseo6 vpP) {

		System.out.println("Seleccionó: Paseo 6");
		vc.setVisible(false);
		vpP.setVisible(true);

	}
	
	public void cambiarPeliculaScream(VentanaCartelera vc, VentanaPeliculaScream vpScream) {

		System.out.println("Seleccionó: Paseo 6");
		vc.setVisible(false);
		vpScream.setVisible(true);

	}
	
	public void cambiarPeliculaSpiderman(VentanaCartelera vc, VentanaPeliculaSpiderman vpSpiderman) {

		System.out.println("Seleccionó: Paseo 6");
		vc.setVisible(false);
		vpSpiderman.setVisible(true);

	}
	
	// // // // // // // // // // VENTANA PELICULA // // // // // // // // // // 
	
	//encanto
	public void regresoEncantoCartelera(VentanaCartelera vc, VentanaPeliculaEncanto vpE) {
		System.out.println("Regresó a la Cartelera");
		vc.setVisible(true);
		vpE.setVisible(false);
	}
	
	public void continueEncantoIngresoCliente(VentanaPeliculaEncanto vp, VentanaIngresoCliente vic) {

		if(vp.cmbCinesDisponibles.getSelectedItem().equals("Seleccione")) {
			
			JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
	
		System.out.println("...Ingreso...");
		System.out.println("Pelicula: "+vp.getPelicula());
		vic.setPeliculaSeleccionada(vp.getPelicula());
		System.out.println("Cine: "+vp.cmbCinesDisponibles.getSelectedItem());
		vic.setCineSeleccionado((String)vp.cmbCinesDisponibles.getSelectedItem());
		vp.setVisible(false);
		vic.setVisible(true);
		}
	}
	
	//Moonfall
	
	public void regresoMoonfallCartelera(VentanaCartelera vc, VentanaPeliculaMoonfall vp) {
		System.out.println("Regresó a la Cartelera");
		vc.setVisible(true);
		vp.setVisible(false);
	}
	
	public void continueMoonfallIngresoCliente(VentanaPeliculaMoonfall vp, VentanaIngresoCliente vic) {

		if(vp.cmbCinesDisponibles.getSelectedItem().equals("Seleccione")) {
			
			JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
	
		System.out.println("...Ingreso...");
		System.out.println("Pelicula: "+vp.getPelicula());
		vic.setPeliculaSeleccionada(vp.getPelicula());
		System.out.println("Cine: "+vp.cmbCinesDisponibles.getSelectedItem());
		vic.setCineSeleccionado((String)vp.cmbCinesDisponibles.getSelectedItem());
		vp.setVisible(false);
		vic.setVisible(true);
		}
	}
	
	
	
	
	//Paseo 6
	public void regresoPaseoCartelera(VentanaCartelera vc, VentanaPeliculaPaseo6 vp) {
		System.out.println("Regresó a la Cartelera");
		vc.setVisible(true);
		vp.setVisible(false);
	}
	
	public void continuePaseoIngresoCliente(VentanaPeliculaPaseo6 vp, VentanaIngresoCliente vic) {

		if(vp.cmbCinesDisponibles.getSelectedItem().equals("Seleccione")) {
			
			JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
	
		System.out.println("...Ingreso...");
		System.out.println("Pelicula: "+vp.getPelicula());
		vic.setPeliculaSeleccionada(vp.getPelicula());
		System.out.println("Cine: "+vp.cmbCinesDisponibles.getSelectedItem());
		vic.setCineSeleccionado((String)vp.cmbCinesDisponibles.getSelectedItem());
		vp.setVisible(false);
		vic.setVisible(true);
		}
	}
	
	
	//Scream
	public void regresoScreamCartelera(VentanaCartelera vc, VentanaPeliculaScream vp) {
		System.out.println("Regresó a la Cartelera");
		vc.setVisible(true);
		vp.setVisible(false);
	}
	
	public void continueScreamIngresoCliente(VentanaPeliculaScream vp, VentanaIngresoCliente vic) {

		if(vp.cmbCinesDisponibles.getSelectedItem().equals("Seleccione")) {
			
			JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
	
		System.out.println("...Ingreso...");
		System.out.println("Pelicula: "+vp.getPelicula());
		vic.setPeliculaSeleccionada(vp.getPelicula());
		System.out.println("Cine: "+vp.cmbCinesDisponibles.getSelectedItem());
		vic.setCineSeleccionado((String)vp.cmbCinesDisponibles.getSelectedItem());
		vp.setVisible(false);
		vic.setVisible(true);
		}
	}
	
	
	//scream
	
	public void regresoSpidermanCartelera(VentanaCartelera vc, VentanaPeliculaSpiderman vp) {
		System.out.println("Regresó a la Cartelera");
		vc.setVisible(true);
		vp.setVisible(false);
	}
	
	public void continueSpidermanIngresoCliente(VentanaPeliculaSpiderman vp, VentanaIngresoCliente vic) {

		if(vp.cmbCinesDisponibles.getSelectedItem().equals("Seleccione")) {
			
			JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
	
		System.out.println("...Ingreso...");
		System.out.println("Pelicula: "+vp.getPelicula());
		vic.setPeliculaSeleccionada(vp.getPelicula());
		System.out.println("Cine: "+vp.cmbCinesDisponibles.getSelectedItem());
		vic.setCineSeleccionado((String)vp.cmbCinesDisponibles.getSelectedItem());
		vp.setVisible(false);
		vic.setVisible(true);
		}
	}
	
	// // // // // // // // // // VENTANA INGRESO USUARIO // // // // // // // // // // 
	
	public void regresoIngresoPelicula(VentanaPeliculaEncanto vp , VentanaIngresoCliente vic ) {
		
		System.out.println("Regresó a "+vp.getPelicula());
		vic.setVisible(false);
		vp.setVisible(true);
		
	}
	
	public void regresoIngresoPelicula(VentanaPeliculaMoonfall vp , VentanaIngresoCliente vic ) {
		
		System.out.println("Regresó a "+vp.getPelicula());
		vic.setVisible(false);
		vp.setVisible(true);
		
	}
	
	public void regresoIngresoPelicula(VentanaPeliculaPaseo6 vp , VentanaIngresoCliente vic ) {
		
		System.out.println("Regresó a "+vp.getPelicula());
		vic.setVisible(false);
		vp.setVisible(true);
		
	}
	
	public void regresoIngresoPelicula(VentanaPeliculaScream vp , VentanaIngresoCliente vic ) {
		
		System.out.println("Regresó a "+vp.getPelicula());
		vic.setVisible(false);
		vp.setVisible(true);
		
	}
	
	public void regresoIngresoPelicula(VentanaPeliculaSpiderman vp , VentanaIngresoCliente vic ) {
		
		System.out.println("Regresó a "+vp.getPelicula());
		vic.setVisible(false);
		vp.setVisible(true);
		
	}
	
	public void verificacionCliente(VentanaIngresoCliente vic, VentanaCompraSilla vcs) {
		
		if(verificar.esCorreo(vic.getTxtCorreo()) && !vic.getPwdContraseña().getText().isEmpty()) {
			
			System.out.println("\nValidando información de Correo....");
			
			
			/*
			 * if(vic.getTxtCorreo() == BDD && vic.getPwdContraseña() == BDD){
			 * 
			 * 	}
			 */
			vic.setVisible(false);
			vcs.setVisible(true);
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Porfavor ingrese nuevamente los datos","ERROR", JOptionPane.ERROR_MESSAGE);
			vic.setTxtCorreo("");
			vic.setPwdContraseña("");
			
		}
		
	}
	
	public void ingresoIngresoClienteRecuperarContraseña(VentanaIngresoCliente vic, VentanaRecuperarContraseña vrc) {
		
		System.out.println("Ingresó a Ventana Recuperar Contraseña");
		vic.setVisible(false);
		vrc.setVisible(true);
		
		
	}
	
	// // // // // // // // // // VENTANA COMPRA SILLA // // // // // // // // // // 

	public void sillasSeleccionadas(VentanaCompraSilla vcs, VentanaSnacks vs) {
		
		if(!vcs.getSpnGeneral().isEnabled() && !vcs.getSpnPreferencial().isEnabled()) {

			JOptionPane.showMessageDialog(null, "Porfavor seleccione asiento(s) para continuar", "NO Asiento", JOptionPane.INFORMATION_MESSAGE);
			
		}else {
			
			Componentes = vcs.getComponentesSilla();
			String Sillas ="";
			
			for (int i=0; i<Componentes.length; i++) {
				
				 if( ( (JToggleButton) Componentes[i]).isSelected() ){
	                Sillas += ((JToggleButton) Componentes[i]).getName() + " - ";
	              }
	          }
				
			System.out.println("Sillas seleccionadas: "+Sillas); 
			
			System.out.println("Ingreso a la Ventana de Snacks");
			vcs.setVisible(false);
			vs.setVisible(true);
			
		}
		
	}
	
	public void regresoCompraSillaIngreso(VentanaCompraSilla vcs, VentanaIngresoCliente vic) {
		
		System.out.println("Regresó a Ventana Ingreso Cliente");
		vcs.setVisible(false);
		vic.setVisible(true);
		
	}
	
	
		
	
		
	
	
	// // // // // // // // // VENTANA REGISTRO CLIENTE// // // // // // // // //


	public void ingresoIngresoClienteRegistroCliente(VentanaRegistroCliente vrc, VentanaIngresoCliente vic) {
		
		System.out.println("Ingresó a la Ventana de Registro");
		vic.setVisible(false);
		vrc.setVisible(true);
		
	}
	
	public boolean registroClienteExitoso(VentanaRegistroCliente vrc) {
		
		
		if (!Verificar.esCorreo(vrc.getTxtCorreo().getText())) {

			JOptionPane.showMessageDialog(null, "Ingrese un formato de correo válido");
			vrc.getTxtCorreo().setText("");
			return false;
		}
		else if(vrc.getTxtApellido().getText().isEmpty() || vrc.getTxtContraseña().getText().isEmpty() || vrc.getTxtDocumento().getText().isEmpty() || vrc.getTxtNombre().getText().isEmpty()){
			
			JOptionPane.showMessageDialog(null, "Porfavor no deje espacios en blanco", "Espacios en blanco", JOptionPane.ERROR_MESSAGE);
			vrc.getBtnIngreso().setEnabled(false);
			vrc.getCbxAutorizacion().setSelected(false);
			return false;
			
		}else {
			
			vrc.getBtnIngreso().setEnabled(true);
			System.out.println("Se registró con éxito!");
			//Se agrega el Cliente a la BDD
			return true;
		}

		
		
	}
	
	public void chechkBoxSelecionado(VentanaRegistroCliente vrc) {
		
		if(vrc.getCbxAutorizacion().isSelected()) {
			
			vrc.getBtnIngreso().setEnabled(true);

			
		}else {
			vrc.getBtnIngreso().setEnabled(false);
		}
		
	}
	
	public void regresoRegistroClienteIngresoCliente(VentanaRegistroCliente vrc, VentanaIngresoCliente vic) {
		
		System.out.println("Regresó a ventana Ingreso Usuario");
		vrc.setVisible(false);
		vic.getPwdContraseña().setText("");
		vic.getFtxtCorreo().setText("");
		vic.setVisible(true);
		
	}
	
	public void recuperarContraseña(VentanaRecuperarContraseña vrc) {
		
		if(Verificar.esCorreo(vrc.getTxtCorreo()) && !vrc.getTxtDocumento().getText().isEmpty()) {
			
			//Se hace la verificación en la base de datos
			
			JOptionPane.showMessageDialog(null, "Recuperación Exitósa\nNombre usuario: _______________\nContraseña: _______________");
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Porfavor ingrese nuevamente los datos","ERROR", JOptionPane.ERROR_MESSAGE);
			
		}
		
	}
	
	public void regresoRecuperarContraseñaIngresoCliente(VentanaIngresoCliente vic, VentanaRecuperarContraseña vrcontraseña) {
		
		System.out.println("Regresó a Ventana Ingreso");
		vrcontraseña.setVisible(false);
		vic.setVisible(true);
		
	}
	
	public void activarSpinnerGeneral(VentanaCompraSilla vcs) {

		if (vcs.getRbtnGeneral().isSelected()) {
			vcs.getSpnGeneral().setEnabled(true);
		} else {
			vcs.getSpnGeneral().setEnabled(false);
		}

	}

	public void activarSpinnerPreferencial(VentanaCompraSilla vcs) {

		if (vcs.getRbtnPreferencial().isSelected()) {
			vcs.getSpnPreferencial().setEnabled(true);
		} else {
			vcs.getSpnPreferencial().setEnabled(false);
		}

	}
	
	// // // // // // // // // VENTANA SNACKS// // // // // // // // //
	
	public void ingresoSnacksPago(VentanaSnacks vs, VentanaPago vp) {
		
		System.out.println("ingresó a VentanaPago");
		vs.setVisible(false);
		vp.setVisible(true);
	}


	public void obtenerCombo1(VentanaSnacks vs) {
		

			
			if(vs.getTbtnImgCombo1().isSelected()){
				ImageIcon imagenCombo1 = new ImageIcon("./img/combos/imgCombo1.png");
				vs.getTbtnImgCombo1().setIcon(new ImageIcon(imagenCombo1.getImage().getScaledInstance(vs.getTbtnImgCombo1().getWidth(),
						vs.getTbtnImgCombo1().getHeight(), Image.SCALE_SMOOTH)));
				vs.getSpnCombo1().setEnabled(true);
			}else {
				ImageIcon imagenCombo1 = new ImageIcon("./img/combos/imgCombo1bn.png");
				vs.getTbtnImgCombo1().setIcon(new ImageIcon(imagenCombo1.getImage().getScaledInstance(vs.getTbtnImgCombo1().getWidth(),
						vs.getTbtnImgCombo1().getHeight(), Image.SCALE_SMOOTH)));
				vs.getSpnCombo1().setEnabled(false);
			}
			
		
		
	}
	
	public void obtenerCombo2(VentanaSnacks vs) {
		
		
		if(vs.getTbtnImgCombo2().isSelected()){
			
			ImageIcon imagenCombo2 = new ImageIcon("./img/combos/imgCombo2.png");
			vs.getTbtnImgCombo2().setIcon(new ImageIcon(imagenCombo2.getImage().getScaledInstance(vs.getTbtnImgCombo2().getWidth(),
					vs.getTbtnImgCombo2().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo2().setEnabled(true);
		}else {
			ImageIcon imagenCombo2 = new ImageIcon("./img/combos/imgCombo2bn.png");
			vs.getTbtnImgCombo2().setIcon(new ImageIcon(imagenCombo2.getImage().getScaledInstance(vs.getTbtnImgCombo2().getWidth(),
					vs.getTbtnImgCombo2().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo2().setEnabled(false);
		}
	}
	
	public void obtenerCombo3(VentanaSnacks vs) {
		
		if (vs.getTbtnImgCombo3().isSelected()) {

			ImageIcon imagenCombo3 = new ImageIcon("./img/combos/imgCombo3.png");
			vs.getTbtnImgCombo3().setIcon(new ImageIcon(imagenCombo3.getImage().getScaledInstance(vs.getTbtnImgCombo3().getWidth(),
					vs.getTbtnImgCombo3().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo3().setEnabled(true);
		} else {
			ImageIcon imagenCombo3 = new ImageIcon("./img/combos/imgCombo3bn.png");
			vs.getTbtnImgCombo3().setIcon(new ImageIcon(imagenCombo3.getImage().getScaledInstance(vs.getTbtnImgCombo3().getWidth(),
					vs.getTbtnImgCombo3().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo3().setEnabled(false);
		}
		
	}
	public void obtenerCombo4(VentanaSnacks vs) {
		
		if (vs.getTbtnImgCombo4().isSelected()) {

			ImageIcon imagenCombo4 = new ImageIcon("./img/combos/imgCombo4.png");
			vs.getTbtnImgCombo4().setIcon(new ImageIcon(imagenCombo4.getImage().getScaledInstance(vs.getTbtnImgCombo4().getWidth(),
					vs.getTbtnImgCombo4().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo4().setEnabled(true);
		} else {
			ImageIcon imagenCombo4 = new ImageIcon("./img/combos/imgCombo4bn.png");
			vs.getTbtnImgCombo4().setIcon(new ImageIcon(imagenCombo4.getImage().getScaledInstance(vs.getTbtnImgCombo4().getWidth(),
					vs.getTbtnImgCombo4().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo4().setEnabled(false);
		}
	}

	public void facturaConsola(VentanaSnacks vs) {
		
		if (vs.getIntSpnComb1() != 0 && vs.getSpnCombo1().isEnabled()) {

			//en lugar de un SYstem out, se podria llamar a un método que realizara estas "Cotizaciones"
			System.out.println(
					"→ " + vs.getIntSpnComb1() + " Combos N°1.......................................$" + vs.getIntSpnComb1()  * 3500);

		}
		if (vs.getIntSpnComb2() != 0 && vs.getSpnCombo2().isEnabled()) {

			System.out.println(
					"→ " + vs.getIntSpnComb2() + " Combos N°2.......................................$" + vs.getIntSpnComb2() * 2500);

		}
		if (vs.getIntSpnComb3() != 0 && vs.getSpnCombo3().isEnabled()) {

			System.out.println(
					"→ " + vs.getIntSpnComb3() + " Combos N°3.......................................$" + vs.getIntSpnComb3() * 500);

		}
		if (vs.getIntSpnComb4() != 0 && vs.getSpnCombo4().isEnabled()) {

			System.out.println(
					"→ " + vs.getIntSpnComb4() + " Combos N°4.......................................$" + vs.getIntSpnComb4() * 1500);

		}
		
	}
	
	public void regresoSnacksSilla(VentanaSnacks vs, VentanaCompraSilla vcs) {
		
		System.out.println("Regresó a Ventana Compra Silla");
		
		vs.setVisible(false);
		vcs.setVisible(true);
		
	}
	
	public Boolean esAdmin(VentanaInicio vi) {
		
		if(vi.getTxtNombre().equalsIgnoreCase("Admin") && vi.getTxtContraseña().equalsIgnoreCase("Admin")){

			
			return true;
		}else {
			return false;
		}
		
	}
	
	public void ingresoAdmin(VentanaInicio vi, VentanaAdmin va) {
		
		vi.setVisible(false);
		va.setVisible(true);
		
		System.out.println("Bienvenido Patrón!");
	}

	////////////////////////////////////////VENTANA ADMIN///////////////////////////////////////////////
	public void cerrarSesionAdmin(VentanaInicio vi, VentanaAdmin va) {
		
		System.out.println("Regresó a Ventana Inicio");
		va.setVisible(false);
		vi.setVisible(true);
		
	}
	
	public void ingresoAdminContraseña(VentanaEstablecerContraseña vec, VentanaAdmin va) {
		
		System.out.println("Ingresó a Ventana Establecer Contraseña");
		va.setVisible(false);
		vec.setVisible(true);
		
	}
	
	public void ingresoAdminRegistro(VentanaAdmin va, VentanaRegistroUsuario vru) {
		
		System.out.println("Ingreso a VentanaRegistroUsuario");
		va.setVisible(false);
		vru.setVisible(true);
	}
	
	/////////////////////////////////////////////VENTANA ESTABLECER CONTRASEÑA ///////////////////////////////////7
	
	public void regresoContraseñaAdmin(VentanaEstablecerContraseña vec, VentanaAdmin va) {
		
		System.out.println("regreso a Ventana Admin");
		va.setVisible(true);
		vec.setVisible(false);
		
	}
	
	public boolean establecerContraseñaExitoso(VentanaEstablecerContraseña vec) {
		
		if(vec.getFTxtCodigo().getText().isEmpty() || vec.getFTxtContraseña().getText().isEmpty()) {
			
			JOptionPane.showMessageDialog(null, "Porfavor no deje espacios en blanco", "Espacios en blanco", JOptionPane.ERROR_MESSAGE);
			return false;

		}
		else {
			
			JOptionPane.showMessageDialog(null, "Cambio de contraseña exitoso","Cambio Exitoso",  JOptionPane.INFORMATION_MESSAGE);

			return true;
		}
		
	}
	
	/////////////////////////////////////////////////////VETNANA REGISTRO USUSARIO ////////////////////////////////////
	
	public void regresoRegistroAdmin(VentanaRegistroUsuario vru, VentanaAdmin va) {
		
		System.out.println("regreso a Ventana Admin");
		va.setVisible(true);
		vru.setVisible(false);
		
	}
	
	public boolean registroEmpleadoExitoso(VentanaRegistroUsuario vru) {
		
		if(vru.getFTxtContraseña().getText().isEmpty() || vru.getFTxtCorreo().getText().isEmpty() || vru.getFTxtDocumento().getText().isEmpty() || vru.getFTxtNombre().getText().isEmpty() || vru.getFTxtTelefono().getText().isEmpty()) {

			JOptionPane.showMessageDialog(null, "Porfavor no deje espacios en blanco", "Espacios en blanco", JOptionPane.ERROR_MESSAGE);
			
			return false;
		}else {
			
			String codigo= "" + vru.getTxtNombre().charAt(0)+vru.getTxtNombre().charAt(1)+vru.getTxtNombre().charAt(2)+vru.getTxtNombre().charAt(3)+
					vru.getSelectedMultiplex().charAt(0)+vru.getSelectedMultiplex().charAt(1)+vru.getSelectedMultiplex().charAt(2)
					+vru.getSelectedMultiplex().charAt(3)+vru.getSelectedMultiplex().charAt(4)
					+vru.getTxtDocumento().charAt(0)+vru.getTxtDocumento().charAt(1)+vru.getTxtDocumento().charAt(2)+vru.getTxtDocumento().charAt(3)+vru.getTxtDocumento().charAt(4);
			
			JOptionPane.showMessageDialog(null, "Registro del empleado "+codigo+" exitoso!");
			System.out.println("Codigo de empleado generado: "+codigo);
			return true;
		}
		
		
		
	}
	/////////////////////////////////////////////////////VETNANA PAGO ////////////////////////////////////

	
	public void obtenerPago(VentanaPago vpago) {
		

	if(vpago.getTbtnBitcoin().isSelected() || vpago.getTbtnPaypal().isSelected()) {
		
	
		if(vpago.getTbtnPaypal().isSelected()){
			ImageIcon Paypal = new ImageIcon("./img/imgBtnPypal.png");
			vpago.getTbtnPaypal().setIcon(new ImageIcon(Paypal.getImage().getScaledInstance(vpago.getTbtnPaypal().getWidth(),
					vpago.getTbtnPaypal().getHeight(), Image.SCALE_SMOOTH)));
			vpago.getTbtnBitcoin().setSelected(false);
		}else {
			ImageIcon Paypalbn = new ImageIcon("./img/imgBtnPypalbn.png");
			vpago.getTbtnPaypal().setIcon(new ImageIcon(Paypalbn.getImage().getScaledInstance(vpago.getTbtnPaypal().getWidth(),
					vpago.getTbtnPaypal().getHeight(), Image.SCALE_SMOOTH)));
		}
		
		if(vpago.getTbtnBitcoin().isSelected()){
			ImageIcon Btc = new ImageIcon("./img/imgBtnBitcoin.png");
			vpago.getTbtnBitcoin().setIcon(new ImageIcon(Btc.getImage().getScaledInstance(vpago.getTbtnBitcoin().getWidth(),
					vpago.getTbtnBitcoin().getHeight(), Image.SCALE_SMOOTH)));
			vpago.getTbtnPaypal().setSelected(false);
		}else {
			ImageIcon BtcBn = new ImageIcon("./img/imgBtnBitcoinbn.png");
			vpago.getTbtnBitcoin().setIcon(new ImageIcon(BtcBn.getImage().getScaledInstance(vpago.getTbtnBitcoin().getWidth(),
					vpago.getTbtnBitcoin().getHeight(), Image.SCALE_SMOOTH)));
		}
		
		
	}else {
		
		JOptionPane.showMessageDialog(null, "Porfavor, Seleccione método de pago", "Pago inválido", JOptionPane.ERROR_MESSAGE);
	}
	
	
}
	
	public void pagoFinal(VentanaCompraSilla vcs, VentanaSnacks vs) {
		
		/*
		 * Las multiplicaciones deberian ir con su respectivo precio   
		 */
		int SillasGenerales = (vcs.getIntSpnGeneral() * 15000);
		int SillasPreferenciales = (vcs.getIntSpnPreferencial() * 70000);
		int Combo1 = (vs.getIntSpnComb1() * 3500);
		int Combo2 = (vs.getIntSpnComb2() * 2500);
		int Combo3 = (vs.getIntSpnComb3() * 500);
		int Combo4 = (vs.getIntSpnComb4() * 1500);
		String SillasG ="";
		String SillasP ="";
		
		String Precio="";
		
		int Total=0;
		
		Componentes = vcs.getComponentesSilla();


			
	
		
		if(vcs.getIntSpnGeneral() !=  0 && vcs.getRbtnGeneral().isSelected()) {
			
			for (int i=0; i<40; i++) {
				
				 if( ( (JToggleButton) Componentes[i]).isSelected() ){
	                SillasG += ((JToggleButton) Componentes[i]).getName() + "\n";
	              }
	          }
			Precio +="\n"+SillasG+"Sillas Generales ............$"+SillasGenerales+"\n";
			Total+=SillasGenerales;
			
		}
		if(vcs.getIntSpnPreferencial() !=0 && vcs.getRbtnPreferencial().isSelected()) {
			
			for (int j=40; j<60; j++) {
				
				 if( ( (JToggleButton) Componentes[j]).isSelected() ){
	                SillasP += ((JToggleButton) Componentes[j]).getName() + "\n";
	              }
	          }
			Precio +="\n"+SillasP+"Sillas Preferenciales:............$"+SillasPreferenciales+"\n";
			Total+=SillasPreferenciales;

				
		}
		if(vs.getIntSpnComb1() != 0 && vs.getSpnCombo1().isEnabled()) {
			Precio +="\nCombo(s) 1............................$"+Combo1;
			Total+=Combo1;
		}
		if(vs.getIntSpnComb2() != 0 && vs.getSpnCombo2().isEnabled()) {
			Precio +="\nCombo(s) 2.............................$"+Combo2;
			Total+=Combo2;
		}
		if(vs.getIntSpnComb3() != 0 && vs.getSpnCombo3().isEnabled()) {
			Precio +="\nCombo(s) 3..............................$"+Combo3;
			Total+=Combo3;
		}
		if(vs.getIntSpnComb4() != 0 && vs.getSpnCombo4().isEnabled()) {
			Precio +="\nCombo(s) 4...............................$"+Combo4;
			Total+=Combo4;
		}
		
		Precio +="\n\nTotal......................................$"+Total;
		JOptionPane.showMessageDialog(null, Precio, "Factura", JOptionPane.PLAIN_MESSAGE);
		
		
		
	}
	
	public void regresoPagoSnacks(VentanaSnacks vs, VentanaPago vp) {
		
		System.out.println("regreso a VentanaSnacks");
		vs.setVisible(true);
		vp.setVisible(false);
	}
	
	//En este método se deberian setear todos los valores a 0 - establecer con rojo los asientos que estan seleccionados y desabilitarlos
	
	public void regresoPagoCartelera(VentanaPago vp, VentanaCartelera vc) {
		
		System.out.println("\n Gracias Por Tu Compra    :D");
		vp.setVisible(false);
		vc.setVisible(true);
		
	}
	

	
	
	
	}
	

