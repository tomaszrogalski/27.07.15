package zadanie3;

import java.awt.Label;
import java.awt.TextField;

public class Instytucja extends Start {
	static{
//		System.out.println("blok statyczny podklasy");
	}
	public Instytucja(String title) {
		setTitle(title);

//		System.out.println("niestatyczny podklasa");
		TextField tnip = new TextField();

		Label nip = new Label();

		nip.setText("nip");

		add(nip);

		add(tnip);
	}
}
