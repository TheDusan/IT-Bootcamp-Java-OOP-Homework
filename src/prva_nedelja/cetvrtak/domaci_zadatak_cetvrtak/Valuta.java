package prva_nedelja.cetvrtak.domaci_zadatak_cetvrtak;

public class Valuta {
    private String naziv;
    private String simbol;
    private double kurs;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public Valuta(String naziv, String simbol) {
        setNaziv(naziv);
        setSimbol(simbol);
    }

    public double konvertujUDinare(double iznos) {
        return 0; // posto je osnovna klasa, nemam sta da racunam, override-ovacu u klasama-naslednicama
    }

    @Override
    public String toString() {
        return "Valuta{" +
                "naziv='" + naziv + '\'' +
                ", simbol='" + simbol + '\'' +
                ", kurs=" + kurs +
                '}';
    }
}
