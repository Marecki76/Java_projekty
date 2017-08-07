package lekcja1;

public class Lekcja1 {

public static void main(String[] args) {
	System.out.println("Dzia³am ...");
	Student st1 = new Student();
	Student st2 = new Student();
	
	st1.wiek = 70;
	st1.imie = "Heniu";
	st1.nazwisko = "Moczymorda";
	st1.plec = "Mê¿czyzna";
	
	
	st2.wiek = 10;
	st2.imie = "Aga";
	st2.nazwisko = "Kowalaska";
	st2.plec = "Kobieta";
	
	System.out.println("Student 1 Imie: " + st1.imie + " ,nazwisko: " + 
	st1.nazwisko + " ,wiek:" + st1.wiek + " ,p³eæ:" + st1.plec);
	
	System.out.println("Student 2 Imie: " + st2.imie + " ,nazwisko: " + 
			st2.nazwisko + " ,wiek:" + st2.wiek + " ,p³eæ:" + st2.plec);
	
}
}
