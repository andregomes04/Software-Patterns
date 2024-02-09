package ex02;

abstract class Chef {  // class abstrata que define todas as outras
    private Chef sucessor = null;

    public void cook(String pedido){  // todos os cooks cozinham
        if (sucessor!=null) 
            sucessor.cook(pedido);
        else System.out.println("Não há chefs para o seu pedido :c \n");
    }

    public boolean canCook(String pedido, String especialidade){ // no entanto, cada um cozinha o que sabe
        if (pedido.contains(especialidade)){
            return true;
        } else return false;
    }

    public Chef setSucessor(Chef sucessor){ // função apenas usada no client; base da chain of responsability
        this.sucessor = sucessor;
        return this;
    }
}

class SushiChef extends Chef{
    @Override
    public void cook(String pedido){
        if(canCook(pedido, "sushi")){
            System.out.println("Starting to cook " + pedido + "! \n");
        }else super.cook(pedido);
    }
}
class BurgerChef extends Chef{
    @Override
    public void cook(String pedido){
        if(canCook(pedido, "hamburger")){
            System.out.println("Starting to cook " + pedido + "! \n");
        }else super.cook(pedido);
    }
}
class PastaChef extends Chef{
    @Override
    public void cook(String pedido){
        if(canCook(pedido, "massa")){
            System.out.println("Starting to cook " + pedido + "! \n");
        }else super.cook(pedido);
    }
}
class PizzaChef extends Chef{
    @Override
    public void cook(String pedido){
        if(canCook(pedido, "pizza")){
            System.out.println("Starting to cook " + pedido + "! \n");
        }else super.cook(pedido);
    }
}
class DesertChef extends Chef{
    @Override
    public void cook(String pedido){
        if(canCook(pedido, "sobremesa")){
            System.out.println("Starting to cook " + pedido + "! \n");
        }else super.cook(pedido);
    }
}
