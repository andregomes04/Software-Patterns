package ex1;

public class Context{
    private Algorithms algorithm;

    public Context(Algorithms alg){
        this.algorithm = alg;
    }

    public void sort(Phone[] phones){
        algorithm.sort(phones);
    }

    public void setAlgorithm(Algorithms alg){
        algorithm = alg;
    }
}