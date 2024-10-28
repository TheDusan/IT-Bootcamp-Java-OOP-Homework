package druga_nedelja.domaci_zadatak_ponedeljak;

public class Igrac {
    private String ime;
    private int godineIskustva;
    private int brojPostignutihPoena;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public int getBrojPostignutihPoena() {
        return brojPostignutihPoena;
    }

    public void setBrojPostignutihPoena(int brojPostignutihPoena) {
        this.brojPostignutihPoena = brojPostignutihPoena;
    }

    public Igrac(String ime, int godineIskustva, int brojPostignutihPoena) {
        setIme(ime);
        setGodineIskustva(godineIskustva);
        setBrojPostignutihPoena(brojPostignutihPoena);
    }

    @Override
    public String toString() {
        return "Igrac{" +
                "ime='" + ime + '\'' +
                ", godineIskustva=" + godineIskustva +
                ", brojPostignutihPoena=" + brojPostignutihPoena +
                '}';
    }
}
