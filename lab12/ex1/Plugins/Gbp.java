package ex1.Plugins;

import ex1.IPlugin;
import ex1.MyBank;

public class Gbp implements IPlugin {

    @Override
    public double showBalance(MyBank b) {
        return b.getBalance()*0.81;
    }
    
}
