package zadanieklient2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.json.JSONException;

public class Start2 extends JFrame {

	public static void main(String[] args) {
		Start2 start2 = new Start2();

	}

	public Start2() {
		super("MENU2");

		JTextArea textArea = new JTextArea(5, 5);
		setSize(400, 600);
		setLocation(400, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		JButton klientInstytucja = new JButton();
		JButton klientIndywidualny = new JButton();

		klientInstytucja.setText("klient Instytucja");
		klientIndywidualny.setText("klient Indywidualny");
		setLayout(new GridLayout(2, 1));
		JPanel gora = new JPanel();
		JPanel dol = new JPanel();
		gora.setLayout(new GridLayout(2, 1));
		gora.add(klientInstytucja);
		gora.add(klientIndywidualny);

		klientIndywidualny.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					DodajKlientIndywidualny ruszaj = new DodajKlientIndywidualny();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		klientInstytucja.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DodajKlientaInstytucja ruszaj2 = new DodajKlientaInstytucja();
			}
		});

		add(gora);
		add(dol);

	}
}

abstract class Klient {

	private String imie;
	private String nazwisko;

	public Klient(String imie, String nazwisko) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
}
