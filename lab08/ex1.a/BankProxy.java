public class BankProxy extends BankAccountImpl {
    BankProxy(String bank, double initialDeposit) {
        super(bank, initialDeposit);
    }

    @Override
    public double balance() {
        if (Company.user == User.OWNER){
            return super.balance();
        } else return 0 ;
    }

    @Override
    public boolean withdraw(double amount) {
        if (Company.user == User.OWNER){
            return super.withdraw(amount);
        } else return false;
    }
    
}
