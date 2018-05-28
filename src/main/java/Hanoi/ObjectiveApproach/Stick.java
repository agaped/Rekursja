package Hanoi.ObjectiveApproach;


import java.util.ArrayDeque;
import java.util.Deque;

public class Stick {

    private Deque<Disc> list;
    private String name;

    public Stick(String name) {
        this.name = name;
        list = new ArrayDeque<>();
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
