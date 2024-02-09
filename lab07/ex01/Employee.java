package ex01;

public class Employee implements People {
    String nome;
    public Employee(String nome) {this.nome=nome;}

    @Override
    public void start(String date) {
        System.out.print("Employee is set to start working at " + date + ".\n");
    }

    @Override
    public void terminate(String date) {
        System.out.print("Employee stopped working at " + date + ".\n");
    }

    @Override
    public void work() {
        System.out.print("Employee is working.\n");
    }
    
}
