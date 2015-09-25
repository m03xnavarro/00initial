import java.util.ArrayList;
import java.util.LinkedList;

public class Programa {

	public static void main(String[] args) {
		ArrayList<Persona> llistaArray = new ArrayList<Persona>();
		LinkedList<Persona> llistaLinked = new LinkedList<Persona>();
		long abans = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			llistaArray.add(new Persona(i, "Persona" + i, i));
		}
		System.out.println("Temps inserció ArrayList: ");
		System.out.println(System.nanoTime() - abans);

		System.out.println("Inserció persona 10001: ");
		abans = System.nanoTime();
		llistaArray.add(new Persona(10001, "Persona" + 10001, 10001));
		System.out.println(System.nanoTime() - abans);

		abans = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			llistaLinked.offer(new Persona(i, "Persona" + i, i));
		}
		System.out.println("Temps inserció LinkedList: ");
		System.out.println(System.nanoTime() - abans);

		System.out.println("Inserció persona 10001: ");
		abans = System.nanoTime();
		llistaLinked.offer(new Persona(10001, "Persona" + 10001, 10001));
		System.out.println(System.nanoTime() - abans);

	}

}
