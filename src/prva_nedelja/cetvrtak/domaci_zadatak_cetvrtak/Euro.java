package prva_nedelja.cetvrtak.domaci_zadatak_cetvrtak;

public class Euro extends Valuta {

    public Euro(double kurs) {
        super("Euro", "EUR");
        setKurs(kurs);
    }

    public double konvertujUDinare(double iznos) {
        return iznos * this.getKurs();
    }

    public void postaviKursNovi(double iznos) {
        setKurs(iznos);
    }
}
