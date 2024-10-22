package exercice10;

import java.util.Objects;

public class Box1<T extends Number> implements Comparable<Box1<T>> {

    private T valeurGenerique;

    public Box1(T valeurGenerique) {
        this.valeurGenerique = valeurGenerique;
    }


    public T getValeurGenerique() {
        return valeurGenerique;
    }


    @Override
    public int compareTo(Box1<T> o) {
        if (o == null) throw new NullPointerException();
        return 1;
    }
}
