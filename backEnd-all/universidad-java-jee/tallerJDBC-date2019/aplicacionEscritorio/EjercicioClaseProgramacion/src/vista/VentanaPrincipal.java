package vista;

import java.awt.BorderLayout;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controlador.Controlador;

public class VentanaPrincipal extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelVentana panel; 
	private PanelResultados panel2;
	
	public VentanaPrincipal(Controlador control,ArrayList<String> nombre, ArrayList<String> apellido, ArrayList<String> usuario) 
	{
		setSize(500,400);
		setResizable(false);
		setTitle("BASE DE DATOS // JUAN SEBASTIAN RUEDA RODRIGUEZ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
	    panel = new PanelVentana(nombre,apellido, usuario);
		add(panel, BorderLayout.NORTH);
		panel2 = new PanelResultados();
		add(panel2);
		
		
		panel2.getButConsulta().addActionListener(control);
		
		panel.getUsuario_id().addItemListener(control);
		
		
	
	}
	
	public void mensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje, " Informacion importante ", JOptionPane.INFORMATION_MESSAGE);
	}

	public PanelVentana getPanel() {
		return panel;
	}

	public void setPanel(PanelVentana panel) {
		this.panel = panel;
	}

	public PanelResultados getPanel2() {
		return panel2;
	}

	public void setPanel2(PanelResultados panel2) {
		this.panel2 = panel2;
	}
	

	
}
