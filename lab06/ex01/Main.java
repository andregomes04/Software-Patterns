package ex01;

public class Main {
    public static void main(String[] args){
        Database database = new Database();
        Registos registos = new Registos();
        Empregado rui = new Empregado("Rui", "Silva", 0, 1500);
        Employee pedro = new Employee("Pedro Lourenço", 0, 2000);
        database.addEmployee(pedro);
        database.deleteEmployee(0);
        database.addEmployee(pedro);
        database.getAllEmployees();
        registos.insere(rui);
        registos.isEmpregado(0);
        registos.listaDeEmpregados();
        registos.remove(0);
    }
}
