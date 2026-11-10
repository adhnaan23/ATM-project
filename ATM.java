import java.util.*;

class Atm{
    public synchronized void checkbalance(Map<Integer,Customer> obj)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account pin:");
        int accountpin=sc.nextInt();
        if(obj.containsKey(accountpin))

        {
            Customer c= obj.get(accountpin);
            if (c.getbalance()>0) {
                System.out.println("Your balance:"+c.getbalance());
            }
            else{
                System.out.println("You have insufficient balance");
            }
        }
        else{
            System.out.println("Enter the correct accountpin");
        }


    }
    // private String phonenumber;
    

    
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    
    // public String getPhonenumber() {
    //     return phonenumber;
    // }
    // public void setPhonenumber(String phonenumber) {
    //     this.phonenumber = phonenumber;
    //     if(phonenumber.length()!=10){
    //         System.out.println("It is invalid phone number");
    //     }
    // }
}
class Deposit extends Atm {
    Scanner sc=new Scanner(System.in);
    public synchronized void cashdeposit(Map<Integer,Customer> obj){
    System.out.println("Enter the amount");
    int accountpin=sc.nextInt();
    if(obj.containsKey(accountpin)){
        Customer c =obj.get(accountpin);
        double balance=sc.nextDouble();

        if(balance>0){
            double Depositamount=c.getbalance()+balance;
            System.out.println("The Successfully Deposit"+balance);
            c.setbalance(Depositamount);

        }
        else
            System.out.println("Enter the valid amount");
    }
    else {
                System.out.println("Incorrect PIN");
            }
    
}
}
class Withdraw extends Atm{
    Scanner sc = new Scanner(System.in);

    public void cashwithdraw(Map<Integer,Customer> obj) {

        System.out.println("Enter your accountpin:");
        int accountpin= sc.nextInt();

        if (obj.containsKey(accountpin)) {

            Customer c = obj.get(accountpin);

            // System.out.println("Enter your PIN:");
            // int enterpin = sc.nextInt();

            // if (enterpin == c.getaccountpin()) {

                System.out.println("Enter the amount:");
                double amount = sc.nextDouble();

                if (amount > 0 && amount <= c.getbalance()) {

                    double remainingBalance = c.getbalance() - amount;
                    System.out.println("Withdraw Successfull: "+amount);

                    c.setbalance(remainingBalance);

                    System.out.println("Remaining balance: " + c.getbalance());
                } 
                else {
                    System.out.println("Insufficient amount");
                }

            } else {
                System.out.println("Incorrect PIN");
            }

        // } else {
        //     System.out.println("Customer not found");
        // }
    }
}
