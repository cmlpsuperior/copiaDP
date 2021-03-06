package pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	public static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {				
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setBounds(100, 100, 650, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBienvenido = new JLabel("BIENVENIDO!");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 60));		
		
		lblBienvenido.setBounds(44, 250, 370, 196);
		frame.getContentPane().add(lblBienvenido);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmCarga = new JMenuItem("Carga");
		mntmCarga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carga carga =new Carga();
				carga.setVisible(true);				
				frame.getContentPane().setVisible(false);
				frame.setContentPane(carga);				
			}
		});
		mnArchivo.add(mntmCarga);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				 //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimientos = new JMenu("Mantenimientos");
		menuBar.add(mnMantenimientos);
		
		JMenuItem mntmTipoDeProceso = new JMenuItem("Tipo de Proceso");
		mntmTipoDeProceso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoProcesoPanel tipoProcP =new TipoProcesoPanel();
				tipoProcP.setVisible(true);
				frame.getContentPane().setVisible(false);
				frame.setContentPane(tipoProcP);
			}
		});
		mnMantenimientos.add(mntmTipoDeProceso);
		
		JMenuItem mntmProcesoElectoral = new JMenuItem("Proceso Electoral");
		mntmProcesoElectoral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProcesoElectoralPanel procElectoralP =new ProcesoElectoralPanel();
				procElectoralP.setVisible(true);
				frame.getContentPane().setVisible(false);
				frame.setContentPane(procElectoralP);
			}
		});
		mnMantenimientos.add(mntmProcesoElectoral);
		
		JMenuItem mntmPartidoPoltico = new JMenuItem("Partido Pol\u00EDtico");
		mntmPartidoPoltico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PartidoPoliticoPanel partPoliticoP =new PartidoPoliticoPanel();
				partPoliticoP.setVisible(true);
				frame.getContentPane().setVisible(false);
				frame.setContentPane(partPoliticoP);
			}
		});
		mnMantenimientos.add(mntmPartidoPoltico);
	}
	
	public static JFrame getFrame(){
		return frame;
	}
}
