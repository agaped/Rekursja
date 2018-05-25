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

    public Disc takeFromTheEnd() {
        return list.pollLast();
    }

    @Override
    public String toString() {
        return name;
    }


    public void printContent() {
        System.out.print(name +" "+list+" ");
    }
}
