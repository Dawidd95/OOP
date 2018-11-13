//1. przyjecie towaru czyli dodaj towar, doda go do magazyn
//2. sprawdz stan magazynu, wyswietlenie wszystkiego w magazyn
//3. zakup towaru ma usunac z magazyn

//1. przyjecie towaru klasa magazyn bo ma przyjmowac do magazynu
//2. sprawdz stasn magazynu klasa magazyn
//3. Zakup towaru klasa Koszyk

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

	void przyjecieTowaru() {

	}

	void pokazStan() {

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

	void dodajDoKoszyka() {

	}

	void zakupTowar() {

	}

	void wyswietlKoszyk() {
		// petla do while calosci wraz z 1. Zaplac 0. Wroc po 1ma pokazac zaplacono iles tam
	}

}

public class Main {

	public static void main(String[] args) {
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
				case 3:
					
					do {
						System.out.println("Dostępne towary");
						for(int i = 0; i<magazyn.size(); i++) {					
							if(magazyn.get(i) != null) {
								System.out.println(magazyn.get(i).pokazStan());
							}
						}

						System.out.println("Jaki numer towaru chcesz dodac do koszyka ?");
						System.out.println("0. Wroc");
						wybierz = scanner.nextInt(); 

						obiektKoszyk.dodajDoKoszyka();

					} while(wybierz != 0);
				
					
					// obiektKoszyk.dodajDoKoszyka();
					break;
				case 4: 
					// obiektKoszyk.wyswietlKoszyk();
					break;
				case 5:
					System.exit(0);
			}
		} while(wybierz != 5);
	}
}
