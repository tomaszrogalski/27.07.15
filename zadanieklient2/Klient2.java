package zadanieklient2;

public class Klient2 {

	private String pesel;
	private String imie;
	private String nazwisko;

	

	public Klient2(String pesel, String imie, String nazwisko) {
		super();
		this.pesel = pesel;
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
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
