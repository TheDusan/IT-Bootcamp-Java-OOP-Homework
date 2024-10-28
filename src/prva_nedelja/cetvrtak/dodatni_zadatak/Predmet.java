package prva_nedelja.cetvrtak.dodatni_zadatak;

public class Predmet {
    private String nazivPredmeta;
    private int bodovi;
    private String imeProfesora;

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getBodovi() {
        return bodovi;
    }

    public void setBodovi(int bodovi) {
        this.bodovi = bodovi;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public Predmet(String nazivPredmeta, int bodovi, String imeProfesora) {
        setNazivPredmeta(nazivPredmeta);
        setBodovi(bodovi);
        setImeProfesora(imeProfesora);
    }

    public String opisPredmeta() {
        return this.getNazivPredmeta() + " " + this.getImeProfesora() + " " + this.getBodovi();
    }
}
