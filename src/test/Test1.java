package test;


public class Test1 {

	public static void main(String[] args) {
		

		
		Bez_main st1 = new Bez_main();
		Bez_main st2 = new Bez_main();
		//tudent st2 = new Student();
		
		st1.setWiek(70);
		st1.setImie("Heniu");
		st1.setNazwisko("Moczymorda");
		st1.setPlec("Mê¿czyzna");
		
		st2.setWiek(10);
		st2.setImie("Aga");
		st2.setNazwisko("Burak");
		st2.setPlec("Kobieta");
		
		
		System.out.println("Student 1 Imie: " + st2.getImie() + " ,nazwisko: " + 
		st1.getNazwisko() + " ,wiek:" + st1.getWiek() + " ,p³eæ:" + st1.getPlec());
		
		System.out.println("Student 1 Imie: " + st2.getImie() + " ,nazwisko: " + 
				st2.getNazwisko() + " ,wiek:" + st2.getWiek() + " ,p³eæ:" + st2.getPlec());	
		
		
//		zmienne.setMiasto("Gdynia");
//System.out.println("Miasto : " + zmienne.getMiasto());   		
		
	}
	
}
