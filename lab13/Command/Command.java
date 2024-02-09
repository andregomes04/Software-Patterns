package lab13.Command;

public interface Command {
    public void execute();
}

class LightOn implements Command{
    Light luz;

    public LightOn(Light luz){ this.luz = luz;}

    @Override
    public void execute() {
      luz.switchOn();
    }

}

class LightOff implements Command{
    Light luz;

    public LightOff(Light luz){ this.luz = luz;}

    @Override
    public void execute() {
      luz.switchOff();
    }

}