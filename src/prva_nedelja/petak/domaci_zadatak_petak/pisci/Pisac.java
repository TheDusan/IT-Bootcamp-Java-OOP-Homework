package prva_nedelja.petak.domaci_zadatak_petak.pisci;

import java.util.ArrayList;
import java.util.List;

public abstract class Pisac { // nigde nije naglaseno da bi trebalo da bude apstrakna klasa
    private String ime;
    private int godinaRodjenja;
    private ArrayList<Knjiga> knjige;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public List<Knjiga> getKnjige() {
        return knjige;
    }

    public void setKnjige(ArrayList<Knjiga> knjige) {
        this.knjige = knjige;
    }

    public Pisac(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige) {
        this.ime = ime;
        this.godinaRodjenja = godinaRodjenja;
        this.knjige = knjige;
    }

    public Knjiga najpoznatijaKnjiga() {
        Knjiga najveca = this.getKnjige().get(0);
        int limit = this.getKnjige().size(); // da se ne racuna svaki put kada se zavrti petlja

        for (int i = 1; i < limit; i++)
        if (this.getKnjige().get(i).getBrojStrana() > najveca.getBrojStrana()) {
            najveca = this.getKnjige().get(i);
        }
        return najveca;
    }

    public int vremePisanja() {
        if (this.knjige.isEmpty()) {
            return 0;
        }

        int prvaGodina = Integer.MAX_VALUE;
        int poslednjaGodina = Integer.MIN_VALUE;

        for (Knjiga knjiga : this.getKnjige()) {
            int godinaIzdavanja = knjiga.getGodinaIzdavanja();
            if (godinaIzdavanja < prvaGodina) {
                prvaGodina = godinaIzdavanja;
            }
            if (godinaIzdavanja > poslednjaGodina) {
                poslednjaGodina = godinaIzdavanja;
            }
        }

        return poslednjaGodina - prvaGodina;
    }
}
