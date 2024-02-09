package ex01;

public class TeamMember extends PeopleDecorator {

    TeamMember(People p) {
        super(p);
    }

    public void colaborate(){
        System.out.print("TeamMember started colaborating.\n");
    }

    @Override
    public void start(String date) {
        System.out.print("TeamMember is set to start working at " + date + ".\n");
    }

    @Override
    public void terminate(String date) {
        System.out.print("TeamMember stopped working at " + date + ".\n");
    }

    @Override
    public void work() {
        System.out.print("TeamMember is working.\n");
    }
    
}
