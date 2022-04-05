package interfaz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import interfaz.VentanaPeliculas.VentanaPelicula;

public class VentanaIngresoCliente extends JPanel {
	private String CineSeleccionado;
	private String PeliculaSeleccionada;
	//VentanaPelicula v4 = new VentanaPelicula(peliculaSeleccionada);

	
	private JPanel pnlPrincipal;
	private JPasswordField pwdContraseña;
	private JTextField txtCorreo;
	private JButton btnIngreso;
	private JButton btnSalir;
	private JButton btnOlvidoContraseña;
	private JButton btnRegistrarUsuario;

	public VentanaIngresoCliente() {

		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);
		
		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);
		
		
		btnIngreso = new JButton();
		btnIngreso.setBounds(280, 500, 134, 54);
		btnIngreso.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("./img/imgBtnIngreso.png");
		btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
				btnIngreso.getHeight(), Image.SCALE_SMOOTH)));
		

		pnlPrincipal.add(btnIngreso);
		
		
		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		ImageIcon imagenSalir = new ImageIcon("./img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);

		
		btnOlvidoContraseña = new JButton();
		//btnOlvidoContraseña.setText("¿Olvido la contraseña?");
		
		btnOlvidoContraseña.setBounds(20, 600, 300, 40);
		btnOlvidoContraseña.setContentAreaFilled(false);
		btnOlvidoContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		btnOlvidoContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon imagenOlvidoContraseña = new ImageIcon("./img/imgOlvidoContraseña.png");

		btnOlvidoContraseña.setIcon(new ImageIcon(imagenOlvidoContraseña.getImage().getScaledInstance(btnOlvidoContraseña.getWidth(),
				btnOlvidoContraseña.getHeight(), Image.SCALE_SMOOTH)));
		
		
		pnlPrincipal.add(btnOlvidoContraseña);
		
		
		btnRegistrarUsuario = new JButton();
		btnRegistrarUsuario.setBounds(370, 600, 300, 40);
		btnRegistrarUsuario.setContentAreaFilled(false);
		btnRegistrarUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		btnRegistrarUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon imagenRegistrarUsuario = new ImageIcon("./img/imgRegistrarUsuario.png");

		btnRegistrarUsuario.setIcon(new ImageIcon(imagenRegistrarUsuario.getImage().getScaledInstance(btnRegistrarUsuario.getWidth(),
				btnRegistrarUsuario.getHeight(), Image.SCALE_SMOOTH)));
		
		
		pnlPrincipal.add(btnRegistrarUsuario);
		
		
		JLabel lblIngresoUsuario = new JLabel();
		lblIngresoUsuario.setText("Ingreso Cliente");
		lblIngresoUsuario.setBounds(180, 40, 500, 100);
		lblIngresoUsuario.setFont(new Font("Comic Sans MS", Font.BOLD, 44));
		
		pnlPrincipal.add(lblIngresoUsuario);
		
		JPanel pnlNombre = new JPanel();
		// pnlNombre.setBackground(Color.DARK_GRAY);
		pnlNombre.setLayout(null);
		pnlNombre.setBounds(150, 190, 400, 130); // Estaba en (50, 350, 600,130)
		pnlNombre.setOpaque(false);
		pnlNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblCorreo = new JLabel();
		lblCorreo.setBounds(105, 20, 180, 30);
		lblCorreo.setText("Correo Electrónico");
		lblCorreo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlNombre.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(100, 75, 200, 30);
		txtCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		

		pnlNombre.add(txtCorreo);

		pnlPrincipal.add(pnlNombre);
		
		JPanel pnlContraseña = new JPanel();
		// pnlContraseña.setBackground(Color.GRAY);
		pnlContraseña.setLayout(null);
		pnlContraseña.setBounds(150, 350, 400, 130);
		pnlContraseña.setOpaque(false);
		pnlContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblContraseña = new JLabel();
		lblContraseña.setBounds(140, 20, 150, 30);
		lblContraseña.setText("Contraseña");
		lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlContraseña.add(lblContraseña);

		pwdContraseña = new JPasswordField();
		pwdContraseña.setBounds(100, 75, 200, 30);
		pwdContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlContraseña.add(pwdContraseña);
		
		

		pnlPrincipal.add(pnlContraseña);



	}

	

	private void crearPanelPrincipal() {
		
		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);
		
		
		btnIngreso = new JButton();
		btnIngreso.setBounds(280, 500, 134, 54);
		btnIngreso.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("./img/imgBtnIngreso.png");
		btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
				btnIngreso.getHeight(), Image.SCALE_SMOOTH)));
		

		pnlPrincipal.add(btnIngreso);
		
		
		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		ImageIcon imagenSalir = new ImageIcon("./img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);

		
		btnOlvidoContraseña = new JButton();
		//btnOlvidoContraseña.setText("¿Olvido la contraseña?");
		
		btnOlvidoContraseña.setBounds(20, 600, 300, 40);
		btnOlvidoContraseña.setContentAreaFilled(false);
		btnOlvidoContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		btnOlvidoContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon imagenOlvidoContraseña = new ImageIcon("./img/imgOlvidoContraseña.png");

		btnOlvidoContraseña.setIcon(new ImageIcon(imagenOlvidoContraseña.getImage().getScaledInstance(btnOlvidoContraseña.getWidth(),
				btnOlvidoContraseña.getHeight(), Image.SCALE_SMOOTH)));
		
		
		pnlPrincipal.add(btnOlvidoContraseña);
		
		
		btnRegistrarUsuario = new JButton();
		btnRegistrarUsuario.setBounds(370, 600, 300, 40);
		btnRegistrarUsuario.setContentAreaFilled(false);
		btnRegistrarUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		btnRegistrarUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon imagenRegistrarUsuario = new ImageIcon("./img/imgRegistrarUsuario.png");

		btnRegistrarUsuario.setIcon(new ImageIcon(imagenRegistrarUsuario.getImage().getScaledInstance(btnRegistrarUsuario.getWidth(),
				btnRegistrarUsuario.getHeight(), Image.SCALE_SMOOTH)));
		
		
		pnlPrincipal.add(btnRegistrarUsuario);
		
		
		JLabel lblIngresoUsuario = new JLabel();
		lblIngresoUsuario.setText("Ingreso Cliente");
		lblIngresoUsuario.setBounds(180, 40, 500, 100);
		lblIngresoUsuario.setFont(new Font("Comic Sans MS", Font.BOLD, 44));
		
		pnlPrincipal.add(lblIngresoUsuario);
		
		

		
	}
	
	private void crearPanelNombre() {

		JPanel pnlNombre = new JPanel();
		// pnlNombre.setBackground(Color.DARK_GRAY);
		pnlNombre.setLayout(null);
		pnlNombre.setBounds(150, 190, 400, 130); // Estaba en (50, 350, 600,130)
		pnlNombre.setOpaque(false);
		pnlNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblCorreo = new JLabel();
		lblCorreo.setBounds(105, 20, 180, 30);
		lblCorreo.setText("Correo Electrónico");
		lblCorreo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlNombre.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(100, 75, 200, 30);
		txtCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		

		pnlNombre.add(txtCorreo);

		pnlPrincipal.add(pnlNombre);

	}

	private void crearPanelContraseña() {

		JPanel pnlContraseña = new JPanel();
		// pnlContraseña.setBackground(Color.GRAY);
		pnlContraseña.setLayout(null);
		pnlContraseña.setBounds(150, 350, 400, 130);
		pnlContraseña.setOpaque(false);
		pnlContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblContraseña = new JLabel();
		lblContraseña.setBounds(140, 20, 150, 30);
		lblContraseña.setText("Contraseña");
		lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlContraseña.add(lblContraseña);

		pwdContraseña = new JPasswordField();
		pwdContraseña.setBounds(100, 75, 200, 30);
		pwdContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlContraseña.add(pwdContraseña);
		
		

		pnlPrincipal.add(pnlContraseña);

	}


	
	private boolean esCorreo(String Correo) {
		Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher comparar=patron.matcher(Correo);
        return comparar.find();
		
	}


	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnIngreso) {
			
			if(esCorreo(txtCorreo.getText()) && !pwdContraseña.getText().isEmpty()) {
				
				
				
				System.out.println("\nValidando información de Correo....");
				
				VentanaCompraSilla vcs = new VentanaCompraSilla();
				vcs.recibirPeliculaCine(peliculaSeleccionada, cineSeleccionado);
				this.setVisible(false);
				vcs.setVisible(true);
				
				/*
				 * Debe haber un método que envie los datos de la pelicula seleccionada y del cine seleccionado.
				 
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Porfavor ingrese nuevamente los datos","ERROR", JOptionPane.ERROR_MESSAGE);
				txtCorreo.setText("");
				pwdContraseña.setText("");
				
			}
			
			/*Deberia ir si esta correcta con la base de datos
			if(txtCorreo.getText().isEmpty() || pwdContraseña.getText().isEmpty()) {
				
				
				
			}
			
			
		}
		else if(e.getSource()==btnSalir) {
			
			this.dispose();
			System.out.println("Ha regresado a la ventana de Pelicula: "+peliculaSeleccionada);

			//VentanaPelicula miVentanaPelicula= new VentanaPelicula();
			//miVentanaPelicula.setPelicula(peliculaSeleccionada);
			//miVentanaPelicula.setVisible(true);
//			
			//VentanaPelicula.cmbCinesDisponibles.removeItem("Seleccione");
			
		}
		else if (e.getSource()==btnOlvidoContraseña) {
			
			System.out.println("\nIngresó a Ventana Restaurar Contraseña");
			VentanaCambiarContraseña vcc = new VentanaCambiarContraseña();
			vcc.enviarDatos( peliculaSeleccionada, cineSeleccionado );
			this.dispose();
			vcc.setVisible(true);
			
		}
		else if (e.getSource()==btnRegistrarUsuario) {
			
			System.out.println("\ningresó a ventana Registrar Usuario");
			VentanaRegistroCliente vru = new VentanaRegistroCliente();
			vru.enviarDatos(peliculaSeleccionada, cineSeleccionado);
			this.dispose();
			vru.setVisible(true);
			
			
		}
	}
	*/

	public JButton getBtnSalir() {
		return btnSalir;
	}
	
	public JButton getBtnIngreso() {
		return btnIngreso;
	}
	
	public void setCineSeleccionado(String cineSeleccionado) {
		CineSeleccionado = cineSeleccionado;
	}
	
	//en lugar de String, Obj Cine.
	public String getCineSeleccionado() {
		return CineSeleccionado;
	}
	
	public void setPeliculaSeleccionada(String peliculaSeleccionada) {
		PeliculaSeleccionada = peliculaSeleccionada;
	}
	
	//en lugar de String, Obj Cine.
	public String getPeliculaSeleccionada() {
		return PeliculaSeleccionada;
	}
	
	public JButton getBtnRegistroUsuario() {
		return btnRegistrarUsuario;
	}
	
	public JButton getBtnOlvidoContraseña() {
		return btnOlvidoContraseña;
	}
	
	public String getTxtCorreo() {
		return txtCorreo.getText();
	}
	
	public JTextField getFtxtCorreo() {
		
		return txtCorreo;
	}
	
	public void setTxtCorreo(String n) {
		txtCorreo.setText(n);
	}
	
	public JPasswordField getPwdContraseña() {
		return pwdContraseña;
	}
	
	public void setPwdContraseña(String n) {
		pwdContraseña.setText(n);
	}
	
}
