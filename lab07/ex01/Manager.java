package ex01;

public class Manager extends PeopleDecorator {

    Manager(People p) {super(p);}

    public void manage(){
        System.out.print("Manager started mannaging.\n");
    }

    @Override
    public void start(String date) {
        System.out.print("Manager is set to start working at " + date + ".\n");
    }

    @Override
    public void terminate(String date) {
        System.out.print("Manager stopped working at " + date + ".\n");
    }

    @Override
    public void work() {
        System.out.print("Manager is working.\n");
    }
}
