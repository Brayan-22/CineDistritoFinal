package facade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import interfaz.VentanaIngresoCliente;
import interfaz.VistaControlador;
import interfaz.VentanaPeliculas.*;


public class ControladorEvento implements ActionListener, KeyListener{
	
	private VistaControlador interfaz;

	public ControladorEvento (VistaControlador interfaz) {
		
		this.interfaz = interfaz;
				
	}
	

	public void actionPerformed(ActionEvent e) {
		
		// // // // // // // // // VENTANA INICIO // // // // // // // // //
		if (e.getSource() == (interfaz.getVentanaInicio().getBtnSalir())) {
			interfaz.getFachada().salir();
		}
		
		if(e.getSource() == interfaz.getVentanaInicio().getBtnIngreso()){
			
			if(interfaz.getFachada().esAdmin(interfaz.getVentanaInicio())){
				
				interfaz.getFachada().ingresoAdmin(interfaz.getVentanaInicio(),interfaz.getVentanaAdmin());
			}else {
				
				interfaz.getFachada().cambiarPanel(interfaz.getVentanaInicio(), interfaz.getVentanaCartelera());
			}
			
		}
		
		// // // // // // // // // VENTANA CARTELERA // // // // // // // // // 
		
		//Boton Salir
		if(e.getSource() == interfaz.getVentanaCartelera().getBtnSalir()) {
			
			interfaz.getVentanaInicio().getFTxtNombre().setText("");
			interfaz.getVentanaInicio().getPwdContraseña().setText("");
			interfaz.getFachada().cambiarPanel(interfaz.getVentanaCartelera(), interfaz.getVentanaInicio());
		}
		
		//Boton pelicula Encanto
		if (e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaEncanto()) {

			interfaz.getFachada().cambiarPeliculaEncanto(interfaz.getVentanaCartelera(),interfaz.getVentanaPeliculaEncanto());

		}
		if(e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaMoonfall()) {
			
			interfaz.getFachada().cambiarPeliculaMoonfall(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaMoonfall());
			
		}
		if(e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaPaseo6()) {
			
			interfaz.getFachada().cambiarPeliculaPaseo(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaPaseo6());
			
		}
		if(e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaScream()) {
			
			interfaz.getFachada().cambiarPeliculaScream(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaScream());
			
		}
		if(e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaSpiderman()) {
			
			interfaz.getFachada().cambiarPeliculaSpiderman(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaSpiderman());
			
		}
		
		// // // // // // // // // VENTANA PELICULAS  // // // // // // // // //
		
		//encanto
		if(e.getSource() == interfaz.getVentanaPeliculaEncanto().getBtnSalir()) {
			
			interfaz.getFachada().regresoEncantoCartelera(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaEncanto());
			
		}
		if(e.getSource() == interfaz.getVentanaPeliculaEncanto().getBtnContinue()) {
			
			interfaz.getFachada().continueEncantoIngresoCliente(interfaz.getVentanaPeliculaEncanto(), interfaz.getVentanaIngresoCliente());
			
		}
		
		//Moonfall
		if (e.getSource() == interfaz.getVentanaPeliculaMoonfall().getBtnSalir()) {

			interfaz.getFachada().regresoMoonfallCartelera(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaMoonfall());

		}
		if(e.getSource() == interfaz.getVentanaPeliculaMoonfall().getBtnContinue()) {
			
			interfaz.getFachada().continueMoonfallIngresoCliente(interfaz.getVentanaPeliculaMoonfall(), interfaz.getVentanaIngresoCliente());
			
		}
		
		
		//Paseo 6
		if (e.getSource() == interfaz.getVentanaPeliculaPaseo6().getBtnSalir()) {

			interfaz.getFachada().regresoPaseoCartelera(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaPaseo6());

		}
		
		if(e.getSource() == interfaz.getVentanaPeliculaPaseo6().getBtnContinue()) {
			
			interfaz.getFachada().continuePaseoIngresoCliente(interfaz.getVentanaPeliculaPaseo6(), interfaz.getVentanaIngresoCliente());
			
		}
		
		//Scream
		if (e.getSource() == interfaz.getVentanaPeliculaScream().getBtnSalir()) {

			interfaz.getFachada().regresoScreamCartelera(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaScream());

		}
		if(e.getSource() == interfaz.getVentanaPeliculaScream().getBtnContinue()) {
			
			interfaz.getFachada().continueScreamIngresoCliente(interfaz.getVentanaPeliculaScream(), interfaz.getVentanaIngresoCliente());
			
		}
		
		//Spiderman
		if (e.getSource() == interfaz.getVentanaPeliculaSpiderman().getBtnSalir()) {

			interfaz.getFachada().regresoSpidermanCartelera(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaSpiderman());

		}
		if(e.getSource() == interfaz.getVentanaPeliculaSpiderman().getBtnContinue()) {
			
			interfaz.getFachada().continueSpidermanIngresoCliente(interfaz.getVentanaPeliculaSpiderman(), interfaz.getVentanaIngresoCliente());
			
		}
		
		// // // // // // // // // VENTANA INGRESO CLIENTE // // // // // // // // //
		
				
		if(e.getSource()== interfaz.getVentanaIngresoCliente().getBtnSalir()) {
			
			switch (interfaz.getVentanaIngresoCliente().getPeliculaSeleccionada()) {
				
			case "Encanto":
				
				interfaz.getFachada().regresoIngresoPelicula(interfaz.getVentanaPeliculaEncanto(), interfaz.getVentanaIngresoCliente());
		
			break;
			
			case "Moonfall":
				
				interfaz.getFachada().regresoIngresoPelicula(interfaz.getVentanaPeliculaMoonfall(), interfaz.getVentanaIngresoCliente());
				
			break;
			
			case "Paseo 6":
				
				interfaz.getFachada().regresoIngresoPelicula(interfaz.getVentanaPeliculaPaseo6(), interfaz.getVentanaIngresoCliente());
				
			break;
			case "Scream":
				
				interfaz.getFachada().regresoIngresoPelicula(interfaz.getVentanaPeliculaScream(), interfaz.getVentanaIngresoCliente());
				
			break;
			case "Spiderman":
				
				interfaz.getFachada().regresoIngresoPelicula(interfaz.getVentanaPeliculaSpiderman(), interfaz.getVentanaIngresoCliente());
				
			break;
	
			}
		}
		
		if(e.getSource() == interfaz.getVentanaIngresoCliente().getBtnIngreso()) {
			
			interfaz.getFachada().verificacionCliente(interfaz.getVentanaIngresoCliente(), interfaz.getVentanaCompraSilla());
			
		}
		if(e.getSource() == interfaz.getVentanaIngresoCliente().getBtnRegistroUsuario()) {
			
			interfaz.getFachada().ingresoIngresoClienteRegistroCliente(interfaz.getVentanaRegistroCliente(),interfaz.getVentanaIngresoCliente());
			
		}
		if(e.getSource() == interfaz.getVentanaIngresoCliente().getBtnOlvidoContraseña()) {
			
			interfaz.getFachada().ingresoIngresoClienteRecuperarContraseña(interfaz.getVentanaIngresoCliente(),interfaz.getVentanaRecuperarContraseña());
			
		}
		
		
		
		// // // // // // // // // VENTANA COMPRA SILLA // // // // // // // // //
		
		if(e.getSource() == interfaz.getVentanaCompraSilla().getBtnContinue()) {
			
			interfaz.getFachada().sillasSeleccionadas(interfaz.getVentanaCompraSilla(), interfaz.getVentanaSnacks());
			
		}
		if(e.getSource() == interfaz.getVentanaCompraSilla().getBtnSalir()) {
			
			interfaz.getFachada().regresoCompraSillaIngreso(interfaz.getVentanaCompraSilla(), interfaz.getVentanaIngresoCliente());
		}
		
		if(e.getSource()== interfaz.getVentanaCompraSilla().getRbtnGeneral()) {
			
			interfaz.getFachada().activarSpinnerGeneral(interfaz.getVentanaCompraSilla());
		}
		if(e.getSource()== interfaz.getVentanaCompraSilla().getRbtnPreferencial()) {
			
			interfaz.getFachada().activarSpinnerPreferencial(interfaz.getVentanaCompraSilla());
		}
		
		// // // // // // // // // VENTANA REGISTRO CLIENTE// // // // // // // // //
		
		if(e.getSource() == interfaz.getVentanaRegistroCliente().getBtnIngreso()) {
			
			interfaz.getFachada().registroClienteExitoso(interfaz.getVentanaRegistroCliente());
			
		}
		if(e.getSource() == interfaz.getVentanaRegistroCliente().getCbxAutorizacion()) {
			
			interfaz.getFachada().chechkBoxSelecionado(interfaz.getVentanaRegistroCliente());
		}

		if(e.getSource() == interfaz.getVentanaRegistroCliente().getBtnSalir()) {
			
			interfaz.getFachada().regresoRegistroClienteIngresoCliente(interfaz.getVentanaRegistroCliente(), interfaz.getVentanaIngresoCliente());
		}
		
		// // // // // // // // // VENTANA RECUPERAR CONTRASEÑA// // // // // // // // //

		if(e.getSource() == interfaz.getVentanaRecuperarContraseña().getBtnSalir()) {
			
			interfaz.getFachada().regresoRecuperarContraseñaIngresoCliente(interfaz.getVentanaIngresoCliente(),interfaz.getVentanaRecuperarContraseña());
		}
		if(e.getSource() == interfaz.getVentanaRecuperarContraseña().getBtnContinue()) {
			
			interfaz.getFachada().recuperarContraseña(interfaz.getVentanaRecuperarContraseña());
		}
		
		// // // // // // // // // VENTANA SNACKS // // // // // // // // //

		if(e.getSource() == interfaz.getVentanaSnacks().getTbtnImgCombo1()) {
			
			interfaz.getFachada().obtenerCombo1(interfaz.getVentanaSnacks());
		}
		if(e.getSource() == interfaz.getVentanaSnacks().getTbtnImgCombo2()) {
			
			interfaz.getFachada().obtenerCombo2(interfaz.getVentanaSnacks());
		}
		if(e.getSource() == interfaz.getVentanaSnacks().getTbtnImgCombo3()) {
			
			interfaz.getFachada().obtenerCombo3(interfaz.getVentanaSnacks());
		}
		if(e.getSource() == interfaz.getVentanaSnacks().getTbtnImgCombo4()) {
			
			interfaz.getFachada().obtenerCombo4(interfaz.getVentanaSnacks());
		}
		if(e.getSource() == interfaz.getVentanaSnacks().getBtnContinue()) {
			
			interfaz.getFachada().facturaConsola(interfaz.getVentanaSnacks());
			interfaz.getFachada().ingresoSnacksPago(interfaz.getVentanaSnacks(), interfaz.getVentanaPago());
			
		}
		if(e.getSource()==interfaz.getVentanaSnacks().getBtnSalir()) {
			
			interfaz.getFachada().regresoSnacksSilla(interfaz.getVentanaSnacks(), interfaz.getVentanaCompraSilla());
		}
		
		// // // // // // // // // // // // // //  // // VENTANA PAGO // // // // // // // // // // // // // // // //

		
		
		if(e.getSource() == interfaz.getVentanaPago().getTbtnBitcoin() ) {
			
			interfaz.getFachada().obtenerPago(interfaz.getVentanaPago());
			
		}
		if (e.getSource() == interfaz.getVentanaPago().getTbtnPaypal()) {

			interfaz.getFachada().obtenerPago(interfaz.getVentanaPago());

		}
		if(e.getSource() == interfaz.getVentanaPago().getBtnFinalizar()) {
			
			interfaz.getFachada().obtenerPago(interfaz.getVentanaPago());
			interfaz.getFachada().pagoFinal(interfaz.getVentanaCompraSilla(), interfaz.getVentanaSnacks());
			interfaz.getFachada().regresoPagoCartelera(interfaz.getVentanaPago(),interfaz.getVentanaCartelera());
			
		}
		if(e.getSource() == interfaz.getVentanaPago().getBtnSalir()) {
			interfaz.getFachada().regresoPagoSnacks(interfaz.getVentanaSnacks(), interfaz.getVentanaPago());
			
			
			
		}
		
		
		
		// // // // // // // // // // // // // //  // // VENTANA ADMIN // // // // // // // // // // // // // // // //
		
		if(e.getSource() == interfaz.getVentanaAdmin().getBtnAgregarEmpleado()) {
			interfaz.getFachada().ingresoAdminRegistro(interfaz.getVentanaAdmin(), interfaz.getVentanaRegistroUsuario());
		}
		if (e.getSource() == interfaz.getVentanaAdmin().getBtnCambiarContraseña()) {
			interfaz.getFachada().ingresoAdminContraseña(interfaz.getVentanaEstablecerContraseña(), interfaz.getVentanaAdmin());
		}
		if (e.getSource() == interfaz.getVentanaAdmin().getBtnCerrarSesion()) {

			interfaz.getFachada().cerrarSesionAdmin(interfaz.getVentanaInicio(), interfaz.getVentanaAdmin());
		}
		
		// // // // // // // // // // // // // //  // // VENTANA ESTABLECER CONTRASEÑA // // // // // // // // // // // // // // // //

		if(e.getSource() == interfaz.getVentanaEstablecerContraseña().getBtnSalir()) {
			
			interfaz.getFachada().regresoContraseñaAdmin(interfaz.getVentanaEstablecerContraseña(), interfaz.getVentanaAdmin());
		}if(e.getSource() == interfaz.getVentanaEstablecerContraseña().getBtnContinue()) {
			
			interfaz.getFachada().establecerContraseñaExitoso(interfaz.getVentanaEstablecerContraseña());
		}
		
		// // // // // // // // // // // // // //  // // VENTANA AGREGAR EMPLEADO // // // // // // // // // // // // // // // //
		if(e.getSource() == interfaz.getVentanaRegistroUsuario().getBtnSalir()) {
			
			interfaz.getFachada().regresoRegistroAdmin(interfaz.getVentanaRegistroUsuario(), interfaz.getVentanaAdmin());
		}
		if(e.getSource() == interfaz.getVentanaRegistroUsuario().getBtnIngreso()) {
			interfaz.getFachada().registroEmpleadoExitoso(interfaz.getVentanaRegistroUsuario());
		}
		
		
	}

	
	//Métodos obligatorios al implementar Key Listener

	@Override
	public void keyTyped(KeyEvent evt) {
		
		if(evt.getSource() == interfaz.getVentanaRegistroCliente().getTxtDocumento()) {
			
			char c = evt.getKeyChar(); if (c < '0' || c > '9') evt.consume();

		}
		if(evt.getSource() == interfaz.getVentanaRegistroCliente().getTxtNombre()) {
			
			char c = evt.getKeyChar(); if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')) evt.consume();
		}
		if(evt.getSource() == interfaz.getVentanaRegistroCliente().getTxtApellido()) {
			
			char c = evt.getKeyChar(); if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')) evt.consume();
			
		}
		
		if(evt.getSource() == interfaz.getVentanaRecuperarContraseña().getTxtDocumento()) {
			char c = evt.getKeyChar(); if (c < '0' || c > '9') evt.consume();

		}
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
