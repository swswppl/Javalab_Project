package main.java.InwFactoryMethod;
import main.java.inwestycje.*;
public class InwestycjaFactoryWethod {
	
	public InwestycjaFactoryWethod() {}
	
	public Lokata makeLokata() {
		return new Lokata();
	}
	
	public Fundusz makeFundusz() {
		return new Fundusz();
	}
	
	public Forex makeForex() {
		return new Forex();
	}
}
