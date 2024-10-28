package oop_test;
/*
    Napraviti klasu Planina
atributi: naziv(String), visina(double ili int) i opasnost(Boolean)
 */
public class Planina {
    private String naziv;
    private double visina;
    private boolean opasnost;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public boolean isOpasnost() {
        return opasnost;
    }

    public void setOpasnost(boolean opasnost) {
        this.opasnost = opasnost;
    }

    public Planina(String naziv, double visina, boolean opasnost) {
        setNaziv(naziv);
        setVisina(visina);
        setOpasnost(opasnost);
    }

    @Override
    public String toString() {
        return "Planina{" +
                "naziv='" + naziv + '\'' +
                ", visina=" + visina +
                ", opasnost=" + opasnost +
                '}';
    }

}
