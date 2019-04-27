package pl.lait.przychodnia;

public class Lekarz extends Pracownik {
	
	private int premia;
	
	public Lekarz(String imie, String nazwisko, 
			int wynagrodzenie, int premia) {
		
		super(imie,nazwisko,wynagrodzenie);
		this.premia = premia;
	}
	
	public void ustawPremie(int nowaPremia) {
		this.premia = nowaPremia;
	}
	public int pobierzPremie() {
		return this.premia;
	}

}
