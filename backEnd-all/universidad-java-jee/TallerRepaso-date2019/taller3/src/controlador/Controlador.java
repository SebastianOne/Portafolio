package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


import modelo.Comision;
import modelo.Implementacion;
import modelo.IngenieroJunior;
import modelo.IngenieroSenior;
import vista.Interfaz;

public class Controlador implements ActionListener, ItemListener {

	private Implementacion im;
	private IngenieroJunior ju;
	private IngenieroSenior sen;
	private Comision com;
	private Interfaz in;
	

	public Controlador() {

		ju = new IngenieroJunior(null, null, null, null, null, null, null, null, null, 0);
		sen = new IngenieroSenior(null, null, null, null, null, null, null, null, 0, 0);
		com = new Comision(null, null, null, null, null, null, null, null, 0, 0, 0);
		im = new Implementacion();
		in = new Interfaz(this);
		in.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String ingeniero = (String) in.getPanelInterfaz().getEmpleados().getSelectedItem();

		if (evento.getActionCommand().equals(in.getPanelBotones().CALCULAR)) 
		{

			if (ingeniero.equalsIgnoreCase("Ingeniero junior")) 
			{
				ju.setNivel((String) in.getPanelInterfaz().getNivel().getSelectedItem());
				ju.setAño((String) in.getPanelInterfaz().getAño().getSelectedItem());
				ju.setGenero((String) in.getPanelInterfaz().getGenero().getSelectedItem());
				ju.setNombre(in.getPanelInterfaz().getTxtNombre().getText());
				ju.setApellido(in.getPanelInterfaz().getTxtApellido().getText());
				ju.setTelefono(in.getPanelInterfaz().getTxtTelefono().getText());
				ju.setCedula(in.getPanelInterfaz().getTxtCedula().getText());
				ju.setCorreo(in.getPanelInterfaz().getTxtCorreo().getText());
				ju.setDireccion(in.getPanelInterfaz().getTxtDireccion().getText());
				ju.calcularSalario();
				in.getPanelInterfaz().getTxtSalario().setText(String.valueOf(ju.calcularSalrioFinal()));
			}

			if (ingeniero.equalsIgnoreCase("Ingeniero Senior")) {

				sen.setAño((String) in.getPanelInterfaz().getAño().getSelectedItem());
				sen.setGenero((String) in.getPanelInterfaz().getGenero().getSelectedItem());
				sen.setNombre(in.getPanelInterfaz().getTxtNombre().getText());
				sen.setApellido(in.getPanelInterfaz().getTxtApellido().getText());
				sen.setTelefono(in.getPanelInterfaz().getTxtTelefono().getText());
				sen.setCedula(in.getPanelInterfaz().getTxtCedula().getText());
				sen.setCorreo(in.getPanelInterfaz().getTxtCorreo().getText());
				sen.setDireccion(in.getPanelInterfaz().getTxtDireccion().getText());
				sen.setVentas(Integer.parseInt(in.getPanelInterfaz().getTxtVenta().getText()));
				sen.calcularSalario();
				
				in.getPanelInterfaz().getTxtSalario().setText(String.valueOf(sen.calcularSalrioFinal()));
				
			}

			if (ingeniero.equalsIgnoreCase("Empleado por Comisión")) {
				com.setGenero((String) in.getPanelInterfaz().getGenero().getSelectedItem());
				com.setNombre(in.getPanelInterfaz().getTxtNombre().getText());
				com.setApellido(in.getPanelInterfaz().getTxtApellido().getText());
				com.setTelefono(in.getPanelInterfaz().getTxtTelefono().getText());
				com.setCedula(in.getPanelInterfaz().getTxtCedula().getText());
				com.setCorreo(in.getPanelInterfaz().getTxtCorreo().getText());
				com.setDireccion(in.getPanelInterfaz().getTxtDireccion().getText());
				com.setClientesCaptados(Integer.parseInt(in.getPanelInterfaz().getTxtCliente().getText()));
				com.setMonto(Integer.parseInt(in.getPanelInterfaz().getTxtMonto().getText()));
				in.getPanelInterfaz().getTxtSalario().setText(String.valueOf(com.calcularSalario()));
			}

			if (ingeniero.equalsIgnoreCase("")) {

				in.mensaje("debe escoger un tipo de empleado");
			}

		}

		if (evento.getActionCommand().equals(in.getPanelBotones().CREAR))
		{
			if (ingeniero.equalsIgnoreCase("Ingeniero junior")) 
			{
				in.mensaje(im.crearEmpleadoJuior(ju.getCedula(), ju.getNombre(), ju.getApellido(), ju.getTelefono(),
						ju.getCorreo(), ju.getDireccion(), ju.getAño(), ju.getGenero(), ju.getNivel(),
						ju.getSalario()));

				in.getPanelInterfaz().getEmpleados().setSelectedIndex(0);
				in.getPanelInterfaz().getNivel().setSelectedIndex(0);
				in.getPanelInterfaz().getAño().setSelectedIndex(0);
				in.getPanelInterfaz().getGenero().setSelectedIndex(0);
				in.getPanelInterfaz().getTxtNombre().setText("");
				in.getPanelInterfaz().getTxtApellido().setText("");
				in.getPanelInterfaz().getTxtTelefono().setText("");
				in.getPanelInterfaz().getTxtCedula().setText("");
				in.getPanelInterfaz().getTxtCorreo().setText("");
				in.getPanelInterfaz().getTxtDireccion().setText("");
				in.getPanelInterfaz().getTxtSalario().setText("");
			}

			if (ingeniero.equalsIgnoreCase("Ingeniero Senior")) {
				in.mensaje(im.crearEmpleadoSenior(sen.getCedula(), sen.getNombre(), sen.getApellido(),
						sen.getTelefono(), sen.getCorreo(), sen.getDireccion(), sen.getAño(), sen.getGenero(),
						sen.getVentas(), sen.getSalario()));

				in.getPanelInterfaz().getEmpleados().setSelectedIndex(0);
				in.getPanelInterfaz().getAño().setSelectedIndex(0);
				in.getPanelInterfaz().getGenero().setSelectedIndex(0);
				in.getPanelInterfaz().getTxtNombre().setText("");
				in.getPanelInterfaz().getTxtApellido().setText("");
				in.getPanelInterfaz().getTxtTelefono().setText("");
				in.getPanelInterfaz().getTxtCedula().setText("");
				in.getPanelInterfaz().getTxtCorreo().setText("");
				in.getPanelInterfaz().getTxtDireccion().setText("");
				in.getPanelInterfaz().getTxtSalario().setText("");
				in.getPanelInterfaz().getTxtVenta().setText("");

			}

			if (ingeniero.equalsIgnoreCase("Empleado por Comisión")) {
				in.mensaje(im.crearEmpleadoComision(com.getCedula(), com.getNombre(), com.getApellido(),
						com.getTelefono(), com.getCorreo(), com.getDireccion(), com.getAño(), com.getGenero(),
						com.getClientesCaptados(), com.getMonto(), com.getSalario()));

				in.getPanelInterfaz().getEmpleados().setSelectedIndex(0);
				in.getPanelInterfaz().getGenero().setSelectedIndex(0);
				in.getPanelInterfaz().getTxtNombre().setText("");
				in.getPanelInterfaz().getTxtApellido().setText("");
				in.getPanelInterfaz().getTxtTelefono().setText("");
				in.getPanelInterfaz().getTxtCedula().setText("");
				in.getPanelInterfaz().getTxtCorreo().setText("");
				in.getPanelInterfaz().getTxtDireccion().setText("");
				in.getPanelInterfaz().getTxtCliente().setText("");
				in.getPanelInterfaz().getTxtMonto().setText("");
				in.getPanelInterfaz().getTxtSalario().setText("");
			}

			if (ingeniero.equalsIgnoreCase("")) {
				in.mensaje("debe escoger un tipo de empleado");
			}

		}

		if (evento.getActionCommand().equals(in.getPanelBotones().ELIMINAR)) {

			in.mensaje(im.eliminarEmpleado(in.getPanelInterfaz().getTxtCedula().getText()));

		}

		if (evento.getActionCommand().equals(in.getPanelBotones().MODIFICAR)) {

			if (ingeniero.equalsIgnoreCase("Ingeniero junior")) {
				ju.setNivel((String) in.getPanelInterfaz().getNivel().getSelectedItem());
				ju.setAño((String) in.getPanelInterfaz().getAño().getSelectedItem());
				ju.setGenero((String) in.getPanelInterfaz().getGenero().getSelectedItem());
				ju.setNombre(in.getPanelInterfaz().getTxtNombre().getText());
				ju.setApellido(in.getPanelInterfaz().getTxtApellido().getText());
				ju.setTelefono(in.getPanelInterfaz().getTxtTelefono().getText());
				ju.setCedula(in.getPanelInterfaz().getTxtCedula().getText());
				ju.setCorreo(in.getPanelInterfaz().getTxtCorreo().getText());
				ju.setDireccion(in.getPanelInterfaz().getTxtDireccion().getText());
				ju.calcularSalario();
				in.getPanelInterfaz().getTxtSalario().setText(String.valueOf(ju.calcularSalrioFinal()));
				in.mensaje(im.modificarEmpleadoJuior(ju.getCedula(), ju.getNombre(), ju.getApellido(), ju.getTelefono(),
						ju.getTelefono(), ju.getDireccion(), ju.getAño(), ju.getGenero(), ju.getNivel(),
						ju.getSalario()));
				in.getPanelInterfaz().getEmpleados().setSelectedIndex(0);
				in.getPanelInterfaz().getNivel().setSelectedIndex(0);
				in.getPanelInterfaz().getAño().setSelectedIndex(0);
				in.getPanelInterfaz().getGenero().setSelectedIndex(0);
				in.getPanelInterfaz().getTxtNombre().setText("");
				in.getPanelInterfaz().getTxtApellido().setText("");
				in.getPanelInterfaz().getTxtTelefono().setText("");
				in.getPanelInterfaz().getTxtCedula().setText("");
				in.getPanelInterfaz().getTxtCorreo().setText("");
				in.getPanelInterfaz().getTxtDireccion().setText("");
				in.getPanelInterfaz().getTxtSalario().setText("");
			}

			if (ingeniero.equalsIgnoreCase("Ingeniero Senior")) {

				sen.setAño((String) in.getPanelInterfaz().getAño().getSelectedItem());
				sen.setGenero((String) in.getPanelInterfaz().getGenero().getSelectedItem());
				sen.setNombre(in.getPanelInterfaz().getTxtNombre().getText());
				sen.setApellido(in.getPanelInterfaz().getTxtApellido().getText());
				sen.setTelefono(in.getPanelInterfaz().getTxtTelefono().getText());
				sen.setCedula(in.getPanelInterfaz().getTxtCedula().getText());
				sen.setCorreo(in.getPanelInterfaz().getTxtCorreo().getText());
				sen.setDireccion(in.getPanelInterfaz().getTxtDireccion().getText());
				sen.setVentas(Integer.parseInt(in.getPanelInterfaz().getTxtVenta().getText()));
				sen.calcularSalario();
				in.getPanelInterfaz().getTxtSalario().setText(String.valueOf(sen.calcularSalrioFinal()));
				in.mensaje(im.modificarEmpleadoSenior(sen.getCedula(), sen.getNombre(), sen.getApellido(),
						sen.getTelefono(), sen.getCorreo(), sen.getDireccion(), sen.getAño(), sen.getGenero(),
						sen.getVentas(), sen.getSalario()));

				in.getPanelInterfaz().getEmpleados().setSelectedIndex(0);
				in.getPanelInterfaz().getAño().setSelectedIndex(0);
				in.getPanelInterfaz().getGenero().setSelectedIndex(0);
				in.getPanelInterfaz().getTxtNombre().setText("");
				in.getPanelInterfaz().getTxtApellido().setText("");
				in.getPanelInterfaz().getTxtTelefono().setText("");
				in.getPanelInterfaz().getTxtCedula().setText("");
				in.getPanelInterfaz().getTxtCorreo().setText("");
				in.getPanelInterfaz().getTxtDireccion().setText("");
				in.getPanelInterfaz().getTxtSalario().setText("");
				in.getPanelInterfaz().getTxtVenta().setText("");
			}

			if (ingeniero.equalsIgnoreCase("Empleado por Comisión")) {
				com.setGenero((String) in.getPanelInterfaz().getGenero().getSelectedItem());
				com.setNombre(in.getPanelInterfaz().getTxtNombre().getText());
				com.setApellido(in.getPanelInterfaz().getTxtApellido().getText());
				com.setTelefono(in.getPanelInterfaz().getTxtTelefono().getText());
				com.setCedula(in.getPanelInterfaz().getTxtCedula().getText());
				com.setCorreo(in.getPanelInterfaz().getTxtCorreo().getText());
				com.setDireccion(in.getPanelInterfaz().getTxtDireccion().getText());
				com.setClientesCaptados(Integer.parseInt(in.getPanelInterfaz().getTxtCliente().getText()));
				com.setMonto(Integer.parseInt(in.getPanelInterfaz().getTxtMonto().getText()));
				in.getPanelInterfaz().getTxtSalario().setText(String.valueOf(com.calcularSalario()));
				in.mensaje(im.modificarEmpleadoComision(com.getCedula(), com.getNombre(), com.getApellido(),
						com.getTelefono(), com.getCorreo(), com.getDireccion(), com.getAño(), com.getGenero(),
						com.getClientesCaptados(), com.getMonto(), com.getSalario()));

				in.getPanelInterfaz().getEmpleados().setSelectedIndex(0);
				in.getPanelInterfaz().getGenero().setSelectedIndex(0);
				in.getPanelInterfaz().getTxtNombre().setText("");
				in.getPanelInterfaz().getTxtApellido().setText("");
				in.getPanelInterfaz().getTxtTelefono().setText("");
				in.getPanelInterfaz().getTxtCedula().setText("");
				in.getPanelInterfaz().getTxtCorreo().setText("");
				in.getPanelInterfaz().getTxtDireccion().setText("");
				in.getPanelInterfaz().getTxtCliente().setText("");
				in.getPanelInterfaz().getTxtMonto().setText("");
				in.getPanelInterfaz().getTxtSalario().setText("");

			}
			if (ingeniero.equalsIgnoreCase("")) {

				in.mensaje("debe escoger un tipo de empleado");
			}

		}

		if (evento.getActionCommand().equals(in.getPanelBotones().BUSCAR)) {
			in.getPanelResultados().getTxtResultado()
					.setText(im.buscarEmpleado(in.getPanelInterfaz().getTxtCedula().getText()));

		}

		if (evento.getActionCommand().equals(in.getPanelBotones().LEER)) {
			in.getPanelResultados().getTxtResultado().setText(
					im.leerEmpleadoJunior() + "\n" + im.leerEmpleadoSenior() + "\n" + im.leerEmpleadoComision());
		}

	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {

		String ingeniero = (String) in.getPanelInterfaz().getEmpleados().getSelectedItem();

		if (ingeniero.equalsIgnoreCase("Ingeniero junior")) {

			in.getPanelInterfaz().getTxtCliente().setEditable(false);
			in.getPanelInterfaz().getTxtMonto().setEditable(false);
			in.getPanelInterfaz().getTxtVenta().setEditable(false);
			in.getPanelInterfaz().getNivel().setEnabled(true);
			in.getPanelInterfaz().getAño().setEnabled(true);
		}

		if (ingeniero.equalsIgnoreCase("Ingeniero Senior")) {
			in.getPanelInterfaz().getNivel().setEnabled(false);
			in.getPanelInterfaz().getTxtMonto().setEditable(false);
			in.getPanelInterfaz().getTxtCliente().setEditable(false);
			in.getPanelInterfaz().getTxtVenta().setEditable(true);
			in.getPanelInterfaz().getAño().setEnabled(true);

		}

		if (ingeniero.equalsIgnoreCase("Empleado por Comisión")) {
			in.getPanelInterfaz().getNivel().setEnabled(false);
			in.getPanelInterfaz().getAño().setEnabled(false);
			in.getPanelInterfaz().getTxtVenta().setEditable(false);
			in.getPanelInterfaz().getTxtMonto().setEditable(true);
			in.getPanelInterfaz().getTxtCliente().setEditable(true);

		}

		if (ingeniero.equalsIgnoreCase("")) {
			in.getPanelInterfaz().getTxtCliente().setEditable(true);
			in.getPanelInterfaz().getTxtMonto().setEditable(true);
			in.getPanelInterfaz().getTxtVenta().setEditable(true);
			in.getPanelInterfaz().getNivel().setEnabled(true);
			in.getPanelInterfaz().getAño().setEnabled(true);

		}

	}

}
