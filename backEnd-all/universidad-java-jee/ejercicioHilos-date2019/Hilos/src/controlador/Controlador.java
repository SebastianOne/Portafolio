package controlador;

import java.util.Random;

import modelo.Cajero;
import modelo.Cliente;

public class Controlador 
{
	private Cliente cli;
	private Cliente cli2;
	private Cajero ca;
	private Cajero ca2;
	private Random aleatorio;
	private long initialTime = 0;
	

	public Controlador() 
	{
		
		long initialTime = 0;
		aleatorio = new Random();

		int num = aleatorio.nextInt(10);
		int num1 = aleatorio.nextInt(10);
		int num2 = aleatorio.nextInt(10);
		int num3 = aleatorio.nextInt(10);
		int num4 = aleatorio.nextInt(10);
		int num5 = aleatorio.nextInt(10);
		int num6 = aleatorio.nextInt(10);
		int num7 = aleatorio.nextInt(10);
		int num8 = aleatorio.nextInt(10);
		int num9 = aleatorio.nextInt(10);

		int time = aleatorio.nextInt(10);
		int time1 = aleatorio.nextInt(10);
		int time2 = aleatorio.nextInt(10);
		int time3 = aleatorio.nextInt(10);
		int time4 = aleatorio.nextInt(10);
		int time5 = aleatorio.nextInt(10);
		int time6 = aleatorio.nextInt(10);
		int time7 = aleatorio.nextInt(10);
		int time8 = aleatorio.nextInt(10);
		int time9 = aleatorio.nextInt(10);

		cli = new Cliente("cliente 1", new int[] { num, num1, num2, num3, num4, num5, num6, num7, num8, num9 });
		cli2 = new Cliente("cliente 2",new int[] { time, time1, time2, time3, time4, time5, time6, time7, time8, time9 });

		Thread t = new Thread(ca = new Cajero("cajero 1", cli, initialTime));
		Thread t2 = new Thread(ca2 = new Cajero("cajero 2", cli2, initialTime));

		t.start();
		t2.start();

	}

}
