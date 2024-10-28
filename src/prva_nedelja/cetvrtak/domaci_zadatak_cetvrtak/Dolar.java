package prva_nedelja.cetvrtak.domaci_zadatak_cetvrtak;

public class Dolar extends Valuta {
    public Dolar(double kurs) {
        super("Dolar", "USD");
        setKurs(kurs);
    }

    @Override
    public double konvertujUDinare(double iznos) {
        return iznos * this.getKurs();
    }

    public void postaviNoviKurs(double kurs) {
        setKurs(kurs);
    }
}
