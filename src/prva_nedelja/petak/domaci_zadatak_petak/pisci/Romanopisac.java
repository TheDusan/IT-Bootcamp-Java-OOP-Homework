package prva_nedelja.petak.domaci_zadatak_petak.pisci;

import java.util.ArrayList;

public class Romanopisac extends Pisac {
    public Romanopisac(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige) {
        super(ime, godinaRodjenja, knjige);
    }

    public void dugometrazniRoman() {
        for (Knjiga k : this.getKnjige()) {
            if (k.getBrojStrana() > 500) {
                System.out.println(k + " je dugometrazni roman");
            }
        }
    }
}
