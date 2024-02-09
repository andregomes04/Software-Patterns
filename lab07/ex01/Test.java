package ex01;

public class Test {
    public static void main(String args[]) {
        People p1 = new Employee("Pedro");
        TeamLeader p2 = new TeamLeader(new Employee("Rui"));
        TeamLeader p6 = new TeamLeader(new TeamMember(new Employee("Andre")));
        TeamMember p3 = new TeamMember(p1); 
        TeamMember p4 = new TeamMember(new Employee("Joana"));
        Manager p5 = new Manager(new Employee("Luis"));

        People list[] = {p1,p2,p3,p4,p5,p6};
        for (People p: list){
            p.start("12/08");
            p.work();
            p.terminate("14/08");
        }
    }
}