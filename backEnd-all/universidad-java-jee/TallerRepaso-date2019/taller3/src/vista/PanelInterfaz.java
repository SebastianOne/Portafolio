package vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelInterfaz extends JPanel 
{

	private static final long serialVersionUID = 1L;
	private JLabel labEmpleado;
	private JLabel labNivel;
	private JLabel labAños;	
	private JLabel labGenero;
	private JLabel labVenta;	
	private JLabel labNombre;
	private JLabel labApellido;
	private JLabel labTelefono;
	private JLabel labCedula;
	private JLabel labCorreo;
	private JLabel labDireccion;
	private JLabel labCliente;
	private JLabel labMonto;
	private JLabel labSalario;
	private JTextField txtVenta;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtCedula;
	private JTextField txtCorreo;
	private JTextField txtDireccion;
	private JTextField txtCliente;
	private JTextField txtMonto;
	private JTextField txtSalario;
	private JComboBox<String> empleados;
	private JComboBox<String> nivel;
	private JComboBox<String> año;
	private JComboBox<String> genero;
	
	
	public PanelInterfaz() 
	{
		
		setLayout(new GridLayout(14,2));
		setSize(350,700);
		TitledBorder border = BorderFactory.createTitledBorder("AGREGAR  EMPLEADOS");
		border.setTitleColor(Color.black);
		setBorder(border);
		
		empleados = new JComboBox<String>();
		empleados.addItem("");
		empleados.addItem("Ingeniero Junior");
		empleados.addItem("Ingeniero Senior");
		empleados.addItem("Empleado por Comisión");
		labEmpleado = new JLabel("tipo de empleado que desea ingresar" );
		
		nivel = new JComboBox<String>();
		nivel.addItem("");
		nivel.addItem("Nivel 1");
		nivel.addItem("Nivel 2");
		nivel.addItem("Nivel 3");
		nivel.addItem("Nivel 4");
		nivel.addItem("Nivel 5");
		labNivel = new JLabel("Que nivel tiene el ingeniero junior" );
		
		año = new JComboBox<String>();
		año.addItem("");
		año.addItem("Menos de dos años");
		año.addItem("De 2 a 3 años");
		año.addItem("De 4 a 7 años");
		año.addItem("De 8 a 15 años");
		año.addItem("Mas de 15 años");
		labAños = new JLabel("Cuanto timpo llevan laborando en la empresa" );
		
		genero = new JComboBox<String>();
		genero.addItem("");
		genero.addItem("Masculino");
		genero.addItem("Femenino");
		labGenero = new JLabel("Genero del empleado" );
		
		labVenta = new JLabel("Ventas realizadas");
		txtVenta = new JTextField("");
		txtVenta .setForeground(Color.black);
		txtVenta .setBackground(Color.white);
		
		
		labNombre = new JLabel("Nombres");
		txtNombre = new JTextField("");
		txtNombre.setForeground(Color.black);
		txtNombre.setBackground(Color.white);
		
		labApellido = new JLabel("Apellidos");
		txtApellido = new JTextField("");
		txtApellido.setForeground(Color.black);
		txtApellido.setBackground(Color.white);
		
		labTelefono = new JLabel("Telefono");
		txtTelefono = new JTextField("");
		txtTelefono.setForeground(Color.black);
		txtTelefono.setBackground(Color.white);
		
		labCedula = new JLabel("Cedula");
		txtCedula = new JTextField("");
		txtCedula.setForeground(Color.black);
		txtCedula.setBackground(Color.white);
		
		labCorreo = new JLabel("Correo");
		txtCorreo = new JTextField("");
		txtCorreo.setForeground(Color.black);
		txtCorreo.setBackground(Color.white);
		
		labDireccion = new JLabel("Dirreccion");
		txtDireccion = new JTextField("");
		txtDireccion.setForeground(Color.black);
		txtDireccion.setBackground(Color.white);
		
		
		labCliente = new JLabel("Numero de clientes captados");
		txtCliente = new JTextField("");
		txtCliente.setForeground(Color.black);
		txtCliente.setBackground(Color.white);
		
		labMonto = new JLabel("Monto por cliente");
		txtMonto = new JTextField("");
		txtMonto.setForeground(Color.black);
		txtMonto.setBackground(Color.white);
		
		labSalario = new JLabel("Salario");
		txtSalario = new JTextField("");
		txtSalario.setForeground(Color.black);
		txtSalario.setBackground(Color.white);
	
		
		add(labEmpleado);
		add(empleados);
		add(labNivel);
		add(nivel);
		add(labAños);
		add(año);
		add(labGenero);
		add(genero);
		add(labNombre);
		add(txtNombre);
		add(labApellido);
		add(txtApellido);
		add(labTelefono);
		add(txtTelefono);
		add(labCedula);
		add(txtCedula);
		add(labCorreo);
		add(txtCorreo);
		add(labDireccion);
		add(txtDireccion);
		add(labVenta);
		add(txtVenta);
		add(labCliente);
		add(txtCliente);
		add(labMonto);
		add(txtMonto);
		add(labSalario);
		add(txtSalario);
		
		
	
	}


	public JLabel getLabEmpleado() {
		return labEmpleado;
	}


	public void setLabEmpleado(JLabel labEmpleado) {
		this.labEmpleado = labEmpleado;
	}


	public JLabel getLabNivel() {
		return labNivel;
	}


	public void setLabNivel(JLabel labNivel) {
		this.labNivel = labNivel;
	}


	public JLabel getLabAños() {
		return labAños;
	}


	public void setLabAños(JLabel labAños) {
		this.labAños = labAños;
	}


	public JLabel getLabVenta() {
		return labVenta;
	}


	public void setLabVenta(JLabel labVenta) {
		this.labVenta = labVenta;
	}


	public JLabel getLabNombre() {
		return labNombre;
	}


	public void setLabNombre(JLabel labNombre) {
		this.labNombre = labNombre;
	}


	public JLabel getLabApellido() {
		return labApellido;
	}


	public void setLabApellido(JLabel labApellido) {
		this.labApellido = labApellido;
	}


	public JLabel getLabTelefono() {
		return labTelefono;
	}


	public void setLabTelefono(JLabel labTelefono) {
		this.labTelefono = labTelefono;
	}


	public JLabel getLabCedula() {
		return labCedula;
	}


	public void setLabCedula(JLabel labCedula) {
		this.labCedula = labCedula;
	}


	public JLabel getLabCorreo() {
		return labCorreo;
	}


	public void setLabCorreo(JLabel labCorreo) {
		this.labCorreo = labCorreo;
	}


	public JLabel getLabDireccion() {
		return labDireccion;
	}


	public void setLabDireccion(JLabel labDireccion) {
		this.labDireccion = labDireccion;
	}


	public JLabel getLabCliente() {
		return labCliente;
	}


	public void setLabCliente(JLabel labCliente) {
		this.labCliente = labCliente;
	}


	public JLabel getLabMonto() {
		return labMonto;
	}


	public void setLabMonto(JLabel labMonto) {
		this.labMonto = labMonto;
	}



	public JTextField getTxtVenta() {
		return txtVenta;
	}


	public void setTxtVenta(JTextField txtVenta) {
		this.txtVenta = txtVenta;
	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}


	public JTextField getTxtApellido() {
		return txtApellido;
	}


	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}


	public JTextField getTxtTelefono() {
		return txtTelefono;
	}


	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}


	public JTextField getTxtCedula() {
		return txtCedula;
	}


	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
	}


	public JTextField getTxtCorreo() {
		return txtCorreo;
	}


	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}


	public JTextField getTxtDireccion() {
		return txtDireccion;
	}


	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}


	public JTextField getTxtCliente() {
		return txtCliente;
	}


	public void setTxtCliente(JTextField txtCliente) {
		this.txtCliente = txtCliente;
	}


	public JTextField getTxtMonto() {
		return txtMonto;
	}


	public void setTxtMonto(JTextField txtMonto) {
		this.txtMonto = txtMonto;
	}


    

	public JLabel getLabGenero() {
		return labGenero;
	}


	public void setLabGenero(JLabel labGenero) {
		this.labGenero = labGenero;
	}


	public JLabel getLabSalario() {
		return labSalario;
	}


	public void setLabSalario(JLabel labSalario) {
		this.labSalario = labSalario;
	}


	public JTextField getTxtSalario() {
		return txtSalario;
	}


	public void setTxtSalario(JTextField txtSalario) {
		this.txtSalario = txtSalario;
	}


	public JComboBox<String> getGenero() {
		return genero;
	}


	public void setGenero(JComboBox<String> genero) {
		this.genero = genero;
	}


	public JComboBox<String> getEmpleados() {
		return empleados;
	}


	public void setEmpleados(JComboBox<String> empleados) {
		this.empleados = empleados;
	}


	public JComboBox<String> getNivel() {
		return nivel;
	}


	public void setNivel(JComboBox<String> nivel) {
		this.nivel = nivel;
	}


	public JComboBox<String> getAño() {
		return año;
	}


	public void setAño(JComboBox<String> año) {
		this.año = año;
	}




}
