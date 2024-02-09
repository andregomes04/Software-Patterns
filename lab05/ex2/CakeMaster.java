package ex2;

public class CakeMaster {
    private CakeBuilder cakebuilder;

    public void setCakeBuilder(CakeBuilder cake) {
        cakebuilder = cake;
    }

    public void createCake(Shape shape, int i, String string) {
        cakebuilder.setCakeShape(shape);
        while(i>1){
            cakebuilder.addCakeLayer();
            i--;
        }
        cakebuilder.addMessage(string);
        cakebuilder.addCreamLayer();
        cakebuilder.addTopLayer();
        cakebuilder.addTopping();
        cakebuilder.createCake();
    }

    public void createCake(int i, String string) {
        while(i>1){
            cakebuilder.addCakeLayer();
            i--;
        }
        cakebuilder.addMessage(string);
        cakebuilder.addCreamLayer();
        cakebuilder.addTopLayer();
        cakebuilder.addTopping();
        cakebuilder.createCake();
    }

    public void createCake(String string) {
        cakebuilder.addMessage(string);
        cakebuilder.addCreamLayer();
        cakebuilder.addTopLayer();
        cakebuilder.addTopping();
        cakebuilder.createCake();
    }

    public Cake getCake() {
        return cakebuilder.getCake();
    }

}
