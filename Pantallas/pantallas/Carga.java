package pantallas;

import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;

import models.TipoProceso;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

public class Carga extends JPanel implements ActionListener{
	private JButton btnPrimCarga;
	private JButton btnSegCarga;
	private JButton btnConf;
	
	
	/**
	 * Create the panel.
	 */
	public Carga() {
		setLayout(null);

		btnPrimCarga = new JButton("Primera fase");		
		btnPrimCarga.setBounds(235, 187, 162, 57);
		add(btnPrimCarga);

		btnSegCarga = new JButton("Segunda fase");
		btnSegCarga.setBounds(235, 379, 162, 57);
		add(btnSegCarga);

		btnConf = new JButton("");
		btnConf.setBounds(62, 127, 50, 49);
		/*btnConf.setIcon(new ImageIcon(getClass().getResource("/Pantallas/pantallas/conf.png")));
		try {
			Image img = ImageIO.read(getClass().getResource("/Pantallas/pantallas/conf.png"));
			btnConf.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		Icon i = new ImageIcon("/Pantallas/pantallas/conf.png");
		btnConf.setIcon(i);*/
		

		/*
		 * JToggleButton button = new
		 * JToggleButton(UIManager.getIcon("OptionPane.informationIcon"));
		 * button.setSelectedIcon(UIManager.getIcon("OptionPane.errorIcon"));
		 * button.setBounds(21, 21, 50, 49); add(button);
		 */
		add(btnConf);
		btnConf.addActionListener(this);
		btnPrimCarga.addActionListener(this);
		btnSegCarga.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConf) {
			Configuracion c= new Configuracion();
			c.setVisible(true);
		}
	}
}
