package Hanoi.ObjectiveApproach;


public class Disc {

    private int number;


    public Disc(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
