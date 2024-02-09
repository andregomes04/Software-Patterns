package lab10.ex1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private static int prodcount = 0;
    private int code;
    private String desc;
    private double price;
    private Estados state;
    private double storeBid = 0;
    private List<Observer> observers = new ArrayList<Observer>();

    public Produto(String desc, double price) {
        prodcount+=1;
        this.code = prodcount;
        this.desc = desc;
        this.price = price;
        this.state = Estados.STOCK;
    }

    public String getDesc() {
        return desc;
    }

    public Estados getState(){
        return this.state;
    }

    public void setState(Estados state){
        this.state = state;
    }

    public void addObserver(Observer o){
        if (!(this.observers.contains(o))){
            this.observers.add(o);
        }
    }
    
    public void setBid(double valor, Observer o){
        if (this.state == Estados.LEILAO){
            if (valor > this.storeBid && valor > this.price){
                this.storeBid = valor;
                addObserver(o);
                notifyObservers(valor);
            }
        }
    }

    public double getCurrentVal(){
        return this.storeBid;
    }

    public double getCode(){
        return this.code;
    }

    public void notifyObservers(double valor) {
        for (Observer o: this.observers) {
            o.update(valor, this);
        }
    }
}
