package interfaz;

import javax.swing.JFrame;

import facade.ControladorEvento;
import facade.Fachada;
import interfaz.VentanaPeliculas.VentanaPelicula;
import interfaz.VentanaPeliculas.VentanaPeliculaEncanto;
import interfaz.VentanaPeliculas.VentanaPeliculaMoonfall;
import interfaz.VentanaPeliculas.VentanaPeliculaPaseo6;
import interfaz.VentanaPeliculas.VentanaPeliculaScream;
import interfaz.VentanaPeliculas.VentanaPeliculaSpiderman;

public class VistaControlador extends JFrame{
	
	private Fachada fachada;
	private ControladorEvento control;
	
	private VentanaAdmin va;
	private VentanaRecuperarContraseña vrcontraseña;
	private VentanaCartelera vc;
	private VentanaCompraSilla vcs;
	private VentanaEstablecerContraseña vec;
	private VentanaIngresoCliente vic;
	private VentanaInicio vi;
	private VentanaPelicula vp;
	private VentanaRegistroCliente vrc;
	private VentanaRegistroUsuario vru;
	private VentanaSnacks vs;
	private VentanaPeliculaEncanto vpEncanto;
	private VentanaPeliculaMoonfall vpMoonfall;
	private VentanaPeliculaPaseo6 vpPaseo;
	private VentanaPeliculaScream vpScream;
	private VentanaPeliculaSpiderman vpSpiderman;
	private VentanaPago vpago;
	
	
	
	
	

	public VistaControlador(Fachada fachada) {
		
		this.fachada = fachada;
		iniciarComponentes();
		capturarEventos();
		
		
	}
	
	private void iniciarComponentes() {
		
		this.setTitle("Cine Distrito");
		this.setSize(700, 700);
		//this.setIconImage(Toolkit.getDefaultToolkit().getImage(VistaControlador.class.getResource("/Imagen/Icono.png")));
		this.getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		va = new VentanaAdmin();
		this.add(va);
		
		vrcontraseña = new VentanaRecuperarContraseña();
		this.add(vrcontraseña);
		
		vc = new VentanaCartelera();
		this.add(vc);
		
		vcs = new VentanaCompraSilla();
		this.add(vcs);
		
		vec = new VentanaEstablecerContraseña();
		this.add(vec);
		
		vic = new VentanaIngresoCliente();
		this.add(vic);
		
		vi = new VentanaInicio();
		this.add(vi);
		
//		vp = new VentanaPelicula();
//		this.add(vp);
		
		vpEncanto = new VentanaPeliculaEncanto();
		this.add(vpEncanto);
		
		vpMoonfall = new VentanaPeliculaMoonfall();
		this.add(vpMoonfall);
		
		vpPaseo = new VentanaPeliculaPaseo6();
		this.add(vpPaseo);
		
		vpScream = new VentanaPeliculaScream();
		this.add(vpScream);
		
		vpSpiderman = new VentanaPeliculaSpiderman();
		this.add(vpSpiderman);
		
		vrc = new VentanaRegistroCliente();
		this.add(vrc);
		
		vru = new VentanaRegistroUsuario();
		this.add(vru);
		
		vs = new VentanaSnacks();
		this.add(vs);
		
		vpago = new VentanaPago();
		this.add(vpago);
		
		
		
		vi.setVisible(true);
		
//		vcc.setVisible(false);
		va.setVisible(false);
		vc.setVisible(false);
		vcs.setVisible(false);
		vec.setVisible(false);
		vic.setVisible(false);
		vpEncanto.setVisible(false);
		vpMoonfall.setVisible(false);
		vpPaseo.setVisible(false);
		vpScream.setVisible(false);
		vpSpiderman.setVisible(false);
		vrcontraseña.setVisible(false);
		vrc.setVisible(false);
		vru.setVisible(false);
		vs.setVisible(false);
		vpago.setVisible(false);
		
	}
	
