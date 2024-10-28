package prva_nedelja.utorak.domaci_zadatak_sreda;

public class BankovniRacun {
    private int brojRacuna;
    private String imeVlasnika;
    private double stanje;

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeVlasnika() {
        return this.imeVlasnika;
    }

    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    public double getStanje() {
        return stanje;
    }

    public void setStanje(double stanje) {
        this.stanje = stanje;
    }

    public BankovniRacun(int brojRacuna, String imeVlasnika, double stanje) {
        setBrojRacuna(brojRacuna);
        setImeVlasnika(imeVlasnika);
        setStanje(stanje);
    }

    public void uplata(double iznos) {
        if (iznos > 0) {
            setStanje(this.getStanje() + iznos);
            System.out.printf("Uplata izvrsena. Novo stanje: %.2f dinara", this.getStanje());
        } else {
            System.out.println("Iznos uplate mora biti pozitivan");
        }
    }

    public void isplata(double iznos) {
        if (iznos > 0) {
            if (this.getStanje() >= iznos) {
                setStanje(this.getStanje() - iznos);
                System.out.printf("Transakcija uspesno obavljena. Stanje na racunu iznosi %.2f dinara\n", this.getStanje());
            } else {
                System.out.println("Nemate dovoljno sredstava na racunu za uspesno obavljanje transakcije");
            }
        } else {
            System.out.println("Uneti iznos mora biti pozitivan");
        }
    }

    @Override
    public String toString() {
        return
                "brojRacuna=" + this.getBrojRacuna() +
                ", imeVlasnika='" + this.getImeVlasnika() + '\'' +
                ", stanje=" + this.getStanje();
    }
}
