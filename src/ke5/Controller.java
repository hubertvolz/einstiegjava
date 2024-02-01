package ke5;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Controller implements ActionListener {
	// Verwaltung der registrierten Beobachter
	private java.util.List<Component> listener = new ArrayList<Component>();

	private Modell m;
	private View v;

	public Controller(Modell m, View v) {
		this.m = m;
		this.v = v;
	}

	void addListener(Component c) {
		listener.add(c);
	}

	public void actionPerformed(ActionEvent ae) {
		// Event kann nur von Button ausgel�st werden
		// ur Unterscheidung die Beschriftung des Buttons auslesen
		String quelle = ((Button)ae.getSource()).getLabel();

		if (quelle.compareTo("   Erhoehe Fuellgrad   ") == 0) {
			m.anpassenFuellgrad(+1);
		}
		else
			if (quelle.compareTo(" Verringere Fuellgrad ") == 0) {
				m.anpassenFuellgrad(-1);
			}

		// alle registrierten Beobachter (Komponenten) informieren,
		// d.h. in diesem Fall das Neuzeichnen ausl�sen
		for (Component v : listener) {
			v.repaint();
		}
	}
}
