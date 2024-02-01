package ke5;
import java.awt.*;
import java.awt.event.*;

public class View extends Frame {
	Modell m;

	public View() {
		this(new Modell());
	}

	public View(Modell m) {
		this.m = m;

		Controller aktualisiereView = new Controller(m, this);

		// definierte Klasse
		addWindowListener(new MeinWindowsListener());

		// Window Adapter als Objekt zur Reaktion auf Fenster -> Schlie�en
		// anonyme Klasse
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


		// Panel vorbereiten
		Panel p = new Panel();
		p.setLayout(new BorderLayout());

		// Buttons
		Panel buttonPanel = new Panel();
		buttonPanel.setLayout(new FlowLayout());
		Button incButton = new Button("   Erhoehe Fuellgrad   ");
		Button decButton = new Button(" Verringere Fuellgrad ");

		incButton.addActionListener(aktualisiereView);
		decButton.addActionListener(aktualisiereView);

		buttonPanel.add(incButton);
		buttonPanel.add(decButton);

		p.add(buttonPanel, BorderLayout.NORTH);

		Fuellgrad cs = new Fuellgrad(m);
		aktualisiereView.addListener(cs);
		p.add(cs, BorderLayout.CENTER);

		Panel exitPanel = new Panel();
		Button exitButton = new Button( " Beenden " );

		exitButton.addActionListener((a) -> {
		      System.out.println("registrierte Aktion" + a.getActionCommand());
		      System.exit(0);});
		exitPanel.add(exitButton, BorderLayout.CENTER);

		p.add(exitPanel, BorderLayout.SOUTH);

		this.add(p);
		this.pack();

		setTitle("ein sehr einfaches Fenster bzw. MVC Beispiel");
		this.setSize(400, 150);
		this.setLocation(300,300);
		this.setVisible(true);
	}
}

class MeinWindowsListener implements WindowListener {
	@Override
	public void windowClosing(WindowEvent e) {
		// System.exit(0);
		System.out.println("Fenster schließen");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Fenster wurde geoeffnet ...");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}
