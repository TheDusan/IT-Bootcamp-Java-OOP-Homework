package druga_nedelja.domaci_zadatak_ponedeljak;

import java.util.ArrayList;
import java.util.List;

public class KosarkaskiKlub extends Klub {

    public KosarkaskiKlub(String naziv, String grad, List<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    @Override
    public int vrednostTima() {
        int ukupnoPoena = 0;

        for (Igrac igrac : this.getListaIgraca()) {
            ukupnoPoena += igrac.getBrojPostignutihPoena();
        }

        return ukupnoPoena * 50;
    }

    public ArrayList<Igrac> sampionTima() { // ako imamo vise igraca sa 1000 postignutih poena
        ArrayList<Igrac> rekorderi = new ArrayList<>();

        for (Igrac igrac : this.getListaIgraca()) {
            if (igrac.getBrojPostignutihPoena() > 1000) {
                rekorderi.add(igrac);
            }
        }
        return rekorderi;
    }
}
