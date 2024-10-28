package druga_nedelja.domaci_zadatak_ponedeljak;

import java.util.ArrayList;
import java.util.List;

public abstract class Klub {
    private String naziv;
    private String grad;
    private List<Igrac> listaIgraca = new ArrayList<>();

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public List<Igrac> getListaIgraca() {
        return listaIgraca;
    }

    public void setListaIgraca(List<Igrac> listaIgraca) {
        this.listaIgraca = listaIgraca;
    }

    public Klub(String naziv, String grad, List<Igrac> listaIgraca) {
        setNaziv(naziv);
        setGrad(grad);
        setListaIgraca(listaIgraca);
    }

    public String najiskusnijiIgrac() {
        Igrac veteran = this.getListaIgraca().get(0);
        int size = this.getListaIgraca().size();

        for (int i = 1; i < size; i++) {
            if (this.getListaIgraca().get(i).getGodineIskustva() > veteran.getGodineIskustva()) {
                veteran = this.getListaIgraca().get(i);
            }
        }
        return veteran.getIme();
    }

    public int ukupnoPoena() {
        int suma = 0;
        int size = this.getListaIgraca().size();
        for (int i = 0; i < size; i++) {
            suma += this.getListaIgraca().get(i).getGodineIskustva();
        }
        return suma;
    }

    public abstract int vrednostTima();
}
