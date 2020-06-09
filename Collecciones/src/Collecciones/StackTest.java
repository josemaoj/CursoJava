package Collecciones;

import java.util.Stack;
import Persona.DatosPersona;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> pila1 = new Stack<String>();
		System.out.println("Insertamos tres elementos en la pila: juan, ana y luis");
        pila1.push("juan");
        pila1.push("ana");
        pila1.push("luis");
        System.out.println("Cantidad de elementos en la pila:" + pila1.size());
        System.out.println("Extraemos un elemento de la pila:" + pila1.pop());
        System.out.println("Cantidad de elementos en la pila:" + pila1.size());
        System.out.println("Consultamos el primer elemento de la pila sin extraerlo:" + pila1.peek());
        System.out.println("Cantidad de elementos en la pila:" + pila1.size());
        System.out.println("Extraemos uno a un cada elemento de la pila mientras no este vacía:");
        while (!pila1.isEmpty())
            System.out.print(pila1.pop() + "-");
        System.out.println();
        System.out.println("Pila 2");
        Stack<Integer> pila2 = new Stack<Integer>();
        pila2.push(70);
        pila2.push(120);
        pila2.push(6);
        System.out.println("Borramos toda la pila");
        pila2.clear();
        System.out.println("Cantidad de elementos en la pila de enteros:" + pila2.size());
        Stack<DatosPersona> pila3 = new Stack<DatosPersona>();
        DatosPersona dp = new DatosPersona();
        dp.setNumeroIdentificacion(123);
        dp.setNombre("Juan Perez");
        pila3.push(dp);
        System.out.println("Cantidad de elementos en la pila:" + pila3.size());
        System.out.println("Consultamos el primer elemento de la pila sin extraerlo:");
        pila3.peek().imprimirDatos();
        System.out.println("Cantidad de elementos en la pila:" + pila1.size());
	}

}
