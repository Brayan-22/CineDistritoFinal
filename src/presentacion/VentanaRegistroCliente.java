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

public class VentanaRegistroCliente extends JPanel{

	private JPanel pnlPrincipal;
	private JButton btnSalir;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCorreo;
	private JTextField txtContraseña;
	private JTextField txtDocumento;
	private JComboBox<String> cmbDocumento;
	private JCheckBox cbxAutorizacion;
	private JButton btnIngreso;
	private JLabel lblIngresoUsuario;

	private String Cine;
	private String Pelicula;

	public VentanaRegistroCliente() {
		
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

		lblIngresoUsuario.setText("Registro clientes");

		lblIngresoUsuario.setBounds(230, 0, 500, 100);
		lblIngresoUsuario.setFont(new Font("Comic Sans MS", Font.BOLD, 26));

		pnlPrincipal.add(lblIngresoUsuario);

		btnIngreso = new JButton();
		btnIngreso.setBounds(280, 580, 134, 54);
		btnIngreso.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("./img/imgBtnRegistro.png");
		btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
				btnIngreso.getHeight(), Image.SCALE_SMOOTH)));
		btnIngreso.setEnabled(false);

		pnlPrincipal.add(btnIngreso);

		JLabel lblNombre = new JLabel();
		lblNombre.setText("Nombres: ");
		lblNombre.setBounds(120, 110, 150, 30);
		lblNombre.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(120, 140, 200, 30);
		txtNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtNombre);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblApellido = new JLabel();
		lblApellido.setText("Apellidos: ");
		lblApellido.setBounds(400, 110, 150, 30);
		lblApellido.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblApellido);

		txtApellido = new JTextField();
		txtApellido.setBounds(400, 140, 200, 30);
		txtApellido.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtApellido);

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
		lblDocumento1.setText("Documento de identidad: ");
		lblDocumento1.setBounds(120, 310, 190, 30);
		lblDocumento1.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblDocumento1);

		txtDocumento = new JTextField();
		txtDocumento.setBounds(400, 340, 200, 30);
		txtDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtDocumento);

		cmbDocumento = new JComboBox<>();
		cmbDocumento.addItem("Cédula de Ciudadania");
		cmbDocumento.setBounds(120, 340, 190, 30);
		cmbDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(cmbDocumento);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		cbxAutorizacion = new JCheckBox();
		cbxAutorizacion.setBounds(120, 350, 400, 260);
		cbxAutorizacion.setContentAreaFilled(false);
		cbxAutorizacion.setText("<html>En cumplimiento del Régimen de Protección Datos Personales, "
				+ "autorizo expresamente a Cine Distrito, de manera directa, o a través de terceros "
				+ "designados, para almacenar, consultar, procesar y en general, para dar tratamiento "
				+ "a la información personal que suministre, y para ser incluido en sus bases de datos, "
				+ "recibir información de la Compañía, de conformidad con las políticas de privacidad "
				+ "y manejo de información.</html>");
		pnlPrincipal.add(cbxAutorizacion);

	

	}

	public void enviarDatos(String Pelicula, String Cine) {

		this.Cine = Cine;
		this.Pelicula = Pelicula;

	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public JTextField getTxtCorreo() {
		return txtCorreo;
	}

	public JTextField getTxtContraseña() {
		return txtContraseña;
	}

	public JTextField getTxtDocumento() {
		return txtDocumento;
	}

	public JComboBox<String> getCmbDocumento() {
		return cmbDocumento;
	}

	public JCheckBox getCbxAutorizacion() {
		return cbxAutorizacion;
	}

	public JButton getBtnIngreso() {
		return btnIngreso;
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

			if (txtApellido.getText().isEmpty() || txtNombre.getText().isEmpty() || txtContraseña.getText().isEmpty()
					|| txtCorreo.getText().isEmpty() || txtDocumento.getText().isEmpty()) {

				JOptionPane.showMessageDialog(null, "Porfavor no deje espacios en blanco");
				btnIngreso.setEnabled(false);
				cbxAutorizacion.setSelected(false);

			} else {

				btnIngreso.setEnabled(true);

			}

			System.out.println("Codigo de empleado generado: "
					+ crearCodigo(txtNombre.getText(), txtApellido.getText(), txtDocumento.getText()));

		} else if (e.getSource() == btnSalir) {

		

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

		} else if (evt.getSource() == txtNombre) {

			char c = evt.getKeyChar();

			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' '))
				evt.consume();

		} else if (evt.getSource() == txtApellido) {

			char c = evt.getKeyChar();

			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' '))
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

	}*/

}
