
import java.util.*;
//id utworu to klucz glowny
class Utwor {
	
	String lp;
	String id_utworu;
	String tytul_utworu;
	String autor_utworu;
	int lpNumber = 3;
	
	Utwor() {
		this.lp = lp;
		this.id_utworu = id_utworu;
		this.tytul_utworu = tytul_utworu;
		this.autor_utworu = autor_utworu;
	}
	
	Utwor(String lp, String id_utworu, String tytul_utworu, String autor_utworu) {
		this.lp = lp;
		this.id_utworu = id_utworu;
		this.tytul_utworu = tytul_utworu;
		this.autor_utworu = autor_utworu;
	}
	
	Utwor nowyElement(String lp, String id_utworu, String tytul_utworu, String autor_utworu) {	

		return new Utwor(lp, id_utworu, tytul_utworu, autor_utworu);  

	}
	
	String pokazStan() {
		return this.lp+" "+this.id_utworu+" "+this.tytul_utworu+" "+this.autor_utworu; 
	}
		
	String getId() {
		return this.id_utworu;
	}
	
	String tytul() {
		return this.tytul_utworu;
	}
}


public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		List <Utwor> utwor  = new ArrayList<>();
		int wybierz;
		Utwor obiektUtwor = new Utwor();
		utwor.add(obiektUtwor.nowyElement("0","#123","Stairway To Heaven","Led Zeppelin"));
		utwor.add(obiektUtwor.nowyElement("1","#346","Love Song","Taylor Swift"));
		utwor.add(obiektUtwor.nowyElement("2","#567","Burn It Down", "Linkin Park"));
		System.out.println("Lp / id / tytul utworu /autor utworu\n");
		for(int i = 0; i<utwor.size(); i++) {					

			if(utwor.get(i) != null) {

				System.out.println(utwor.get(i).pokazStan());

			}

		}
		
		
		
		do {

			System.out.println("\n1: Pokaz utwory"); //

			System.out.println("2: Dodaj nowy utwor"); //

			System.out.println("3: Usun wybrany utwor");  //++

			System.out.println("4: Zmien dane utworu"); //

			System.out.println("5: Koniec"); //
			

			System.out.println("Twoj wybor: ");

			wybierz = scanner.nextInt(); 		

			switch(wybierz) {
			
				case 1:
					for(int i = 0; i<utwor.size(); i++) {					

						if(utwor.get(i) != null) {

							System.out.println(utwor.get(i).pokazStan());

						}

					}
							
					break;
				
				case 2: 

					System.out.println("Podaj lp: ");

					String lp = scanner.next();
					
					System.out.println("Wprowadź id utworu zaczynając od #: ");

					String id = scanner.next();
					
			
							
					System.out.println("Wprowadz tytul utworu: ");

					String tytul = scanner.next();
							
					System.out.println("Wprowadz autora utworu: ");
							
					String autor = scanner.next();
							
					Iterator<Utwor> iterr = utwor.iterator();
					
					
					utwor.add(obiektUtwor.nowyElement(lp, id, tytul, autor));
					
										
					break;

				case 3:
					String numer;

					System.out.println("Jaki numer utworu chcesz usunac ?");

					numer = scanner.next();

					Iterator<Utwor> iter2 = utwor.iterator();

					while(iter2.hasNext()) {

						

						if(iter2.next().getId().contains(numer)) {

							iter2.remove();
						} else {
							System.out.println("Nie ma takiego utworu");
							break;
						}

					}
					break;
			
					
				case 5: 
					System.out.println("Koniec programu");
					System.exit(0);
			}

		} while(wybierz != 5);
	}

}
