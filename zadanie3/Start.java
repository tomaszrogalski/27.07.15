package zadanie3;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;

public class Start extends JFrame {

	// int x=3;
	public static void main(String[] args) {
		Indywidualny indywidualny = new Indywidualny("Indywidualny");
		Instytucja instytucja = new Instytucja("Isntytucja");

	}

	// static{
	// System.out.println("blok statyczny nadklasy");
	//
	// }

	public Start() {
		// System.out.println("niestatyczny nadklasa");
		setSize(600, 200);
		setLocation(400, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		setLayout(new GridLayout(3, 1));

		TextField timie = new TextField();
		TextField tnazwisko = new TextField();

		Label imie = new Label();
		Label nazwisko = new Label();

		imie.setText("imie");
		nazwisko.setText("nazwisko");

		add(imie);
		add(timie);
		add(nazwisko);
		add(tnazwisko);
	}
}
