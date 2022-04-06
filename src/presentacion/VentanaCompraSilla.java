package Presentacion;

import Logica.Principal.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class VentanaCompraSilla extends JPanel {

	private JButton btnSalir;
	private JButton btnContinue;
	
	private Component[] componentes;
        private ArrayList<JToggleButton> arrayBotones;
	
	private JLabel lblSalaActual;
	
	private JRadioButton rbtnGeneral;
	private JRadioButton rbtnPreferencial;
	
	private JSpinner spnGeneral;
	private JSpinner spnPreferencial;
	
	private JLabel lblPelicula;
	private JLabel lblCine;
	private Sistema sistema;

	
	String Sillas ="";

	
	
	
	public VentanaCompraSilla() {
                sistema= new Sistema();
                lblCine = new JLabel();
		
                arrayBotones=new ArrayList<>();
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
		
		
		JPanel pnlSillas = new JPanel();
                GridLayout grid = new GridLayout(6, 10,3,3);
		pnlSillas.setBackground(Color.LIGHT_GRAY);
		pnlSillas.setBounds(250, 90, 418, 320);
		pnlSillas.setLayout(grid);
		pnlSillas.setOpaque(false);
		pnlSillas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		
		///////////////////////////////////////////
                
                
		ImageIcon imagenSilla = new ImageIcon("./img/imgAsiento.png");
		ImageIcon imagenSillaPreferencial = new ImageIcon("./img/imgAsientoPreferencial.png");
		
		
		JPanel pnlComplementos = new JPanel();
		pnlComplementos.setBackground(Color.LIGHT_GRAY);
		pnlComplementos.setBounds(30, 90, 620, 470);
		pnlComplementos.setLayout(null);
		pnlComplementos.setOpaque(false);
		//pnlComplementos.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
		
		
		lblSalaActual = new JLabel();
		lblSalaActual.setBounds(0, 15, 190, 30);
                lblSalaActual.setFont((new Font("Comic Sans MS", 0, 18)));
                pnlComplementos.add(lblSalaActual);
		
		lblPelicula = new JLabel();
		lblPelicula.setBounds(0, 80, 200, 40);
		lblPelicula.setFont((new Font("Comic Sans MS", 0, 18)));
		pnlComplementos.add(lblPelicula);
		
		lblCine.setBounds(0, 120, 200, 40);
		lblCine.setFont((new Font("Comic Sans MS", 0, 18)));
		pnlComplementos.add(lblCine);
		
		JLabel lblTitulos = new JLabel();
		lblTitulos.setText("Costo     Boletos  Cantidad");
		lblTitulos.setBounds(0, 190, 400, 40);
		lblTitulos.setFont((new Font("Comic Sans MS", 1, 16)));
		pnlComplementos.add(lblTitulos);
		
		JLabel lblCostoGeneral = new JLabel();
		lblCostoGeneral.setText("$ 11.000");
		lblCostoGeneral.setBounds(0, 240, 100, 40);
		lblCostoGeneral.setFont((new Font("Comic Sans MS", 0, 11)));
		pnlComplementos.add(lblCostoGeneral);
		
		JLabel lblCostoPreferencial = new JLabel();
		lblCostoPreferencial.setText("$ 15.000");
		lblCostoPreferencial.setBounds(0, 290, 100, 40);
		lblCostoPreferencial.setFont((new Font("Comic Sans MS", 0, 11)));
		pnlComplementos.add(lblCostoPreferencial);
		
		rbtnGeneral = new JRadioButton();
		rbtnGeneral.setBounds(55, 240, 90, 40);
		rbtnGeneral.setText("General");
		rbtnGeneral.setOpaque(false);
		rbtnGeneral.setFont((new Font("Comic Sans MS", 0, 13)));
		pnlComplementos.add(rbtnGeneral);

		rbtnPreferencial = new JRadioButton();
		rbtnPreferencial.setBounds(55, 290, 115, 40);
		rbtnPreferencial.setText("Preferencial");
		rbtnPreferencial.setOpaque(false);
		rbtnPreferencial.setFont((new Font("Comic Sans MS", 0, 13)));
		pnlComplementos.add(rbtnPreferencial);
		
		SpinnerModel smG = new SpinnerNumberModel(1, 1, 9, 1);
		spnGeneral = new JSpinner(smG);
		spnGeneral.setBounds(160, 240, 50, 30);
		spnGeneral.setFont((new Font("Comic Sans MS", 0, 11)));
		spnGeneral.setEditor(new JSpinner.DefaultEditor(spnGeneral));
		spnGeneral.setEnabled(false);
		pnlComplementos.add(spnGeneral);
		
		SpinnerModel smP = new SpinnerNumberModel(1, 1, 9, 1);
		spnPreferencial = new JSpinner(smP);
		spnPreferencial.setBounds(160, 290, 50, 30);
		spnPreferencial.setFont((new Font("Comic Sans MS", 0, 11)));
		spnPreferencial.setEditor(new JSpinner.DefaultEditor(spnPreferencial));
		spnPreferencial.setEnabled(false);
		pnlComplementos.add(spnPreferencial);

                if (lblSalaActual.getText().equals("")) {
                lblSalaActual.setText("1");
            }
                sistema.getArrayMultiplex().get(Multiplex(lblCine.getText())).actualizarSalas();
		sistema.getArrayMultiplex().get(Multiplex(lblCine.getText())).getArraySalas().get((Integer.valueOf(lblSalaActual.getText()))-1).actualizasAsientos();
                for (int i = 1; i <=60; i++) {
                    JToggleButton botonTemp = new JToggleButton();
                        botonTemp.setName("Silla: "+String.valueOf(sistema.getArrayMultiplex().get(Multiplex(lblCine.getText())).getArraySalas().get(Integer.valueOf(lblSalaActual.getText())-1).getArrayAsientos().get(i-1).getCodigoAsiento()));
                        if(sistema.getArrayMultiplex().get(Multiplex(lblCine.getText())).getArraySalas().get(Integer.valueOf(lblSalaActual.getText())-1).getArrayAsientos().get(i-1).getTipoAsiento()==1){
                            botonTemp.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
                        }else{
                            botonTemp.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
                        }
                        if(sistema.getArrayMultiplex().get(Multiplex(lblCine.getText())).getArraySalas().get(Integer.valueOf(lblSalaActual.getText())-1).getArrayAsientos().get(i-1).getEstadoAsiento()==2){
                            botonTemp.setBackground(Color.red);
                            botonTemp.setEnabled(false);
                        }else{
                            botonTemp.setBackground(Color.green);
                        }
                        pnlSillas.add(botonTemp);
                        arrayBotones.add(botonTemp);
                }
                
		pnlPrincipal.add(pnlSillas);
		
		
		pnlPrincipal.add(pnlComplementos);
		
		
		componentes = pnlSillas.getComponents();
		

	}
        
        private int Multiplex(String multiplex){
            switch(multiplex){
                case "Cine: titan":
                    return 0;
                case "Cine: unicentro":
                    return 1;
                case "Cine: plaza centra":
                    return 2;
                case "Cine: gran estacion":
                    return 3;
                case "Cine: emabajador":
                    return 4;
                case "Cine: Las americas":
                    return 5;
                default:
                    return 0;
            }
        } 

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JButton getBtnContinue() {
		return btnContinue;
	}
	
	public Component[] getComponentesSilla() {
		return componentes; 
		//= pnlSillas.getComponents();
	}
	public JRadioButton getRbtnGeneral() {
		return rbtnGeneral;
	}

	public JRadioButton getRbtnPreferencial() {
		return rbtnPreferencial;
	}

	public JSpinner getSpnGeneral() {
		return spnGeneral;
	}

	public JSpinner getSpnPreferencial() {
		return spnPreferencial;
	}
	
	public int getIntSpnGeneral() {
		return (Integer) spnGeneral.getValue();
	}
	
	public int getIntSpnPreferencial() {
		return (Integer) spnPreferencial.getValue();
	}

    public JLabel getLblSalaActual() {
        return lblSalaActual;
    }

    public void setLblSalaActual(JLabel lblSalaActual) {
        this.lblSalaActual = lblSalaActual;
    }
	
        
	public JLabel getLblPelicula() {
		return lblPelicula;
	}
	public JLabel getLblCine() {
		return lblCine;
	}
	public void setLblPelicula(String Pelicula) {
		lblPelicula.setText("Pelicula: "+Pelicula);
	}
	
	public void setLblCine(String Cine) {
		lblCine.setText("Cine: "+Cine);
	}
        
        public void setLblSalaActual(String Sala){
            lblSalaActual.setText(Sala);
        }
	
	

/*
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnContinue) {
			
			VentanaSnacks vs = new VentanaSnacks();
			this.setVisible(false);
			vs.enviarDatos(Pelicula, Cine);
			vs.setVisible(true);
			System.out.println(sillasSeleccionadas()); 
			
			
		}else if(e.getSource()== btnSalir) {
			
			VentanaIngresoCliente vic = new VentanaIngresoCliente(Cine, Pelicula);
			this.setVisible(false);
			vic.setVisible(true);
			
		}
		
	}
	*/

    public ArrayList<JToggleButton> getArrayBotones() {
        return arrayBotones;
    }

    public void setArrayBotones(ArrayList<JToggleButton> arrayBotones) {
        this.arrayBotones = arrayBotones;
    }


}
