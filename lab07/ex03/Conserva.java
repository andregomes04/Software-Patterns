package ex03;

public class Conserva extends Produto {
    public Conserva(String nome, double weight) {
        this.nome = nome;
        this.weight = weight;
    }

    @Override
    protected void draw() {
        System.out.print("Conserva " + nome + " - Weight: " + weight + " .\n");
    }
}
