package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	
	private JTextArea txtResultado;

	public PanelResultados() 
     {
    	setLayout(new GridLayout(1,1));
 		setSize(350,700);
 		TitledBorder border = BorderFactory.createTitledBorder("MOSTRAR EMPLEADOS");
 		border.setTitleColor(Color.black);
 		setBorder(border);
 		
 
		txtResultado = new JTextArea("");
		txtResultado.setForeground(Color.black);
		txtResultado.setBackground(Color.white);
		txtResultado.setLineWrap(true);  
		txtResultado.setWrapStyleWord(true); 
		JScrollPane scrollPane = new JScrollPane(txtResultado);
		scrollPane.setPreferredSize( new Dimension( 320, 200 ) );
		txtResultado.setForeground(Color.black);
		txtResultado.setBackground(Color.white);
		
		add(scrollPane);
     }


	public JTextArea getTxtResultado() {
		return txtResultado;
	}

	public void setTxtResultado(JTextArea txtResultado) {
		this.txtResultado = txtResultado;
	}

	
}
