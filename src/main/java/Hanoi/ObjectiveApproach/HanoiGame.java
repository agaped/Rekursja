package Hanoi.ObjectiveApproach;


public class HanoiGame {

    Stick A;
    Stick B;
    Stick C;
    int disc;
    int counter = 0;

    public HanoiGame(int discNumber) {
        A = new Stick("A");
        B = new Stick("B");
        C = new Stick("C");
        disc = discNumber;
    }

    public int counter() {
        return counter;
    }

    public double countMinMoveNumber(int discNumber) {
        return Math.pow(2, discNumber) - 1;
    }

    public void initializeFirstStickWithDiscs(int discNumber, Stick from) {
        for (int i = discNumber; i >= 1; i--) {
            from.addToTheEnd(new Disc(i));
        }
    }

    public void hanoiRecursion(int discNumber, Stick from, Stick to, Stick buffor) {
        if (discNumber > 0) {

            Disc buffer = moveDisc(from, buffor);

            hanoiRecursion(discNumber - 1, from, buffor, to);

            counter++;

            System.out.println(buffer + " " + from + " --> " + to);
            moveDisc(buffor, to);

            hanoiRecursion(discNumber - 1, buffor, to, from);
        }
    }

    private Disc moveDisc(Stick from, Stick to) {
        Disc buffer;
        buffer = from.takeLastElement();
        to.addToTheEnd(buffer);
        return buffer;
    }
}
