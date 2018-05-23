package Hanoi.ObjectiveApproach;

public class Main {

    public static void main(String[] args) {
        HanoiGame hanoiGame = new HanoiGame(3);

        Stick A = new Stick("A");
        Stick B = new Stick("B");
        Stick C = new Stick("C");

        hanoiGame.initializeFirstStickWithDiscs(3, A);
        A.printContent();
        hanoiGame.hanoiRecursion(3, A, C, B);
        C.printContent();

    }
}
