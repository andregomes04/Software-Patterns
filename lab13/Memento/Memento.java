package lab13.Memento;

import java.util.Stack;

public class Memento {  //Memento: O cofre, lido e escrito pelo originator e gerida pelo Caretaker
    private String state;
    public Memento(String stateToSave) {state = stateToSave;}
    public String getState() {return state;}
}

class Originator{ //Originator: O objeto que detém o estado
    private String state;
    public void set(String state){this.state=state;}
    public Memento saveToMemento(){return new Memento(state);}
    public void restoreFromMemento(Memento m){state = m.getState();}
}

class CareTaker{ //Caretaker: O objeto que sabe quando e porque é que o Originator precisa de guardar o seu estado
    private Stack<Memento> savedStates = new Stack<Memento>();
    public void addMemento(Memento m) {savedStates.push(m);}
    public boolean hasMemento(){return !savedStates.isEmpty();}
    public Memento getMemento(){return savedStates.pop();}
}
