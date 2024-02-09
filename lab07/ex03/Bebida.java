package ex03;

public class Bebida extends Produto {
    public Bebida(String nome, double weight) {
        this.nome = nome;
        this.weight = weight;
    }

    @Override
    protected void draw() {
        System.out.print("Bebida " + nome + " - Weight: " + weight + " .\n");
    }
}
