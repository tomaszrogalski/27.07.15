package zadanieklient2;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DodajKlientaInstytucja extends JFrame {

	public DodajKlientaInstytucja() {
		super("instytucja");

		JTextArea textArea = new JTextArea(5, 5);
		setSize(400, 600);
		setLocation(400, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		JButton Dodaj = new JButton();
		JButton Cofnij = new JButton();

		Dodaj.setText("Dodaj");
		Cofnij.setText("Cofnij");
		setLayout(new GridLayout(3, 1));

		JPanel gora = new JPanel();
		JPanel srodek = new JPanel();
		JPanel dol = new JPanel();

		Label imie = new Label();
		Label nazwisko = new Label();
		Label nip = new Label();

		imie.setText("imie");
		nazwisko.setText("nazwisko");
		nip.setText("nip");

		TextField timie = new TextField();
		TextField tnazwisko = new TextField();
		TextField tnip = new TextField();

		gora.setLayout(new GridLayout(2, 1));
		srodek.setLayout(new GridLayout(3, 2));
		dol.setLayout(new GridLayout(1, 1));

		srodek.add(imie);
		srodek.add(timie);
		srodek.add(nazwisko);
		srodek.add(tnazwisko);
		srodek.add(nip);
		srodek.add(tnip);

		dol.add(textArea);

		Dodaj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				timie.getText();
				KlientInstytucja nazwa = new KlientInstytucja(timie.getText(), tnazwisko.getText(), tnip.getText());
				textArea.append(nazwa.toString());
			}
		});

		Cofnij.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Start2 start2 = new Start2();
			}
		});

		gora.add(Dodaj);
		gora.add(Cofnij);

		add(gora);
		add(srodek);
		add(dol);
	}
}

class KlientInstytucja extends Klient {

	private String nip;

	public KlientInstytucja(String imie, String nazwisko, String nip) {
		super(imie, nazwisko);
		this.nip = nip;
	}

	@Override
	public String toString() {

		return "Imie: " + super.getImie() + " Nazwisko: " + super.getNazwisko() + " Nip: " + nip + "\n";
	}
}