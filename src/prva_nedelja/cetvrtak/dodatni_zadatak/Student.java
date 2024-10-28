package prva_nedelja.cetvrtak.dodatni_zadatak;

import java.util.List;

public class Student extends Osoba {
    private List<Predmet> listaPredmeta;
    private String brojIndeksa;
    private double prosekOcena;

    public List<Predmet> getListaPredmeta() {
        return listaPredmeta;
    }

    public void setListaPredmeta(List<Predmet> listaPredmeta) {
        this.listaPredmeta = listaPredmeta;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public double getProsekOcena() {
        return prosekOcena;
    }

    public void setProsekOcena(double prosekOcena) {
        this.prosekOcena = prosekOcena;
    }

    public Student(String ime, String prezime, int godinaRodjenja, List<Predmet> listaPredmeta, String brojIndeksa, double prosekOcena) {
        super(ime, prezime, godinaRodjenja);
        setListaPredmeta(listaPredmeta);
        setBrojIndeksa(brojIndeksa);
        setProsekOcena(prosekOcena);
    }

    public void dodajPredmet(Predmet predmet) {
        listaPredmeta.add(predmet);
        System.out.println("Predmet uspesno dodat!");
    }

    public void ispisPredmeta() {
        for (Predmet p : listaPredmeta) {
            System.out.println(p.opisPredmeta());
        }
    }

    @Override
    public void predstaviSe() {
        super.predstaviSe();
        System.out.printf("Broj indeksa: %d");
    }
}
