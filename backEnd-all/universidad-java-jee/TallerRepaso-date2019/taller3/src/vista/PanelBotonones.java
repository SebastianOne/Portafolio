package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotonones extends JPanel
{
	 private JButton butCalcular;
	private JButton butCrear;
    private JButton butEliminar;
    private JButton butModificar;
    private JButton butBuscar;
    private JButton butLeer;
    
    public static final String CALCULAR = "Calcular salario";
    public static final String CREAR = "Crear";
    public static final String ELIMINAR = "Eliminar";
    public static final String MODIFICAR = "Modificar";
    public static final String BUSCAR = "Buscar";
    public static final String LEER = "Leer";
    
	
	private static final long serialVersionUID = 1L;
	
   public PanelBotonones() 
   {
	   setSize(200,200);
	   setLayout(new GridLayout(6,1));
	   
	   butCalcular = new JButton ("Calcular salario");
	   butCalcular.setActionCommand(CALCULAR);
	  
	   butCrear = new JButton ("Crear");
	   butCrear.setActionCommand(CREAR);
	   
	   butEliminar = new JButton ("Eliminar");
	   butEliminar.setActionCommand(ELIMINAR);
	   
	   butModificar = new JButton ("Modificar");
	   butModificar.setActionCommand(MODIFICAR);
	   
	   butBuscar = new JButton ("Buscar");
	   butBuscar.setActionCommand(BUSCAR);
	   
	   butLeer = new  JButton("Leer");
	   butLeer.setActionCommand(LEER);
	   
	   add(butCalcular);
	   add(butCrear);
	   add(butEliminar);
	   add(butModificar);
	   add(butBuscar);
	   add(butLeer);
	   
	   
	   
   }

public JButton getButCalcular() {
	return butCalcular;
}

public void setButCalcular(JButton butCalcular) {
	this.butCalcular = butCalcular;
}

public JButton getButCrear() {
	return butCrear;
}

public void setButCrear(JButton butCrear) {
	this.butCrear = butCrear;
}

public JButton getButEliminar() {
	return butEliminar;
}

public void setButEliminar(JButton butEliminar) {
	this.butEliminar = butEliminar;
}

public JButton getButModificar() {
	return butModificar;
}

public void setButModificar(JButton butModificar) {
	this.butModificar = butModificar;
}

public JButton getButLeer() {
	return butLeer;
}

public void setButLeer(JButton butLeer) {
	this.butLeer = butLeer;
}

public static String getCalcular() {
	return CALCULAR;
}

public static String getCrear() {
	return CREAR;
}

public static String getEliminar() {
	return ELIMINAR;
}

public static String getModificar() {
	return MODIFICAR;
}

public static String getLeer() {
	return LEER;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

public JButton getButBuscar() {
	return butBuscar;
}

public void setButBuscar(JButton butBuscar) {
	this.butBuscar = butBuscar;
}
   
   
   
   
}
