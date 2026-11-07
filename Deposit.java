import java.util.*;

class Deposit extends Atm {
    Scanner sc=new Scanner(System.in);
    public  void cashdeposit(){
        System.out.println("Enter the amount");
        double amount=sc.nextDouble();
        if(amount>0){
            double Depositamount=getbalance()+amount;
            System.out.println("The Successfully Deposit"+Depositamount);
            setbalance(Depositamount);
        }
        else
            System.out.println("Enter the valid amount");
    }
    
}
