package Collecciones;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import Persona.DatosPersona;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> cola1 = new LinkedList<String>();
		System.out.println("Insertamos tres elementos en la cola: juan, ana y luis");
        cola1.add("juan");
        cola1.add("ana");
        cola1.add("luis");
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Extraemos un elemento de la cola:" + cola1.poll());
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Consultamos el primer elemento de la cola sin extraerlo:" + cola1.peek());
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Extraemos uno a un cada elemento de la cola mientras no este vacía:");
        while (!cola1.isEmpty())
            System.out.print(cola1.poll() + "-");
        System.out.println();
        System.out.println("Cola 2");
        Queue<Integer> cola2 = new LinkedList<Integer>();
        cola2.add(70);
        cola2.add(120);
        cola2.add(6);
        System.out.println("Imprimimos la cola de enteros");
        for (Integer elemento : cola2)
            System.out.print(elemento + "-");
        System.out.println();
        System.out.println("Borramos toda la cola");
        cola2.clear();
        System.out.println("Cantidad de elementos en la cola de enteros:" + cola2.size());
        Queue<DatosPersona> cola3 = new LinkedList<DatosPersona>();
        DatosPersona dp = new DatosPersona();
        dp.setNumeroIdentificacion(123);
        dp.setNombre("Juan Perez");
        cola3.add(dp);
        System.out.println("Cantidad de elementos en la pila:" + cola3.size());
        System.out.println("Consultamos el primer elemento de la pila sin extraerlo:");
        cola3.peek().imprimirDatos();
        System.out.println("Cantidad de elementos en la pila:" + cola3.size());
		PriorityQueue<Integer> cola4 = new PriorityQueue<Integer>();
        cola4.add(70);
        cola4.add(120);
        cola4.add(6);
        System.out.println("Imprimimos la cola con prioridades de enteros");
        while (!cola4.isEmpty())
            System.out.print(cola4.poll() + "-");
        System.out.println();
		PriorityQueue<String> cola5 = new PriorityQueue<String>();
        cola5.add("Juan");
        cola5.add("Ana");
        cola5.add("Luis");
        System.out.println("Imprimimos la cola con prioridades de String");
        while (!cola5.isEmpty())
            System.out.print(cola5.poll() + "-");
        /*
        PriorityQueue<DatosPersona> cola3 = new PriorityQueue<DatosPersona>();
        DatosPersona dp = new DatosPersona();
        dp.setNumeroIdentificacion(456);
        dp.setNombre("Juan Perez");
        cola3.add(dp);
        dp.setNumeroIdentificacion(123);
        dp.setNombre("Lina Lopez");
        cola3.add(dp);
        System.out.println("Imprimimos la cola con prioridades de objeto");
        while (!cola3.isEmpty())
            cola3.poll().imprimirDatos();
        */
        
	}
}
