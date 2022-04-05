package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaAdmin extends JPanel {

	private JButton btnAgregarEmpleado;
	private JButton btnCambiarContraseña;
	private JButton btnCerrarSesion;

	public VentanaAdmin() {

		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);

		btnCerrarSesion = new JButton();
		btnCerrarSesion.setBounds(250, 580, 168, 49);
		btnCerrarSesion.setContentAreaFilled(false);
		ImageIcon imagenCerrarSesion = new ImageIcon("./img/imgBtnCerrarSesion.png");
		btnCerrarSesion.setIcon(new ImageIcon(imagenCerrarSesion.getImage()
				.getScaledInstance(btnCerrarSesion.getWidth(), btnCerrarSesion.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnCerrarSesion);

		btnAgregarEmpleado = new JButton();
		btnAgregarEmpleado.setBounds(110, 170, 186, 49);
		btnAgregarEmpleado.setContentAreaFilled(false);
		ImageIcon imagenAgregarEmpleado = new ImageIcon("./img/imgBtnAgregarUsuario.png");
		btnAgregarEmpleado.setIcon(new ImageIcon(imagenAgregarEmpleado.getImage()
				.getScaledInstance(btnAgregarEmpleado.getWidth(), btnAgregarEmpleado.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnAgregarEmpleado);

		btnCambiarContraseña = new JButton();
		btnCambiarContraseña.setBounds(400, 170, 186, 49);
		btnCambiarContraseña.setContentAreaFilled(false);
		ImageIcon imagenCambiarContraseña = new ImageIcon("./img/imgBtnCambiarContraseña.png");
		btnCambiarContraseña.setIcon(new ImageIcon(imagenCambiarContraseña.getImage().getScaledInstance(
				btnCambiarContraseña.getWidth(), btnCambiarContraseña.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnCambiarContraseña);

	}

	public JButton getBtnAgregarEmpleado() {
		return btnAgregarEmpleado;
	}

	public JButton getBtnCambiarContraseña() {
		return btnCambiarContraseña;
	}

	public JButton getBtnCerrarSesion() {
		return btnCerrarSesion;
	}

	/*
	 * 
	 * 
	 * @Override public void actionPerformed(ActionEvent e) {
	 * 
	 * if(e.getSource()==btnAgregarEmpleado) {
	 * 
	 * VentanaRegistroUsuario vru = new VentanaRegistroUsuario();
	 * this.setVisible(false); vru.setVisible(true);
	 * 
	 * }else if(e.getSource()==btnCerrarSesion) {
	 * 
	 * VentanaInicio vi = new VentanaInicio(); this.dispose(); vi.setVisible(true);
	 * 
	 * 
	 * }else if(e.getSource()==btnCambiarContraseña) {
	 * 
	 * VentanaEstablecerContraseña vec = new VentanaEstablecerContraseña();
	 * this.setVisible(false); vec.setVisible(true);
	 * 
	 * 
	 * }
	 * 
	 * }
	 */

}
