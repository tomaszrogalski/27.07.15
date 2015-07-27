package zadanieklient2;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.json.JSONException;
import org.json.JSONObject;

public class DodajKlientIndywidualny extends JFrame {

	public DodajKlientIndywidualny() throws IOException, JSONException {
		super("indywidualny");

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
		Label pesel = new Label();

		imie.setText("imie");
		nazwisko.setText("nazwisko");
		pesel.setText("pesel");

		TextField timie = new TextField();
		TextField tnazwisko = new TextField();
		TextField tpesel = new TextField();

		gora.setLayout(new GridLayout(2, 1));
		srodek.setLayout(new GridLayout(3, 2));
		dol.setLayout(new GridLayout(1, 1));

		srodek.add(imie);
		srodek.add(timie);
		srodek.add(nazwisko);
		srodek.add(tnazwisko);
		srodek.add(pesel);
		srodek.add(tpesel);

		dol.add(textArea);

		Dodaj.addActionListener(new ActionListener() {
			List<String> lista = funkcja();

			@Override
			public void actionPerformed(ActionEvent e) {
//				KlientIndywidualny nazwa = new KlientIndywidualny(lista.get(0),lista.get(2),
//						lista.get(1));
//				textArea.append(nazwa.toString());
				
				timie.getText();
				KlientIndywidualny nazwa = new KlientIndywidualny(timie.getText(), tnazwisko.getText(),
						tpesel.getText());
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

	public List<String> funkcja() throws IOException, JSONException {
		List<String> listaaa = new ArrayList<>();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		URL restServiceURL = new URL("http://localhost:8080/cwiczenia/zadanie/klient/print/1");
		HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
		httpConnection.setRequestMethod("GET");
		httpConnection.setRequestProperty("Accept", "application/json");

		BufferedReader responseBuffer = new BufferedReader(new InputStreamReader((httpConnection.getInputStream())));
		String output = "";
		System.out.println("Output from Server:  \n");
		while ((output = responseBuffer.readLine()) != null) {
			output += output;
			System.out.println(output);
		}
		System.out.println(output);
		httpConnection.disconnect();
		System.out.println(output);
		JSONObject jsonobject = new JSONObject(output);
		String imie = jsonobject.getString("imie");
		String pesel = jsonobject.getString("pesel");
		String nazwisko = jsonobject.getString("nazwisko");
		System.out.println(imie + " " + pesel + " " + nazwisko);
		///////////////////////////////////////////
		// listaaa.add(imie);
		// listaaa.add(pesel);
		// listaaa.add(nazwisko);
		////////////////////////////////////////////
		return listaaa;
	}
}

class KlientIndywidualny extends Klient {

	private String pesel;

	public KlientIndywidualny(String imie, String nazwisko, String pesel) {
		super(imie, nazwisko);
		this.pesel = pesel;
	}

	@Override
	public String toString() {

		return "Imie: " + super.getImie() + " Nazwisko: " + super.getNazwisko() + " Pesel: " + pesel + "\n";
	}
}