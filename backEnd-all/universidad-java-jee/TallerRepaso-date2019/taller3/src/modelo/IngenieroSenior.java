package modelo;

public class IngenieroSenior extends SalarioFijo

{
	private int ventas ;
	private double salario2;
	private double salario3;
	private double salario4;
	private double salario5;
	

	public IngenieroSenior(String cedula, String nombre, String apellido, String telefono, String correo, String direccion,
			String año, String genero, int ventas, double salario)
	{
		super( cedula , nombre , apellido,  telefono,  correo,  direccion, año, genero);
		
		 this.ventas = ventas;
		 this.salario = salario;
	     salario2 = 0;
	     salario3 = 0;
	     salario4 = 0;
	     salario5 = 0;
	     
		// TODO Auto-generated constructor stub
	}

	

	
	@Override
	public double calcularSalario()
	{
		 if(ventas == 1 || ventas == 5  ) 
		 {
			 salario2 = (salario1/100)*10;
			 salario3 = salario2;
		 }
			 if(ventas ==6 || ventas ==  10 ) 
			 {
				 salario2 = (salario1/100)*15;
				 salario3 = salario2;
				 
				 if(ventas == 11 || ventas == 20  ) 
				 {
					 salario2 = (salario1/100)*20;
					 salario3 = salario2;
	    	   
				 }
					 if(ventas >= 21  ) 
					 {
						 salario2 = (salario1/100)*30;
						 salario3 = salario2;
	    	          }
	    	      }
	      
		 
		return salario3;
	}

	@Override
	public double calcularSalrioFinal() 
	{
		if(año.equalsIgnoreCase("Menos de dos años")) 
		 {
			 salario4 = salario1;
			 salario5 = salario1;
		 }
	     if(año.equalsIgnoreCase("De 2 a 3 años")) 
	        {
	    		salario4 = (salario1/100)*5;
	    		salario5 = salario4;
	        }
	    	if(año.equalsIgnoreCase("De 4 a 7 años")  )
	    	   {
	    		salario4 = (salario1/100)*10;
	    		salario5 = salario4;
	    	   
	    	   }
	    	  if(año.equalsIgnoreCase("De 8 a 15 años")) 
	    	  {
	    		  salario4 = (salario1/100)*15;
		    		salario5 = salario4;
	    	  }
	    		  
	    	  if(año.equalsIgnoreCase("Mas de 15 años")) 
	    		  {
	    			  salario4 = (salario1/100)*20;
	  	    		salario5 = salario4;
	    		  }
	    	     
	    	  
	       
		 
		
		  if(salario5 == salario1) 
		   {
			salario = salario5 + salario3;
		   }
		else 
		{
			salario = salario5+ salario3 + salario1;
		}
		
		
		return salario;
	}


	public int getVentas() {
		return ventas;
	}


	public void setVentas(int ventas) {
		this.ventas = ventas;
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
