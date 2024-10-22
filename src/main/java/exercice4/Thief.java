package exercice4;

public interface Thief {

    default boolean canSteal() {
        return true;
    }
}
