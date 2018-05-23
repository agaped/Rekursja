package Hanoi;


import Hanoi.ObjectiveApproach.HanoiGame;
import Hanoi.ObjectiveApproach.Stick;

public class Hanoi {

    private int counter = 0;

    public  void hanoiRecursion(int disc, char from, char to, char buffor) {
        if (disc > 0) {
            hanoiRecursion(disc - 1, from, buffor, to);
            counter++;
            System.out.println(from + " --> " + to);
            hanoiRecursion(disc - 1, buffor, to, from);
        }
    }

   public static void main(String[] args) {

        Hanoi hanoi=new Hanoi();
        int disc=3;

        hanoi.hanoiRecursion(disc, 'A', 'B', 'C');
        System.out.println(Math.pow(2,disc)-1 == hanoi.counter ? true: false);

//--------------------
       HanoiGame hanoiGame=new HanoiGame(3);
       Stick A=new Stick("A");
       Stick B=new Stick("B");
       Stick C=new Stick("C");
       hanoiGame.initializeFirstStickWithDiscs(3,A);
        hanoiGame.hanoiRecursion(3,A,B,C);

    }

}

