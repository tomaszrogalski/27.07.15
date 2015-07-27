package zadanie3;

import java.awt.Label;
import java.awt.TextField;

public class Indywidualny extends Start {

	public Indywidualny(String title) {
		setTitle(title);

		TextField tpesel = new TextField();
		setLocation(400, 400);
		Label pesel = new Label();

		pesel.setText("pesel");

		add(pesel);

		add(tpesel);

	}
}
