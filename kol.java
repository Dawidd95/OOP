package sd;

import java.util.*;

class Czytelnicy {
	String id_czytelnika;
	String imie_czytelnika;
	String nazwisko_czytelnika;
	
	Czytelnicy() {
		this.id_czytelnika = id_czytelnika;
		this.imie_czytelnika = imie_czytelnika;
		this.nazwisko_czytelnika = nazwisko_czytelnika;
	}
	
	Czytelnicy(String id_czytelnika, String imie_czytelnika, String nazwisko_czytelnika) {
		this.id_czytelnika = id_czytelnika;
		this.imie_czytelnika = imie_czytelnika;
		this.nazwisko_czytelnika = nazwisko_czytelnika;
		
	}
	
	Czytelnicy nowyElement(String id_czytelnika, String imie_czytelnika, String nazwisko_czytelnika) {	

		return new Czytelnicy(id_czytelnika, imie_czytelnika, nazwisko_czytelnika);  

	}
	
	String pokazStan() {

		return this.id_czytelnika+" "+this.imie_czytelnika+" "+this.nazwisko_czytelnika; 

	}
}

//----------------------------------------------------------------

class Autorzy {
	String id_autora;
	String imie_autora;
	String nazwisko_autora;
	
	Autorzy() {
		this.id_autora = id_autora;
		this.imie_autora = imie_autora;
		this.nazwisko_autora = nazwisko_autora;
	}
	
	Autorzy(String id_autora, String imie_autora, String nazwisko_autora) {
		this.id_autora = id_autora;
		this.imie_autora = imie_autora;
		this.nazwisko_autora = nazwisko_autora;
	}
	
	Autorzy nowyElement(String id_autora, String imie_autora, String nazwisko_autora) {	

		return new Autorzy(id_autora, imie_autora, nazwisko_autora);  

	}
	
	String pokazStan() {

		return this.id_autora+" "+this.imie_autora+" "+this.nazwisko_autora; 

	}
}

//-----------------------------------------------------------------------

class Ksiazki {
	String id_ksiazki;
	String id_autora;
	String tytul;
	String rok_wydania;
	
	Ksiazki() {
		this.id_ksiazki = id_ksiazki;
		this.id_autora = id_autora;
		this.tytul = tytul;
		this.rok_wydania = rok_wydania;
	}
	
	Ksiazki(String id_ksiazki, String id_autora, String tytul, String rok_wydania) {
		this.id_ksiazki = id_ksiazki;
		this.id_autora = id_autora;
		this.tytul = tytul;
		this.rok_wydania = rok_wydania;
	}
	
	Ksiazki nowyElement(String id_ksiazki, String id_autora, String tytul, String rok_wydania) {	

		return new Ksiazki(id_ksiazki, id_autora, tytul, rok_wydania);  

	}
	
	String pokazStan() {

		return this.id_ksiazki+" "+this.id_autora+" "+this.tytul+" "+this.rok_wydania; 

	}
	
	String getNumer() {

		return this.id_ksiazki;

	}
}

//----------------------------------------------------------------------------

class Wypozyczania {
	String id_wypozyczania;
	String id_czytelnika;
	String id_ksiazki;
	String data_wypozyczania;
	String termin_oddania;
	
	Wypozyczania() {
		this.id_wypozyczania = id_wypozyczania;
		this.id_czytelnika = id_czytelnika;
		this.id_ksiazki = id_ksiazki;
		this.data_wypozyczania = data_wypozyczania;
		this.termin_oddania = termin_oddania;
	}
	
	Wypozyczania(String id_wypozyczania, String id_czytelnika, String id_ksiazki, String data_wypozyczania, String termin_oddania) {
		this.id_wypozyczania = id_wypozyczania;
		this.id_czytelnika = id_czytelnika;
		this.id_ksiazki = id_ksiazki;
		this.data_wypozyczania = data_wypozyczania;
		this.termin_oddania = termin_oddania;
	}
	
	Wypozyczania nowyElement(String id_wypozyczania, String id_czytelnika, String id_ksiazki, String data_wypozyczania, String termin_oddania) {	

		return new Wypozyczania(id_wypozyczania,  id_czytelnika, id_ksiazki,  data_wypozyczania,  termin_oddania);  

	}
	
	String pokazStan() {

		return this.id_wypozyczania+" "+  this.id_czytelnika+" " +this.id_ksiazki+" " + this.data_wypozyczania+" " +  this.termin_oddania;

	}
	
}

//----------------------------------------------------------


public class klasa {
	
	List <Czytelnicy> czytelnicy  = new ArrayList<>();

	List <Autorzy> autorzy = new ArrayList<>();

	List <Ksiazki> ksiazki = new ArrayList<>();
	
	List <Wypozyczania> wypozyczania = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List <Czytelnicy> czytelnicy  = new ArrayList<>();

		List <Autorzy> autorzy = new ArrayList<>();

		List <Ksiazki> ksiazki = new ArrayList<>();
		
