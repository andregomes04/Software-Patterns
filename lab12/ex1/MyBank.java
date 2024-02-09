package ex1;

public class MyBank {
    private int accNum;
    private int pswd;
    private double balance; //dollars

    public MyBank(int accNum, double d, int pswd) {
        this.accNum = accNum;
        this.balance = d;
        this.pswd = pswd;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public int getPswd() {
        return pswd;
    }
}
