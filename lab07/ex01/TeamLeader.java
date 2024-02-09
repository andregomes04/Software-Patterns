package ex01;

public class TeamLeader extends PeopleDecorator {

    TeamLeader(People p) {super(p);}

    public void plan(){
        System.out.print("TeamLeader started planning.\n");
    }

    @Override
    public void start(String date) {
        System.out.print("TeamLeader is set to start working at " + date + ".\n");
    }

    @Override
    public void terminate(String date) {
        System.out.print("TeamLeader stopped working at " + date + ".\n");
    }

    @Override
    public void work() {
        System.out.print("TeamLeader is working.\n");
    } 
}
