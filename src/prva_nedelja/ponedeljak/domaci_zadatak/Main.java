package prva_nedelja.ponedeljak.domaci_zadatak;

public class Main {
    public static void main(String[] args) {
        BankovniRacun bankovniRacun = new BankovniRacun(12345, "John Locke", 1000);

        System.out.println(bankovniRacun.toString());

        bankovniRacun.uplata(500.00);
        bankovniRacun.uplata(-100.00);

        bankovniRacun.isplata(200.00);
        bankovniRacun.isplata(2000.00);
        bankovniRacun.isplata(-50.00);

        System.out.println(bankovniRacun.toString());
    }
}

