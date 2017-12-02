package pk.edu.pl.InwFactoryMethod;
import pl.edu.pl.jp.inwestycje.*;
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
/*
package pk.dydakt.to.dp.c.gof.factorymethod;

import pk.dydakt.to.dp.c.gof.soups.*;

class SoupFactoryMethod {
    public SoupFactoryMethod() {}
        
    public SoupBuffet makeSoupBuffet() {
        return new SoupBuffet();
    }

    public ChickenSoup makeChickenSoup() {
        return new ChickenSoup();
    }
    public ClamChowder makeClamChowder() {
        return new ClamChowder();
    }
    public FishChowder makeFishChowder() {
        return new FishChowder();
    }
    public Minnestrone makeMinnestrone() {
        return new Minnestrone();
    }
    public PastaFazul makePastaFazul() {
        return new PastaFazul();
    }
    public TofuSoup makeTofuSoup() {
        return new TofuSoup();
    }
    public VegetableSoup makeVegetableSoup() {
        return new VegetableSoup();
    }

    public String makeBuffetName() {
        return "Soup Buffet";
    }
}
*/