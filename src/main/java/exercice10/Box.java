package exercice10;

import java.util.Objects;

public class Box<T extends Comparable> implements Comparable<Box<T>> {



    private T valeurGenerique;

    public Box(T valeurGenerique) {
        this.valeurGenerique = valeurGenerique;
    }

    public T getValeurGenerique() {
        return valeurGenerique;
    }

    @Override
    public int compareTo(Box<T> o) {
        if (o == null) throw new NullPointerException();
        return this.getValeurGenerique().compareTo(o.getValeurGenerique());
    }


}
