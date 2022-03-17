package sk.stuba.fei.uim.oop.zvierata;


import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ZvieraComparator implements Comparator<Zviera> {
    @Override
    public int compare(Zviera o1, Zviera o2) {
        return o1.getMeno().compareTo(o2.getMeno());
    }

    @Override
    public Comparator<Zviera> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Zviera> thenComparing(Comparator<? super Zviera> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Zviera> thenComparing(Function<? super Zviera, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Zviera> thenComparing(Function<? super Zviera, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Zviera> thenComparingInt(ToIntFunction<? super Zviera> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Zviera> thenComparingLong(ToLongFunction<? super Zviera> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Zviera> thenComparingDouble(ToDoubleFunction<? super Zviera> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
