import java.util.*;

public class BankAccount {
    public static void main(String[] args){

        Customer c1=new Customer("Tarun",10000);
       Bank b1=new Bank();
       b1.openAccount(c1);

       c1.viewDetails(b1);




    }

}
class Bank{
 String name;
 int accountNo;
 int balance;

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    Random random=new Random();
    ArrayList<Customer> customers=new ArrayList<>();

 public void openAccount(Customer c1) {
     this.name = c1.getName();
     this.balance = c1.getBalance();
     this.accountNo=random.nextInt();
     customers.add(c1);
 }

}
class Customer{
    String name;
    int balance;

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    Customer(String name,int balance){
        this.name=name;
        this.balance=balance;
    }
    ArrayList<Bank> account=new ArrayList<Bank>();
    public void setAccount(Bank b1){
        account.add(b1);
    }

    public void viewDetails(Bank b){
        System.out.println("Name:"+b.getName());
        System.out.println("AccountNo:"+ b.getAccountNo());
        System.out.println("balance:"+b.getBalance());

    }


}