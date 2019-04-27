package pl.lait.przychodnia;

public class Pracownik {

	private String imie;
	protected String nazwisko = "";
	protected int wynagrodzenie = 0;
	
	
	/*public Pracownik() {
		System.out.println("Wewnątrz konstruktora Pracownik");
	}*/
	public Pracownik(String imie, String nazwisko, int wynagrodzenie) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wynagrodzenie = wynagrodzenie;
	}
	
	public String pokazDanePracownika() {
		return imie + " " + nazwisko
				+ " " + wynagrodzenie;
	}
	
	
	
}
