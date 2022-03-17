package sk.stuba.fei.uim.oop;


import sk.stuba.fei.uim.oop.zvierata.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zveri = new ArrayList<>(List.of(new Pes("Dunco"), new Macka("Murko"),
                new Pes("Luna"), new Macka("Garfield")));

        System.out.println(zveri);
        zveri.sort(new ZvieraComparator());
        System.out.println(zveri);

        zveri.sort((o1, o2) -> -o1.getMeno().compareTo(o2.getMeno()));
        System.out.println(zveri);
        zveri.sort(Comparator.comparing(Zviera::getMeno));
        System.out.println(zveri);
        }
    }


