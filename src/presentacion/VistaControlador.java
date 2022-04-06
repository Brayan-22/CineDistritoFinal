package Presentacion;

import javax.swing.JFrame;

import facade.ControladorEvento;
import facade.Fachada;

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
		
		vp = new VentanaPelicula();
		this.add(vp);
		
		
		vrc = new VentanaRegistroCliente();
		this.add(vrc);
		
		vru = new VentanaRegistroUsuario();
		this.add(vru);
		
		vs = new VentanaSnacks();
		this.add(vs);
		
		vpago = new VentanaPago();
		this.add(vpago);
		
		
		
		vi.setVisible(true);
		
		vp.setVisible(false);
		va.setVisible(false);
		vc.setVisible(false);
		vcs.setVisible(false);
		vec.setVisible(false);
		vic.setVisible(false);
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
		
		vp.getBtnContinue().addActionListener(getControl());
		vp.getBtnSalir().addActionListener(getControl());
		vp.getCmbCinesDisponibles().addActionListener(getControl());
		
		
		vic.getBtnSalir().addActionListener(getControl());
		vic.getBtnIngreso().addActionListener(getControl());
		vic.getBtnOlvidoContraseña().addActionListener(getControl());
		vic.getBtnRegistroUsuario().addActionListener(getControl());
		
		vcs.getBtnContinue().addActionListener(getControl());
		vcs.getBtnSalir().addActionListener(getControl());
		//
                for (int i = 0; i < vcs.getArrayBotones().size(); i++) {
                    vcs.getArrayBotones().get(i).addActionListener(getControl());
            }
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
		vru.getFTxtDocumento().addKeyListener(getControl());
		vru.getFTxtNombre().addKeyListener(getControl());
		vru.getFTxtTelefono().addKeyListener(getControl());
                vru.getFTxtApellido().addKeyListener(getControl());
		
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
	
	public VentanaPelicula getVentanaPelicula() {
		return vp;
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
