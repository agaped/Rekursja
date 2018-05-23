package Hanoi.ObjectiveApproach;


import java.util.LinkedList;

public class Stick {

    private LinkedList<Disc> list;
    private String name;

    public Stick(String name) {
        this.name = name;
        list = new LinkedList<>();
    }

    public void addToTheEnd(Disc disc) {
        list.add(disc);
    }

    public Disc takeLastElement() {
        return list.pollFirst();
    }

    @Override
    public String toString() {
        return name;
    }


    public void printContent() {
        for (Disc d : list) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
