package interfaz;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

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
	
	
	private JToggleButton btnSilla00;
	private JToggleButton btnSilla01;
	private JToggleButton btnSilla02;
	private JToggleButton btnSilla03;
	private JToggleButton btnSilla04;
	private JToggleButton btnSilla05;
	private JToggleButton btnSilla06;
	private JToggleButton btnSilla07;
	private JToggleButton btnSilla08;
	private JToggleButton btnSilla09;
	
	private JToggleButton btnSilla10;
	private JToggleButton btnSilla11;
	private JToggleButton btnSilla12;
	private JToggleButton btnSilla13;
	private JToggleButton btnSilla14;
	private JToggleButton btnSilla15;
	private JToggleButton btnSilla16;
	private JToggleButton btnSilla17;
	private JToggleButton btnSilla18;
	private JToggleButton btnSilla19;
	
	private JToggleButton btnSilla20;
	private JToggleButton btnSilla21;
	private JToggleButton btnSilla22;
	private JToggleButton btnSilla23;
	private JToggleButton btnSilla24;
	private JToggleButton btnSilla25;
	private JToggleButton btnSilla26;
	private JToggleButton btnSilla27;
	private JToggleButton btnSilla28;
	private JToggleButton btnSilla29;
	
	private JToggleButton btnSilla30;
	private JToggleButton btnSilla31;
	private JToggleButton btnSilla32;
	private JToggleButton btnSilla33;
	private JToggleButton btnSilla34;
	private JToggleButton btnSilla35;
	private JToggleButton btnSilla36;
	private JToggleButton btnSilla37;
	private JToggleButton btnSilla38;
	private JToggleButton btnSilla39;
	
	private JToggleButton btnSilla40;
	private JToggleButton btnSilla41;
	private JToggleButton btnSilla42;
	private JToggleButton btnSilla43;
	private JToggleButton btnSilla44;
	private JToggleButton btnSilla45;
	private JToggleButton btnSilla46;
	private JToggleButton btnSilla47;
	private JToggleButton btnSilla48;
	private JToggleButton btnSilla49;
	
	private JToggleButton btnSilla50;
	private JToggleButton btnSilla51;
	private JToggleButton btnSilla52;
	private JToggleButton btnSilla53;
	private JToggleButton btnSilla54;
	private JToggleButton btnSilla55;
	private JToggleButton btnSilla56;
	private JToggleButton btnSilla57;
	private JToggleButton btnSilla58;
	private JToggleButton btnSilla59;
	
	private JRadioButton rbtnGeneral;
	private JRadioButton rbtnPreferencial;
	
	private JSpinner spnGeneral;
	private JSpinner spnPreferencial;
	
	

	private String Pelicula;
	private String Cine;
	
	String Sillas ="";

	
	
	
	public VentanaCompraSilla() {
		

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
		pnlSillas.setBackground(Color.LIGHT_GRAY);
		pnlSillas.setBounds(250, 90, 418, 320);
		pnlSillas.setLayout(null);
		pnlSillas.setOpaque(false);
		pnlSillas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		
		///////////////////////////////////////////
		ImageIcon imagenSilla = new ImageIcon("./img/imgAsiento.png");
		ImageIcon imagenSillaPreferencial = new ImageIcon("./img/imgAsientoPreferencial.png");
		
		btnSilla00 = new JToggleButton();
		btnSilla00.setName("Silla 00");
		btnSilla00.setBounds(10, 10, 36, 36);
		btnSilla00.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla00);

		//
		
		btnSilla01 = new JToggleButton();
		btnSilla01.setName("Silla 01");
		btnSilla01.setBounds(50, 10, 36, 36);
		btnSilla01.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla01);
		
		//
		
		btnSilla02 = new JToggleButton();
		btnSilla02.setName("Silla 02");
		btnSilla02.setBounds(90, 10, 36, 36);
		btnSilla02.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla02);
		
		//
		
		btnSilla03 = new JToggleButton();
		btnSilla03.setName("Silla 03");
		btnSilla03.setBounds(130, 10, 36, 36);
		btnSilla03.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla03);
		
		//
		

		btnSilla04 = new JToggleButton();
		btnSilla04.setName("Silla 04");
		btnSilla04.setBounds(170, 10, 36, 36);
		btnSilla04.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla04);
		
		//

		btnSilla05 = new JToggleButton();
		btnSilla05.setName("Silla 05");
		btnSilla05.setBounds(210, 10, 36, 36);
		btnSilla05.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla05);	
		
		//

		btnSilla06 = new JToggleButton();
		btnSilla06.setName("Silla 06");
		btnSilla06.setBounds(250, 10, 36, 36);
		btnSilla06.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla06);
		
		//

		btnSilla07 = new JToggleButton();
		btnSilla07.setName("Silla 07");
		btnSilla07.setBounds(290, 10, 36, 36);
		btnSilla07.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla07);
		
		//

		btnSilla08 = new JToggleButton();
		btnSilla08.setName("Silla 08");
		btnSilla08.setBounds(330, 10, 36, 36);
		btnSilla08.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla08);
		
		//

		btnSilla09 = new JToggleButton();
		btnSilla09.setName("Silla 09");
		btnSilla09.setBounds(370, 10, 36, 36);
		btnSilla09.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla09);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		btnSilla10 = new JToggleButton();
		btnSilla10.setName("Silla 10");
		btnSilla10.setBounds(10, 50, 36, 36);
		btnSilla10.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla10);

		//
		
		btnSilla11 = new JToggleButton();
		btnSilla11.setName("Silla 11");
		btnSilla11.setBounds(50, 50, 36, 36);
		btnSilla11.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla11);
		
		//
		
		btnSilla12 = new JToggleButton();
		btnSilla12.setName("Silla 12");
		btnSilla12.setBounds(90, 50, 36, 36);
		btnSilla12.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla12);
		
		//
		
		btnSilla13 = new JToggleButton();
		btnSilla13.setName("Silla 13");
		btnSilla13.setBounds(130, 50, 36, 36);
		btnSilla13.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla13);
		
		//
		

		btnSilla14 = new JToggleButton();
		btnSilla14.setName("Silla 14");
		btnSilla14.setBounds(170, 50, 36, 36);
		btnSilla14.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla14);
		
		//

		btnSilla15 = new JToggleButton();
		btnSilla15.setName("Silla 15");
		btnSilla15.setBounds(210, 50, 36, 36);
		btnSilla15.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla15);	
		
		//

		btnSilla16 = new JToggleButton();
		btnSilla16.setName("Silla 16");
		btnSilla16.setBounds(250, 50, 36, 36);
		btnSilla16.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla16);
		
		//

		btnSilla17 = new JToggleButton();
		btnSilla17.setName("Silla 17");
		btnSilla17.setBounds(290, 50, 36, 36);
		btnSilla17.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla17);
		
		//

		btnSilla18 = new JToggleButton();
		btnSilla18.setName("Silla 18");
		btnSilla18.setBounds(330, 50, 36, 36);
		btnSilla18.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla18);
		
		//

		btnSilla19 = new JToggleButton();
		btnSilla19.setName("Silla 19");
		btnSilla19.setBounds(370, 50, 36, 36);
		btnSilla19.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla19);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		btnSilla20 = new JToggleButton();
		btnSilla20.setName("Silla 20");
		btnSilla20.setBounds(10, 90, 36, 36);
		btnSilla20.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla20);

		//
		
		btnSilla21 = new JToggleButton();
		btnSilla21.setName("Silla 21");
		btnSilla21.setBounds(50, 90, 36, 36);
		btnSilla21.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla21);
		
		//
		
		btnSilla22 = new JToggleButton();
		btnSilla22.setName("Silla 22");
		btnSilla22.setBounds(90, 90, 36, 36);
		btnSilla22.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla22);
		
		//
		
		btnSilla23 = new JToggleButton();
		btnSilla23.setName("Silla 23");
		btnSilla23.setBounds(130, 90, 36, 36);
		btnSilla23.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla23);
		
		//
		

		btnSilla24 = new JToggleButton();
		btnSilla24.setName("Silla 24");
		btnSilla24.setBounds(170, 90, 36, 36);
		btnSilla24.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla24);
		
		//

		btnSilla25 = new JToggleButton();
		btnSilla25.setName("Silla 25");
		btnSilla25.setBounds(210, 90, 36, 36);
		btnSilla25.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla25);	
		
		//

		btnSilla26 = new JToggleButton();
		btnSilla26.setName("Silla 26");
		btnSilla26.setBounds(250, 90, 36, 36);
		btnSilla26.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		btnSilla26.setBackground(Color.green);
		pnlSillas.add(btnSilla26);
		
		//

		btnSilla27 = new JToggleButton();
		btnSilla27.setName("Silla 27");
		btnSilla27.setBounds(290, 90, 36, 36);
		btnSilla27.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla27);
		
		//

		btnSilla28 = new JToggleButton();
		btnSilla28.setName("Silla 28");
		btnSilla28.setBounds(330, 90, 36, 36);
		btnSilla28.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla28);
		
		//

		btnSilla29 = new JToggleButton();
		btnSilla29.setName("Silla 29");
		btnSilla29.setBounds(370, 90, 36, 36);
		btnSilla29.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla29);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		btnSilla30 = new JToggleButton();
		btnSilla30.setName("Silla 30");
		btnSilla30.setBounds(10, 130, 36, 36);
		btnSilla30.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla30);
		
		//
		
		btnSilla31 = new JToggleButton();
		btnSilla31.setName("Silla 31");
		btnSilla31.setBounds(50, 130, 36, 36);
		btnSilla31.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla31);
		
		//
		
		btnSilla32 = new JToggleButton();
		btnSilla32.setName("Silla 32");
		btnSilla32.setBounds(90, 130, 36, 36);
		btnSilla32.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla32);
		
		//
		
		btnSilla33 = new JToggleButton();
		btnSilla33.setName("Silla 33");
		btnSilla33.setBounds(130, 130, 36, 36);
		btnSilla33.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla33);
		
		//
		

		btnSilla34 = new JToggleButton();
		btnSilla34.setName("Silla 34");
		btnSilla34.setBounds(170, 130, 36, 36);
		btnSilla34.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla34);
		
		//

		btnSilla35 = new JToggleButton();
		btnSilla35.setName("Silla 35");
		btnSilla35.setBounds(210, 130, 36, 36);
		btnSilla35.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla35);	
		
		//

		btnSilla36 = new JToggleButton();
		btnSilla36.setName("Silla 36");
		btnSilla36.setBounds(250, 130, 36, 36);
		btnSilla36.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		btnSilla36.setBackground(Color.green);
		pnlSillas.add(btnSilla36);
		
		//

		btnSilla37 = new JToggleButton();
		btnSilla37.setName("Silla 37");
		btnSilla37.setBounds(290, 130, 36, 36);
		btnSilla37.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla37);
		
		//

		btnSilla38 = new JToggleButton();
		btnSilla38.setName("Silla 38");
		btnSilla38.setBounds(330, 130, 36, 36);
		btnSilla38.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla38);
		
		//

		btnSilla39 = new JToggleButton();
		btnSilla39.setName("Silla 39");
		btnSilla39.setBounds(370, 130, 36, 36);
		btnSilla39.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla39);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		btnSilla40 = new JToggleButton();
		btnSilla40.setName("Silla 40");
		btnSilla40.setBounds(10, 170, 36, 36);
		btnSilla40.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla40);
		
		//
		
		btnSilla41 = new JToggleButton();
		btnSilla41.setName("Silla 41");
		btnSilla41.setBounds(50, 170, 36, 36);
		btnSilla41.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla41);
		
		//
		
		btnSilla42 = new JToggleButton();
		btnSilla42.setName("Silla 42");
		btnSilla42.setBounds(90, 170, 36, 36);
		btnSilla42.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla42);
		
		//
		
		btnSilla43 = new JToggleButton();
		btnSilla43.setName("Silla 43");
		btnSilla43.setBounds(130, 170, 36, 36);
		btnSilla43.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla43);
		
		//
		

		btnSilla44 = new JToggleButton();
		btnSilla44.setName("Silla 44");
		btnSilla44.setBounds(170, 170, 36, 36);
		btnSilla44.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla44);
		
		//

		btnSilla45 = new JToggleButton();
		btnSilla45.setName("Silla 45");
		btnSilla45.setBounds(210, 170, 36, 36);
		btnSilla45.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla45);	
		
		//

		btnSilla46 = new JToggleButton();
		btnSilla46.setName("Silla 46");
		btnSilla46.setBounds(250, 170, 36, 36);
		btnSilla46.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla46);
		
		//

		btnSilla47 = new JToggleButton();
		btnSilla47.setName("Silla 47");
		btnSilla47.setBounds(290, 170, 36, 36);
		btnSilla47.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla47);
		
		//

		btnSilla48 = new JToggleButton();
		btnSilla48.setName("Silla 48");
		btnSilla48.setBounds(330, 170, 36, 36);
		btnSilla48.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla48);
		
		//

		btnSilla49 = new JToggleButton();
		btnSilla49.setName("Silla 49");
		btnSilla49.setBounds(370, 170, 36, 36);
		btnSilla49.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla49);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		btnSilla50 = new JToggleButton();
		btnSilla50.setName("Silla 50");
		btnSilla50.setBounds(10, 210, 36, 36);
		btnSilla50.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla50);
		
		//
		
		btnSilla51 = new JToggleButton();
		btnSilla51.setName("Silla 51");
		btnSilla51.setBounds(50, 210, 36, 36);
		btnSilla51.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla51);
		
		//
		
		btnSilla52 = new JToggleButton();
		btnSilla52.setName("Silla 52");
		btnSilla52.setBounds(90, 210, 36, 36);
		btnSilla52.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla52);
		
		//
		
		btnSilla53 = new JToggleButton();
		btnSilla53.setName("Silla 53");
		btnSilla53.setBounds(130, 210, 36, 36);
		btnSilla53.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla53);
		
		//
		

		btnSilla54 = new JToggleButton();
		btnSilla54.setName("Silla 54");
		btnSilla54.setBounds(170, 210, 36, 36);
		btnSilla54.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla54);
		
		//

		btnSilla55 = new JToggleButton();
		btnSilla55.setName("Silla 55");
		btnSilla55.setBounds(210, 210, 36, 36);
		btnSilla55.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla55);	
		
		//

		btnSilla56 = new JToggleButton();
		btnSilla56.setName("Silla 56");
		btnSilla56.setBounds(250, 210, 36, 36);
		btnSilla56.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla56);
		
		//

		btnSilla57 = new JToggleButton();
		btnSilla57.setName("Silla 57");
		btnSilla57.setBounds(290, 210, 36, 36);
		btnSilla57.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla57);
		
		//

		btnSilla58 = new JToggleButton();
		btnSilla58.setName("Silla 58");
		btnSilla58.setBounds(330, 210, 36, 36);
		btnSilla58.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla58);
		
		//

		btnSilla59 = new JToggleButton();
		btnSilla59.setName("Silla 59");
		btnSilla59.setBounds(370, 210, 36, 36);
		btnSilla59.setIcon(new ImageIcon(imagenSillaPreferencial.getImage().getScaledInstance(32,
				32, Image.SCALE_SMOOTH)));
		pnlSillas.add(btnSilla59);
		
		
		JLabel lblPantalla = new JLabel();
		lblPantalla.setBounds(210, 320, 397, 397);
		ImageIcon imagenTV = new ImageIcon("./img/imgPantalla.png");
		lblPantalla.setIcon(new ImageIcon(imagenTV.getImage().getScaledInstance(lblPantalla.getWidth(),
				lblPantalla.getHeight(), Image.SCALE_SMOOTH)));
