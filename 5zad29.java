// do magazynu podawac duza ilosc np: 450
// dpuble wpisywac z przecinkiem w oknie
// podaj kod zaczynamy od 0

package nauka;
import java.util.Scanner;

public class Main 
{
 
    public static void main(String[] args) 
    {
   
        //książka adresowa - max 100 osób
        Osoba[] ksiazka_adresowa=new Osoba[100]; //tablica klasy Osoba
        Scanner ObiektPrzycisk = new Scanner(System.in);
        int opcja; 
        int licznik=0;              
        //menu
        do
        {
            System.out.println("-------- MENU --------------------------");
            System.out.println("1 - wprowadź wpis");
            System.out.println("2 - usuń wpis");
            System.out.println("3 - pokaż wszystkie wpisy");
            System.out.println("4 - wyjście");
            System.out.println("----------------------------------------");
            System.out.print("Wybierz jedną z opcji: ");
            opcja= ObiektPrzycisk.nextInt();
            switch (opcja)
            {
                case 1:
                {   
                    System.out.println("WPROWADŹ WPIS ----------------------------------------");
                    ksiazka_adresowa[licznik]=new Osoba(); // licznik to index 0,1,2,3,4,5...
                    
                    // wywołanie metody podajNazwisko(); klasy Osoba
                    ksiazka_adresowa[licznik].PodajNazwisko(); // nazwisko dla ksiazka_adresowa[0] lub [1] lub [2] itd...
                    // wywołanie metody podajTelefon(); klasy Osoba
                    ksiazka_adresowa[licznik].PodajTelefon();  // telefon dla ksiazka_adresowa[0] lub [1] lub [2] itd...
                    licznik++;        
                    break;
                }
                case 2:
                {   
                    System.out.println("USUŃ WPIS ----------------------------------------");
                    System.out.print("Podaj nr wpisu do usunięcia: ");
                    int nr = ObiektPrzycisk.nextInt();
                    System.out.println(nr);
                    ksiazka_adresowa[nr-1].nazwisko=""; // czyli jak wpiszemy 1 to zmieni w indexie 0, jak wpiszemy 5 to w indexie 4 itd...
                    ksiazka_adresowa[nr-1].telefon="";  // czyli jak wpiszemy 1 to zmieni w indexie 0, jak wpiszemy 5 to w indexie 4 itd...
                    break;
                }      
                case 3:
                {
                    System.out.println("WSZYSTKIE WPISY ----------------------------------------");
                    for (int i=0;i<licznik;i++) // przechodzi przez wszystkie liczniki [0], [1], [2] itd...
                    {
                       if (ksiazka_adresowa[i].PokazNazwisko()!="")   // jesli jest nazwisko 
                       System.out.println(i+1+" - "+ksiazka_adresowa[i].PokazNazwisko());    // pokazuje numer czyli wartosc iterowanego 'i' podniesionego o 1 oraz nazwisko        
                    } 
                    break;
                } 
                case 4:break;
                default:System.out.println("Nie wybrano właściwej opcji");
            }
        }
        while (opcja!=4);
    }   
}
//-------------------------------------------------------------
class Osoba
{
    //składowe klasy Osoba
    //public int licznik=0;
    
    public String nazwisko;     //x
    public String telefon;      // y
    
    //metody klasy Osoba
    public String PodajNazwisko()
    {
        Scanner ObiektString = new Scanner(System.in);
        System.out.print("Podaj nazwisko:");
        String new_naz = ObiektString.next();
        nazwisko=new_naz;   // to samo x
        return nazwisko;       // to samo x
    }
    public String PodajTelefon()
    {
        Scanner ObiektString = new Scanner(System.in);
        System.out.print("Podaj telefon:");
        String new_telefon = ObiektString.next();
        telefon=new_telefon;       // to samo y
        return telefon;           // to samo y
    }
    public String PokazNazwisko()
    {
        return nazwisko;    // to samo x
    }
}
