package interfaz.VentanaPeliculas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class VentanaPelicula extends JPanel {

	private JPanel pnlPrincipal;
	private String nombrePelicula ="";
    private	JButton btnSalir;
	private	JLabel imgPelicula;
	public static JComboBox<String> cmbCinesDisponibles;
	private JButton btnContinue;
	private String cineSeleccionado;
	private JLabel lblTitulo;
	
	
	
	
	
	public VentanaPelicula() {
		
		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);
		
		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);
		
		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		ImageIcon imagenSalir = new ImageIcon("./img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);
		
		btnContinue = new JButton();
		btnContinue.setBounds(400, 550, 154, 54);
		btnContinue.setContentAreaFilled(false);
		//btnContinue.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		ImageIcon imagenContinue = new ImageIcon("./img/imgBtnContinue.png");

		btnContinue.setIcon(new ImageIcon(imagenContinue.getImage().getScaledInstance(btnContinue.getWidth(),
				btnContinue.getHeight(), Image.SCALE_SMOOTH)));
		
		pnlPrincipal.add(btnContinue);
		
		
		
		
	}
	

	public void setPelicula(String nombrePelicula) {
		
		imgPelicula = new JLabel();
		imgPelicula.setBounds(70, 100, 260, 410);
		imgPelicula.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4, true));
		
		lblTitulo = new JLabel();
		lblTitulo.setBounds(400, 100, 210, 50);
		lblTitulo.setFont(new Font("Comic Sans MS", 3, 50));
		
		JTextArea txaDescripcion = new JTextArea();
		txaDescripcion.setBounds(340, 180, 340, 200);
		txaDescripcion.setEditable(false);
		txaDescripcion.setOpaque(false);
		txaDescripcion.setLineWrap(true);
		txaDescripcion.setFont(new Font("Comic Sans MS", 0, 15));
		
		JLabel lblLimiteEdad = new JLabel();
		lblLimiteEdad.setBounds(80, 520, 60, 90);
		
		JLabel lblGeneros = new JLabel();
		lblGeneros.setBounds(170, 540, 200, 65);
		lblGeneros.setFont(new Font("Andale Mono", 2, 18));
		lblGeneros.setForeground(Color.BLACK);
		
		JLabel lblDirectores = new JLabel();
		lblDirectores.setBounds(340, 340, 100, 20);
		lblDirectores.setFont(new Font("Comic Sans MS", 1, 15));
		lblDirectores.setText("Directores: ");
		
		JLabel lblDirectoresPelicula = new JLabel();
		lblDirectoresPelicula.setBounds(340,  350,  390,  50);
		lblDirectoresPelicula.setFont(new Font("Comic Sans MS", 0, 13));
		//lblDirectoresPelicula.setText("Texto de Prueba");
		
		JLabel lblCinesDisponibles = new JLabel();
		lblCinesDisponibles.setBounds(340, 410, 150, 15);
		lblCinesDisponibles.setText("Cines Disponibles: ");
		lblCinesDisponibles.setFont(new Font("Comic Sans MS", 1, 15));
		
		pnlPrincipal.add(lblCinesDisponibles);
		

		
		

		cmbCinesDisponibles = new JComboBox<String>();
		cmbCinesDisponibles.setBounds(340, 430, 150, 20);
		cmbCinesDisponibles.addItem("Seleccione");
		cmbCinesDisponibles.addItem("Centro");
		cmbCinesDisponibles.addItem("Titan Plaza");
		cmbCinesDisponibles.addItem("Gran Estación");
		cmbCinesDisponibles.addItem("Embajador");
		cmbCinesDisponibles.addItem("Plaza Americas");
		cmbCinesDisponibles.addItem("Unicentro");
		
		
		
		//La idea es crear un metodo que revise en la base de datos que cines cuentan con esta funcion
		
		pnlPrincipal.add(cmbCinesDisponibles);
		

		
		switch (nombrePelicula){
		
		case "Encanto": 
			
			ImageIcon imagenEncanto = new ImageIcon("./img/Encanto.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenEncanto.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			
			lblTitulo.setText("Encanto");
			txaDescripcion.setText("cuenta la historia de los Madrigal, una familia ex-traordinaria que vive escondida "
					+ "en las montañas de Colombia, en una casa mágica, en un pueblo vi- brante, en un lugar maravilloso "
					+ "conocido como un Encanto.");
			
			
			ImageIcon imgEdadEncanto = new ImageIcon("./img/imgEdadTodos.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadEncanto.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			lblGeneros.setText("<html>• Animación <br>• Aventura <br>• Comedia</html>");
			
			lblDirectoresPelicula.setText("Byron Howard y Jared Bush.");
			
			
			
			break;
			
		case "Moonfall":
			ImageIcon imagenMoonfall = new ImageIcon("./img/Moonfall.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenMoonfall.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Moonfall");
			lblTitulo.setFont(new Font("Comic Sans MS", 3, 49));
			txaDescripcion.setText("una fuerza misteriosa saca a la Luna de su órbita alrededor de la "
					+ "Tierra y la envía a toda \nvelocidad en un curso de colisión con la vida tal   como la conocemos.");
			
			ImageIcon imgEdadMoonfall = new ImageIcon("./img/imgEdad10.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadMoonfall.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			lblDirectoresPelicula.setText("Roland Emmerich");
			
			//La idea es crear un metodo que revise en la base de datos que cines cuentan con esta funcion
			cmbCinesDisponibles.removeItem("Unicentro");
			lblGeneros.setText("<html>• Ciencia Ficción <br>• Fantasia <br>• Aventura</html>");
			
			
			break;
			
		case "Paseo6":
			
			ImageIcon imagenPaseo6 = new ImageIcon("./img/Paseo6.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenPaseo6.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Paseo 6");
			lblTitulo.setFont(new Font("Comic Sans MS", 3, 49));
			txaDescripcion.setText("La Excursión de 11 es el paseo donde todo puede pasar, pero excursión de 11 "
					+ "con los papás, eso sí es el colmo. Y como Álvaro Castaño sabe que es mejor la seguridad "
					+ "que la policía, decide viajar con su familia para vigilar a su hija Sarita, sin embargo, "
					+ "su suegra, Raquel, no está dispuesta a permitirlo y también se embarca en el plan.");
			
			ImageIcon imgEdadPaseo6 = new ImageIcon("./img/imgEdadTeen.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadPaseo6.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			
			lblDirectoresPelicula.setText("Rodrigo Triana");
			
			lblGeneros.setText("<html>• Comedia </html>");
			
			
			break;
			
		
		case "Scream":
			
			ImageIcon imagenScream = new ImageIcon("./img/Scream.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenScream.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Scream");
			lblTitulo.setFont(new Font("Comic Sans MS", 3, 49));
			txaDescripcion.setText("Una nueva entrega de la franquicia de terror 'Scream' seguirá a "
					+ "una mujer que regresa a su ciudad natal para tratar de averiguar quién ha estado "
					+ "cometiendo una serie de crímenes viciosos.");
			
			ImageIcon imgEdadScream = new ImageIcon("./img/imgEdad17.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadScream.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			lblDirectoresPelicula.setText(" Wes Craven");
			
			lblGeneros.setText("<html>• Terror <br>• Misterio </html>");
			
			
			
			
			break;
			
		case "Spiderman":
			
			ImageIcon imagenSpiderman = new ImageIcon("./img/Spiderman.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenSpiderman.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Spiderman");
			lblTitulo.setBounds(380, 100, 250, 70);
			lblTitulo.setFont(new Font("Comic Sans MS", 3, 45));
			txaDescripcion.setText("Por primera vez en la historia cinematográfica de Spider- Man, "
					+ "nuestro amistoso héroe y vecino es desenmascarado, y ya no puede separar su vida "
					+ "normal de los altos riesgos de ser un súper héroe. ");
			
			
			ImageIcon imgEdadSpiderman = new ImageIcon("./img/imgEdad10.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadSpiderman.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			lblDirectoresPelicula.setText("Marvel Comics y Stan Lee");
			
			lblGeneros.setText("<html>• Acción <br>• Aventura</html>");
		
			
			
			break;
			
		
		
		}
	
	
		pnlPrincipal.add(lblGeneros);
		pnlPrincipal.add(lblTitulo);
		pnlPrincipal.add(imgPelicula);
		pnlPrincipal.add(lblLimiteEdad);
		pnlPrincipal.add(txaDescripcion);
		pnlPrincipal.add(lblDirectores);
		pnlPrincipal.add(lblDirectoresPelicula);
		
		
	}

	
	public JButton getBtnSalir() {
		return btnSalir;
	}
	
	public JButton getBtnContinue() {
		return btnContinue;
	}
	
	//Acá deberia ir JComboBox<Cine>
	public JComboBox<String> getCmbCinesDisponibles(){
		return cmbCinesDisponibles;
	}
	
	
	
	
	
	private void crearPanelPelicula() {
		
		imgPelicula = new JLabel();
		imgPelicula.setBounds(70, 100, 260, 410);
		imgPelicula.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4, true));
		
		lblTitulo = new JLabel();
		lblTitulo.setBounds(400, 100, 210, 50);
		lblTitulo.setFont(new Font("Comic Sans MS", 3, 50));
		
		JTextArea txaDescripcion = new JTextArea();
		txaDescripcion.setBounds(340, 180, 340, 200);
		txaDescripcion.setEditable(false);
		txaDescripcion.setOpaque(false);
		txaDescripcion.setLineWrap(true);
		txaDescripcion.setFont(new Font("Comic Sans MS", 0, 15));
		
		JLabel lblLimiteEdad = new JLabel();
		lblLimiteEdad.setBounds(80, 520, 60, 90);
		
		JLabel lblGeneros = new JLabel();
		lblGeneros.setBounds(170, 540, 200, 65);
		lblGeneros.setFont(new Font("Andale Mono", 2, 18));
		lblGeneros.setForeground(Color.BLACK);
		
		JLabel lblDirectores = new JLabel();
		lblDirectores.setBounds(340, 340, 100, 20);
		lblDirectores.setFont(new Font("Comic Sans MS", 1, 15));
		lblDirectores.setText("Directores: ");
		
		JLabel lblDirectoresPelicula = new JLabel();
		lblDirectoresPelicula.setBounds(340,  350,  390,  50);
		lblDirectoresPelicula.setFont(new Font("Comic Sans MS", 0, 13));
		//lblDirectoresPelicula.setText("Texto de Prueba");
		
		JLabel lblCinesDisponibles = new JLabel();
		lblCinesDisponibles.setBounds(340, 410, 150, 15);
		lblCinesDisponibles.setText("Cines Disponibles: ");
		lblCinesDisponibles.setFont(new Font("Comic Sans MS", 1, 15));
		
		pnlPrincipal.add(lblCinesDisponibles);
		

		
		

		cmbCinesDisponibles = new JComboBox<String>();
		cmbCinesDisponibles.setBounds(340, 430, 150, 20);
		cmbCinesDisponibles.addItem("Seleccione");
		cmbCinesDisponibles.addItem("Centro");
		cmbCinesDisponibles.addItem("Titan Plaza");
		cmbCinesDisponibles.addItem("Gran Estación");
		cmbCinesDisponibles.addItem("Embajador");
		cmbCinesDisponibles.addItem("Plaza Americas");
		cmbCinesDisponibles.addItem("Unicentro");
		
		
		
		//La idea es crear un metodo que revise en la base de datos que cines cuentan con esta funcion
		
		pnlPrincipal.add(cmbCinesDisponibles);
		
		
		
		
		
		
		
		
		
		
		
		switch (nombrePelicula){
		
		case "Encanto": 
			
			ImageIcon imagenEncanto = new ImageIcon("./img/Encanto.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenEncanto.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			
			lblTitulo.setText("Encanto");
			txaDescripcion.setText("cuenta la historia de los Madrigal, una familia ex-traordinaria que vive escondida "
					+ "en las montañas de Colombia, en una casa mágica, en un pueblo vi- brante, en un lugar maravilloso "
					+ "conocido como un Encanto.");
			
			
			ImageIcon imgEdadEncanto = new ImageIcon("./img/imgEdadTodos.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadEncanto.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			lblGeneros.setText("<html>• Animación <br>• Aventura <br>• Comedia</html>");
			
			lblDirectoresPelicula.setText("Byron Howard y Jared Bush.");
			
			
			
			break;
			
		case "Moonfall":
			ImageIcon imagenMoonfall = new ImageIcon("./img/Moonfall.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenMoonfall.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Moonfall");
			lblTitulo.setFont(new Font("Comic Sans MS", 3, 49));
			txaDescripcion.setText("una fuerza misteriosa saca a la Luna de su órbita alrededor de la "
					+ "Tierra y la envía a toda \nvelocidad en un curso de colisión con la vida tal   como la conocemos.");
			
			ImageIcon imgEdadMoonfall = new ImageIcon("./img/imgEdad10.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadMoonfall.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			lblDirectoresPelicula.setText("Roland Emmerich");
			
			//La idea es crear un metodo que revise en la base de datos que cines cuentan con esta funcion
			cmbCinesDisponibles.removeItem("Unicentro");
			lblGeneros.setText("<html>• Ciencia Ficción <br>• Fantasia <br>• Aventura</html>");
			
			
			break;
			
		case "Paseo6":
			
			ImageIcon imagenPaseo6 = new ImageIcon("./img/Paseo6.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenPaseo6.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Paseo 6");
			lblTitulo.setFont(new Font("Comic Sans MS", 3, 49));
			txaDescripcion.setText("La Excursión de 11 es el paseo donde todo puede pasar, pero excursión de 11 "
					+ "con los papás, eso sí es el colmo. Y como Álvaro Castaño sabe que es mejor la seguridad "
					+ "que la policía, decide viajar con su familia para vigilar a su hija Sarita, sin embargo, "
					+ "su suegra, Raquel, no está dispuesta a permitirlo y también se embarca en el plan.");
			
			ImageIcon imgEdadPaseo6 = new ImageIcon("./img/imgEdadTeen.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadPaseo6.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			
			lblDirectoresPelicula.setText("Rodrigo Triana");
			
			lblGeneros.setText("<html>• Comedia </html>");
			
			
			break;
			
		
		case "Scream":
			
			ImageIcon imagenScream = new ImageIcon("./img/Scream.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenScream.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Scream");
			lblTitulo.setFont(new Font("Comic Sans MS", 3, 49));
			txaDescripcion.setText("Una nueva entrega de la franquicia de terror 'Scream' seguirá a "
					+ "una mujer que regresa a su ciudad natal para tratar de averiguar quién ha estado "
					+ "cometiendo una serie de crímenes viciosos.");
			
			ImageIcon imgEdadScream = new ImageIcon("./img/imgEdad17.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadScream.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			lblDirectoresPelicula.setText(" Wes Craven");
			
			lblGeneros.setText("<html>• Terror <br>• Misterio </html>");
			
			
			
			
			break;
			
		case "Spiderman":
			
			ImageIcon imagenSpiderman = new ImageIcon("./img/Spiderman.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenSpiderman.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Spiderman");
			lblTitulo.setBounds(380, 100, 250, 70);
			lblTitulo.setFont(new Font("Comic Sans MS", 3, 45));
			txaDescripcion.setText("Por primera vez en la historia cinematográfica de Spider- Man, "
					+ "nuestro amistoso héroe y vecino es desenmascarado, y ya no puede separar su vida "
					+ "normal de los altos riesgos de ser un súper héroe. ");
			
			
			ImageIcon imgEdadSpiderman = new ImageIcon("./img/imgEdad10.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadSpiderman.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			lblDirectoresPelicula.setText("Marvel Comics y Stan Lee");
			
			lblGeneros.setText("<html>• Acción <br>• Aventura</html>");
		
			
			
			break;
			
		
		
		}
	
	
		pnlPrincipal.add(lblGeneros);
		pnlPrincipal.add(lblTitulo);
		pnlPrincipal.add(imgPelicula);
		pnlPrincipal.add(lblLimiteEdad);
		pnlPrincipal.add(txaDescripcion);
		pnlPrincipal.add(lblDirectores);
		pnlPrincipal.add(lblDirectoresPelicula);
	
	}



//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == btnSalir) {
//			this.dispose();
//			System.out.println("Ha regresado a la ventana de Cartelera");
//
//			VentanaCartelera v2 = new VentanaCartelera();
//			v2.setVisible(true);
//			
//			this.dispose();
//			
//			
//		}
//		else if(e.getSource()==cmbCinesDisponibles) {
//			
//		 cineSeleccionado = (String)cmbCinesDisponibles.getSelectedItem();
//			
//		 
//		 
//		}else if(e.getSource()==btnContinue) {
//			
//			if(cineSeleccionado.equals("Seleccione")) {
//				
//				JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error", JOptionPane.ERROR_MESSAGE);
//				
//				
//			}else {
//				
//				
//				System.out.println("Cine seleccionado: "+ cineSeleccionado);
//				VentanaIngresoCliente v3 = new VentanaIngresoCliente(cineSeleccionado, nombrePelicula);
//				this.dispose();
//				v3.setVisible(true);
//				
//			}
//			
//		
//			
//			
//		}
//		
//	}
	

	
	
	
	
}
