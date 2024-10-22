package exercice1;

public class Lasagna {
    private int minutesNecessaire;

    public Lasagna(int minutesNecessaire) {
        this.minutesNecessaire = minutesNecessaire;
    }

    public int expectedMinutesInOven() {
        return minutesNecessaire;
    }

    public int remainingMinutesInOven(int minutesPasseeAuFour) {
        return minutesNecessaire - minutesPasseeAuFour;
    }

    public int preparationTimeInMinutes(int nbreCouche) {
        return nbreCouche*2;
    }

    public int totalTimeInMinutes(int nbreCouche, int minutesPasseeAuFour) {
        return minutesPasseeAuFour + nbreCouche*2;
    }


}
