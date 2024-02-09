package ex01;

import java.util.ArrayList;
import java.util.List;

public class AdapterDB implements DBinterface {
    private Database db = new Database();

    @Override
    public void insere(Empregado emp) {
        Employee emloyee = new Employee(emp.nome().concat(emp.apelido()) ,emp.codigo(), emp.salario());
        db.addEmployee(emloyee);
    }

    public void insere(Employee emp) {
        db.addEmployee(emp);
    }


    @Override
    public void remove(int codigo) {
        db.deleteEmployee(codigo);
    }

    @Override
    public boolean isEmpregado(int codigo) {
       Employee[] emp_list = db.getAllEmployees();
       for(Employee emp:emp_list){
            if(emp.getEmp_num() == codigo){
                return true;
            }
        } return false;
    }

    @Override
    public List<Empregado> listaDeEmpregados() {
        List<Empregado> empList = new ArrayList<>();
            for(Empregado emp:empList){
                empList.add(emp);
            }
        return empList;
    }

   

}
