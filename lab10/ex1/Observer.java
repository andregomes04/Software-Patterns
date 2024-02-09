package lab10.ex1;

abstract class Observer {
    protected Produto prod;
    public abstract void update(double valor, Produto p);
}
