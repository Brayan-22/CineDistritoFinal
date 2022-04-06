package facade;

import Logica.AbstractFactory.*;
import Logica.CRUD.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.colorchooser.DefaultColorSelectionModel;

import Presentacion.*;
import Logica.Principal.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Fachada {
        private AbstractFactoryCRUD miFabrica;
        private Read read;
        private Create create;
        private Update update;
        private Sistema sistema;
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
            miFabrica=new FabricaEmpleado(myName);
            read=miFabrica.readRegistro();
            ArrayList arrayTemp = read.operacionCrud();
            if (myName.isEmpty() || myPass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            }else if(arrayTemp.isEmpty()){
                JOptionPane.showMessageDialog(null, "Este empleado no se encuentra registrado");
            }else if(myName.equals(arrayTemp.get(0)) && myPass.equals(arrayTemp.get(1))){
                System.out.println("Usuario: "+myName);
                System.out.println("Contraseña: "+myPass);
		vi.setVisible(false);
		vc.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
            }

		
}
	// // // // // // // // // // VENTANA CARTELERA // // // // // // // // // //  
	public void cambiarPanel(VentanaCartelera vc, VentanaInicio vi) {
	
		System.out.println("Ha regresado a la ventana de inicio");
		vc.setVisible(false);
		vi.setVisible(true);
		
	}
	

	
	public void cambiarCarteleraPelicula(VentanaCartelera vc, VentanaPelicula vp) {
                vp.getCmbSalasDisponibles().removeAllItems();
		vc.setVisible(false);
		vp.setVisible(true);

	}
	
	// // // // // // // // // // VENTANA PELICULA // // // // // // // // // // 
	
	public void setPelicula(String nombrePelicula, VentanaPelicula vp) {
            vp.getCmbSalasDisponibles().removeAllItems();
            
		switch (nombrePelicula) {

		case "Encanto":
                        sistema= new Sistema();

			ImageIcon imagenEncanto = new ImageIcon("./img/Encanto.jpg");
			vp.getLblImagen().setIcon(new ImageIcon(imagenEncanto.getImage().getScaledInstance(vp.getLblImagen().getWidth(),
					vp.getLblImagen().getHeight(), Image.SCALE_SMOOTH)));

			vp.getLblTitulo().setText("Encanto");
			vp.getTxtDescripcion().setText("cuenta la historia de los Madrigal, una familia ex-traordinaria que vive escondida "
					+ "en las montañas de Colombia, en una casa mágica, en un pueblo vi- brante, en un lugar maravilloso "
					+ "conocido como un Encanto.");

			ImageIcon imgEdadEncanto = new ImageIcon("./img/imgEdadTodos.png");
			vp.getLblLimiteEdad().setIcon(new ImageIcon(imgEdadEncanto.getImage().getScaledInstance(vp.getLblLimiteEdad().getWidth(),
					vp.getLblLimiteEdad().getHeight(), Image.SCALE_SMOOTH)));

			vp.getLblGeneros().setText("<html>• Animación <br>• Aventura <br>• Comedia</html>");

			vp.getLblDirectoresPelicula().setText("Byron Howard y Jared Bush.");
                        
                        sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).actualizarSalas();
                        for (int i = 0; i < sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().size(); i++) {
                            if (sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().get(i).getId_pelicula()==1) {
                                vp.getCmbSalasDisponibles().addItem(String.valueOf(sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().get(i).getCodigoSala()));
                            }
                    }
                        //vp.getCmbCinesDisponibles().addItem(nombrePelicula);

			break;

		case "Moonfall":
                        sistema=new Sistema();
			ImageIcon imagenMoonfall = new ImageIcon("./img/Moonfall.jpg");
			vp.getLblImagen().setIcon(new ImageIcon(imagenMoonfall.getImage().getScaledInstance(vp.getLblImagen().getWidth(),
					vp.getLblImagen().getHeight(), Image.SCALE_SMOOTH)));

			vp.getLblTitulo().setText("Moonfall");
			vp.getLblTitulo().setFont(new Font("Comic Sans MS", 3, 49));
			vp.getTxtDescripcion().setText("una fuerza misteriosa saca a la Luna de su órbita alrededor de la "
					+ "Tierra y la envía a toda \nvelocidad en un curso de colisión con la vida tal   como la conocemos.");

			ImageIcon imgEdadMoonfall = new ImageIcon("./img/imgEdad10.png");
			vp.getLblLimiteEdad().setIcon(new ImageIcon(imgEdadMoonfall.getImage().getScaledInstance(vp.getLblLimiteEdad().getWidth(),
					vp.getLblLimiteEdad().getHeight(), Image.SCALE_SMOOTH)));

			vp.getLblDirectoresPelicula().setText("Roland Emmerich");

			vp.getLblGeneros().setText("<html>• Ciencia Ficción <br>• Fantasia <br>• Aventura</html>");
                        sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).actualizarSalas();
                        for (int i = 0; i < sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().size(); i++) {
                            if (sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().get(i).getId_pelicula()==2) {
                                vp.getCmbSalasDisponibles().addItem(String.valueOf(sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().get(i).getCodigoSala()));
                        }
                    }
			break;

		case "Paseo 6":
                        sistema=new Sistema();

			ImageIcon imagenPaseo6 = new ImageIcon("./img/Paseo6.jpg");
			vp.getLblImagen().setIcon(new ImageIcon(imagenPaseo6.getImage().getScaledInstance(vp.getLblImagen().getWidth(),
					vp.getLblImagen().getHeight(), Image.SCALE_SMOOTH)));

			vp.getLblTitulo().setText("Paseo 6");
			vp.getLblTitulo().setFont(new Font("Comic Sans MS", 3, 49));
			vp.getTxtDescripcion().setText("La Excursión de 11 es el paseo donde todo puede pasar, pero excursión de 11 "
					+ "con los papás, eso sí es el colmo. Y como Álvaro Castaño sabe que es mejor la seguridad "
					+ "que la policía, decide viajar con su familia para vigilar a su hija Sarita, sin embargo, "
					+ "su suegra, Raquel, no está dispuesta a permitirlo y también se embarca en el plan.");

			ImageIcon imgEdadPaseo6 = new ImageIcon("./img/imgEdadTeen.png");
			vp.getLblLimiteEdad().setIcon(new ImageIcon(imgEdadPaseo6.getImage().getScaledInstance(vp.getLblLimiteEdad().getWidth(),
					vp.getLblLimiteEdad().getHeight(), Image.SCALE_SMOOTH)));

			vp.getLblDirectoresPelicula().setText("Rodrigo Triana");

			vp.getLblGeneros().setText("<html>• Comedia </html>");
                        
                        sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).actualizarSalas();
                        for (int i = 0; i < sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().size(); i++) {
                            if (sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().get(i).getId_pelicula()==3) {
                                vp.getCmbSalasDisponibles().addItem(String.valueOf(sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().get(i).getCodigoSala()));
                            }
                    }

			break;

		case "Scream":
                        sistema= new Sistema();
			ImageIcon imagenScream = new ImageIcon("./img/Scream.jpg");
			vp.getLblImagen().setIcon(new ImageIcon(imagenScream.getImage().getScaledInstance(vp.getLblImagen().getWidth(),
					vp.getLblImagen().getHeight(), Image.SCALE_SMOOTH)));

			vp.getLblTitulo().setText("Scream");
			vp.getLblTitulo().setFont(new Font("Comic Sans MS", 3, 49));
			vp.getTxtDescripcion().setText("Una nueva entrega de la franquicia de terror 'Scream' seguirá a "
					+ "una mujer que regresa a su ciudad natal para tratar de averiguar quién ha estado "
					+ "cometiendo una serie de crímenes viciosos.");

			ImageIcon imgEdadScream = new ImageIcon("./img/imgEdad17.png");
			vp.getLblLimiteEdad().setIcon(new ImageIcon(imgEdadScream.getImage().getScaledInstance(vp.getLblLimiteEdad().getWidth(),
					vp.getLblLimiteEdad().getHeight(), Image.SCALE_SMOOTH)));

			vp.getLblDirectoresPelicula().setText(" Wes Craven");

			vp.getLblGeneros().setText("<html>• Terror <br>• Misterio </html>");
                        sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).actualizarSalas();
                        for (int i = 0; i < sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().size(); i++) {
                            if (sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().get(i).getId_pelicula()==4) {
                                vp.getCmbSalasDisponibles().addItem(String.valueOf(sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().get(i).getCodigoSala()));
                            }
                    }

			break;

		case "Spiderman":
                        sistema=new Sistema();
			ImageIcon imagenSpiderman = new ImageIcon("./img/Spiderman.jpg");
			vp.getLblImagen().setIcon(new ImageIcon(imagenSpiderman.getImage().getScaledInstance(vp.getLblImagen().getWidth(),
					vp.getLblImagen().getHeight(), Image.SCALE_SMOOTH)));

			vp.getLblTitulo().setText("Spiderman");
			vp.getLblTitulo().setBounds(380, 100, 250, 70);
			vp.getLblTitulo().setFont(new Font("Comic Sans MS", 3, 45));
			vp.getTxtDescripcion().setText("Por primera vez en la historia cinematográfica de Spider- Man, "
					+ "nuestro amistoso héroe y vecino es desenmascarado, y ya no puede separar su vida "
					+ "normal de los altos riesgos de ser un súper héroe. ");

			ImageIcon imgEdadSpiderman = new ImageIcon("./img/imgEdad10.png");
			vp.getLblLimiteEdad().setIcon(new ImageIcon(imgEdadSpiderman.getImage().getScaledInstance(vp.getLblLimiteEdad().getWidth(),
					vp.getLblLimiteEdad().getHeight(), Image.SCALE_SMOOTH)));

			vp.getLblDirectoresPelicula().setText("Marvel Comics y Stan Lee");

			vp.getLblGeneros().setText("<html>• Acción <br>• Aventura</html>");
                        
                        sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).actualizarSalas();
                        for (int i = 0; i < sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().size(); i++) {
                            if (sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().get(i).getId_pelicula()==5) {
                                vp.getCmbSalasDisponibles().addItem(String.valueOf(sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas().get(i).getCodigoSala()));
                        }
                    }
			break;

		}

	}

	
	//encanto
	public void regresoPeliculaCartelera(VentanaCartelera vc, VentanaPelicula vp) {
		System.out.println("Regresó a la Cartelera");
		vc.setVisible(true);
		vp.setVisible(false);
	}
	
	
	
	public void continueIngresoCliente(VentanaPelicula vp, VentanaIngresoCliente vic) {

		if(vp.cmbCinesDisponibles.getSelectedItem().equals("Seleccione")) {
			
			JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
	
		System.out.println("...Ingreso...");
		System.out.println("Pelicula: "+vp.getLblTitulo().getText());
		vic.setPeliculaSeleccionada(vp.getLblTitulo().getText());
		System.out.println("Cine: "+vp.cmbCinesDisponibles.getSelectedItem());
		vic.setCineSeleccionado((String)vp.cmbCinesDisponibles.getSelectedItem());
		vp.setVisible(false);
		vic.setVisible(true);
		}
	}
	
	
	////////////////////////////////////////////////////// VENTANA INGRESO CLIENTE ////////////////////////////////////
	
	public void verificacionCliente(VentanaIngresoCliente vic, VentanaCompraSilla vcs, VentanaPelicula vp) {
            
		
		if(verificar.esCorreo(vic.getTxtCorreo()) && !vic.getPwdContraseña().getText().isEmpty()) {
                        miFabrica=new FabricaCliente(vic.getTxtCorreo());
			read=miFabrica.readRegistro();
                        ArrayList arrayTemp= read.operacionCrud();
                        
			System.out.println("\nValidando información de Correo....");
                        if (vic.getTxtCorreo().equals(arrayTemp.get(1)) && vic.getPwdContraseña().getText().equals(arrayTemp.get(2))) {
                            System.err.println("es correcto");
                            vcs.setLblCine((String)vp.getCmbCinesDisponibles().getSelectedItem());
                            vcs.setLblPelicula(vp.getLblTitulo().getText());
                            vcs.setLblSalaActual((String)vp.getCmbSalasDisponibles().getSelectedItem());
                            vic.setVisible(false);
                            vcs.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(null, "Credenciales incorrectas, registrese");
                        }
                        
			
			// se debe tener en cuenta para escribir en la base de datos

			
			
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
	
	public void regresoIngresoClientePelicula(VentanaIngresoCliente vic, VentanaPelicula vp) {
		
		System.out.println("Regresó a la ventana Pelicula");
		vic.setVisible(false);
		vp.setVisible(true);
	}
	
	// // // // // // // // // // VENTANA COMPRA SILLA // // // // // // // // // // 

	public void sillasSeleccionadas(VentanaCompraSilla vcs, VentanaSnacks vs) {
		int SillasSeleccionadas=0;
		Componentes = vcs.getComponentesSilla();
		String Sillas ="";
		int sillasGenerales=0;
		int sillasPreferenciales = 0;
		
		if(vcs.getSpnGeneral().isEnabled() || vcs.getSpnPreferencial().isEnabled()) {

	
			
			for (int i=0; i<Componentes.length; i++) {
				
				
				 if( ( (JToggleButton) Componentes[i]).isSelected() ){
	                Sillas += ((JToggleButton) Componentes[i]).getName() + " - ";
	              }
	          }
				
			System.out.println("Sillas seleccionadas: "+Sillas);
			

			//Sirve para saber que sillas generales estan seleccionadas: 
			if(vcs.getIntSpnGeneral() !=  0) {
				
				for (int i=0; i<40; i++) {
					
					 if( ( (JToggleButton) Componentes[i]).isSelected() ){
		                 
						 sillasGenerales++;
		              }
		          }

				
			}
			
			//sirve para saber que sillas Preferenciales estan seleccionadas
			if(vcs.getIntSpnPreferencial() !=0) {
				
				for (int j=40; j<60; j++) {
					
					 if( ( (JToggleButton) Componentes[j]).isSelected() ){
						 sillasPreferenciales++;
					 }
		          }
	

					
			}if(sillasGenerales != vcs.getIntSpnGeneral() && vcs.getSpnGeneral().isEnabled() || (!vcs.getSpnGeneral().isEnabled() && sillasGenerales>0)) {
				
				JOptionPane.showMessageDialog(null, "Porfavor seleccione la cantidad correcta");
				
				
			}else if(sillasPreferenciales != vcs.getIntSpnPreferencial() && vcs.getSpnPreferencial().isEnabled()) {
		
					JOptionPane.showMessageDialog(null, "Porfavor seleccione la cantidad correcta");
				
				
			}
			else {
				
				if(!vcs.getSpnGeneral().isEnabled() && sillasGenerales>0) {
					JOptionPane.showMessageDialog(null, "Porfavor seleccione la cantidad correcta");

					
				}else if(!vcs.getSpnPreferencial().isEnabled() && sillasPreferenciales>0) {
					JOptionPane.showMessageDialog(null, "Porfavor seleccione la cantidad correcta");

			}else {
				System.out.println("Ingreso a la Ventana de Snacks");
				vcs.setVisible(false);
				vs.setVisible(true);
			}
			}

			
			
			
			
		}else {
			
			
			JOptionPane.showMessageDialog(null, "Porfavor seleccione asiento(s) para continuar", "NO Asiento", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}
	
	public void regresoCompraSillaIngreso(VentanaCompraSilla vcs, VentanaIngresoCliente vic) {
		
		System.out.println("Regresó a Ventana Ingreso Cliente");
		vcs.setVisible(false);
		vic.setVisible(true);
		
	}
	
	public void actualizarSillas(VentanaCompraSilla vcs) {
		
		Componentes = vcs.getComponentesSilla();
		
		
	}
	
//	public void actualizarSala01Encanto(VentanaCompraSilla vcs) {
//		
//		Componentes = vcs.getComponentesSilla();
//		
//		for (int i = 0; i < Componentes.length; i++) {
//
//			((JToggleButton) Componentes[i]).setBackground(new JToggleButton().getBackground());
//			// aca recoge los datos de la BDD ej. 10
//			((JToggleButton) Componentes[10]).setBackground(Color.BLUE);
//
//		}
//}
//	public void actualizarSala02Encanto(VentanaCompraSilla vcs) {
//		
//		Componentes = vcs.getComponentesSilla();
//		
//		for (int i = 0; i < Componentes.length; i++) {
//			((JToggleButton) Componentes[i]).setBackground(new JToggleButton().getBackground());
//			// aca recoge los datos de la BDD ej. 10
//			((JToggleButton) Componentes[25]).setBackground(Color.BLUE);
//
//		}
//}
	
	
	
		
	
		
	
	
	// // // // // // // // // VENTANA REGISTRO CLIENTE// // // // // // // // //


	public void ingresoIngresoClienteRegistroCliente(VentanaRegistroCliente vrc, VentanaIngresoCliente vic) {
		
		System.out.println("Ingresó a la Ventana de Registro");
		vic.setVisible(false);
		vrc.setVisible(true);
		
	}
	
	public void registroClienteExitoso(VentanaRegistroCliente vrc) {
		
		
		if (!Verificar.esCorreo(vrc.getTxtCorreo().getText())) {
			JOptionPane.showMessageDialog(null, "Ingrese un formato de correo válido");
			vrc.getTxtCorreo().setText("");
		}
		else if(vrc.getTxtApellido().getText().isEmpty() || vrc.getTxtContraseña().getText().isEmpty() || vrc.getTxtDocumento().getText().isEmpty() || vrc.getTxtNombre().getText().isEmpty()){
			
			JOptionPane.showMessageDialog(null, "Porfavor no deje espacios en blanco", "Espacios en blanco", JOptionPane.ERROR_MESSAGE);
			vrc.getBtnIngreso().setEnabled(false);
			vrc.getCbxAutorizacion().setSelected(false);
			
		}else {
                        
			vrc.getBtnIngreso().setEnabled(true);
			System.out.println("Se registró con éxito!");
			//Se agrega el Cliente a la BDD
                        miFabrica=new FabricaCliente(Integer.valueOf(vrc.getTxtDocumento().getText()), vrc.getTxtNombre().getText(), vrc.getTxtApellido().getText(), vrc.getTxtContraseña().getText(), vrc.getTxtCorreo().getText());
                        create=miFabrica.crearRegistro();
                        create.operacionCrud();
                        
                        vrc.getTxtApellido().setText("");
                        vrc.getTxtNombre().setText("");
                        vrc.getTxtDocumento().setText("");
                        vrc.getTxtCorreo().setText("");
                        vrc.getTxtContraseña().setText("");
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
			miFabrica = new FabricaCliente(vrc.getTxtCorreo());
                        read=miFabrica.readRegistro();
                        ArrayList arrayTemp = read.operacionCrud();
			//Se hace la verificación en la base de datos
			if(arrayTemp.isEmpty()){
                            JOptionPane.showMessageDialog(null, "credenciales incorrectas");
                        }else{
                            JOptionPane.showMessageDialog(null, "Usuario:"+arrayTemp.get(3)+"\nContraseña: "+arrayTemp.get(2));
                        }

		}else {
			JOptionPane.showMessageDialog(null, "Por favor llene todos los campos","ERROR", JOptionPane.ERROR_MESSAGE);
			
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
			return true;
		}
		
	}
	
	/////////////////////////////////////////////////////VETNANA REGISTRO USUSARIO ////////////////////////////////////
	
	public void regresoRegistroAdmin(VentanaRegistroUsuario vru, VentanaAdmin va) {
		
		System.out.println("regreso a Ventana Admin");
		va.setVisible(true);
		vru.setVisible(false);
		
	}
	
	
	
	public void registroEmpleadoExitoso(VentanaRegistroUsuario vru) {
		
		if(vru.getFTxtContraseña().getText().isEmpty() || vru.getFTxtCorreo().getText().isEmpty() || vru.getFTxtDocumento().getText().isEmpty() || vru.getFTxtNombre().getText().isEmpty() || vru.getFTxtTelefono().getText().isEmpty()) {

			JOptionPane.showMessageDialog(null, "Porfavor no deje espacios en blanco", "Espacios en blanco", JOptionPane.ERROR_MESSAGE);
			

		
			
		}else if(!Verificar.esCorreo(vru.getTxtCorreo())){
			
			JOptionPane.showMessageDialog(null, "Ingrese un correo válido", "Error correo", JOptionPane.WARNING_MESSAGE);
			

			
			
		}else {
                        String nombre = vru.getTxtNombre();
                        String apellido=vru.getTxtApellido();
                        String correo=vru.getTxtCorreo();
                        String telefono=vru.getTxtTelefono();
                        String multiplex=vru.getCmbMultiplex().getSelectedItem().toString();
                        String cedula=vru.getTxtDocumento();
                        String cargo=vru.getCmbCargo().getSelectedItem().toString();
                        String contraseña=vru.getTxtContraseña();
                        miFabrica=new FabricaEmpleado(Integer.valueOf(cedula), nombre, apellido, contraseña, telefono, LocalDate.now().toString(), multiplex(multiplex), cargo(cargo));
			create=miFabrica.crearRegistro();
                        create.operacionCrud();
			String codigo= "" + vru.getTxtNombre().charAt(0)+vru.getTxtNombre().charAt(1)+vru.getTxtNombre().charAt(2)+vru.getTxtNombre().charAt(3)+
					vru.getSelectedMultiplex().charAt(0)+vru.getSelectedMultiplex().charAt(1)+vru.getSelectedMultiplex().charAt(2)
					+vru.getSelectedMultiplex().charAt(3)+vru.getSelectedMultiplex().charAt(4)
					+vru.getTxtDocumento().charAt(0)+vru.getTxtDocumento().charAt(1)+vru.getTxtDocumento().charAt(2)+vru.getTxtDocumento().charAt(3)+vru.getTxtDocumento().charAt(4);
			
			JOptionPane.showMessageDialog(null, "Registro del empleado "+codigo+" exitoso!");
			System.out.println("Codigo de empleado generado: "+codigo);
                        vru.getFTxtDocumento().setText("");
                        vru.getFTxtApellido().setText("");
                        vru.getFTxtNombre().setText("");
                        vru.getFTxtCorreo().setText("");
                        vru.getFTxtTelefono().setText("");
                        vru.getFTxtContraseña().setText("");
		}
		
		
		
	}
	/////////////////////////////////////////////////////VETNANA PAGO ////////////////////////////////////
        public int cargo(String cargo){
            switch (cargo){
                case "Director":
                return 1;
                case "Cajero":
                return 2;
                case "Despachador Comida":
                return 3;
                case "Encargado Sala":
                return 4;
                case "Aseador":
                return 5;
                default:
                    return 0;
            }
        }
        public int multiplex(String multiplex){
            switch (multiplex){
                case "Titan":
                return 1;
                case "Unicentro":
                return 2;
                case "Plaza Central":
                return 3;
                case "Gran Estacion":
                return 4;
                case "Embajador":
                return 5;
                case "LasAmericas":
                return 6;
                default:
                    return 0;
            }
        }
	
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
	
	public void pagoFinal(VentanaCompraSilla vcs, VentanaSnacks vs, VentanaInicio vi, VentanaIngresoCliente vic, VentanaPelicula vpelicula) {
		
		/*
		 * Las multiplicaciones deberian ir con su respectivo precio   
		 */
		int SillasGenerales = (vcs.getIntSpnGeneral() * 11000);
		int SillasPreferenciales = (vcs.getIntSpnPreferencial() * 15000);
		int Combo1 = (vs.getIntSpnComb1() * 3500);
		int Combo2 = (vs.getIntSpnComb2() * 2500);
		int Combo3 = (vs.getIntSpnComb3() * 500);
		int Combo4 = (vs.getIntSpnComb4() * 1500);
		String SillasG ="";
		String SillasP ="";
		//Deberia ir un acceso a la BDD para verificar el nombre de la persona con el correo
		String NombreCliente = vic.getTxtCorreo(); 
		String NombreEmpleado = vi.getTxtNombre(); //Con el código registrado inicialmente, obtener el nombre del empleado
		
		
		String Precio="\nEmpleado: "+NombreEmpleado+"\nCliente: "+NombreCliente+"\nCine Seleccionado: "
		+(String)vpelicula.getCmbCinesDisponibles().getSelectedItem()+"\nPelicula: "+vpelicula.getLblTitulo().getText();
		
		int Total=0;
		
		Componentes = vcs.getComponentesSilla();


			
	
		//Sirve para saber que sillas generales estan seleccionadas: 
		if(vcs.getIntSpnGeneral() !=  0 && vcs.getRbtnGeneral().isSelected()) {
			
			for (int i=0; i<40; i++) {
				
				 if( ( (JToggleButton) Componentes[i]).isSelected() ){
	                SillasG += ((JToggleButton) Componentes[i]).getName() + "\n";
	              }
	          }
			Precio +="\n"+SillasG+"Sillas Generales ............$"+SillasGenerales+"\n";
			Total+=SillasGenerales;
			
		}
		
		//sirve para saber que sillas Preferenciales estan seleccionadas
		if(vcs.getIntSpnPreferencial() !=0 && vcs.getRbtnPreferencial().isSelected()) {
			
			for (int j=40; j<60; j++) {
				
				 if( ( (JToggleButton) Componentes[j]).isSelected() ){
	                SillasP += ((JToggleButton) Componentes[j]).getName() + "\n";
	              }
	          }
			Precio +="\n"+SillasP+"Sillas Preferenciales:............$"+SillasPreferenciales+"\n";
			Total+=SillasPreferenciales;

				
		}
		
		//sirve para conocer que combos seleccionó
		if(vs.getIntSpnComb1() != 0 && vs.getSpnCombo1().isEnabled()) {
			Precio +="\nCombo(s) 1..........................$"+Combo1;
			Total+=Combo1;
		}
		if(vs.getIntSpnComb2() != 0 && vs.getSpnCombo2().isEnabled()) {
			Precio +="\nCombo(s) 2..........................$"+Combo2;
			Total+=Combo2;
		}
		if(vs.getIntSpnComb3() != 0 && vs.getSpnCombo3().isEnabled()) {
			Precio +="\nCombo(s) 3..........................$"+Combo3;
			Total+=Combo3;
		}
		if(vs.getIntSpnComb4() != 0 && vs.getSpnCombo4().isEnabled()) {
			Precio +="\nCombo(s) 4..........................$"+Combo4;
			Total+=Combo4;
		}
		
		
		//El total de la factura
		Precio +="\n\n\nTotal...................................$"+Total;
		JOptionPane.showMessageDialog(null, Precio, "Factura", JOptionPane.PLAIN_MESSAGE);
		
		vic.setTxtCorreo("");
		vic.setPwdContraseña("");
		
		//recoge los botones de el panel para inhabilitarlos 
		
		for (int k=0; k<Componentes.length; k++) {
			
			 if( ( (JToggleButton) Componentes[k]).isSelected() ){
				 
				 ((JToggleButton) Componentes[k]).setSelected(false);
				 ((JToggleButton) Componentes[k]).setBackground(Color.red);
				 ((JToggleButton) Componentes[k]).setEnabled(false);  
             }
         }
		

	}
	
	public void reiniciar(VentanaCompraSilla vcs, VentanaSnacks vs, VentanaPago vp, VentanaPelicula vpeli) {
		
		
		System.err.println("No se que pasa");
		vcs.getSpnGeneral().setValue(1);
		vcs.getSpnGeneral().setEnabled(false);
		vcs.getSpnPreferencial().setValue(1);
		vcs.getSpnPreferencial().setEnabled(false);
		vcs.getRbtnGeneral().setSelected(false);
		vcs.getRbtnPreferencial().setSelected(false);
		
		vs.getTbtnImgCombo1().setSelected(false);
		vs.getSpnCombo1().setEnabled(false);
		vs.getSpnCombo1().setValue(1);
		ImageIcon imagenCombo1 = new ImageIcon("./img/combos/imgCombo1bn.png");
		vs.getTbtnImgCombo1().setIcon(new ImageIcon(imagenCombo1.getImage().getScaledInstance(vs.getTbtnImgCombo4().getWidth(),
				vs.getTbtnImgCombo4().getHeight(), Image.SCALE_SMOOTH)));
		
		vs.getTbtnImgCombo2().setSelected(false);
		vs.getSpnCombo2().setEnabled(false);
		vs.getSpnCombo2().setValue(1);
		ImageIcon imagenCombo2 = new ImageIcon("./img/combos/imgCombo2bn.png");
		vs.getTbtnImgCombo2().setIcon(new ImageIcon(imagenCombo2.getImage().getScaledInstance(vs.getTbtnImgCombo4().getWidth(),
				vs.getTbtnImgCombo4().getHeight(), Image.SCALE_SMOOTH)));
		
		vs.getTbtnImgCombo3().setSelected(false);
		vs.getSpnCombo3().setEnabled(false);
		vs.getSpnCombo3().setValue(1);
		ImageIcon imagenCombo3 = new ImageIcon("./img/combos/imgCombo3bn.png");
		vs.getTbtnImgCombo3().setIcon(new ImageIcon(imagenCombo3.getImage().getScaledInstance(vs.getTbtnImgCombo3().getWidth(),
				vs.getTbtnImgCombo4().getHeight(), Image.SCALE_SMOOTH)));
		
		vs.getTbtnImgCombo4().setSelected(false);
		vs.getSpnCombo4().setEnabled(false);
		vs.getSpnCombo4().setValue(1);
		ImageIcon imagenCombo4 = new ImageIcon("./img/combos/imgCombo4bn.png");
		vs.getTbtnImgCombo4().setIcon(new ImageIcon(imagenCombo4.getImage().getScaledInstance(vs.getTbtnImgCombo4().getWidth(),
				vs.getTbtnImgCombo4().getHeight(), Image.SCALE_SMOOTH)));
		
		//obtenerPago(vp);
		ImageIcon Paypalbn = new ImageIcon("./img/imgBtnPypal.png");
		vp.getTbtnPaypal().setIcon(new ImageIcon(Paypalbn.getImage().getScaledInstance(vp.getTbtnPaypal().getWidth(),
				vp.getTbtnPaypal().getHeight(), Image.SCALE_SMOOTH)));
		ImageIcon BtcBn = new ImageIcon("./img/imgBtnBitcoin.png");
		vp.getTbtnBitcoin().setIcon(new ImageIcon(BtcBn.getImage().getScaledInstance(vp.getTbtnBitcoin().getWidth(),
				vp.getTbtnBitcoin().getHeight(), Image.SCALE_SMOOTH)));
		
		vp.getButtonGroup().clearSelection();
		
		vpeli.getCmbCinesDisponibles().setSelectedIndex(0);
		
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
	

