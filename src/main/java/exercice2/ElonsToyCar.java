package exercice2;

public class ElonsToyCar {

    private int batterieRestante = 100;
    private int distance = 0;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return distance + " mètres parcourus";
    }

    public String batteryDisplay() {
        String message = "";
        if (batterieRestante > 0) {
            message = "Batterie chargée à " + batterieRestante + "%";
        } else {
            message = "Batterie vide";
        }
        return message;
    }

    public void drive() {
        if(batterieRestante >= 0) {
            this.distance += 20;
            this.batterieRestante -= 2;
        }
    }
}
