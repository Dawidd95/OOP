
import java.util.*;

class Kontakty {
	String imie;
	String nazwisko;
	String adres;
	String numerKontaktu;
	
	Kontakty() {
		this.numerKontaktu = numerKontaktu;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
	}
		
	Kontakty(String numerKontaktu, String imie, String nazwisko, String adres) {
		this.numerKontaktu = numerKontaktu;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
	}
	
	Kontakty dodaj() { // ma stworzyc nowy obiekt i wrzucic go do tablicy ksiazkaAdresowa
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wprowadź numerKontaktu: ");
		String numerKontaktu = scanner.next();
		System.out.println("Wprowadź imie: ");
		String imie = scanner.next();
		System.out.println("Wprowadź nazwisko: ");
		String nazwisko = scanner.next();
		System.out.println("Wprowadź Adres: ");
		String adres = scanner.next();
		
		return new Kontakty(numerKontaktu, imie, nazwisko, adres);  //stworzylo nowy obiekt
	}
	
	String wyswietlKontakt() {
		return this.numerKontaktu+" "+this.imie+" "+this.nazwisko+" "+this.adres; 
	}
	
	String getNumer() {
		return this.numerKontaktu;
	}
}


public class program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int index = 0;
		
		List <Kontakty> ksiazkaAdresowa = new ArrayList<>();
		
		int wybierz;
		do {
			System.out.println("\n1: dodaj kontakt");
			System.out.println("2: usun kontakt");
			System.out.println("3: wyswietl kontakt");
			System.out.println("4: koniec");
			System.out.println("Twoj wybor: ");
			wybierz = scanner.nextInt(); 
			Kontakty obiekt = new Kontakty();
					
			switch(wybierz) {
				case 1: 
					ksiazkaAdresowa.add(obiekt.dodaj());
					break;
				case 2: 
					String numer;
					System.out.println("Jaki numer chcesz usunac ?");
					numer = scanner.next();
					Iterator<Kontakty> iter = ksiazkaAdresowa.iterator();
					while(iter.hasNext()) {
						
						if(iter.next().getNumer().contains(numer)) {
							iter.remove();
						}
					}
				case 3: 
					System.out.println("Wszystkie Kontakty");
					for(int i = 0; i<ksiazkaAdresowa.size(); i++) {					
						if(ksiazkaAdresowa.get(i) != null) {
							System.out.println(ksiazkaAdresowa.get(i).wyswietlKontakt());
						}
					}
			}
		} while(wybierz != 4);
	}

}
