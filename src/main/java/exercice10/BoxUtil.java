package exercice10;

public class BoxUtil<T extends Comparable<T>> {

    public void getValueOfT(Box<T> t) {
        System.out.printf(t.getValeurGenerique() + "\n");
    }
}
