package lab10.ex1;

public class Cliente extends Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, Produto p) { //outra opção, não usada, em que o cliente se regista como observer em vez de no Leilao
        this.nome = nome;
        prod = p;
        prod.addObserver(this);
    }

    public void licitar(Produto product, double valor){
        product.setBid(valor, this);
    }

    @Override
    public void update(double valor, Produto p) {
        System.out.printf("%s saw: Product code %f now on bid for %f\n", this.nome, p.getCode(), valor);
    }

}
