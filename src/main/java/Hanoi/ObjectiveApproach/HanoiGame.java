package Hanoi.ObjectiveApproach;


public class HanoiGame {

    Stick A;
    Stick B;
    Stick C;
    int disc;
    int counter=0;

    public HanoiGame(int discNumber) {
        A = new Stick("A");
        B = new Stick("B");
        C = new Stick("C");
        disc=discNumber;
    }

    public int counter(){
        return counter;
    }

    public double countMinMoveNumber(int discNumber){
        return Math.pow(2, discNumber)-1;
    }

    public void initializeFirstStickWithDiscs(int discNumber, Stick from){
        for(int i=1; i<=discNumber; i++){
            from.addToTheEnd(new Disc(i));
        }
    }

    public void hanoiRecursion(int discNumber, Stick from, Stick to, Stick buffor){
        Disc buffer;
        if (discNumber > 0) {
            buffer=from.takeFromTheBegining();
            buffor.addToTheEnd(buffer);

            hanoiRecursion(discNumber - 1, from, buffor, to);

            counter++;
            System.out.println(from + " --> " + to);

            buffer=buffor.takeFromTheBegining();
            to.addToTheEnd(buffer);

            hanoiRecursion(discNumber - 1, buffor, to, from);
        }
    }
}
