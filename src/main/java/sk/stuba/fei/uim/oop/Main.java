package sk.stuba.fei.uim.oop;


import sk.stuba.fei.uim.oop.zvierata.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zveri = new ArrayList<>(List.of(new Pes("Dunco"), new Macka("Murko")));

        Map<String, String> hlavneMesta = new HashMap<>();
        hlavneMesta.put("Slovensko", "Bratislava");
        hlavneMesta.put("Cesko", "Praha");
        hlavneMesta.put("Polsko", "Varsava");
        hlavneMesta.put("Madarsko", "Budapest");

       /* if(hlavneMesta.containsKey("Slovensko")){
        System.out.println(hlavneMesta.get("Slovensko"));
          hlavneMesta.remove("Slovensko");
            System.out.println(hlavneMesta);}*/

        System.out.println(hlavneMesta.size());

        if(hlavneMesta.containsKey("Slovensko")){
            hlavneMesta.remove("Slovensko");
        }
        System.out.println("------");
        for (String kluc : hlavneMesta.keySet()){
            System.out.println(kluc);
            System.out.println(hlavneMesta.get(kluc));
        }
        System.out.println("------");
        for (String hodnota : hlavneMesta.values()){
            System.out.println(hodnota);
        }
        System.out.println("------");
        System.out.println(hlavneMesta);
        hlavneMesta.clear();
        System.out.println(hlavneMesta);

        }
    }