	//Método por el cual se da el control de los eventos de los componentes interactivos de la interfaz
	public ControladorEvento getControl() {
		if (control == null) {
			control = new ControladorEvento(this);
			}

		return control;
		
	}
	
	
	private void capturarEventos() {
		
		vi.getBtnSalir().addActionListener(getControl());
		vi.getBtnIngreso().addActionListener(getControl());
		
		vc.getBtnSalir().addActionListener(getControl());
		vc.getBtnPeliculaEncanto().addActionListener(getControl());
		vc.getBtnPeliculaMoonfall().addActionListener(getControl());
		vc.getBtnPeliculaPaseo6().addActionListener(getControl());
		vc.getBtnPeliculaScream().addActionListener(getControl());
		vc.getBtnPeliculaSpiderman().addActionListener(getControl());
		
		vpEncanto.getBtnContinue().addActionListener(getControl());
		vpEncanto.getBtnSalir().addActionListener(getControl());
		vpEncanto.getCmbCinesDisponibles().addActionListener(getControl());
		
		vpMoonfall.getBtnContinue().addActionListener(getControl());
		vpMoonfall.getBtnSalir().addActionListener(getControl());
		vpMoonfall.getCmbCinesDisponibles().addActionListener(getControl());
		
		vpPaseo.getBtnContinue().addActionListener(getControl());
		vpPaseo.getBtnSalir().addActionListener(getControl());
		vpPaseo.getCmbCinesDisponibles().addActionListener(getControl());
		
		vpScream.getBtnContinue().addActionListener(getControl());
		vpScream.getBtnSalir().addActionListener(getControl());
		vpScream.getCmbCinesDisponibles().addActionListener(getControl());
		
		vpSpiderman.getBtnContinue().addActionListener(getControl());
		vpSpiderman.getBtnSalir().addActionListener(getControl());
		vpSpiderman.getCmbCinesDisponibles().addActionListener(getControl());
		
		vic.getBtnSalir().addActionListener(getControl());
		vic.getBtnIngreso().addActionListener(getControl());
		vic.getBtnOlvidoContraseña().addActionListener(getControl());
		vic.getBtnRegistroUsuario().addActionListener(getControl());
		
		vcs.getBtnContinue().addActionListener(getControl());
		vcs.getBtnSalir().addActionListener(getControl());
		//
		vcs.getBtnSilla00().addActionListener(getControl());
		vcs.getBtnSilla01().addActionListener(getControl());
		vcs.getBtnSilla02().addActionListener(getControl());
		vcs.getBtnSilla03().addActionListener(getControl());
		vcs.getBtnSilla04().addActionListener(getControl());
		vcs.getBtnSilla05().addActionListener(getControl());
		vcs.getBtnSilla06().addActionListener(getControl());
		vcs.getBtnSilla07().addActionListener(getControl());
		vcs.getBtnSilla08().addActionListener(getControl());
		vcs.getBtnSilla09().addActionListener(getControl());
		//
		vcs.getBtnSilla10().addActionListener(getControl());
		vcs.getBtnSilla11().addActionListener(getControl());
		vcs.getBtnSilla12().addActionListener(getControl());
		vcs.getBtnSilla13().addActionListener(getControl());
		vcs.getBtnSilla14().addActionListener(getControl());
		vcs.getBtnSilla15().addActionListener(getControl());
		vcs.getBtnSilla16().addActionListener(getControl());
		vcs.getBtnSilla17().addActionListener(getControl());
		vcs.getBtnSilla18().addActionListener(getControl());
		vcs.getBtnSilla19().addActionListener(getControl());
		//
		vcs.getBtnSilla20().addActionListener(getControl());
		vcs.getBtnSilla21().addActionListener(getControl());
		vcs.getBtnSilla22().addActionListener(getControl());
		vcs.getBtnSilla23().addActionListener(getControl());
		vcs.getBtnSilla24().addActionListener(getControl());
		vcs.getBtnSilla25().addActionListener(getControl());
		vcs.getBtnSilla26().addActionListener(getControl());
		vcs.getBtnSilla27().addActionListener(getControl());
		vcs.getBtnSilla28().addActionListener(getControl());
		vcs.getBtnSilla29().addActionListener(getControl());
		//
		vcs.getBtnSilla30().addActionListener(getControl());
		vcs.getBtnSilla31().addActionListener(getControl());
		vcs.getBtnSilla32().addActionListener(getControl());
		vcs.getBtnSilla33().addActionListener(getControl());
		vcs.getBtnSilla34().addActionListener(getControl());
		vcs.getBtnSilla35().addActionListener(getControl());
		vcs.getBtnSilla36().addActionListener(getControl());
		vcs.getBtnSilla37().addActionListener(getControl());
		vcs.getBtnSilla38().addActionListener(getControl());
		vcs.getBtnSilla39().addActionListener(getControl());
		//
		vcs.getBtnSilla40().addActionListener(getControl());
		vcs.getBtnSilla41().addActionListener(getControl());
		vcs.getBtnSilla42().addActionListener(getControl());
		vcs.getBtnSilla43().addActionListener(getControl());
		vcs.getBtnSilla44().addActionListener(getControl());
		vcs.getBtnSilla45().addActionListener(getControl());
		vcs.getBtnSilla46().addActionListener(getControl());
		vcs.getBtnSilla47().addActionListener(getControl());
		vcs.getBtnSilla48().addActionListener(getControl());
		vcs.getBtnSilla49().addActionListener(getControl());
		// 
		vcs.getBtnSilla50().addActionListener(getControl());
		vcs.getBtnSilla51().addActionListener(getControl());
		vcs.getBtnSilla52().addActionListener(getControl());
		vcs.getBtnSilla53().addActionListener(getControl());
		vcs.getBtnSilla54().addActionListener(getControl());
		vcs.getBtnSilla55().addActionListener(getControl());
		vcs.getBtnSilla56().addActionListener(getControl());
		vcs.getBtnSilla57().addActionListener(getControl());
		vcs.getBtnSilla58().addActionListener(getControl());
		vcs.getBtnSilla59().addActionListener(getControl());
		//
		vcs.getRbtnGeneral().addActionListener(getControl());
		vcs.getRbtnPreferencial().addActionListener(getControl());
		
		
		vrc.getBtnIngreso().addActionListener(getControl());
		vrc.getBtnSalir().addActionListener(getControl());
		vrc.getCbxAutorizacion().addActionListener(getControl());
		vrc.getTxtDocumento().addKeyListener(getControl());
		
		vrcontraseña.getBtnContinue().addActionListener(getControl());
		vrcontraseña.getBtnSalir().addActionListener(getControl());
		vrcontraseña.getTxtDocumento().addKeyListener(getControl());
		
		vs.getBtnContinue().addActionListener(getControl());
		vs.getBtnSalir().addActionListener(getControl());
		vs.getTbtnImgCombo1().addActionListener(getControl());
		vs.getTbtnImgCombo2().addActionListener(getControl());
		vs.getTbtnImgCombo3().addActionListener(getControl());
		vs.getTbtnImgCombo4().addActionListener(getControl());
		
		va.getBtnAgregarEmpleado().addActionListener(getControl());
		va.getBtnCambiarContraseña().addActionListener(getControl());
		va.getBtnCerrarSesion().addActionListener(getControl());
		
		vec.getBtnContinue().addActionListener(getControl());
		vec.getBtnSalir().addActionListener(getControl());
		
		vru.getBtnIngreso().addActionListener(getControl());
		vru.getBtnSalir().addActionListener(getControl());
		
		vpago.getTbtnBitcoin().addActionListener(getControl());
		vpago.getTbtnPaypal().addActionListener(getControl());
		vpago.getBtnFinalizar().addActionListener(getControl());
		vpago.getBtnSalir().addActionListener(getControl());
		
		
		
		
		
		// 
		
		
	}
	
