package prva_nedelja.petak.domaci_zadatak_petak.pisci;

import java.util.ArrayList;
import java.util.List;

public record Main() {
    public static void main(String[] args) {
        Knjiga knjiga = new Knjiga("Tako je govorio zaratustra", 300, 1885);
        Knjiga knjiga1 = new Knjiga("Vladalac", 295, 1513);
        Knjiga knjiga2 = new Knjiga("Vrli novi svet", 250, 1932);
        Knjiga knjiga3 = new Knjiga("Maslackovo vino", 501, 1957);
        Knjiga knjiga4 = new Knjiga("Dopler", 195, 2004);
        Knjiga knjiga5 = new Knjiga("Stranac", 157, 1942);

        ArrayList<Knjiga> knjige = new ArrayList<>();
        knjige.add(knjiga);
        knjige.add(knjiga1);
        knjige.add(knjiga2);
        knjige.add(knjiga3);
        knjige.add(knjiga4);
        knjige.add(knjiga5);

        Romanopisac romanopisac = new Romanopisac("Prljavi Inspekor Blaza", 1969, knjige);
        Esejista esejista = new Esejista("Zika Sarenica", 1973, knjige);
        Pesnik pesnik = new Pesnik("Zoran Kostic Cane", 1964, knjige);

        romanopisac.dugometrazniRoman();
        System.out.println(esejista.brojZbirki());
        System.out.println(pesnik.brojZbirki());
        System.out.println(romanopisac.najpoznatijaKnjiga());
        System.out.println(esejista.vremePisanja());


    }
}
