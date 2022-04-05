package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaInicio extends JPanel {

	private JLayeredPane pnlBase;
	private JPanel pnlPrincipal;
	private JPanel pnlUsuario;
	private JComboBox<String> cmbUsuario;
	private JTextField txtNombre;
	private JPasswordField pwdContraseña;
	private JButton btnSalir;
	private JButton btnIngreso;
	


	public VentanaInicio() {

		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);
		
		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);
		
		JLabel lblImgUsuario = new JLabel();
		lblImgUsuario.setBounds(270, 20, 150, 150);
		ImageIcon imagenUsuario = new ImageIcon("./img/imgUser.png");

		lblImgUsuario.setIcon(new ImageIcon(imagenUsuario.getImage().getScaledInstance(lblImgUsuario.getWidth(),
				lblImgUsuario.getHeight(), Image.SCALE_SMOOTH)));
		pnlPrincipal.add(lblImgUsuario);
		
		btnIngreso = new JButton();
		btnIngreso.setBounds(280, 550, 134, 54);
		btnIngreso.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnIngreso.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("./img/imgBtnIngreso.png");
		btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
				btnIngreso.getHeight(), Image.SCALE_SMOOTH)));
		pnlPrincipal.add(btnIngreso);
		
		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 60);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		ImageIcon imagenSalir = new ImageIcon("./img/Exit.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));
		
		pnlPrincipal.add(btnSalir);
		
		JPanel pnlNombre = new JPanel();
		pnlNombre.setBackground(Color.DARK_GRAY);
		pnlNombre.setLayout(null);
		pnlNombre.setBounds(50, 190, 600, 130); // Estaba en (50, 350, 600,130)
		pnlNombre.setOpaque(false);
		pnlNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		pnlPrincipal.add(pnlNombre);
	
		JLabel lblNombre = new JLabel();
		lblNombre.setBounds(250, 20, 80, 30);
		lblNombre.setText("Nombre");
		lblNombre.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlNombre.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(200, 75, 200, 30);
		txtNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		

		pnlNombre.add(txtNombre);
		
		JPanel pnlContraseña = new JPanel();
		// pnlContraseña.setBackground(Color.GRAY);
		pnlContraseña.setLayout(null);
		pnlContraseña.setBounds(50, 350, 600, 130);
		pnlContraseña.setOpaque(false);
		pnlContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblContraseña = new JLabel();
		lblContraseña.setBounds(250, 20, 150, 30);
		lblContraseña.setText("Contraseña");
		lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlContraseña.add(lblContraseña);

		pwdContraseña = new JPasswordField();
		pwdContraseña.setBounds(200, 75, 200, 30);
		pwdContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlContraseña.add(pwdContraseña);

		pnlPrincipal.add(pnlContraseña);
	

	}



	



/*
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnSalir) {
			this.dispose();
			System.out.println("\n\nHa salido del sistema!!!");
		}

		else if (e.getSource() == btnIngreso) {

			String myPass = String.valueOf(pwdContraseña.getPassword());
			;

			if (txtNombre.getText().isEmpty() || myPass.isEmpty()) {

				JOptionPane.showMessageDialog(pnlPrincipal, "Porfavor, rellene todos los campos");

			} else {
				
				if(String.valueOf(txtNombre.getText()).equals("admin") && myPass.equals("admin")) {
					System.out.println("Bienvenido patron!");

					VentanaAdmin va = new VentanaAdmin();
					this.dispose();
					va.setVisible(true);
					
					
					
					
				}else {
					
				

				System.out.println("Ingresó: " + "\n" + txtNombre.getText() + "\n" + myPass);

				VentanaCartelera v2 = new VentanaCartelera();
				v2.setVisible(true);
				
				this.dispose();
				}
				
			}

		}
	}*/

	//Se hace para agregarle los escuchadores en el VistaControlador.Java
	public JButton getBtnSalir() {
		return btnSalir;
	}
	
	
	public JButton getBtnIngreso() {
		return btnIngreso;
	}
	
	public JPasswordField getPwdContraseña() {
		return pwdContraseña;
	}
	
	public JTextField getFTxtNombre() {
		return txtNombre;
	}
	
	public String getTxtNombre() {
		return txtNombre.getText();
	}
	
	public String getTxtContraseña() {
		
		String myPass = String.valueOf(pwdContraseña.getPassword());
		return  myPass;
	}



}
