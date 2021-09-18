package modelo;

public class IngenieroJunior extends SalarioFijo {

	private String nivel;
	private double salario2;
	private double salario3;
	private double salario4;
	private double salario5;


	public IngenieroJunior(String cedula, String nombre, String apellido, String telefono, String correo, String direccion,
			String año, String genero, String nivel, double salario) {
		super(cedula , nombre , apellido,  telefono,  correo,  direccion, año, genero);
		// TODO Auto-generated constructor stub

		this.nivel = nivel;
		this.salario = salario;
		salario2 = 0;
		salario3 = 0;
		salario4 = 0;
		salario5 = 0;

	}

	
	

	@Override
	public double calcularSalario() {
		if (nivel.equalsIgnoreCase("Nivel 1")) {
			salario2 = salario1;
			salario3 = salario2;

		}

		if (nivel.equalsIgnoreCase("Nivel 2") || nivel.equalsIgnoreCase("Nivel 3")) {
			salario2 = (salario1 / 100) * 5;
			salario3 = salario2;
		}

		if (nivel.equalsIgnoreCase("Nivel 4") || nivel.equalsIgnoreCase("Nivel 5")) {
			salario2 = (salario1 / 100) * 8;
			salario3 = salario2;
		}

		return salario3;
	}

	@Override
	public double calcularSalrioFinal() {
		if (año.equalsIgnoreCase("Menos de dos años")) {
			salario4 = salario1;
			salario5 = salario1;

			if (año.equalsIgnoreCase("De 2 a 3 años")) {
				salario4 = (salario1 / 100) * 5;
				salario5 = salario4;

				if (año.equalsIgnoreCase("De 4 a 7 años")) {
					salario4 = (salario1 / 100) * 10;
					salario5 = salario4;

					if (año.equalsIgnoreCase("De 8 a 15 años")) {
						salario4 = (salario1 / 100) * 15;
						salario5 = salario4;

						if (año.equalsIgnoreCase("Mas de 15 años")) {
							salario4 = (salario1 / 100) * 20;
							salario5 = salario4;
						}
					}
				}
			}
		}

		if (salario3 == salario1 & salario5 == salario1) {
			salario = salario1;
		} else {
			salario = salario3 + salario5 + salario1;
		}

		return salario;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getSalario2() {
		return salario2;
	}

	public void setSalario2(double salario2) {
		this.salario2 = salario2;
	}

	public double getSalario3() {
		return salario3;
	}

	public void setSalario3(double salario3) {
		this.salario3 = salario3;
	}

	public double getSalario4() {
		return salario4;
	}

	public void setSalario4(double salario4) {
		this.salario4 = salario4;
	}

	public double getSalario5() {
		return salario5;
	}

	public void setSalario5(double salario5) {
		this.salario5 = salario5;
	}

}
