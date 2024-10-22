package exercice4;

public class Warrior extends Fighter {
    public Warrior() {
        super("Warrior", false);
    }

    public int damagePoints(Fighter wizard) {
        int pointInflige = wizard.isVulnerable() ? 10 : 6;
        wizard.point -= pointInflige;
        return pointInflige;
    }
}
