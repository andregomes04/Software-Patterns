package ex1;

public class Phone{
    private String processador;
    private double price;
    private String memory;
    private String camera;
    
    public Phone(String processador, double price, String memory, String camera) {
        this.processador = processador;
        this.price = price;
        this.memory = memory;
        this.camera = camera;
    }

    public double getPrice() {
        return this.price;
    }

    public String getMemory() {
        return this.memory;
    }

    public String getProcessador() {
        return this.processador;
    }

    public String getCamera() {
        return this.camera;
    }
}