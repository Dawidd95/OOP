
//2. sprawdz stan magazynu, wyswietlenie wszystkiego w magaza
//3. zakup towaru ma usunac z magazyn

//1. przyjecie towaru klasa magazyn bo ma przyjmowac do magazynu
//2. sprawdz stasn magazynu klasa magazyn
//3. Zakup towaru klasa Koszyk


// 1.przyjecie Cale VVVVVVVVVVVVVVv
// 2. Stan magazynu caly VVVVVVVVVVVVVVV
// 3. powrot na zakupie towaru VVVVVVVVVVVVV
// 4. PRzy zakupie towaru dodanie go do koszyka wraz z podana iloscia
// 5. usuniecie odpowiedniej ilosci tego towaru z magazynu
// 6. wyswietlenie zawartosci ksozyka
package nauka;

import java.util.*;

class Magazyn {
	String index;
	String nazwa;
	int ilosc;
	double cena;

	Magazyn() {
		this.index = index;
		this.nazwa = nazwa;
		this.ilosc = ilosc;
		this.cena = cena;
	}

	Magazyn(String index, String nazwa, int ilosc, double cena) {
		this.index = index;
		this.nazwa = nazwa;
		this.ilosc = ilosc;
		this.cena = cena;
	}

	Magazyn przyjecieTowaru() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj kod: ");
		String index = scanner.next();
		System.out.println("Wprowadź nazwe produktu: ");
		String nazwa = scanner.next();
		System.out.println("Wprowadź ilosc produktu: ");
		int ilosc = scanner.nextInt();
		System.out.println("Wprowadź cene: ");
		double cena = scanner.nextDouble();
		
		return new Magazyn(index, nazwa, ilosc, cena);  
	}

	String pokazStan() {
		return this.index+" "+this.nazwa+" "+this.ilosc+"szt "+this.cena+" zł."; 
	}
}

class Koszyk extends Magazyn {

	Koszyk() {
		this.index = index;
		this.nazwa = nazwa;
		this.ilosc = ilosc;
		this.cena = cena;
	}

	Koszyk(String index, String nazwa, int ilosc, double cena) {
		super(index, nazwa, ilosc, cena);
	}

	Koszyk dodajDoKoszyka() {	
		return new Koszyk(this.index, this.nazwa, this.ilosc, this.cena);  
	}

	void zakupTowar() {

	}

	String wyswietlKoszyk() {
		return this.index+" "+this.nazwa+" "+this.ilosc+"szt "+this.cena+" zł."; 
		// petla do while calosci wraz z 1. Zaplac 0. Wroc po 1ma pokazac zaplacono iles tam
	}
	
	String getNumer() {
		return this.index;
	}
}

public class Main {
	
	public static void main(String[] args) {
		myFunction();
	}
		
	public static void myFunction() {
		Scanner scanner = new Scanner(System.in);
		int index = 0;
		
		List <Magazyn> magazyn  = new ArrayList<>();
		List <Koszyk> koszyk = new ArrayList<>();
		
		int wybierz;
		
		do {
			System.out.println("\n1: Przyjmij towar"); //
			System.out.println("2: Stan magazynu"); //
			System.out.println("3: Zakup towaru");  //++
			System.out.println("4: Przejdz do koszyka"); //
			System.out.println("5: Koniec"); //
			System.out.println("Twoj wybor: ");
			wybierz = scanner.nextInt(); 

			Magazyn obiektMagazyn = new Magazyn();
			Koszyk obiektKoszyk = new Koszyk();
					
			switch(wybierz) {
				case 1: 
					magazyn.add(obiektMagazyn.przyjecieTowaru());
					break;
				case 2:
					System.out.println("Stan magazynu");
					for(int i = 0; i<magazyn.size(); i++) {					
						if(magazyn.get(i) != null) {
							System.out.println(magazyn.get(i).pokazStan());
						}
					}
					
					break;
				case 3:
					//sprobowac to cale wrzucic w funkcje a tutaj tlyko bedzie jej wywolanie
					String numer;		
					System.out.println("Dostępne towary");
					for(int i = 0; i<magazyn.size(); i++) {					
						if(magazyn.get(i) != null) {
							System.out.println(magazyn.get(i).pokazStan());
						}
					}
					
					System.out.println("0. Wroc");
					System.out.println("\nJaki numer towaru chcesz dodac do koszyka ?");
						
					numer = scanner.next(); 
					Iterator <Koszyk> iter = koszyk.iterator();
					if(iter.hasNext()) {
						if(iter.next().getNumer().contains(numer)) {
							//obiektKoszyk.dodajDoKoszyka();
							System.out.println("dzial");
						}
						else {
							System.out.println("");
						}
					} 
					break;
				case 4: 
					System.out.println("\nTwój koszyk");
					for(int i = 0; i<koszyk.size(); i++) {					
						if(koszyk.get(i) != null) {
							System.out.println(koszyk.get(i).wyswietlKoszyk());
						}
					}
					break;
				case 5:
					System.exit(0);
			}
		} while(wybierz != 5);
	}
}
