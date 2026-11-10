
public class Customer {   
    public String name;
    private double balance;
    private String phonenumber;

    Customer( String name, double balance,String phonenumber) {
        this.name = name;
        this.balance = balance;
    }
    public void setbalance(double balance){
            this.balance=balance; 
            System.out.println(balance);   
        }

    public double getbalance(){
        return balance;
    }
    public void setPhonenumber(String phonenumber) {
        if(phonenumber.length()==10){
           this.phonenumber = phonenumber;
        }
    }
    public String getPhonenumber() {
        return phonenumber;
    }


}
// class accountpin{
//         private int accountpin;
//         accountpin(int accountpin){
//         this.accountpin=accountpin;
//         }

//         public void setaccountpin(int accountpin) {
       
//         if(accountpin>=1000||accountpin<10000)
//         {
//             this.accountpin=accountpin;

//         }
//     }
//     public int getaccountpin() {
//         return accountpin;
//     }
// }