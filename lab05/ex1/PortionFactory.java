package ex1;
public class PortionFactory {
    public static Portion create(String type, Temperature temp){
        if((type == "Beverage")&&(temp == Temperature.COLD)){
            return new FruitJuice();
        }
        else if((type == "Beverage")&&(temp == Temperature.WARM)){
            return new Milk();
        }
        else if((type == "Meat")&&(temp == Temperature.COLD)){
            return new Tuna();
        }
        else if((type == "Meat")&&(temp == Temperature.WARM)){
            return new Pork();
        }
        else throw new IllegalArgumentException("Pedido não existe!");
        
    }
}

class Milk implements Portion{

    @Override
    public Temperature getTemperature() {
       return Temperature.WARM;
    }

    @Override
    public State getState() {
        return State.Liquid;
    }

    public String toString(){
        return "Milk: Temperature "+ getTemperature() + " State " + getState();
    }

}

class FruitJuice implements Portion{

    @Override
    public Temperature getTemperature() {
       return Temperature.COLD;
    }

    @Override
    public State getState() {
        return State.Liquid;
    }

    public String toString(){
        return "FruitJuice: Temperature "+ getTemperature() + " State " + getState();
    }
}

class Tuna implements Portion{

    @Override
    public Temperature getTemperature() {
        return Temperature.COLD;
    }

    @Override
    public State getState() {
        return State.Solid;
    }

    public String toString(){
        return "Tuna: Temperature "+ getTemperature() + " State " + getState();
    }

}

class Pork implements Portion{

    @Override
    public Temperature getTemperature() {
       return Temperature.WARM;
    }

    @Override
    public State getState() {
        return State.Solid;
    }

    public String toString(){
        return "Pork: Temperature "+ getTemperature() + " State " + getState();
    }

}
