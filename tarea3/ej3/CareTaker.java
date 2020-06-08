package tarea3.ej3;

import java.util.ArrayList;

public class CareTaker {

    private ArrayList <Memento> savedStates = new ArrayList<>();

    public void addMemento(Memento memento){
        this.savedStates.add(memento);
    }

    public Memento getMemento(int index){
        return  this.savedStates.get(index);
    }
}
