package exercice4;

public abstract class Fighter {

    protected boolean vulnarable;
    protected int point;
    String type;

    public Fighter(String type, boolean isVulnarable) {
        this.vulnarable = isVulnarable;
        this.point = 60;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Le combattant est un " + type;
    }

    public boolean isVulnerable() {
        return vulnarable;
    }

    public void setVulnarable(boolean vulnarable) {
        this.vulnarable = vulnarable;
    }

    public abstract int damagePoints(Fighter fighter);
}
