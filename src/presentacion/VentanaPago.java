package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class VentanaPago extends JPanel{
	
	private JButton btnSalir;
	private JButton btnFinalizar;
	private JToggleButton tbtnPaypal;
	private JToggleButton tbtnBitcoin;
	

public VentanaPago() {
	
	
	this.setBounds(0, 0, 700, 700);
	this.setLayout(null);
	
	JPanel pnlPrincipal = new JPanel();
	pnlPrincipal.setBounds(0, 0, 700, 700);
	pnlPrincipal.setBackground(Color.GRAY);
	pnlPrincipal.setLayout(null);
	this.add(pnlPrincipal);
	
	btnFinalizar = new JButton();
	btnFinalizar.setBounds(200, 550, 266, 59);
	btnFinalizar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
	btnFinalizar.setContentAreaFilled(false);
	ImageIcon imagenIngreso = new ImageIcon("./img/imgBtnFinalizarCompra.png");
	btnFinalizar.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnFinalizar.getWidth(),
			btnFinalizar.getHeight(), Image.SCALE_SMOOTH)));
	pnlPrincipal.add(btnFinalizar);
	
	btnSalir = new JButton();
	btnSalir.setBounds(20, 20, 60, 40);
	btnSalir.setContentAreaFilled(false);
	btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
	ImageIcon imagenSalir = new ImageIcon("./img/exitArrow.png");

	btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
			btnSalir.getHeight(), Image.SCALE_SMOOTH)));
	
	pnlPrincipal.add(btnSalir);

	
	tbtnPaypal = new JToggleButton();
	tbtnPaypal.setBounds(269, 250, 152, 59);
	tbtnPaypal.setName("PayPal");
	tbtnPaypal.setContentAreaFilled(false);
	ImageIcon Paypal = new ImageIcon("./img/imgBtnPypal.png");
	tbtnPaypal.setIcon(new ImageIcon(Paypal.getImage().getScaledInstance(tbtnPaypal.getWidth(),
			tbtnPaypal.getHeight(), Image.SCALE_SMOOTH)));

	pnlPrincipal.add(tbtnPaypal);

	
	tbtnBitcoin = new JToggleButton();
	tbtnBitcoin.setBounds(269, 400, 152, 59);
	tbtnBitcoin.setName("BitCoin");
	tbtnBitcoin.setContentAreaFilled(false);
	ImageIcon Bitcoin = new ImageIcon("./img/imgBtnBitcoin.png");
	tbtnBitcoin.setIcon(new ImageIcon(Bitcoin.getImage().getScaledInstance(tbtnBitcoin.getWidth(),
			tbtnBitcoin.getHeight(), Image.SCALE_SMOOTH)));
	pnlPrincipal.add(tbtnBitcoin);
	
	ButtonGroup grupoToggle = new ButtonGroup();
	grupoToggle.add(tbtnBitcoin);
	grupoToggle.add(tbtnPaypal);
	
	
	
	}


public JButton getBtnSalir() {
	return btnSalir;
}


public JButton getBtnFinalizar() {
	return btnFinalizar;
}


public JToggleButton getTbtnPaypal() {
	return tbtnPaypal;
}


public JToggleButton getTbtnBitcoin() {
	return tbtnBitcoin;
}
}
