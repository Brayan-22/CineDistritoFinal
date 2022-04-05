package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaRecuperarContraseña extends JPanel {

	private JPanel pnlPrincipal;
	private JTextField txtCorreo;
	private JTextField txtDocumento;
	private JButton btnContinue;
	private JButton btnSalir;
	private String Cine;
	private String Pelicula;
	private JLabel lblContraseña;
	private JLabel lblDocumento;
	private JLabel lblCorreo;
	
	
	public VentanaRecuperarContraseña() {
		
		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);
		
		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);
		
		btnContinue = new JButton();
		btnContinue.setBounds(280, 520, 134, 54);
		btnContinue.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("./img/imgBtnContinue.png");
		btnContinue.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnContinue.getWidth(),
				btnContinue.getHeight(), Image.SCALE_SMOOTH)));
		

		pnlPrincipal.add(btnContinue);
		
		
		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		ImageIcon imagenSalir = new ImageIcon("./img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);
		
		
		lblContraseña = new JLabel();
		lblContraseña.setText("Recuperar Contraseña");
		lblContraseña.setBounds(130, 40, 500, 100);
		lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 44));
		
		pnlPrincipal.add(lblContraseña);
		
		JPanel pnlDocumento = new JPanel();
		// pnlNombre.setBackground(Color.DARK_GRAY);
		pnlDocumento.setLayout(null);
		pnlDocumento.setBounds(150, 190, 400, 130); // Estaba en (50, 350, 600,130)
		pnlDocumento.setOpaque(false);
		pnlDocumento.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		lblDocumento = new JLabel();
		lblDocumento.setBounds(80, 20, 280, 30);
		lblDocumento.setText("Documento de Identidad");
		lblDocumento.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlDocumento.add(lblDocumento);

		
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(100, 75, 200, 30);
		txtDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		
		
		
		

		pnlDocumento.add(txtDocumento);

		pnlPrincipal.add(pnlDocumento);

		JPanel pnlCorreo = new JPanel();
		// pnlContraseña.setBackground(Color.GRAY);
		pnlCorreo.setLayout(null);
		pnlCorreo.setBounds(150, 350, 400, 130);
		pnlCorreo.setOpaque(false);
		pnlCorreo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		lblCorreo = new JLabel();
		lblCorreo.setBounds(110, 20, 200, 30);
		lblCorreo.setText("Correo electrónico");
		lblCorreo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlCorreo.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(100, 75, 200, 30);
		txtCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlCorreo.add(txtCorreo);
		
		

		pnlPrincipal.add(pnlCorreo);
	}
	
	
	
	
	public void enviarDatos(String Pelicula, String Cine) {
		
		this.Cine = Cine;
		this.Pelicula = Pelicula;
		
		
	}




	public JTextField getFTxtCorreo() {
		return txtCorreo;
	}
	
	public String getTxtCorreo() {
		return txtCorreo.getText();
	}




	public JTextField getTxtDocumento() {
		return txtDocumento;
	}




	public JButton getBtnContinue() {
		return btnContinue;
	}




	public JButton getBtnSalir() {
		return btnSalir;
	}



	


	
	



	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnIngreso) {
			
			
			
				if(esCorreo(txtCorreo.getText()) ) {
				
					System.out.println("Ingresando...");
					JOptionPane.showMessageDialog(null, "Su contraseña es\n \"123456\"", "Recuperación", JOptionPane.INFORMATION_MESSAGE);
				
				}else {
				
					JOptionPane.showMessageDialog(null, "Formato inválido, ingrese los datos nuevamente", "Error de Formato", JOptionPane.WARNING_MESSAGE);
					txtDocumento.setText("");
					txtCorreo.setText("");
				}
			
		
		
			

			
		}
		else if(e.getSource()==btnSalir) {
			
	
		
				
				VentanaIngresoCliente viu = new VentanaIngresoCliente(Cine, Pelicula);
				this.dispose();
				viu.setVisible(true);
				
			
			
			
		}
		
	}
*/	

	




/*
	@Override
	public void keyTyped(KeyEvent evt) {
		if (evt.getSource() == txtDocumento) {

			char c = evt.getKeyChar();

			if (c < '0' || c > '9')
				evt.consume();

		}
		
	}

	
	*/
	
	
	
}
