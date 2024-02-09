package ex03;

public class Doce extends Produto {
    public Doce(String nome, double weight) {
        this.nome = nome;
        this.weight = weight;
    }

    @Override
    protected void draw() {
         System.out.print("Doce " + nome + " - Weight: " + weight + " .\n");
    }
}