		List <Wypozyczania> wypozyczania = new ArrayList<>();
		int wybierz;
		Czytelnicy obiektCzytelnicy = new Czytelnicy();
		Autorzy obiektAutorzy = new Autorzy();
		Ksiazki obiektKsiazki = new Ksiazki();
		Wypozyczania obiektWypozyczania = new Wypozyczania();
		
		czytelnicy.add(obiektCzytelnicy.nowyElement("0", "Roman", "Gwozdz"));
		czytelnicy.add(obiektCzytelnicy.nowyElement("1", "Janina", "Mech"));
		czytelnicy.add(obiektCzytelnicy.nowyElement("2", "Kasia", "Wolna"));
		autorzy.add(obiektAutorzy.nowyElement("0", "Henryk", "Sienkiewicz"));
		autorzy.add(obiektAutorzy.nowyElement("1", "Janina", "Kaczmarek"));
		autorzy.add(obiektAutorzy.nowyElement("2", "Stefan", "Zeromski"));
		ksiazki.add(obiektKsiazki.nowyElement("0", "0", "Ogniem i mieczem", "2005"));
		ksiazki.add(obiektKsiazki.nowyElement("1", "1", "Magiczny ogrod", "2002"));
		ksiazki.add(obiektKsiazki.nowyElement("2", "2", "Zemsta", "2007"));
		wypozyczania.add(obiektWypozyczania.nowyElement("0", "1", "1", "11.11.2018", "17.11.2018"));
		wypozyczania.add(obiektWypozyczania.nowyElement("1", "0", "2", "12.11.2018", "18.11.2018"));
		wypozyczania.add(obiektWypozyczania.nowyElement("2", "0", "1", "18.11.2018", "26.11.2018"));
		
		
		System.out.println("Wszyscy czytelnicy:");

		for(int i = 0; i<czytelnicy.size(); i++) {					

			if(czytelnicy.get(i) != null) {

				System.out.println(czytelnicy.get(i).pokazStan());

			}

		}
		
		System.out.println("\nWszyscy autorzy:");

		for(int i = 0; i<autorzy.size(); i++) {					

			if(autorzy.get(i) != null) {

				System.out.println(autorzy.get(i).pokazStan());

			}

		}
		
		System.out.println("\nWszystkie ksiazki :");

		for(int i = 0; i<ksiazki.size(); i++) {					

			if(ksiazki.get(i) != null) {

				System.out.println(ksiazki.get(i).pokazStan());

			}

		}
		
		System.out.println("\nWszystkie wypozyczenia :");

		for(int i = 0; i<wypozyczania.size(); i++) {					

			if(wypozyczania.get(i) != null) {

				System.out.println(wypozyczania.get(i).pokazStan());

			}

		}
		
		do {

			System.out.println("\n1: Dodaj czytelnika"); //

			System.out.println("2: Wszyscy czytelnicy"); //

			System.out.println("3: Usun wybrana ksiazke");  //++

			System.out.println("4: wyswietl wszystkie ksiazki"); //

			System.out.println("5: Wypozycz ksiazke"); //
			
			System.out.println("6: Koniec");

			System.out.println("Twoj wybor: ");

			wybierz = scanner.nextInt(); 		

			switch(wybierz) {

				case 1: 

					System.out.println("Podaj id: ");

					String id = scanner.next();

					System.out.println("Wprowadź imie: ");

					String imie = scanner.next();

					System.out.println("Wprowadz nazwisko: ");

					String nazwisko = scanner.next();


					czytelnicy.add(obiektCzytelnicy.nowyElement(id, imie, nazwisko));


					break;

				case 2:

					System.out.println("Wszyscy czytelnicy:");

					for(int i = 0; i<czytelnicy.size(); i++) {					

						if(czytelnicy.get(i) != null) {

							System.out.println(czytelnicy.get(i).pokazStan());

						}

					}

					break;
				case 3:
					String numer;

					System.out.println("Jaki numer ksiazki chcesz usunac ?");

					numer = scanner.next();

					Iterator<Ksiazki> iter = ksiazki.iterator();

					while(iter.hasNext()) {

						

						if(iter.next().getNumer().contains(numer)) {

							iter.remove();

						}

					}
					break;
				case 4:
					System.out.println("\nWszystkie ksiazki :");

					for(int i = 0; i<ksiazki.size(); i++) {					

						if(ksiazki.get(i) != null) {

							System.out.println(ksiazki.get(i).pokazStan());

						}

					}
				
				case 5: 
					
					
					System.out.println("Podaj id wypozyczenia: ");

					String id_wypozyczenia = scanner.next();

					System.out.println("Wprowadź id czytelnika: ");

					String id_czytelnika = scanner.next();

					System.out.println("Wprowadz id ksiazki: ");

					String id_ksiazki = scanner.next();

					System.out.println("Wprowadz date wypozyczenia: ");
					
					String data_wyp = scanner.next();
					
					System.out.println("Wprowadz date oddania: ");
					
					String data_odd = scanner.next();

					wypozyczania.add(obiektWypozyczania.nowyElement(id_wypozyczenia, id_czytelnika, id_ksiazki, data_wyp, data_odd));


					break;
					
					
				case 6:
					System.out.println("Koniec programu");
					
					System.exit(0);

			}

		} while(wybierz != 5);
	}

}
