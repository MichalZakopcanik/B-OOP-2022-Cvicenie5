package sk.stuba.fei.uim.oop.zvierata;

public abstract class Zviera implements Comparable<Zviera> {
    protected String meno;

    public Zviera(String meno) {
        this.meno = meno;
    }

    public abstract void zvukZvierata();


    public void pohladkat(){
        System.out.println(this.meno + " bol pohladkany");
        this.zvukZvierata();
    }
    public String getMeno() {
        return meno;
    }

    @Override
    public String toString() {
        return this.meno;
    }

    @Override
    public int compareTo(Zviera o) {
        return this.meno.compareTo(o.getMeno());
    }
}
