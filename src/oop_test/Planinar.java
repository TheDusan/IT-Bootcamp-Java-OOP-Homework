package oop_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Napraviti klasu Planinar
atributi:lista planina, max uspon(maksimalna visina na koju taj planinar moze da se popne)
 */
public class Planinar {
    private List<Planina> planine;
    private double maxUspon;

    public List<Planina> getPlanine() {
        return planine;
    }

    public void setPlanine(List<Planina> planine) {
        this.planine = planine;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(double maxUspon) {
        this.maxUspon = maxUspon;
    }

    public Planinar(List<Planina> planine, double maxUspon) {
        setPlanine(planine);
        setMaxUspon(maxUspon);
    }

    @Override
    public String toString() {
        return "Planinar{" +
                "planine=" + planine +
                ", maxUspon=" + maxUspon +
                '}';
    }
    // dodaj(Planina p) -> ubacuje datu planinu u listu ukoliko je njena visina manja ili jednaka max usponu
    public void dodaj(Planina p) {
        if (p.getVisina() <= this.maxUspon) {
            this.planine.add(p);
            System.out.printf("Planina %s uspesno dodata u listu!\n", p.getNaziv());
        } else {
            System.out.printf("Planina %s nije dodata u listu jer je visina veća od maksimalnog uspona.\n", p.getNaziv());
        }
    }

    // opasne() -> metoda vraca listu planina koje su opasne za penjanje
    public List opasne() {
        List<Planina> opasnePlanine = new ArrayList<>();
        for (Planina p : this.getPlanine()) {
            if (p.isOpasnost()) {
                opasnePlanine.add(p);
            }
        }
        return opasnePlanine;
    }

    // izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog planinara ili ako je opasna
    public List<Planina> izbaci() {
        Iterator<Planina> iterator = this.planine.iterator();

        while (iterator.hasNext()) {
            Planina planina = iterator.next();
            if (planina.getVisina() > this.getMaxUspon() || planina.isOpasnost()) {
                iterator.remove();
            }
        }
        return this.getPlanine();
    }

    // najveca()-> vraca najvecu planinu iz planinarove liste

    public Planina najveca() {
        Planina najveca = null;

        for (Planina p : this.getPlanine()) {
            if (najveca == null || najveca.getVisina() < p.getVisina()) {
                najveca = p;
            }
        }
        return najveca;
    }

    // dodatna metoda za stampanje liste planina
    public void stampajPlanine() {
        for (Planina p : this.getPlanine()) {
            System.out.println(p);
        }
    }
}
