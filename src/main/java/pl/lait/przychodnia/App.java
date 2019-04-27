package pl.lait.przychodnia;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Witaj w programie PRZYCHODNIA");
        System.out.println("Zatrudniłeś/aś własnie pielęgniarkę Kasię");
        
        Pielegniarka kasia = new Pielegniarka("Kasia", "Pielęgniarka", 2250, 0);
        
        System.out.println("Dane naszego nowego pracownika to:");
        
        System.out.println(kasia.pokazDanePracownika());
        
        System.out.println("Nasza Kasia pracowała bardzo ciężko...");
        System.out.println("Przepracowała 99 godzin ekstra");
        int godzinkiKasi = 99;
        kasia.ustawNadgodziny(godzinkiKasi);
        System.out.println("Obecnie ma "
        		+ "na koncie: " + kasia.pobierzNadgodziny());
        System.out.println("Nasza Kasia pracowała jeszcze więcej");
        godzinkiKasi += 10;
        kasia.ustawNadgodziny(godzinkiKasi);
        System.out.println("Obecnie ma "
        		+ "na koncie: " + kasia.pobierzNadgodziny());
        System.out.println("Do przychodni dotarł Doktor Lubicz");
        Lekarz kanalia = new Lekarz("Doktor", "Lubicz", 8000, 800);
        System.out.println("Dane naszego doktorka "
        		+ "to: " + kanalia.pokazDanePracownika());
        System.out.println("A jego premia "
        		+ "to: " + kanalia.pobierzPremie());
        System.out.println("Gdyby ktoś zapłacił Kasi za nadgodziny"
        		+ " to zarobiłaby "
        		+ "w tym m-cu :" + kasia.doWyplaty());
    }
}
