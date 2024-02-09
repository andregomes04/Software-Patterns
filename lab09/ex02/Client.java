package ex02;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> pedidos = new ArrayList<>();
        pedidos.add("hamburger vegan");
        pedidos.add("massa carbonara");
        pedidos.add("pizza simples");
        pedidos.add("sushi nigiri e sashimi");
        pedidos.add("salada");
        pedidos.add("sobremesa de gelado e natas");
   
        Chef chef = // ordem dos chefs em relação aos pedidos é irrelevante
        new PastaChef().setSucessor(
            new BurgerChef().setSucessor(
                new PizzaChef().setSucessor(
                    new SushiChef().setSucessor(
                        new DesertChef()))));

        for (String pedido:pedidos){
            chef.cook(pedido);
        }
    }
}
