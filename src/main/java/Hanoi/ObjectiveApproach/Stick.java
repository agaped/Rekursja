package Hanoi.ObjectiveApproach;


import java.util.LinkedList;

public class Stick {

    private LinkedList<Disc> list;
    private String name;

    public Stick(String name) {
        this.name = name;
        list = new LinkedList<>();
    }

    public void addToTheEnd(Disc disc){
        list.add(disc);
    }

    public Disc takeFromTheBegining(){
        return list.pollFirst();
    }

    @Override
    public String toString() {
        return name+": "+list;
    }
}
