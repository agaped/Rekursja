package Hanoi.ObjectiveApproach;


public class HanoiRunner {

    public static void main(String[] args) {

        HanoiGame hanoiGame = new HanoiGame();

        Stick A = new Stick("A");
        Stick B = new Stick("B");
        Stick C = new Stick("C");

        hanoiGame.solveHanoi(A, B, C);

    }
}
