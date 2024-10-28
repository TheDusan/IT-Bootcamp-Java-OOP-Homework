package prva_nedelja.ponedeljak.domaci_zadatak;

public class BankovniRacun {
    int brojRacuna;
    String imeVlasnika;
    double stanje;

    public BankovniRacun(int brojRacuna, String imeVlasnika, double stanje) {
        this.brojRacuna = brojRacuna;
        this.imeVlasnika = imeVlasnika;
        this.stanje = stanje;
    }

    public void uplata(double iznos) {
        if (iznos > 0) {
            stanje += iznos;
            System.out.printf("Uplata izvrsena. Novo stanje: %.2f dinara", this.stanje);
        } else {
            System.out.println("Iznos uplate mora biti pozitivan");
        }
    }

    public void isplata(double iznos) {
        if (iznos > 0) {
            if (stanje >= iznos) {
                stanje -= iznos;
                System.out.printf("Transakcija uspesno obavljena. Stanje na racunu iznosi %.2f dinara\n", this.stanje);
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
                "brojRacuna=" + this.brojRacuna +
                ", imeVlasnika='" + this.imeVlasnika + '\'' +
                ", stanje=" + this.stanje;
    }
}
