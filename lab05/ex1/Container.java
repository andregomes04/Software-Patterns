package ex1;

public abstract class Container {
    public static Container create(Portion menu){
        if((menu.getState() == State.Liquid)&&(menu.getTemperature() == Temperature.COLD)){
            return new PlasticBottle();
        }
        else if((menu.getState() == State.Liquid)&&(menu.getTemperature() == Temperature.WARM)){
            return new TermicBottle();
        }
        else if((menu.getState() == State.Solid)&&(menu.getTemperature() == Temperature.COLD)){
            return new PlasticBag();
        }
        else if((menu.getState() == State.Solid)&&(menu.getTemperature() == Temperature.WARM)){
            return new Tupperware();
        }
        else throw new IllegalArgumentException("Pedido não existe!");
    }
    
}

class PlasticBottle extends Container{
    public String toString(){
        return "PlasticBottle with portion = FruitJuice: Temperature COLD, State Liquid";
    }
}

class TermicBottle extends Container{
    public String toString(){
        return "TermicBottle with portion = Milk: Temperature WARM, State Liquid";
    }
}

class Tupperware extends Container{
    public String toString(){
        return "Tupperware with portion = Pork: Temperature WARM, State Solid";
    }
}

class PlasticBag extends Container{
    public String toString(){
        return "PlasticBag with portion = Tuna: Temperature COLD, State Solid";
    }
}