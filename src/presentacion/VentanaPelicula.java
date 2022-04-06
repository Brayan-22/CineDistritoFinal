package Presentacion;
import Logica.Principal.Sistema;
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

public class VentanaPelicula extends JPanel {

	private JPanel pnlPrincipal;
	private String nombrePelicula ="";
    private	JButton btnSalir;
	private	JLabel imgPelicula;
	public static JComboBox<String> cmbCinesDisponibles;
	private JButton btnContinue;
	private String cineSeleccionado;
	private JLabel lblTitulo;
	private JTextArea txaDescripcion;
	
	private JLabel lblLimiteEdad;
	private JLabel lblGeneros ;
	private JLabel lblDirectores;
	private JLabel lblDirectoresPelicula;
	//private Sistema sistema;
	
	private JComboBox<String> cmbSalasDisponibles;
        private Sistema sistema;
	
	public VentanaPelicula() {
		
		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);
		
		//JPanel pnlPrincipal = new JPanel();
		//pnlPrincipal.setBounds(0, 0, 700, 700);
		this.setBackground(Color.GRAY);
		//pnlPrincipal.setLayout(null);
		//this.add(pnlPrincipal);
		
		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		ImageIcon imagenSalir = new ImageIcon("./img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		this.add(btnSalir);
		
		btnContinue = new JButton();
		btnContinue.setBounds(400, 550, 154, 54);
		btnContinue.setContentAreaFilled(false);
		//btnContinue.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		ImageIcon imagenContinue = new ImageIcon("./img/imgBtnContinue.png");

		btnContinue.setIcon(new ImageIcon(imagenContinue.getImage().getScaledInstance(btnContinue.getWidth(),
				btnContinue.getHeight(), Image.SCALE_SMOOTH)));
		
		this.add(btnContinue);
		
		imgPelicula = new JLabel();
		imgPelicula.setBounds(70, 100, 260, 410);
		imgPelicula.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4, true));
		
		lblTitulo = new JLabel();
		lblTitulo.setBounds(400, 100, 210, 50);
		lblTitulo.setFont(new Font("Comic Sans MS", 3, 50));
		
		txaDescripcion = new JTextArea();
		txaDescripcion.setBounds(340, 180, 340, 200);
		txaDescripcion.setEditable(false);
		txaDescripcion.setOpaque(false);
		txaDescripcion.setLineWrap(true);
		txaDescripcion.setFont(new Font("Comic Sans MS", 0, 15));
		
		lblLimiteEdad = new JLabel();
		lblLimiteEdad.setBounds(80, 520, 60, 90);
		
		lblGeneros = new JLabel();
		lblGeneros.setBounds(170, 540, 200, 65);
		lblGeneros.setFont(new Font("Andale Mono", 2, 18));
		lblGeneros.setForeground(Color.BLACK);
		
		lblDirectores = new JLabel();
		lblDirectores.setBounds(340, 340, 100, 20);
		lblDirectores.setFont(new Font("Comic Sans MS", 1, 15));
		lblDirectores.setText("Directores: ");
		
		lblDirectoresPelicula = new JLabel();
		lblDirectoresPelicula.setBounds(340,  350,  390,  50);
		lblDirectoresPelicula.setFont(new Font("Comic Sans MS", 0, 13));
		//lblDirectoresPelicula.setText("Texto de Prueba");
		
		JLabel lblCinesDisponibles = new JLabel();
		lblCinesDisponibles.setBounds(340, 410, 150, 15);
		lblCinesDisponibles.setText("Cines Disponibles: ");
		lblCinesDisponibles.setFont(new Font("Comic Sans MS", 1, 15));
		
		this.add(lblCinesDisponibles);
		

		
		//sistema=new Sistema();
                JLabel lblSalasDisponibles = new JLabel();
                lblSalasDisponibles.setBounds(510, 410, 150, 15);
                lblSalasDisponibles.setText("Salas disponibles: ");
                lblSalasDisponibles.setFont(new Font("Comic Sans MS", 1, 15));
                this.add(lblSalasDisponibles);
		cmbCinesDisponibles = new JComboBox<String>();
		cmbCinesDisponibles.setBounds(340, 430, 150, 20);
                cmbSalasDisponibles=new JComboBox<String>();
                cmbSalasDisponibles.setBounds(510, 430, 150, 20);
                sistema= new Sistema();
                for (int i = 0; i < 6; i++) {
                    cmbCinesDisponibles.addItem((String)sistema.getArrayMultiplex().get(i).getNombreMultiplex());
                }
		
		this.add(cmbSalasDisponibles);
		this.add(cmbCinesDisponibles);
		
		this.add(lblGeneros);
		this.add(lblTitulo);
		this.add(imgPelicula);
		this.add(lblLimiteEdad);
		this.add(txaDescripcion);
		this.add(lblDirectores);
		this.add(lblDirectoresPelicula);
		
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

        public JComboBox<String> getCmbSalasDisponibles() {
            return cmbSalasDisponibles;
        }

        public void setCmbSalasDisponibles(JComboBox<String> cmbSalasDisponibles) {
            this.cmbSalasDisponibles = cmbSalasDisponibles;
        }
	
        
	public JLabel getLblGeneros() {
		return lblGeneros;
	}
	
	public JLabel getLblTitulo() {
		return lblTitulo;
	}
	public JLabel getLblLimiteEdad() {
		return lblLimiteEdad;
	}
	public JLabel getLblDirectoresPelicula() {
		return lblDirectoresPelicula;
	}
	public JTextArea getTxtDescripcion() {
		return txaDescripcion;
	}
	public JLabel getLblImagen() {
		return imgPelicula;
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
