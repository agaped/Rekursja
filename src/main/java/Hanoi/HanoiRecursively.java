package Hanoi;


public class HanoiRecursively {

    private int counter = 0;

    public  void hanoiRecursively(int disc, char from, char to, char buffor) {
        if (disc > 0) {
            hanoiRecursively(disc - 1, from, buffor, to);
            counter++;
            System.out.println(from + " --> " + to);
            hanoiRecursively(disc - 1, buffor, to, from);
        }
    }

   public static void main(String[] args) {

        HanoiRecursively hanoi=new HanoiRecursively();
        int disc=3;

        hanoi.hanoiRecursively(disc, 'A', 'C', 'B');
        System.out.print("Does minimal move number was preserved? ");
       System.out.println(Math.pow(2,disc)-1 == hanoi.counter ? true: false);

    }

}

