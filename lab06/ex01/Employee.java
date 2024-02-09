package ex01;

import java.util.Vector;

class Employee{
    private String name;
    private long emp_num;
    private double salary;

    public Employee(String name, long emp_num, double salary){
        this.name = name;
        this.emp_num = emp_num;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public long getEmp_num() {
        return this.emp_num;
    }

    public double getSalary() {
        return this.salary;
    }
}

class Database implements DBinterface{
    private Vector <Employee> employees;

    public Database(){
        employees = new Vector<>();
    }

    public boolean addEmployee(Employee employee){
        employees.add(employee);
        return true;
    }

    public void deleteEmployee(long emp_num){
       for (Employee emp:employees){
            if (emp.getEmp_num() == emp_num){
                employees.remove(emp);
            }
       }
    }

    public Employee[] getAllEmployees(){
        int k = employees.size();
        Employee emplist[] = new Employee[k];
        int i = 0;
        for (Employee emp :employees){
            emplist[i]=emp;
            i++;
        }
        return emplist;
    }
}