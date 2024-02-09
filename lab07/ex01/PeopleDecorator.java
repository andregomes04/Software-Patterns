package ex01;

public class PeopleDecorator implements People {

    protected People person;
    PeopleDecorator(People p){
        this.person = p;
    }

    @Override
    public void work() {
        person.work();
    }

    @Override
    public void start(String date) {
       person.start(date);
    }

    @Override
    public void terminate(String date) {
        person.terminate(date);
    }
    
}
