package zadanieklient2;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class HelloBean {

	List<Klient2> listaKlientow = new ArrayList<>();

	public Klient2 wezklienta(int nrKlienta) {
		listaKlientow.add(new Klient2("111111111111", "klient1", "NAZWISKO1"));
		listaKlientow.add(new Klient2("222222222222", "klient2", "NAZWISKO2"));
		listaKlientow.add(new Klient2("333333333333", "klient3", "NAZWISKO3"));
		listaKlientow.add(new Klient2("444444444444", "klient4", "NAZWISKO4"));
		return listaKlientow.get(nrKlienta);
	}
}
