
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
// 6. wyswietlenie zawartosci ksozyka ++



//Powinna być możliwość
//przyjęcia towaru do sklepu oraz jego sprzedaż w sposób hurtowy i
//detaliczny. „Sprzedaż” ma polegać na wybieraniu towarów do
//koszyka (bez rejestrowania klientów) i naliczaniu zbiorczej.

package nauka;

import java.util.*;

class Magazyn {
	String index;
	String nazwa;
	int ilosc;
	double cena;
	double suma;

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

	Magazyn przyjecieTowaru(String index, String nazwa, int ilosc, double cena) {	
		return new Magazyn(index, nazwa, ilosc, cena);  
	}

	String pokazStan() {
		return this.index+" "+this.nazwa+" "+this.ilosc+"szt "+this.cena+" zł."; 
	}
	
	String getNumer() {
		return this.index;
	}
	
	String getNazwa() {
		return this.nazwa;
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

	Koszyk dodajDoKoszyka(String index, String nazwa, int ilosc, double cena) {	
		return new Koszyk(index, nazwa, ilosc, cena);  
	}

	void zakupTowar() {

	}
}

class Produkt {
	String index;
	String nazwa;
	int ilosc;
	double cena;
	double suma;
	
	Produkt() {
		this.index = index;
		this.nazwa = nazwa;
		this.ilosc = ilosc;
		this.cena = cena;
	}
	
	Produkt(String index, String nazwa, int ilosc, double cena) {
		this.index = index;
		this.nazwa = nazwa;
		this.ilosc = ilosc;
		this.cena = cena;
	}
	
	Produkt dodajProdukt(String index, String nazwa, int ilosc, double cena) {	
		return new Produkt(index, nazwa, ilosc, cena);  
	}
	
	String pokazStan() {
		return this.index+" "+this.nazwa+" "+this.ilosc+"szt "+this.cena+" zł."; 
	}
	
	String getIndex() {
		return this.index;
	}
}

public class Main {
	
	List <Magazyn> magazyn  = new ArrayList<>();
	List <Koszyk> koszyk = new ArrayList<>();
	List <Produkt> produkt = new ArrayList<>();
	int wyborInt;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		List <Magazyn> magazyn  = new ArrayList<>();
		List <Koszyk> koszyk = new ArrayList<>();
		List <Produkt> produkt = new ArrayList<>();
		
		int wybierz;
		double total;
		
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
			Produkt obiektProdukt = new Produkt();
					
			switch(wybierz) {
				case 1: 
					System.out.println("Podaj kod: ");
					String index = scanner.next();
					System.out.println("Wprowadź nazwe produktu: ");
					String nazwa = scanner.next();
					System.out.println("Wprowadź ilosc produktu: ");
					int ilosc = scanner.nextInt();
					System.out.println("Wprowadź cene za jedna sztuke tego produktu: ");
					double cena = scanner.nextDouble();
					magazyn.add(obiektMagazyn.przyjecieTowaru(index, nazwa, ilosc, cena));
					produkt.add(obiektProdukt.dodajProdukt(index, nazwa, ilosc, cena));
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
					String wybor;
					int ile;
					System.out.println("Jaki numer produktu chcesz dodac ?");
					wybor = scanner.next();
					System.out.println("Ile sztuk chcesz kupic tego produktu ?");
					ile = scanner.nextInt();
					int wyborInt = Integer.parseInt(wybor);
					Iterator<Produkt> iter = produkt.iterator();
					while(iter.hasNext()) {
					
					if(iter.next().getIndex().contains(wybor)) {   //dziala 
						// teraz stworzyc obiekkt klasy Koszyk i wrzucic tam te dane
						koszyk.add(obiektKoszyk.dodajDoKoszyka(produkt.get(wyborInt).index, produkt.get(wyborInt).nazwa, ile, produkt.get(wyborInt).cena*ile));
					} else {
						System.out.println("");
					 }
					}
					break;
				case 4: 
					double suma = 0;
					System.out.println("\nTwój koszyk");
					for(int i = 0; i<koszyk.size(); i++) {					
						if(koszyk.get(i) != null) {
							System.out.println(koszyk.get(i).pokazStan());
						}
					}
					for(int i = 0; i<koszyk.size(); i++) {					
						if(koszyk.get(i) != null) {
							suma = suma + koszyk.get(i).cena;
						}
					}
					total = suma;
					double hurtowy = total-(total*0.3);
					System.out.println("Do zapłaty detaliczny: "+total+" zł");
					System.out.println("Do zapłaty hurtowy(-30%): "+hurtowy+" zł");
					break;
				case 5:
					System.exit(0);
			}
		} while(wybierz != 5);
	}
}
