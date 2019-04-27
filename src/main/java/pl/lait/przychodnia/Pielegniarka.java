package pl.lait.przychodnia;

public class Pielegniarka extends Pracownik{
	
	private int nadgodziny;
	
	public Pielegniarka(String imie, String nazwisko, int wynagrodzenie, int nadgodziny) {
		super(imie, nazwisko, wynagrodzenie);
		this.nadgodziny = nadgodziny;
	}
	public void ustawNadgodziny(int godzinki) {
		this.nadgodziny = godzinki;
	}
	public int pobierzNadgodziny() {
		
		
		
		return this.nadgodziny;
		
	}
	public int doWyplaty() {
		int stawkaGodzinowa = this.wynagrodzenie/160;
		int wartoscNadgodzin = this.nadgodziny*stawkaGodzinowa;
		return this.wynagrodzenie+wartoscNadgodzin;
	}
	
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
		
	}

}
