package oop_test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Planina> planine = new ArrayList<>();

        Planina planina = new Planina("Mount Kosciuszko", 2228, true);
        Planina planina2 = new Planina("Ball's Pyramid", 561, false);
        Planina planina3 = new Planina("Mount Ossa", 1617, true);
        Planina planina4 = new Planina("Mount Dissapointment", 800, true);

        planine.add(planina);
        planine.add(planina2);
        planine.add(planina3);
        planine.add(planina4);

        Planinar rekreativac = new Planinar(planine, 1000);
        /*
        rekreativac.stampajPlanine();
        System.out.println();
        rekreativac.dodaj(new Planina("Barn Bluff", 1545, true));
        rekreativac.stampajPlanine();

         */

        /*
        List<Planina> opasneZaRek = rekreativac.opasne();

        for (Planina p : opasneZaRek) {
            System.out.println(p);
        }

         */


        // System.out.println(rekreativac.najveca());

        /*
        rekreativac.stampajPlanine();
        rekreativac.izbaci();
        System.out.println();
        rekreativac.stampajPlanine();

         */

        Pro pro = new Pro(planine, 1500);
        pro.stampajPlanine();
        pro.izbaci();
        System.out.println();
        pro.stampajPlanine();

    }
}
