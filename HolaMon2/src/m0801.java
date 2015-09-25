import java.util.Scanner;


public class m0801 {

	public static void main(String[] args) {
//		Cotxe myCar = new Cotxe();
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Introdueix la marca del cotxe:");
//		myCar.marca = entrada.nextLine();
//		System.out.println("Introdueix el model del cotxe:");
//		myCar.model = entrada.nextLine();
//		System.out.println("Introdueix el nombre de cilindres:");
//		myCar.cilindres = Integer.parseInt(entrada.nextLine());
//		System.out.println("Introdueix la cilindrada:");
//		myCar.cilindrada = Integer.parseInt(entrada.nextLine());
//		myCar.calculaPotenciaFiscal();
//		System.out.println("");
//		System.out.println("El " + myCar.marca + " " + myCar.model + " té "
//		+ String.valueOf(myCar.potenciaFiscal) + " cavalls fiscals");
//		entrada.close();

		CotxeHibrid myCar = new CotxeHibrid();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix la marca del cotxe:");
		myCar.marca = entrada.nextLine();
		System.out.println("Introdueix el model del cotxe:");
		myCar.model = entrada.nextLine();
		System.out.println("Introdueix el nombre de cilindres:");
		myCar.cilindres = Integer.parseInt(entrada.nextLine());
		System.out.println("Introdueix la cilindrada:");
		myCar.cilindrada = Integer.parseInt(entrada.nextLine());
		System.out.println("Introdueix la potència del motor elèctic:");
		myCar.setkW(Integer.parseInt(entrada.next()));
		myCar.calculaPotenciaFiscal();
		System.out.println("");
		System.out.println("El " + myCar.marca + " " + myCar.model + " té "
		+ String.valueOf(myCar.potenciaFiscal) + " cavalls fiscals");
		entrada.close();
	}

}
