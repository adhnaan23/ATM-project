import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the name:");
        // String name=sc.next();
        // System.out.println("Enter the Accountpin:");
        // int accountpin=sc.nextInt();
        // // if (accountpin>999||accountpin<10000){
        // //     int Accountpin=accountpin;
        // // }
        // // else{
        // //     System.out.println("Enter the validpin");
        // // }
        // System.out.println("Enter the Balance:");
        // double balance=sc.nextDouble();
         Map<Integer,Customer> obj=new HashMap<>();
          obj.put(1003,new Customer("Adhnaan",10000,"9600301365"));
         obj.put(1013,new Customer("Aswin",110000,"6383064940"));
         obj.put(1023,new Customer("Safeeq",15300,"8825939548"));
         obj.put(1033,new Customer("Sathish",12000.50,"8072868060"));
          

        Atm amWithdraw = new Withdraw();
        amWithdraw.checkbalance(obj);
    }
}
