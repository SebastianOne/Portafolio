package vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelVentana extends JPanel
{
	
	private JComboBox<String> usuario_id;
	private JComboBox<String> firts_name;
	private JComboBox<String> last_name;
	private JComboBox<String> gender;

	
	
	
   public PanelVentana(ArrayList nombre, ArrayList apellido, ArrayList usuario) 
   {
	  
	   setLayout(new GridLayout(2,2));
	 
	   usuario_id  =  new JComboBox<String>();
	   usuario_id.addItem("Usuarios");
	   for(int i = 0; i<usuario.size(); i++)
	   {
		   usuario_id.addItem((String) usuario.get(i));
		   
		   
	   }
	   
	   firts_name = new JComboBox<String>();
	   firts_name.addItem("Nombres");
	   for(int i = 0; i<nombre.size(); i++)
	   {
		   firts_name.addItem((String) nombre.get(i));
		   
		   
	   }
	  
	   last_name = new JComboBox<String>();
	   last_name.addItem("Apellidos");
	   for(int i = 0; i<apellido.size(); i++)
	   {
		   last_name.addItem((String) apellido.get(i));
		   
	   }
	   
	   gender = new JComboBox<String>();
	   gender.addItem("Genero");
	   gender.addItem("Female");
	   gender.addItem("Male");
	   
	   add(usuario_id);
	   add(firts_name);
	   add(last_name);
	   add(gender);
	  
	   
	   
   }


public JComboBox<String> getFirts_name() {
	return firts_name;
}




public void setFirts_name(JComboBox<String> firts_name) {
	this.firts_name = firts_name;
}




public JComboBox<String> getLast_name() {
	return last_name;
}




public void setLast_name(JComboBox<String> last_name) {
	this.last_name = last_name;
}


public JComboBox<String> getGender() {
	return gender;
}




public void setGender(JComboBox<String> gender) {
	this.gender = gender;
}


public JComboBox<String> getUsuario_id() {
	return usuario_id;
}


public void setUsuario_id(JComboBox<String> usuario_id) {
	this.usuario_id = usuario_id;
}





   
   
}
