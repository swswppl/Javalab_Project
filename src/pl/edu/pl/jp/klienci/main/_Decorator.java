package pl.edu.pl.jp.klienci.main;

import pl.edu.pl.jp.inwestycje.*;

import java.util.Scanner;

public abstract class _Decorator {

		public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Podaj kwote do zainwestowania: ");
		  int kwota = scanner.nextInt();
		  String nazwa_inwestycji = "test";
		  if(kwota <=0 )
			  nazwa_inwestycji ="Wez kredyt";
		  
		  else if (kwota > 0 && kwota < 50000)
			   nazwa_inwestycji = new Lokata().wybrana_inwestycja();
		  
		  if (kwota > 50000 && kwota < 100000  )
			  nazwa_inwestycji = new Fundusz().wybrana_inwestycja();
		  
		  else if(kwota > 100000  )
			  nazwa_inwestycji = new Forex().wybrana_inwestycja();
		
		  System.out.println(String.format(" Polecana inwestycja dla kwoty: %d to: %s", kwota, nazwa_inwestycji));
			 }
	  
}


