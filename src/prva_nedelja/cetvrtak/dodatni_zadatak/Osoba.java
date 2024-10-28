package prva_nedelja.cetvrtak.dodatni_zadatak;

public class Osoba {
    private String ime;
    private String prezime;
    private int godinaRodjenja;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public Osoba(String ime, String prezime, int godinaRodjenja) {
        setIme(ime);
        setPrezime(prezime);
        setGodinaRodjenja(godinaRodjenja);
    }

    public void predstaviSe() {
        System.out.printf("Moje ime je %s %s i rodjen sam %d\n", this.getIme(), this.getPrezime(), this.getGodinaRodjenja());
    }
}
