class Atm{
    private String name;
    private  int accountpin;
    private double balance;
    private String phonenumber;
    public void setbalance(double balance){
        this.balance=balance;

        if(balance>0)
            System.out.println(balance);
        else{
            System.out.println("Insufficient balance");
        }
    }
    public double getbalnce(){
        return balance;
    }

    synchronized void checkbalance(){
        System.out.println("Available Balance"+getbalnce());
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
    public void setAccountpin(int accountpin) {
        this.accountpin = accountpin;
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