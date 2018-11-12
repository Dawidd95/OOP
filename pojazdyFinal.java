package nauka;

import java.util.*;

class Pojazd {
	String model;
	String marka;
	int mocSilnika;
	double pojemnoscSilnika;

	Pojazd() {
		this.model = model;
		this.marka = marka;
		this.mocSilnika = mocSilnika;
		this.pojemnoscSilnika = pojemnoscSilnika;
	}

	Pojazd(String model, String marka, int mocSilnika, double pojemnoscSilnika) {
		this.model = model;
		this.marka = marka;
		this.mocSilnika = mocSilnika;
		this.pojemnoscSilnika = pojemnoscSilnika;
	}
	
	
	String getModel() {
		return this.model;
	}
	
	String wyswietl() {
		return this.marka+" "+this.model+" "+this.mocSilnika+" "+this.pojemnoscSilnika; 
	}
}

class Osobowy extends Pojazd { 
	
	Osobowy() {
		this.model = model;
		this.marka = marka;
		this.mocSilnika = mocSilnika;
		this.pojemnoscSilnika = pojemnoscSilnika;
	}

	
	Osobowy(String model, String marka, int mocSilnika, double pojemnoscSilnika) {
		super(model, marka, mocSilnika, pojemnoscSilnika);
	}
		
	Osobowy dodaj() { 
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wprowadź marke: ");
		String marka = scanner.next();
		System.out.println("Wprowadź model: ");
		String model = scanner.next();
		System.out.println("Wprowadź moc silnika: ");
		int moc = scanner.nextInt();
		System.out.println("Wprowadź pojemnosc silnika: ");
		double pojemnosc = scanner.nextDouble();
		
		return new Osobowy(marka, model, moc, pojemnosc);  
	}

	void metoda() {
		super.getModel();
	}
	
	void metoda2() {
		super.wyswietl();
	}
}

class Motor extends Pojazd {
	
	Motor() {
		this.model = model;
		this.marka = marka;
		this.mocSilnika = mocSilnika;
		this.pojemnoscSilnika = pojemnoscSilnika;
	}

	Motor(String model, String marka, int mocSilnika, double pojemnoscSilnika) {
		super(model, marka, mocSilnika, pojemnoscSilnika);
	}
	
	Motor dodaj() { 
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wprowadź marke: ");
		String marka = scanner.next();
		System.out.println("Wprowadź model: ");
		String model = scanner.next();
		System.out.println("Wprowadź moc silnika: ");
		int moc = scanner.nextInt();
		System.out.println("Wprowadź pojemnosc silnika: ");
		double pojemnosc = scanner.nextDouble();
		
		return new Motor(marka, model, moc, pojemnosc);  
	}
	
	void metoda() {
		super.getModel();
	}
	
	void metoda2() {
		super.wyswietl();
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int index = 0;
		
		List <Osobowy> samochodyOsobowe  = new ArrayList<>();
		List <Motor> motocykle = new ArrayList<>();
		
		int wybierz;
		do {
			System.out.println("\n1: dodaj samochod osobowy");
			System.out.println("2: dodaj motocykl");
			System.out.println("3: usun samochod osobowy");
			System.out.println("4: usun motocykl");
			System.out.println("5: wyswietl pojazdy");
			System.out.println("6: koniec");
			System.out.println("Twoj wybor: ");
			wybierz = scanner.nextInt(); 

			Pojazd pojazd = new Pojazd();
			Osobowy osobowy = new Osobowy();
			Motor motor = new Motor();
					
			switch(wybierz) {
				case 1: 
					samochodyOsobowe.add(osobowy.dodaj());
					break;
				case 2:
					motocykle.add(motor.dodaj());
					break;
				case 3: 
					String model;
					System.out.println("Jaką marke samochodu chcesz usunac ?");
					model = scanner.next();
					Iterator<Osobowy> iter = samochodyOsobowe.iterator();
					while(iter.hasNext()) {
						
						if(iter.next().getModel().contains(model)) {
							iter.remove();
						}
					}
					break;
				case 4: 
					String modelMoto;
					System.out.println("Jaką marke motocyklu chcesz usunac ?");
					modelMoto = scanner.next();
					Iterator<Motor> iterMoto = motocykle.iterator();
					while(iterMoto.hasNext()) {
						
						if(iterMoto.next().getModel().contains(modelMoto)) {
							iterMoto.remove();
						}
					}
					break;
				case 5: 
					System.out.println("Wszystkie motocykle");
					for(int i = 0; i<motocykle.size(); i++) {					
						if(motocykle.get(i) != null) {
							System.out.println(motocykle.get(i).wyswietl());
						}
					}
					System.out.println("Wszystkie samochody");
					for(int i = 0; i<samochodyOsobowe.size(); i++) {					
						if(samochodyOsobowe.get(i) != null) {
							System.out.println(samochodyOsobowe.get(i).wyswietl());
						}
					}
					break;
			}
		} while(wybierz != 6);
	}
}
