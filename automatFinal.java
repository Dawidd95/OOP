package nauka;

import java.util.*;

class Automat {
	String nazwaNapoju;
	double cenaNapoju;
	double wrzuconaSuma = 0;

	Automat() {
		this.nazwaNapoju = nazwaNapoju;
		this.cenaNapoju = cenaNapoju;
	}

	Automat(String nazwaNapoju, double cenaNapoju) {
		this.nazwaNapoju = nazwaNapoju;
		this.cenaNapoju = cenaNapoju;
	}
	
	void wybierzNapoj(double suma) {
		Scanner scanner = new Scanner(System.in);
		int wybierz;
		
		do {
			System.out.println("//////////////////////////////////////////////////////////////////");
			System.out.println("\nWybierz napój");
			System.out.print("Wrzucona suma: ");
			System.out.format("%.2f%n", suma);
			System.out.println("\n1: Coca Cola 3.28zł");
			System.out.println("2: Pepsi 3.89 zł");
			System.out.println("3: Sprite 3.59 zł");
			System.out.println("4: Woda Gazowana 2.19 zł");
			System.out.println("5: Woda Smakowa 2.59 zł");
			System.out.println("\n0. WYJDZ I ZWROC WRZUCONE PIENIADZE");
			System.out.println("Twoj wybor: ");
			wybierz = scanner.nextInt(); 
			
			switch(wybierz) {
				case 1: 	
					nazwaNapoju = "Coca Cola";
					cenaNapoju = 3.28;
					kupNapoj(suma);
					break;
				case 2: 	
					nazwaNapoju = "Pepsi";
					cenaNapoju = 3.89;
					kupNapoj(suma);
					break;
				case 3: 	
					nazwaNapoju = "Sprite";
					cenaNapoju = 3.59;
					kupNapoj(suma);
					break;
				case 4: 	
					nazwaNapoju = "Woda Gazowana";
					cenaNapoju = 2.19;
					kupNapoj(suma);
					break;
				case 5: 	
					nazwaNapoju = "Woda Smakowa";
					cenaNapoju = 2.59;
					kupNapoj(suma);
					break;
				case 0:
					zakoncz();
			}
		} while(wybierz < 6);
	}
	
	void kupNapoj(double suma) {
		Scanner scanner = new Scanner(System.in);
		int wybierz;
		Automat napoj = new Automat(nazwaNapoju, cenaNapoju);
		if (napoj.cenaNapoju > suma) {
			System.out.println("\nMASZ ZA MALO PIENIEDZY BY KUPIC TEN NAPOJ!");
			System.out.println("0. Wroc");
			wybierz = scanner.nextInt();
		} else {
			zwrocReszte(napoj.cenaNapoju);
		}
	}
	
	void zakoncz() {
		System.out.println("Zwrocone pieniadze: ");
		System.out.format("%.2f%n", wrzuconaSuma);
		System.exit(0);
	}
	
	void zwrocReszte(double cena) {
		double reszta;
		reszta = wrzuconaSuma-cena;
		System.out.println("Kupiono pomyślnie");
		System.out.println("Odbierz reszte: ");
		System.out.format("%.2f%n", reszta);
		System.exit(0);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int wybierz;
		Automat suma = new Automat();
		do {
			System.out.println("/////////////////////////////////////////////////////////////////////////");
			System.out.println("Ceny napojów: Coca Cola 3.28zł, Pepsi 3.89 zł, Sprite 3.59 zł, Woda Gazowana 2.19 zł, Woda Smakowa 2.59 zł");
			System.out.print("Wrzucona juz suma: ");
			System.out.format("%.2f%n", suma.wrzuconaSuma);
			System.out.println("\nWrzuc monete: ");
			System.out.println("\n1: 0.10 gr");
			System.out.println("2: 0.20 gr");
			System.out.println("3: 0.50 gr");
			System.out.println("4: 1.00 zł");
			System.out.println("5: 2.00 zł");
			System.out.println("6: 5.00 zł\n");
			System.out.println("7. ZATWIERDZ I PRZEJDZ DALEJ");
			System.out.println("0. WYJDZ I ZWROC WRZUCONA SUME");
			System.out.println("Wybierz opcje: ");
			
			wybierz = scanner.nextInt(); 
			
			switch(wybierz) {
				case 1: 	
					suma.wrzuconaSuma += 0.1;				
					break;
				case 2: 	
					suma.wrzuconaSuma += 0.2;
					break;
				case 3: 	
					suma.wrzuconaSuma += 0.5;	
					break;
				case 4: 	
					suma.wrzuconaSuma += 1.0;
					break;
				case 5: 	
					suma.wrzuconaSuma += 2.0;		
					break;
				case 6: 	
					suma.wrzuconaSuma += 5.0;		
					break;
				case 7: 
					suma.wybierzNapoj(suma.wrzuconaSuma);
					break;
				case 0: 
					suma.zakoncz();
					break;
			} 
		} while(wybierz != 0 || wybierz != 7);
	}
}
