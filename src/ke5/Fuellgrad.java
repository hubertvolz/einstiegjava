package ke5;
import java.awt.*;

public class Fuellgrad extends Canvas {
	private Modell m;

	public Fuellgrad() {
		this(new Modell());
	}

	public Fuellgrad(Modell m) {
		this.m = m;
		setPreferredSize(new Dimension( 100,30));
		setBackground(Color.WHITE);
	}

	@Override
	public void paint(Graphics g) {
		// da paint die Methode paint der Super-Klasse �berschreibt
		// und sich um die lokalen Aktivit�ten k�mmert
		// ist zur Aktualisierung der Komponenten aus der/den Super-Klasse(n)
		// der Aufruf der paint-Methode der Super-Klasse erforderlich
		super.paint(g);
		g.setColor(Color.BLACK);
		g.drawRect(100, 10, 100, 10);
		g.fillRect(100, 10, m.getFuellgrad(), 10);
	}
}
