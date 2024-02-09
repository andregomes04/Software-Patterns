package lab10.ex1;

import java.util.List;

public class Gestor extends Observer {
    private String nome;

    public Gestor(String nome) {
        this.nome = nome;
    }

    public void checkAuction(List<Produto> produtos){
        for(int i = 0; i < produtos.size(); i++){
            produtos.get(i).addObserver(this);
        }
    }

    @Override
    public void update(double valor, Produto p) {
        System.out.printf("%s saw: Product code %f now on bid for %f\n", this.nome,p.getCode(), valor);
    }
}
