package Hanoi.ObjectiveApproach;


public class HanoiGame {

    private Stick A;
    private  Stick B;
    private Stick C;

    private DiscNumberValidator discNumberValidator;

    public HanoiGame() {
        A = new Stick("A");
        B = new Stick("B");
        C = new Stick("C");
        discNumberValidator =new DiscNumberValidator();
    }


    public void solveHanoi(Stick start, Stick middle, Stick end) {
        int discNumber =discNumberValidator.validate();
        initializeFirstStickWithDiscs(discNumber, start);

        printSticksContent(start, middle, end);

        try {
            solve(discNumber, start, middle, end);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        printSticksContent(start, middle, end);
    }

    private void initializeFirstStickWithDiscs(int discNumber, Stick from) {
        for (int i = discNumber; i >= 1; i--) {
            from.addToTheEnd(new Disc(i));
        }
    }

    private void solve(int discNumber, Stick start, Stick middle, Stick end) throws InterruptedException {
        if(discNumber>10 || discNumber<0){
            throw new IllegalArgumentException("Disc number should be between 1-9");
        }
        if (discNumber > 0) {
            solve(discNumber - 1, start, end, middle);

            Disc buffer = moveDisc(start, middle);

            System.out.println("[" + buffer + "] " + " " + start + " --> " + end);

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

    private void printSticksContent(Stick start, Stick middle, Stick end) {
        start.printContent();
        middle.printContent();
        end.printContent();
        System.out.println();
    }
}
