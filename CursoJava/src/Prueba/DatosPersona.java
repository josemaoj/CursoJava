package Prueba;

import java.util.Scanner;

public class DatosPersona {
	int numeroIdentificacion;
	String nombre;
	/**
	 * Constructor de la clase
	 */
	public DatosPersona() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite su numero de Identificacion:");
		this.numeroIdentificacion=teclado.nextInt();
		System.out.println("Digite su nombre: ");
		this.nombre=teclado.next();
	}
	
	
}
