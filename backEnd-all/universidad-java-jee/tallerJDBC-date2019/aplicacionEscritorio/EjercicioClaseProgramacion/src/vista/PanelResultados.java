package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PanelResultados extends JPanel
{
	
 
	private static final long serialVersionUID = 1L;
    private TextArea resultados;
    private JButton butConsulta;
   

public static final String CONSULTA = "consulta";
  
  public PanelResultados()
  {
	    setLayout(new GridLayout(2,1));
	    resultados = new TextArea();
	    resultados.setForeground(Color.black);
	    resultados.setBackground(Color.white);
		resultados.setForeground(Color.black);
		
	 
	    butConsulta =  new JButton("consulta");
	    butConsulta.setActionCommand(CONSULTA);
	  
	    add(resultados);
	    add(butConsulta);
	  
  }

public TextArea getResultados() {
	return resultados;
}

public void setResultados(TextArea resultados) {
	this.resultados = resultados;
}

public JButton getButConsulta() {
	return butConsulta;
}

public void setButConsulta(JButton butConsulta) {
	this.butConsulta = butConsulta;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

public static String getConsulta() {
	return CONSULTA;
}



  
  
}
