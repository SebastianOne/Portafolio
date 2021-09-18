
package modelo;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Implementacion {

	private ArrayList<IngenieroJunior> jun;
	private ArrayList<IngenieroSenior> sen;
	private ArrayList<Comision> com;
	private String respuesta;
	private String respuesta2;
	private String respuesta3;
	private String respuesta4;

	private int contadorJun;
	private int contadorSen;
	private int contadorCom;

	public static final Pattern validacion1 = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public Implementacion() {

		jun = new ArrayList<>();
		sen = new ArrayList<>();
		com = new ArrayList<>();

		contadorJun = 0;
		contadorSen = 0;
		contadorCom = 0;

		respuesta = "";
		respuesta2 = "";
		respuesta3 = "";
		respuesta4 = "";

	}

	public static boolean validate(String email) {
		Matcher matcher = validacion1.matcher(email);
		return matcher.find();
	}

	public String crearEmpleadoJuior(String cedula, String nombre, String apellido, String telefono, String correo,
			String direccion, String año, String genero, String nivel, double salario) {

		int contador = 0;

		for (int i = 0; i < jun.size(); i++) {
			if (jun.get(i).cedula.equalsIgnoreCase(cedula)) {
				contador++;

			}

		}

		if (contador >= 1) {
			respuesta = "El empleado ya existe";

		}

		else {
			if (validate(correo) == true) {
				jun.add(new IngenieroJunior(cedula, nombre, apellido, telefono, correo, direccion, año, genero, nivel,
						salario));
				contadorJun++;
				respuesta = "Empleado agregado exitosamente";
			}

			else {
				respuesta = "direccion de correo no valida";
			}
		}

		return respuesta;

	}

	public String crearEmpleadoSenior(String cedula, String nombre, String apellido, String telefono, String correo,
			String direccion, String año, String genero, int ventas, double salario) {

		int contador = 0;

		for (int i = 0; i < sen.size(); i++) {
			if (sen.get(i).cedula.equalsIgnoreCase(cedula)) {
				contador++;

			}

		}

		if (contador >= 1) {
			respuesta = "El empleado ya existe";

		}

		else {
			if (validate(correo) == true) {
				sen.add(new IngenieroSenior(cedula, nombre, apellido, telefono, correo, direccion, año, genero, ventas,
						salario));
				contadorSen++;
				respuesta = "Empleado agregado exitosamente";
			}

			else {
				respuesta = "direccion de correo no valida";
			}

		}

		return respuesta;

	}

	public String crearEmpleadoComision(String cedula, String nombre, String apellido, String telefono, String correo,
			String direccion, String año, String genero, int clientesCaptados, double monto, double salario) {

		int contador = 0;

		for (int i = 0; i < com.size(); i++) {
			if (com.get(i).cedula.equalsIgnoreCase(cedula)) {
				contador++;

			}

		}

		if (contador >= 1) {
			respuesta = "El empleado ya existe";

		}

		else {

			if (validate(correo) == true) {
				com.add(new Comision(cedula, nombre, apellido, telefono, correo, direccion, año, genero,
						clientesCaptados, monto, salario));
				contadorCom++;
				respuesta = "Empleado agregado exitosamente";
			}

			else {
				respuesta = "direccion de correo no valida";
			}

		}

		return respuesta;

	}

	public String leerEmpleadoJunior() {
		String empleados = "";

		for (int i = 0; i < jun.size(); i++) {
			empleados += "tipo de empleado :" + "Ingeniero Junior " + "\n" + "nombre : " + jun.get(i).getNombre() + "\n"
					+ "apellido :" + jun.get(i).getApellido() + "\n" + "cedula :" + jun.get(i).getCedula() + "\n"
					+ "telefono: " + jun.get(i).getTelefono() + "\n" + "correo: " + jun.get(i).getCorreo() + "\n"
					+ "direccion: " + jun.get(i).getDireccion() + "\n" + "año : " + jun.get(i).getAño() + "\n"
					+ "genero: " + jun.get(i).getGenero() + "\n" + " nivel: " + jun.get(i).getNivel() + "\n"
					+ "salario : " + jun.get(i).getSalario() + "\n\n";

		}

		return empleados;

	}

	public String leerEmpleadoSenior() {
		String empleados = "";

		for (int i = 0; i < sen.size(); i++) {
			empleados += "tipo de empleado :" + "Ingeniero Senior " + "\n" + "nombre : " + sen.get(i).getNombre() + "\n"
					+ "apellido :" + sen.get(i).getApellido() + "\n" + "cedula :" + sen.get(i).getCedula() + "\n"
					+ "telefono : " + sen.get(i).getTelefono() + "\n" + "correo : " + sen.get(i).getCorreo() + "\n"
					+ "direccion : " + sen.get(i).getDireccion() + "\n" + "año : " + sen.get(i).getAño() + "\n"
					+ "genero: " + sen.get(i).getGenero() + "\n" + " ventas : " + sen.get(i).getVentas() + "\n"
					+ "salario : " + sen.get(i).getSalario() + "\n\n";

		}

		return empleados;

	}

	public String leerEmpleadoComision() {
		String empleados = "";

		for (int i = 0; i < com.size(); i++) {
			empleados += "tipo de empleado :" + "Empleado por Comision " + "\n" + "nombre : " + com.get(i).getNombre()
					+ "\n" + "apellido :" + com.get(i).getApellido() + "\n" + "cedula :" + com.get(i).getCedula() + "\n"
					+ "telefono: " + com.get(i).getTelefono() + "\n" + "correo: " + com.get(i).getCorreo() + "\n"
					+ "direccion: " + com.get(i).getDireccion() + "\n" + "año : " + com.get(i).getAño() + "\n"
					+ "genero: " + com.get(i).getGenero() + "\n" + "clientes captados : "
					+ com.get(i).getClientesCaptados() + "\n" + "monto : " + com.get(i).getMonto() + "\n" + "salario : "
					+ com.get(i).getSalario() + "\n\n";

		}

		return empleados;

	}

	public String eliminarEmpleado(String cedula) {
		respuesta = "empleado no existe";
		respuesta2 = "empleado no existe";
		respuesta3 = "empleado no existe";

		for (int i = 0; i < jun.size(); i++) {
			if (jun.get(i).cedula.equalsIgnoreCase(cedula)) {
				jun.remove(i);
				respuesta = "empleado eliminado";
				break;
			}

		}

		for (int i = 0; i < sen.size(); i++) {
			if (sen.get(i).cedula.equalsIgnoreCase(cedula)) {
				sen.remove(i);
				respuesta2 = "empleado eliminado";
				break;
			}

		}

		for (int i = 0; i < com.size(); i++) {
			if (com.get(i).cedula.equalsIgnoreCase(cedula)) {
				com.remove(i);
				respuesta3 = "empleado eliminado";
				break;
			}

		}

		if (respuesta.equalsIgnoreCase("empleado no existe") & respuesta2.equalsIgnoreCase("empleado no existe")
				& respuesta3.equalsIgnoreCase("empleado no existe")) {
			respuesta4 = "el empleado no existe";
		}

		else {
			respuesta4 = "el empleado fue eliminado";
		}

		return respuesta4;
	}

	public String modificarEmpleadoJuior(String cedula, String nombre, String apellido, String telefono, String correo,
			String direccion, String año, String genero, String nivel, double salario) {

		int contador = 0;

		
		for (int i = 0; i < jun.size(); i++) 
		{

			if (jun.get(i).cedula.equalsIgnoreCase(cedula)) {
				jun.set(i, new IngenieroJunior(cedula, nombre, apellido, telefono, correo, direccion, año, genero,
						nivel, salario));
				contador++;
				respuesta = "empleado modificado";
				break;

			}

		}

	
			if (contador == 0) {
				respuesta = "El empleado no existe";

			}
		

		return respuesta;

	}

	public String modificarEmpleadoSenior(String cedula, String nombre, String apellido, String telefono, String correo,
			String direccion, String año, String genero, int ventas, double salario) {

		int contador = 0;

		
		for (int i = 0; i < sen.size(); i++) {
			if (sen.get(i).cedula.equalsIgnoreCase(cedula)) {
				sen.set(i, new IngenieroSenior(cedula, nombre, apellido, telefono, correo, direccion, año, genero,
						ventas, salario));
				contador++;
				respuesta = "empleado modificado";
				break;

			}

		}

		
			if (contador == 0) {
				respuesta = "El empleado no existe";

			}
		

		return respuesta;

	}

	public String modificarEmpleadoComision(String cedula, String nombre, String apellido, String telefono,
			String correo, String direccion, String año, String genero, int clientesCaptados, double monto,
			double salario) {
		int contador = 0;

		

		for (int i = 0; i < com.size(); i++) {
			if (com.get(i).cedula.equalsIgnoreCase(cedula))
					 {
				com.set(i, new Comision(cedula, nombre, apellido, telefono, correo, direccion, año, genero,
						clientesCaptados, monto, salario));
				contador++;
				respuesta = "empleado modificado";
				break;

			}

		}

		
			if (contador == 0) {
				respuesta = "El empleado no existe";

			}
		

		return respuesta;

	}

	public String buscarEmpleado(String cedula) {
		String empleados = "";

		for (int i = 0; i < jun.size(); i++) {
			if (jun.get(i).getCedula().equalsIgnoreCase(cedula)) {
				empleados = "tipo de empleado :" + "Ingeniero Junior " + "\n" + "nombre : " + jun.get(i).getNombre()
						+ "\n" + "apellido :" + jun.get(i).getApellido() + "\n" + "cedula :" + jun.get(i).getCedula()
						+ "\n" + "telefono: " + jun.get(i).getTelefono() + "\n" + "correo: " + jun.get(i).getCorreo()
						+ "\n" + "direccion: " + jun.get(i).getDireccion() + "\n" + "año : " + jun.get(i).getAño()
						+ "\n" + "genero: " + jun.get(i).getGenero() + "\n" + " nivel: " + jun.get(i).getNivel() + "\n"
						+ "salario : " + jun.get(i).getSalario() + "\n\n";
			}

		}

		for (int i = 0; i < sen.size(); i++) {
			if (sen.get(i).getCedula().equalsIgnoreCase(cedula)) {
				empleados = "tipo de empleado :" + "Ingeniero Senior " + "\n" + "nombre : " + sen.get(i).getNombre()
						+ "\n" + "apellido :" + sen.get(i).getApellido() + "\n" + "cedula :" + sen.get(i).getCedula()
						+ "\n" + "telefono : " + sen.get(i).getTelefono() + "\n" + "correo : " + sen.get(i).getCorreo()
						+ "\n" + "direccion : " + sen.get(i).getDireccion() + "\n" + "año : " + sen.get(i).getAño()
						+ "\n" + "genero: " + sen.get(i).getGenero() + "\n" + " ventas : " + sen.get(i).getVentas()
						+ "\n" + "salario : " + sen.get(i).getSalario() + "\n\n";
			}
		}

		for (int i = 0; i < com.size(); i++) {
			if (com.get(i).getCedula().equalsIgnoreCase(cedula)) {
				empleados = "tipo de empleado :" + "Empleado por Comision " + "\n" + "nombre : "
						+ com.get(i).getNombre() + "\n" + "apellido :" + com.get(i).getApellido() + "\n" + "cedula :"
						+ com.get(i).getCedula() + "\n" + "telefono: " + com.get(i).getTelefono() + "\n" + "correo: "
						+ com.get(i).getCorreo() + "\n" + "direccion: " + com.get(i).getDireccion() + "\n" + "año : "
						+ com.get(i).getAño() + "\n" + "genero: " + com.get(i).getGenero() + "\n"
						+ "clientes captados : " + com.get(i).getClientesCaptados() + "\n" + "monto : "
						+ com.get(i).getMonto() + "\n" + "salario : " + com.get(i).getSalario() + "\n\n";
			}
		}

		if (empleados.equalsIgnoreCase("")) {
			empleados = "no existe el empleado con esa cedula";
		}

		return empleados;
	}

	public int getContadorJun() {
		return contadorJun;
	}

	public void setContadorJun(int contadorJun) {
		this.contadorJun = contadorJun;
	}

	public int getContadorSen() {
		return contadorSen;
	}

	public void setContadorSen(int contadorSen) {
		this.contadorSen = contadorSen;
	}

	public int getContadorCom() {
		return contadorCom;
	}

	public void setContadorCom(int contadorCom) {
		this.contadorCom = contadorCom;
	}

}
