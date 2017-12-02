package pl.edu.pl.jp.klienci.main;

import pl.edu.pl.jp.inwestycje.*;


public abstract class _Decorator {
	
		public static void main(String[] args) {
			
			 int kwota = InwestycjaHelper.wczytajKwote();
			 String nazwa_inwestycji = InwestycjaHelper.nazwa_to_kwota(kwota);
			 InwestycjaHelper.wyswietl(kwota, nazwa_inwestycji);
		}
		
}