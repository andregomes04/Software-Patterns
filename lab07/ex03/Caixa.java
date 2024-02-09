package ex03;

import java.util.ArrayList;
import java.util.List;

public class Caixa extends Produto {
    private List<Produto> prods = new ArrayList<>();
    public Caixa(String nome, double weight) {
        this.nome = nome;
        this.weight = weight;
    }

    public void add(Produto p){
        prods.add(p);
    }

    @Override
    protected void draw() {
        double total = weight;
        for (Produto p: prods){
            total += p.weight; //apenas funciona para produtos; necessário implementar metodo
        }
        System.out.print("Caixa " + nome + " [ Weight: " + weight + " ; Total: " + total + "]\n");
        for (Produto p: prods){
            p.draw();
        }
    }
}
