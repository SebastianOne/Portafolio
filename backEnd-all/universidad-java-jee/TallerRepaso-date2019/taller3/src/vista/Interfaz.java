package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

import controlador.Controlador;

public class Interfaz extends JFrame 
{

	
	private static final long serialVersionUID = 1L;
	private PanelInterfaz panelInterfaz;
	private PanelBotonones panelBotones;
	private PanelResultados panelResultados;

	public Interfaz(Controlador control) 
	{
		
        setSize(700,700);
        setLayout(new GridLayout(1,1));
        setResizable(false);
        setTitle("Personal de sistemas ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  
        setLayout(new BorderLayout());
        
        panelInterfaz = new PanelInterfaz();
        panelBotones = new PanelBotonones();
        panelResultados = new PanelResultados();
        add(panelInterfaz,BorderLayout.CENTER);
        add(panelBotones, BorderLayout.EAST);
        add(panelResultados,BorderLayout.SOUTH);
        
	    panelInterfaz.getEmpleados().addItemListener(control);
	    panelBotones.getButCalcular().addActionListener(control);
	    panelBotones.getButCrear().addActionListener(control);
	    panelBotones.getButEliminar().addActionListener(control);
	    panelBotones.getButLeer().addActionListener(control);
	    panelBotones.getButModificar().addActionListener(control);
	    panelBotones.getButBuscar().addActionListener(control);
	  
	    
        
	}
	
	public void mensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje, " Informacion importante ", JOptionPane.INFORMATION_MESSAGE);
	}
	public PanelInterfaz getPanelInterfaz() {
		return panelInterfaz;
	}

	public void setPanelInterfaz(PanelInterfaz panelInterfaz) {
		this.panelInterfaz = panelInterfaz;
	}

	public PanelBotonones getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(PanelBotonones panelBotones) {
		this.panelBotones = panelBotones;
	}

	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}
	
	
	
}
