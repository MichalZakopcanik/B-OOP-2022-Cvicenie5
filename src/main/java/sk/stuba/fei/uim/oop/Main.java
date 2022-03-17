package sk.stuba.fei.uim.oop;


import sk.stuba.fei.uim.oop.zvierata.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zveri = new ArrayList<>(List.of(new Pes("Dunco"), new Macka("Murko"),
                new Pes("Luna"), new Macka("Garfield")));

            zveri.stream().forEach(System.out::println);

            List<Zviera> zveri2 = zveri.stream().collect(Collectors.toList());

            zveri2 = zveri2.stream()
                    .sorted((o1, o2) -> o1.getMeno().compareTo(o2.getMeno()))
                    .collect(Collectors.toList());

            System.out.println("----");
            zveri2.stream().forEach(System.out::println);

            String[] mena = zveri2.stream()
                    .map(zviera -> zviera.getMeno())
                    .toArray(String[]::new);

            Stream.of(mena).forEach(System.out::println);
            System.out.println("---");

            List<Pes> psi = zveri.stream()
                    .filter(zviera -> zviera instanceof Pes)
                    .map(pes -> (Pes) pes)
                    .collect(Collectors.toList());
            psi.forEach(System.out::println);

        System.out.println("----");
        List<Macka> macky = Stream.generate(() -> new Macka("Murko")).limit(5).collect(Collectors.toList());
        System.out.println(macky);
        }
    }


