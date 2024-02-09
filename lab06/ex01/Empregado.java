package ex01;

import java.util.ArrayList;
import java.util.List;

class Empregado {
    private String nome;
    private String apelido;
    private int codigo;
    private double salario;

    public Empregado(String nome, String apelido, int codigo, double salario) {
        this.nome = nome;
        this.apelido = apelido;
        this.codigo = codigo;
        this.salario = salario;
    }

    public String nome() {
        return this.nome;
    }

    public String apelido() {
        return this.apelido;
    }

    public int codigo() {
        return this.codigo;
    }

    public double salario() {
        return this.salario;
    }
}

class Registos implements DBinterface{
    private ArrayList<Empregado> empregados;
    public Registos(){
        empregados = new ArrayList<>();
    }

    public void insere(Empregado emp){
        empregados.add(emp);
    }

    public void remove(int codigo){
        for(Empregado emp:empregados){
            if(emp.codigo() == codigo){
                empregados.remove(emp);
            }
        }
    }

    public boolean isEmpregado(int codigo){
        for(Empregado emp:empregados){
            if(emp.codigo() == codigo){
              return true;
            }
        }
        return false;
    }

    public List<Empregado> listaDeEmpregados(){
        List<Empregado> empList = new ArrayList<>();
        for(Empregado emp:empregados){
            empList.add(emp);
        }
        return empList;
    }
}
