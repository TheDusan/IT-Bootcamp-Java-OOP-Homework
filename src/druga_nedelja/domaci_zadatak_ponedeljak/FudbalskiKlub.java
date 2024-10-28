package druga_nedelja.domaci_zadatak_ponedeljak;

import java.util.List;

public class FudbalskiKlub extends Klub {

    public FudbalskiKlub(String naziv, String grad, List<Igrac> listaIgraca) {
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

    public String najboljiStrelac() {
        Igrac golgeter = this.getListaIgraca().get(0);
        String imeGolgetera = this.getListaIgraca().get(0).getIme();
        int size = this.getListaIgraca().size();
        for (int i = 1; i < size; i++) {
            if (this.getListaIgraca().get(i).getBrojPostignutihPoena() > golgeter.getBrojPostignutihPoena()) {
                imeGolgetera = this.getListaIgraca().get(i).getIme();
            }
        }
        return imeGolgetera;
    }
}
