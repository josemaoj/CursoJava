package Persona;

public class DatosPersona {
	int numeroIdentificacion;
	String nombre;
	
	/**
	 * Constructor de la clase
	 */
	public DatosPersona() {
		super();
	}

	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void imprimirDatos() {
		System.out.println("Numero de Identificación: "+getNumeroIdentificacion());
		System.out.println("Nombre Completo: "+getNombre());
	}
	
}
