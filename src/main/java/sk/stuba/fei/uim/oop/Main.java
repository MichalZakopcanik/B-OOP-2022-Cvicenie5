package sk.stuba.fei.uim.oop;


import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Zviera> zveri = new ArrayList<>();
        zveri.add(new Pes("Dunco"));
        zveri.add(new Macka("Murko"));

        for (var zver : zveri){
            kontrola(zver);
        }
    }

    private static void kontrola(Zviera zver){
        if (zver instanceof Pes){
            System.out.println("Je to pes");
        } else {
            throw new IllegalArgumentException("Nie je to pes");
        }
    }
}
