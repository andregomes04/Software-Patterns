package ex2;

public class Cake {
    private Shape shape = Shape.Circle;
    private String cakeLayer;
    private int numCakeLayers = 1;
    private Cream midLayerCream;
    private Cream topLayerCream;
    private Topping topping;
    private String message;

    public void setShape(Shape shape){
        this.shape = shape;
    }

    public void setNumCakeLayers(int numCakeLayers) {
        this.numCakeLayers = this.numCakeLayers + numCakeLayers;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void setTopping(Topping topping){
        this.topping=topping;
    }

    public void setCakeLayer(String cakeLayer) {
        this.cakeLayer = cakeLayer;
    }

    public void setMidLayerCream(Cream midLayerCream) {
        this.midLayerCream = midLayerCream;
    }

    public void setTopLayerCream(Cream topLayerCream) {
        this.topLayerCream = topLayerCream;
    }

    public Shape getShape() {
        return shape;
    }

    public String getCakeLayer() {
        return cakeLayer;
    }

    public int getNumCakeLayers() {
        return numCakeLayers;
    }

    public Cream getMidLayerCream() {
        return midLayerCream;
    }

    public Cream getTopLayerCream() {
        return topLayerCream;
    }

    public Topping getTopping() {
        return topping;
    }

    public String getMessage() {
        return message;
    }

    public String toString(){
        if(getNumCakeLayers()==1){
            return(getCakeLayer() + " cake with " + getNumCakeLayers() + " layers, topped with " + getTopLayerCream() + " cream and " + getTopping() + ". Message says: " + getMessage() + ".");
        }else if (getNumCakeLayers()>1){
            return(getCakeLayer() + " cake with " + getNumCakeLayers() + " layers and " + getMidLayerCream() + " cream, topped with " + getTopLayerCream() + " cream and " + getTopping() + ". Message says: " + getMessage() + ".");
        }else return("Error with your cake :c"); 
    }
}

class ChocolateCakeBuilder implements CakeBuilder {

    protected Cake cake = new Cake();

    @Override
    public void setCakeShape(Shape shape) {
        cake.setShape(shape);
    }

    @Override
    public void addCakeLayer() {
        cake.setNumCakeLayers(1);
    }

    @Override
    public void addCreamLayer() {
    }

    @Override
    public void addTopLayer() {
        cake.setTopLayerCream(Cream.Whipped_Cream);
    }

    @Override
    public void addTopping() {
       cake.setTopping(Topping.Fruit);
    }

    @Override
    public void addMessage(String m) {
        cake.setMessage(m);
    }

    @Override
    public void createCake() {
        cake.setCakeLayer("Soft Chocolate");
    }

    @Override
    public Cake getCake() {
        return cake;
    }
}

class SpongeCakeBuilder implements CakeBuilder{

    protected Cake cake = new Cake();

    @Override
    public void setCakeShape(Shape shape) {
        cake.setShape(shape);
    }

    @Override
    public void addCakeLayer() {
        cake.setNumCakeLayers(1);
    }

    @Override
    public void addCreamLayer() {
        cake.setMidLayerCream(Cream.Red_Berries);
    }

    @Override
    public void addTopLayer() {
        cake.setTopLayerCream(Cream.Whipped_Cream);
    }

    @Override
    public void addTopping() {
        cake.setTopping(Topping.Fruit);
    }

    @Override
    public void addMessage(String m) {
        cake.setMessage(m);
    }

    @Override
    public void createCake() {
        cake.setCakeLayer("Sponge");
    }

    @Override
    public Cake getCake() {
        return cake;
    }

}

class YogurtCakeBuilder implements CakeBuilder{

    protected Cake cake = new Cake();

    @Override
    public void setCakeShape(Shape shape) {
        cake.setShape(shape);
    }

    @Override
    public void addCakeLayer() {
        cake.setNumCakeLayers(1);
    }

    @Override
    public void addCreamLayer() {
        cake.setMidLayerCream(Cream.Vanilla);
    }

    @Override
    public void addTopLayer() {
        cake.setTopLayerCream(Cream.Red_Berries);
    }

    @Override
    public void addTopping() {
        cake.setTopping(Topping.Chocolate);
    }

    @Override
    public void addMessage(String m) {
        cake.setMessage(m);
    }

    @Override
    public void createCake() {
        cake.setCakeLayer("Yogurt");
    }

    @Override
    public Cake getCake() {
        return cake;
    }

}