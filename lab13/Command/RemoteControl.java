package lab13.Command;

public class RemoteControl {
    private Command command;
    public void setCommand(Command c){this.command=c;}
    public void pressButton(){command.execute();}
}
