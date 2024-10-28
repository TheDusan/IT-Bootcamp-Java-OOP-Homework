package prva_nedelja.petak.domaci_zadatak_petak.pisci;

import java.util.ArrayList;

public class Pesnik extends Pisac {

    public Pesnik(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige) {
        super(ime, godinaRodjenja, knjige);
    }

    public int brojZbirki() {
        int brojac = 0;

        for (Knjiga k : this.getKnjige()) {
            if (k.getBrojStrana() < 100) {
                brojac++;
            }
        }
        return brojac;
    }
}
