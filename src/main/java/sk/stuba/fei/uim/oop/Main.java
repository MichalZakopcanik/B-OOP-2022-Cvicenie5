package sk.stuba.fei.uim.oop;


import sk.stuba.fei.uim.oop.zvierata.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zveri = new ArrayList<>(List.of(new Pes("Dunco"), new Macka("Murko"),
                new Pes("Luna"), new Macka("Garfield")));

        System.out.println(zveri);
        zveri.sort(null);
        System.out.println(zveri);
    }
    }


