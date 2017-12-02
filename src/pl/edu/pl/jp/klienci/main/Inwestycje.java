package pl.edu.pl.jp.klienci.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pl.edu.pl.jp.inwestycje.*;
public class Inwestycje {





	private static List<Inwestycja> inwestycje = new ArrayList<Inwestycja>();
	
	public static void main(String[] args) {
		inwestycje.add(new Lokata());
		inwestycje.add(new Fundusz());
		inwestycje.add(new Forex());
		
		inwestycje.add(new Lokata());
		inwestycje.add(new Fundusz());
		inwestycje.add(new Forex());
		
		Iterator<Inwestycja> it = inwestycje.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().wybrana_inwestycja());
			// polecane inwestycje - klasa factory
		}
	}
}