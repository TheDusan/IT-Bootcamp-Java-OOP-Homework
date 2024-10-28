package druga_nedelja.domaci_zadatak_ponedeljak;

import java.util.ArrayList;
import java.util.List;

public class OdbojkaskiKlub extends Klub {

    public OdbojkaskiKlub(String naziv, String grad, List<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    @Override
    public int vrednostTima() {
        int ukupnoPoena = 0;

        for (Igrac igrac : this.getListaIgraca()) {
            ukupnoPoena += igrac.getBrojPostignutihPoena();
        }

        return ukupnoPoena * 1000;
    }

    public Igrac odbrambeniAs() {
        Igrac defanzivac = null;
        List<Igrac> listaIgraca = this.getListaIgraca();

        for (Igrac igrac : listaIgraca) {
            if (igrac.getGodineIskustva() < 3) {
                if (defanzivac == null || igrac.getBrojPostignutihPoena() > defanzivac.getBrojPostignutihPoena()) {
                    defanzivac = igrac;
                }
            }
        }
        return defanzivac;
    }


}
