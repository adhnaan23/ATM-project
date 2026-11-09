
public class Customer {   
    public String name;
    private int accountpin;
    private double balance;

    Customer( int accountpin, double balance) {
        this.accountpin = accountpin;
        this.balance = balance;
    }
    public void setbalance(double balance){
            this.balance=balance; 
            System.out.println(balance);   
        }

    public double getbalance(){
        return balance;
    }
    public void setaccountpin(int accountpin) {
       
        if(accountpin>=1000||accountpin<10000)
        {
            this.accountpin=accountpin;

        }
    }
    public int getaccountpin() {
        return accountpin;
    }


}
