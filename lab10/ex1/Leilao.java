package lab10.ex1;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
    protected static List<Produto> produtos = new ArrayList<Produto>(); //todos os produtos 
    public static void main(String[] args) {
        produtos.add(new Produto("Vaso Romano", 350.00));
        produtos.add(new Produto("Pintura Romana", 1050.00));
        produtos.add(new Produto("Estatua", 300.00));
        produtos.add(new Produto("Urna", 850.00));
        produtos.add(new Produto("Faca", 150.00));

        Gestor gest1 = new Gestor("Rui");
        gest1.checkAuction(produtos);

        produtos.get(0).setState(Estados.LEILAO);
        produtos.get(3).setState(Estados.LEILAO);

        Cliente client1 = new Cliente("Pedro");
        Cliente client2 = new Cliente("Saul");
        Cliente client3 = new Cliente("Raul");

        produtos.get(0).setState(Estados.LEILAO);
        client1.licitar(produtos.get(0), 400);
        client2.licitar(produtos.get(0), 500);
        client3.licitar(produtos.get(3), 2000);
    }
}
