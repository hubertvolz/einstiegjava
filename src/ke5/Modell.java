package ke5;

// sehr einfaches Modell eines Fortschrittbalkens in AWT
public class Modell {
	private int fuellgrad = 0;
	
	public void setFuellgrad(int wert) {
		if (wert < 0) {
			fuellgrad = 0;
		}
		else if (wert > 100) {
			fuellgrad = 100;
		}
		else
			fuellgrad = wert;
	}
	
	public int getFuellgrad() {
		return fuellgrad;
	}
	
	public boolean istVoll() {
		return fuellgrad == 100;
	}
	
	public boolean istLeer() {
		return fuellgrad == 0;
	}

	public int anpassenFuellgrad(int differenz) {
		setFuellgrad(fuellgrad + differenz);
		return getFuellgrad();
	}
}
