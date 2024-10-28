package prva_nedelja.cetvrtak.domaci_zadatak_cetvrtak;

public class Main {
    public static void main(String[] args) {
        Valuta euro = new Euro(117.5);
        Valuta dolar = new Dolar(102.3);

        System.out.println(euro);
        System.out.println(dolar);
        System.out.println(dolar.konvertujUDinare(100));
        System.out.println(euro.konvertujUDinare(100));

        euro.setKurs(118);
        dolar.setKurs(100);
        System.out.println(euro);
        System.out.println(dolar);
        System.out.println(euro.konvertujUDinare(100));
        System.out.println(dolar.konvertujUDinare(100));

    }
}