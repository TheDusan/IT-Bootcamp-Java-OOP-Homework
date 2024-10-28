package oop_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pro extends Planinar {

    public Pro(List<Planina> planine, double maxUspon) {
        super(planine, maxUspon);
    }

    public List<Planina> izbaci() {
        Iterator<Planina> iterator = this.getPlanine().iterator();

        while (iterator.hasNext()) {
            Planina planina = iterator.next();
            if (planina.getVisina() > this.getMaxUspon()) {
                iterator.remove();
            }
        }
        return this.getPlanine();
    }
}
