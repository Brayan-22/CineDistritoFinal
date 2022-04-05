package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lógica.Verificar;

public class VentanaRegistroUsuario extends JPanel {

	private JButton btnSalir;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtContraseña;
	private JTextField txtDocumento;
	private JComboBox<String> cmbMultiplex;
	private JComboBox<String> cmbCargo;
	private JComboBox<String> cmbRol;
	private JCheckBox cbxAutorizacion;
	private JButton btnIngreso;
	private JLabel lblIngresoUsuario;
	


	public VentanaRegistroUsuario() {


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
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		ImageIcon imagenSalir = new ImageIcon("./img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);

		lblIngresoUsuario = new JLabel();

		lblIngresoUsuario.setText("Registro Empleado");

		lblIngresoUsuario.setBounds(230, 0, 500, 100);
		lblIngresoUsuario.setFont(new Font("Comic Sans MS", Font.BOLD, 26));

		pnlPrincipal.add(lblIngresoUsuario);

		btnIngreso = new JButton();
		btnIngreso.setBounds(280, 580, 134, 54);
		btnIngreso.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("./img/imgBtnRegistro.png");
		btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
				btnIngreso.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnIngreso);
		

		JLabel lblNombre = new JLabel();
		lblNombre.setText("Nombres & Apellidos: ");
		lblNombre.setBounds(120, 110, 190, 30);
		lblNombre.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(120, 140, 200, 30);
		txtNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtNombre);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblApellido = new JLabel();
		lblApellido.setText("Número de Telefono: ");
		lblApellido.setBounds(400, 110, 190, 30);
		lblApellido.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblApellido);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(400, 140, 200, 30);
		txtTelefono.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtTelefono);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblCorreo = new JLabel();
		lblCorreo.setText("Correo electrónico: ");
		lblCorreo.setBounds(120, 210, 150, 30);
		lblCorreo.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(120, 240, 200, 30);
		txtCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtCorreo);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblContraseña = new JLabel();
		lblContraseña.setText("Contraseña: ");
		lblContraseña.setBounds(400, 210, 150, 30);
		lblContraseña.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblContraseña);

		txtContraseña = new JTextField();
		txtContraseña.setBounds(400, 240, 200, 30);
		txtContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtContraseña);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblDocumento1 = new JLabel();
		lblDocumento1.setText("Cedula Ciudadania:  ");
		lblDocumento1.setBounds(400, 310, 190, 30);
		lblDocumento1.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblDocumento1);

		txtDocumento = new JTextField();
		txtDocumento.setBounds(400, 340, 200, 30);
		txtDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtDocumento);

		JLabel lblMultiplex = new JLabel();
		lblMultiplex.setText("Multiplex:  ");
		lblMultiplex.setBounds(120, 310, 190, 30);
		lblMultiplex.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));
		
		pnlPrincipal.add(lblMultiplex);
		
		cmbMultiplex = new JComboBox<>();
		cmbMultiplex.addItem("Titan");
		cmbMultiplex.addItem("Unicentro");
		cmbMultiplex.addItem("Plaza Central");
		cmbMultiplex.addItem("Gran Estación");
		cmbMultiplex.addItem("Embajador");
		cmbMultiplex.addItem("LasAmericas");
		cmbMultiplex.setBounds(120, 340, 190, 30);
		cmbMultiplex.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(cmbMultiplex);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblCargo = new JLabel();
		lblCargo.setText("Cargo: ");
		lblCargo.setBounds(120, 410, 190, 30);
		lblCargo.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblCargo);

		cmbCargo = new JComboBox<>();
		cmbCargo.setBounds(120, 440, 200, 30);
		cmbCargo.addItem("Director");
		cmbCargo.addItem("Cajero");
		cmbCargo.addItem("Despachador Comida");
		cmbCargo.addItem("Encargado Sala");
		cmbCargo.addItem("Aseador");
		cmbCargo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(cmbCargo);
		
		JLabel lblRol = new JLabel();
		lblRol.setText("Rol: ");
		lblRol.setBounds(400, 410, 190, 30);
		lblRol.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));
		
		pnlPrincipal.add(lblRol);

		cmbRol = new JComboBox<>();
		cmbRol.addItem("Rol aún no disponible");
		cmbRol.setBounds(400, 440, 190, 30);
		cmbRol.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(cmbRol);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		

	}


	public JButton getBtnSalir() {
		return btnSalir;
	}


	public JTextField getFTxtNombre() {
		return txtNombre;
	}
	
	public String getTxtNombre() {
		return txtNombre.getText();
	}


	public JTextField getFTxtTelefono() {
		return txtTelefono;
	}
	
	public String getTxtTelefono() {
		return txtTelefono.getText();
	}


	public String getTxtCorreo() {
		return txtCorreo.getText();
	}
	
	public JTextField getFTxtCorreo() {
		return txtCorreo;
	}


	public String getTxtContraseña() {
		return txtContraseña.getText();
	}
	
	public JTextField getFTxtContraseña() {
		return txtContraseña;
	}


	public JTextField getFTxtDocumento() {
		return txtDocumento;
	}
	
	public String getTxtDocumento() {
		return txtDocumento.getText();
	}


	public JComboBox<String> getCmbMultiplex() {
		return cmbMultiplex;
	}


	public JComboBox<String> getCmbCargo() {
		return cmbCargo;
	}


	public JComboBox<String> getCmbRol() {
		return cmbRol;
	}


	public JCheckBox getCbxAutorizacion() {
		return cbxAutorizacion;
	}


	public JButton getBtnIngreso() {
		return btnIngreso;
	}
	
	public String getSelectedMultiplex() {
		
		return (String)cmbMultiplex.getSelectedItem();
	}



	/*
	 * Método que devuelve el código del empleado una vez que se registra (Se debe
	 * guardar en la base de datos)
	 * 
	 * @param Nombre Recibe el nombre del empleado a registrar
	 * 
	 * @param Apellido recibe el apellido del empleado a registrar
	 * 
	 * @param Documento Recibe el documento del empleado a registrar
	 * 
	 * @return retorno El código generado para el empleado
	 */

	//Cargo o Multiplex

	/*

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cbxAutorizacion) {

			if (!cbxAutorizacion.isSelected()) {

				btnIngreso.setEnabled(false);

			} else {
				btnIngreso.setEnabled(true);
			}

		} else if (e.getSource() == btnIngreso) {

			if (!Verificar.isNumeric(txtDocumento.getText())) {

				JOptionPane.showMessageDialog(null, "Ingrese un número de documento válido");
				txtDocumento.setText("");

			}

			if (!Verificar.esCorreo(txtCorreo.getText())) {

				JOptionPane.showMessageDialog(null, "Ingrese un formato de correo válido");
				txtCorreo.setText("");

			}

			if (txtTelefono.getText().isEmpty() || txtNombre.getText().isEmpty() || txtContraseña.getText().isEmpty()
					|| txtCorreo.getText().isEmpty() || txtDocumento.getText().isEmpty()) {

				JOptionPane.showMessageDialog(null, "Porfavor no deje espacios en blanco");
				btnIngreso.setEnabled(false);
				cbxAutorizacion.setSelected(false);

			} else {

				btnIngreso.setEnabled(true);

			}

			System.out.println("Codigo de empleado generado: "
					+ crearCodigo(txtNombre.getText(), (String)cmbMultiplex.getSelectedItem() , txtDocumento.getText()));

		} else if (e.getSource() == btnSalir) {

		

				VentanaAdmin va = new VentanaAdmin();
				this.setVisible(false);
				va.setVisible(true);

			

		}

	}

	@Override
	public void keyTyped(KeyEvent evt) {
		if (evt.getSource() == txtDocumento) {

			char c = evt.getKeyChar();

			if (c < '0' || c > '9')
				evt.consume();

		} else if (evt.getSource() == txtNombre) {

			char c = evt.getKeyChar();

			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' '))
				evt.consume();

		} else if (evt.getSource() == txtTelefono) {

			char c = evt.getKeyChar();

			if (c < '0' || c > '9')
				evt.consume();
			
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
	*/

}



