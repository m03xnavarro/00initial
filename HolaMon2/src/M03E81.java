import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03E81 {

	public static void main(String[] args) {
		// 1
		List<Integer> fibonacci = new ArrayList<Integer>(25);
		// 2a
		fibonacci.add(0, 0);
		// 2b
		fibonacci.add(1, 1);
		// 2c
		for (int i = 2; i < 25; i++) {
			fibonacci.add(i, fibonacci.get(i - 2) + fibonacci.get(i - 1));
		}

		// 3.a
		System.out
				.println("Successió de Fibonacci mostrada amb bucle -normal-");
		for (int i = 2; i < 25; i++) {
			System.out
					.println("Posició " + i + " element: " + fibonacci.get(i));
		}

		// 3.b
		System.out
				.println("Successió de Fibonacci mostrada amb bucle -for/each-");
		for (Object o : fibonacci)
			System.out.println("Element: " + o);

		// 3.c

		System.out.println("Successió de Fibonacci mostrada amb iterador");
		Iterator<Integer> it = fibonacci.iterator();
		while (it.hasNext()) {
			System.out.println("Iterador: " + it.next());
		}

		// 4
		System.out.println("Posició del 2584: " + fibonacci.lastIndexOf(2584));

		// 5
		System.out.println("Hi és el 4311? "
				+ String.valueOf(fibonacci.contains(4311)));

	}

}
