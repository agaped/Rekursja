package Hanoi.ObjectiveApproach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HanoiGame hanoiGame = new HanoiGame(3);

        Stick A = new Stick("A");
        Stick B = new Stick("B");
        Stick C = new Stick("C");


        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();

        hanoiGame.solveHanoi(discs, A, B, C);

    }
}