	public VentanaInicio getVentanaInicio() {
		return vi;
	}
	
	public VentanaCartelera getVentanaCartelera() {
		return vc;
	}
	
//	public VentanaPelicula getVentanaPelicula() {
//		return vp;
//	}
	
	public VentanaPeliculaEncanto getVentanaPeliculaEncanto() {
		return vpEncanto;
	}
	
	public VentanaPeliculaMoonfall getVentanaPeliculaMoonfall() {
		return vpMoonfall;
	}
	
	public VentanaPeliculaPaseo6 getVentanaPeliculaPaseo6() {
		return vpPaseo;
	}
	
	public VentanaPeliculaScream getVentanaPeliculaScream() {
		return vpScream;
	}
	
	public VentanaPeliculaSpiderman getVentanaPeliculaSpiderman() {
		return vpSpiderman;
	}
	
	public VentanaIngresoCliente getVentanaIngresoCliente() {
		return vic;
	}
	
	public VentanaCompraSilla getVentanaCompraSilla() {
		return vcs;
	}
	
	public VentanaRegistroCliente getVentanaRegistroCliente() {
		return vrc;
	}
	
	public VentanaRecuperarContraseña getVentanaRecuperarContraseña() {
		
		return vrcontraseña;
	}
	
	public VentanaSnacks getVentanaSnacks() {
		return vs;
	}
	
	public VentanaAdmin getVentanaAdmin() {
		return va;
	}
	
	public VentanaEstablecerContraseña getVentanaEstablecerContraseña() {
		return vec;
	}
	
	public VentanaRegistroUsuario getVentanaRegistroUsuario() {
		return vru;
	}
	
	public VentanaPago getVentanaPago() {
		return vpago;
	}
	
	public Fachada getFachada () {
		return fachada;
	}


	
	
	
	
	
	
	
	
}
