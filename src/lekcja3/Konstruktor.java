package lekcja3;

public class Konstruktor {
	Konstruktor() {
		System.out.println("OK1");
	}
	
	Konstruktor(String imie) {
		this.imie = imie;
		System.out.println("OK2");
	}
	
	Konstruktor(int x) {
		this.imie = "Zenon";
		this.lata = 87;
		System.out.println("OK3");
	}
	
	
	
	private String imie;
	private int lata;
	
	public static void main(String[] args) {
		
		System.out.println("OK");
		Konstruktor ks = new Konstruktor();
		Konstruktor ks2 = new Konstruktor("Marek");
		Konstruktor ks3 = new Konstruktor(1);
		
		//ks.imie = "Marek";
		//ks.lata = 10;
		System.out.println("Imiê: " + ks.imie);
		System.out.println("Imiê: " + ks2.imie);
		System.out.println("Imiê: " + ks3.imie);
		System.out.println("Lata: " + ks3.lata);
	}
}
