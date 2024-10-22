package exercice4;

public class Wizard extends Fighter {

    boolean hasSort = false;

    public Wizard() {
        super("Wizard", true);
    }

    public void prepareSpell() {
        this.hasSort = true;
        super.setVulnarable(false);
    }

    public int damagePoints(Fighter warrior) {
        int pointInflige = hasSort ? 12 : 3;
        warrior.point -= pointInflige;
        return pointInflige;
    }
}
