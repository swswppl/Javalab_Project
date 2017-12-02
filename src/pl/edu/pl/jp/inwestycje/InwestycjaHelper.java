package pl.edu.pl.jp.inwestycje;

import java.util.Scanner;

public class InwestycjaHelper {	
	
	private static Scanner scanner;
	/**
	 * Metoda wybory nazwy inwestycji
	 * @param kwota
	 * @return
	 */
	public static String nazwa_to_kwota(int kwota) {
		String nazwa_inwestycji = null;
		
		if(kwota <=0 )
			  nazwa_inwestycji ="Wez kredyt";
		  
		  else if (kwota > 0 && kwota < 50000)
			   nazwa_inwestycji = new Lokata().wybrana_inwestycja();
		  
		  if (kwota > 50000 && kwota < 100000  )
			  nazwa_inwestycji = new Fundusz().wybrana_inwestycja();
		  
		  else if(kwota > 100000  )
			  nazwa_inwestycji = new Forex().wybrana_inwestycja();
		
		  return nazwa_inwestycji;
	}
	
	/**
	 * Metoda wczytuje kwote z imputu
	 * @return
	 */
	public static int wczytajKwote(){
		scanner = new Scanner(System.in);
		System.out.print("Podaj kwote do zainwestowania: ");
		int kwota = scanner.nextInt();
		
		return kwota;
	}
	
	/**
	 * Metoda wyswietla kwote i nzwe inwestycji
	 * @param kwota
	 * @param nazwa_inwestycji
	 */
	public static void wyswietl(int kwota, String nazwa_inwestycji){
		System.out.println(String.format(" Polecana inwestycja dla kwoty: %d to: %s", kwota, nazwa_inwestycji));
	}
	
}

