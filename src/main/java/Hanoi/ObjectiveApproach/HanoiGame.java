package Hanoi.ObjectiveApproach;


public class HanoiGame {

    private Stick A;
    private  Stick B;
    private Stick C;
    private int disc;
    private int counter;

    public HanoiGame(int discNumber) {
        A = new Stick("A");
        B = new Stick("B");
        C = new Stick("C");
        disc = discNumber;
        counter=0;
    }

    public int counter() {
        return counter;
    }

    public double countMinMoveNumber(int discNumber) {
        return Math.pow(2, discNumber) - 1;
    }

    public void solveHanoi(int discNumber, Stick start, Stick middle, Stick end) {
        initializeFirstStickWithDiscs(discNumber, start);
        start.printContent();
        try {
            solve(discNumber, start, middle, end);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        end.printContent();
    }

    private void initializeFirstStickWithDiscs(int discNumber, Stick from) {
        for (int i = discNumber; i >= 1; i--) {
            from.addToTheEnd(new Disc(i));
        }
    }

    private void solve(int discNumber, Stick start, Stick middle, Stick end) throws InterruptedException {
        if (discNumber > 0) {
            solve(discNumber - 1, start, end, middle);

            Disc buffer = moveDisc(start, middle);

            counter++;
            System.out.println("[" + buffer + "] " + " " + start + " --> " + end);
            Thread.sleep(500);

            moveDisc(middle, end);

            solve(discNumber - 1, middle, start, end);
        }
    }

    private Disc moveDisc(Stick from, Stick to) {
        Disc buffer;
        buffer = from.takeFromTheEnd();
        to.addToTheEnd(buffer);
        return buffer;
    }
}
