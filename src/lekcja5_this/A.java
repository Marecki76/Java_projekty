package lekcja5_this;

public class A {
	//pierwszy konstruktor
	A(){
		System.out.println("Metoda konstruktora");
		
	}
	
	//pierwszy konstruktor
		A(int x){
			//wywo³anie konstruktora
			this();
			System.out.println(x);
			}

}
