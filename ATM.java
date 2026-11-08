import java.util.Map;
import java.util.Scanner;

class Atm{
    private String name;
    private  int accountpin;
    private double balance;
    private String phonenumber;
    public void setbalance(double balance){
            this.balance=balance;    
        }

    public double getbalance(){
        return balance;
    }

    synchronized void checkbalance(){
        System.out.println("Available Balance"+getbalance());
}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAccountpin() {
        return accountpin;
    }
    public void setAccountpin(Map<String,Customer> obj) {
       
        if(accountpin<1000||accountpin>9999)
        {
            System.out.println("Invalid pin");
        }
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        if(phonenumber.length()!=10){
            System.out.println("It is invalid phone number");
        }
    }
}
class Deposit extends Atm {
    Scanner sc=new Scanner(System.in);
    public synchronized void cashdeposit(Map<String,Customer> obj){
    System.out.println("Enter the amount");
    double balance=sc.nextDouble();
    if(obj.containsValue(balance)){
        Customer c =obj.get(balance);
        if(balance>0){
            double Depositamount=c.getbalance()+balance;
            System.out.println("The Successfully Deposit"+Depositamount);
            setbalance(Depositamount);
        }
        else
            System.out.println("Enter the valid amount");
    }
    
}
}
// 
class Withdraw {
    Scanner sc = new Scanner(System.in);

    public void cashwithdraw(Map<String, Customer> obj) {

        System.out.println("Enter your name:");
        String name = sc.next();

        if (obj.containsKey(name)) {

            Customer c = obj.get(name);

            System.out.println("Enter your PIN:");
            int enterpin = sc.nextInt();

            if (enterpin == c.getAccountpin()) {

                System.out.println("Enter the amount:");
                double amount = sc.nextDouble();

                if (amount > 0 && amount <= c.getBalance()) {

                    double remainingBalance = c.getBalance() - amount;

                    c.setBalance(remainingBalance);

                    System.out.println("Remaining balance: " + c.getBalance());
                } else {
                    System.out.println("Insufficient amount");
                }

            } else {
                System.out.println("Incorrect PIN");
            }

        } else {
            System.out.println("Customer not found");
        }
    }
}