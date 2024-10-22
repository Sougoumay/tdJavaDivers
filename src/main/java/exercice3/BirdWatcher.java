package exercice3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BirdWatcher {
    int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch( x -> x > 0);
    }

    public int getCountForFirstDays(int firstDays) {
        return IntStream.range(0, firstDays).map( i -> birdsPerDay[i]).sum();
    }

    public long getBusyDays() {

        return Arrays.stream(birdsPerDay).filter( x -> x >= 5).count();
    }
}