//		lblPantalla.setText("Holaaa");
		
		//pnladd(lblPantalla);
		
		
		pnlPrincipal.add(pnlSillas);
		
		JPanel pnlComplementos = new JPanel();
		pnlComplementos.setBackground(Color.LIGHT_GRAY);
		pnlComplementos.setBounds(30, 90, 620, 470);
		pnlComplementos.setLayout(null);
		pnlComplementos.setOpaque(false);
		//pnlComplementos.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
		
		
		JComboBox<String> cmbHorario = new JComboBox<String>();
		cmbHorario.setBounds(0, 15, 190, 30);
		cmbHorario.addItem("Seleccione Horario");
		pnlComplementos.add(cmbHorario);
		
		
		JLabel lblPelicula = new JLabel();
		lblPelicula.setText("Pelicula: "+Pelicula);
		lblPelicula.setBounds(0, 80, 200, 40);
		lblPelicula.setFont((new Font("Comic Sans MS", 0, 18)));
		pnlComplementos.add(lblPelicula);
		
		JLabel lblCine = new JLabel();
		lblCine.setText("Cine: "+Cine);
		lblCine.setBounds(0, 120, 200, 40);
		lblCine.setFont((new Font("Comic Sans MS", 0, 18)));
		pnlComplementos.add(lblCine);
		
		JLabel lblTitulos = new JLabel();
		lblTitulos.setText("Costo     Boletos  Cantidad");
		lblTitulos.setBounds(0, 190, 400, 40);
		lblTitulos.setFont((new Font("Comic Sans MS", 1, 16)));
		pnlComplementos.add(lblTitulos);
		
		JLabel lblCostoGeneral = new JLabel();
		lblCostoGeneral.setText("$ 15.000");
		lblCostoGeneral.setBounds(0, 240, 100, 40);
		lblCostoGeneral.setFont((new Font("Comic Sans MS", 0, 11)));
		pnlComplementos.add(lblCostoGeneral);
		
		JLabel lblCostoPreferencial = new JLabel();
		lblCostoPreferencial.setText("$ 70.000");
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

		
		
		
		
		pnlPrincipal.add(pnlComplementos);
		
		
		componentes = pnlSillas.getComponents();
		

	}
	
	public void recibirPeliculaCine(String Pelicula, String Cine) {
		
		this.Pelicula = Pelicula;
		this.Cine = Cine;
		
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JButton getBtnContinue() {
		return btnContinue;
	}

	public JToggleButton getBtnSilla00() {
		return btnSilla00;
	}

	public JToggleButton getBtnSilla01() {
		return btnSilla01;
	}

	public JToggleButton getBtnSilla02() {
		return btnSilla02;
	}

	public JToggleButton getBtnSilla03() {
		return btnSilla03;
	}

	public JToggleButton getBtnSilla04() {
		return btnSilla04;
	}

	public JToggleButton getBtnSilla05() {
		return btnSilla05;
	}

	public JToggleButton getBtnSilla06() {
		return btnSilla06;
	}

	public JToggleButton getBtnSilla07() {
		return btnSilla07;
	}

	public JToggleButton getBtnSilla08() {
		return btnSilla08;
	}

	public JToggleButton getBtnSilla09() {
		return btnSilla09;
	}

	public JToggleButton getBtnSilla10() {
		return btnSilla10;
	}

	public JToggleButton getBtnSilla11() {
		return btnSilla11;
	}

	public JToggleButton getBtnSilla12() {
		return btnSilla12;
	}

	public JToggleButton getBtnSilla13() {
		return btnSilla13;
	}

	public JToggleButton getBtnSilla14() {
		return btnSilla14;
	}

	public JToggleButton getBtnSilla15() {
		return btnSilla15;
	}

	public JToggleButton getBtnSilla16() {
		return btnSilla16;
	}

	public JToggleButton getBtnSilla17() {
		return btnSilla17;
	}

	public JToggleButton getBtnSilla18() {
		return btnSilla18;
	}

	public JToggleButton getBtnSilla19() {
		return btnSilla19;
	}

	public JToggleButton getBtnSilla20() {
		return btnSilla20;
	}

	public JToggleButton getBtnSilla21() {
		return btnSilla21;
	}

	public JToggleButton getBtnSilla22() {
		return btnSilla22;
	}

	public JToggleButton getBtnSilla23() {
		return btnSilla23;
	}

	public JToggleButton getBtnSilla24() {
		return btnSilla24;
	}

	public JToggleButton getBtnSilla25() {
		return btnSilla25;
	}

	public JToggleButton getBtnSilla26() {
		return btnSilla26;
	}

	public JToggleButton getBtnSilla27() {
		return btnSilla27;
	}

	public JToggleButton getBtnSilla28() {
		return btnSilla28;
	}

	public JToggleButton getBtnSilla29() {
		return btnSilla29;
	}

	public JToggleButton getBtnSilla30() {
		return btnSilla30;
	}

	public JToggleButton getBtnSilla31() {
		return btnSilla31;
	}

	public JToggleButton getBtnSilla32() {
		return btnSilla32;
	}

	public JToggleButton getBtnSilla33() {
		return btnSilla33;
	}

	public JToggleButton getBtnSilla34() {
		return btnSilla34;
	}

	public JToggleButton getBtnSilla35() {
		return btnSilla35;
	}

	public JToggleButton getBtnSilla36() {
		return btnSilla36;
	}

	public JToggleButton getBtnSilla37() {
		return btnSilla37;
	}

	public JToggleButton getBtnSilla38() {
		return btnSilla38;
	}

	public JToggleButton getBtnSilla39() {
		return btnSilla39;
	}

	public JToggleButton getBtnSilla40() {
		return btnSilla40;
	}

	public JToggleButton getBtnSilla41() {
		return btnSilla41;
	}

	public JToggleButton getBtnSilla42() {
		return btnSilla42;
	}

	public JToggleButton getBtnSilla43() {
		return btnSilla43;
	}

	public JToggleButton getBtnSilla44() {
		return btnSilla44;
	}

	public JToggleButton getBtnSilla45() {
		return btnSilla45;
	}

	public JToggleButton getBtnSilla46() {
		return btnSilla46;
	}

	public JToggleButton getBtnSilla47() {
		return btnSilla47;
	}

	public JToggleButton getBtnSilla48() {
		return btnSilla48;
	}

	public JToggleButton getBtnSilla49() {
		return btnSilla49;
	}

	public JToggleButton getBtnSilla50() {
		return btnSilla50;
	}

	public JToggleButton getBtnSilla51() {
		return btnSilla51;
	}

	public JToggleButton getBtnSilla52() {
		return btnSilla52;
	}

	public JToggleButton getBtnSilla53() {
		return btnSilla53;
	}

	public JToggleButton getBtnSilla54() {
		return btnSilla54;
	}

	public JToggleButton getBtnSilla55() {
		return btnSilla55;
	}

	public JToggleButton getBtnSilla56() {
		return btnSilla56;
	}

	public JToggleButton getBtnSilla57() {
		return btnSilla57;
	}

	public JToggleButton getBtnSilla58() {
		return btnSilla58;
	}

	public JToggleButton getBtnSilla59() {
		return btnSilla59;
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


}
