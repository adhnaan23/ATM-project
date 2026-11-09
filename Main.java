import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        int accountpin=sc.nextInt();
        double balance=sc.nextDouble();
         Map<String,Customer> obj=new HashMap<>();
          obj.put(name,new Customer(accountpin,balance));
        //  obj.put(102,("Aswin",1033,10000));
        //  obj.put(103,("Afsal",1023,15300));
        //  obj.put(104,("Ayman",1013,12000.50));
        //   obj.containsValue();

        Withdraw amWithdraw = new Withdraw();
        amWithdraw.cashwithdraw(obj);
    }
}
