package lekcja9_method_overloading;

public class Klasa1 {

	String[] tablica = new String[12];
	String[] args1;

	public static void main(String[] args) {

		if (args[0] != null) {
			System.out.println(args[0]);
		}

		System.out.println("D³ugoœæ:" + args.length);
		
		if(args.length > 1) {
			System.out.println(args[1]);
		}

		if (args[0].equals("Rima")) {
			System.out.println("Parametr to Rima");
		} else {
			System.out.println("Jakiœ inny parametr");
		}

	}

}
