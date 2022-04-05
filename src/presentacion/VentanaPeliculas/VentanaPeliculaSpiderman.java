package interfaz.VentanaPeliculas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class VentanaPeliculaSpiderman extends JPanel{
	
	private JPanel pnlPrincipal;
	private String nombrePelicula ="";
    private	JButton btnSalir;
	private	JLabel imgPelicula;
	public static JComboBox<String> cmbCinesDisponibles;
	private JButton btnContinue;
	private String cineSeleccionado;
	private JLabel lblTitulo;

	public VentanaPeliculaSpiderman() {
	
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
	
	
	//La idea es crear un metodo que revise en la base de datos que cines cuentan con esta funcion
	
	pnlPrincipal.add(cmbCinesDisponibles);
	
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
	
	//Deberia ir JComboBox<Cine>
	public JComboBox<String> getCmbCinesDisponibles() {
		return cmbCinesDisponibles;
	}
	
	//Deberia regresar un Objeto tipo Pelicula
	public String getPelicula() {
		return "Spiderman";
	}

}
