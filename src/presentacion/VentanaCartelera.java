package interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import interfaz.VentanaPeliculas.VentanaPelicula;

public class VentanaCartelera extends JPanel{

	private JPanel pnlCartelera;
	private JButton btnSalir;
	private JPanel pnlPeliculas;
	private JButton peliculaEncanto;
	private JButton peliculaMoonfall;
	private JButton peliculaPaseo6;
	private JButton peliculaScream;
	private JButton peliculaSpiderman;
	String movieName ="";

	public VentanaCartelera() {

		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);
		
		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setBounds(0, 0, 700, 700);
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
		
		JPanel pnlCartelera = new JPanel();
		pnlCartelera.setBackground(Color.LIGHT_GRAY);
		pnlCartelera.setBounds(50, 90, 600, 470);
		pnlCartelera.setLayout(null);
		pnlCartelera.setOpaque(false);
		pnlCartelera.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));

		// Se crea el label que dice "Peliculas en cartelera"
		JLabel lblPeliculas = new JLabel();
		lblPeliculas.setBounds(180, 20, 250, 30);
		lblPeliculas.setText("PELICULAS EN CARTELERA");
		lblPeliculas.setFont(new Font("Comic Sans MS", 3, 16));

		pnlCartelera.add(lblPeliculas);

		
		JPanel pnlPeliculas = new JPanel();

		pnlPeliculas.setBounds(10, 70, 580, 390);
		pnlPeliculas.setPreferredSize(new Dimension (1050, 370));
		pnlPeliculas.setLayout(null);
		pnlPeliculas.setBackground(Color.GRAY);
		//pnlPeliculas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		pnlCartelera.add(pnlPeliculas);

		JScrollPane Scroll = new JScrollPane(pnlPeliculas);

		// Es importante que tenga el mismo posicionamiento
		Scroll.setBounds(10, 70, 580, 390);
		Scroll.setViewportView(pnlPeliculas);

		pnlCartelera.add(Scroll);
		
		peliculaEncanto = new JButton();
		peliculaEncanto.setBounds(50, 10, 150, 225);
		peliculaEncanto.setContentAreaFilled(false);
		ImageIcon imagenEncanto = new ImageIcon("./img/Encanto.jpg");

		peliculaEncanto.setIcon(new ImageIcon(imagenEncanto.getImage().getScaledInstance(peliculaEncanto.getWidth(),
				peliculaEncanto.getHeight(), Image.SCALE_SMOOTH)));

		pnlPeliculas.add(peliculaEncanto);
		
		JLabel lblPeliculaEncanto = new JLabel();
		lblPeliculaEncanto.setText("<html><body><center><strong>Encanto</strong></center> <br> Estreno:24 Nov 2021 <br>Género: Animación, Aventura </body></html>");
		lblPeliculaEncanto.setBounds(50, 250, 150, 75);
		
		pnlPeliculas.add(lblPeliculaEncanto);
	
		//Moonfall
		peliculaMoonfall = new JButton();
		peliculaMoonfall.setBounds(250, 10, 150, 225);
		peliculaMoonfall.setContentAreaFilled(false);
		ImageIcon imagenMoonfall = new ImageIcon("./img/Moonfall.jpg");

		peliculaMoonfall.setIcon(new ImageIcon(imagenMoonfall.getImage().getScaledInstance(peliculaMoonfall.getWidth(),
				peliculaMoonfall.getHeight(), Image.SCALE_SMOOTH)));

		pnlPeliculas.add(peliculaMoonfall);
		
		JLabel lblPeliculaMoonfall = new JLabel();
		lblPeliculaMoonfall.setText("<html><body><center><strong>Moonfall</strong></center> <br> Estreno:3 Feb 2022 <br>Género: Acción, Ciencia Ficción </body></html>");
		lblPeliculaMoonfall.setBounds(250, 250, 150, 75);
		
		pnlPeliculas.add(lblPeliculaMoonfall);
		
		//Paseo 6
		
		peliculaPaseo6 = new JButton();
		peliculaPaseo6.setBounds(450, 10, 150, 225);
		peliculaPaseo6.setContentAreaFilled(false);
		ImageIcon imagenPaseo6 = new ImageIcon("./img/Paseo6.jpg");

		peliculaPaseo6.setIcon(new ImageIcon(imagenPaseo6.getImage().getScaledInstance(peliculaPaseo6.getWidth(),
				peliculaPaseo6.getHeight(), Image.SCALE_SMOOTH)));

		pnlPeliculas.add(peliculaPaseo6);
		
		JLabel lblPeliculaPaseo6 = new JLabel();
		lblPeliculaPaseo6.setText("<html><body><center><strong>Paseo 6</strong></center> <br> Estreno:23 Dic 2021 <br>Género: Comedia </body></html>");
		lblPeliculaPaseo6.setBounds(450, 250, 150, 75);
		
		pnlPeliculas.add(lblPeliculaPaseo6);
		
		//Scream
		
		peliculaScream = new JButton();
		peliculaScream.setBounds(650, 10, 150, 225);
		peliculaScream.setContentAreaFilled(false);
		ImageIcon imagenScream = new ImageIcon("./img/Scream.jpg");

		peliculaScream.setIcon(new ImageIcon(imagenScream.getImage().getScaledInstance(peliculaScream.getWidth(),
				peliculaScream.getHeight(), Image.SCALE_SMOOTH)));

		pnlPeliculas.add(peliculaScream);
		
		JLabel lblPeliculaScream = new JLabel();
		lblPeliculaScream.setText("<html><body><center><strong>Scream</strong></center> <br> Estreno:13 Ene 2022 <br>Género: Terror </body></html>");
		lblPeliculaScream.setBounds(650, 250, 150, 75);
		
		pnlPeliculas.add(lblPeliculaScream);
		
		//Spiderman
		
		peliculaSpiderman = new JButton();
		peliculaSpiderman.setBounds(850, 10, 150, 225);
		peliculaSpiderman.setContentAreaFilled(false);
		ImageIcon imagenSpiderman = new ImageIcon("./img/Spiderman.jpg");

		peliculaSpiderman.setIcon(new ImageIcon(imagenSpiderman.getImage().getScaledInstance(peliculaSpiderman.getWidth(),
				peliculaSpiderman.getHeight(), Image.SCALE_SMOOTH)));

		pnlPeliculas.add(peliculaSpiderman);
		
		JLabel lblPeliculaSpiderman = new JLabel();
		lblPeliculaSpiderman.setText("<html><body><center><strong>Spiderman</strong></center> <br> Estreno:16 Dic 2021 <br>Género: Aventura </body></html>");
		lblPeliculaSpiderman.setBounds(850, 250, 150, 75);
		
		pnlPeliculas.add(lblPeliculaSpiderman);
		
		pnlPrincipal.add(pnlCartelera);
		
		
	}
	
	




	
	public JButton getBtnSalir() {
		return btnSalir;
	}
	
	public JButton getBtnPeliculaEncanto() {
		return peliculaEncanto;
	}
	
	public JButton getBtnPeliculaMoonfall() {
		return peliculaMoonfall;
	}
	
	public JButton getBtnPeliculaPaseo6() {
		return peliculaPaseo6;
	}
	
	public JButton getBtnPeliculaScream() {
		return peliculaScream;
	}
	
	public JButton getBtnPeliculaSpiderman() {
		return peliculaSpiderman;
	}
	
	
	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == btnSalir) {
//			this.dispose();
//			System.out.println("Ha regresado a la ventana de inicio");
//
//			VentanaInicio v1 = new VentanaInicio();
//			v1.setVisible(true);
//			
//			
//		}
//		else if(e.getSource()==peliculaEncanto) {
//			
//			System.out.println("Selecciono: Encanto");
//			movieName = "Encanto";
//			pelicula = new VentanaPelicula();
//			pelicula.setPelicula(movieName);
//			pelicula.setVisible(true);
//			this.dispose();
//		}
//		else if(e.getSource()==peliculaMoonfall) {
//			System.out.println("Selecciono: Moonfall");
//			movieName = "Moonfall";
//			pelicula = new VentanaPelicula();
//			pelicula.setPelicula(movieName);
//			pelicula.setVisible(true);
//			this.dispose();
//		}
//		else if(e.getSource()==peliculaPaseo6) {
//			System.out.println("Selecciono: Paseo 6");
//			movieName = "Paseo6";
//			pelicula = new VentanaPelicula();
//			pelicula.setPelicula(movieName);
//			pelicula.setVisible(true);
//			this.dispose();
//		}
//		else if(e.getSource()==peliculaScream) {
//			System.out.println("Selecciono: Scream");
//			movieName = "Scream";
//			pelicula = new VentanaPelicula();
//			pelicula.setPelicula(movieName);
//			pelicula.setVisible(true);
//			this.dispose();
//		}
//		else if(e.getSource()==peliculaSpiderman) {
//			System.out.println("Selecciono: Spiderman");
//			movieName = "Spiderman";
//			pelicula = new VentanaPelicula();
//			pelicula.setPelicula(movieName);
//			pelicula.setVisible(true);
//			this.dispose();
//		}
//	
//
//	}
}
