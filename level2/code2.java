import java.util.*;
   
class Code2{

        public static class BankAccount{
		  public
		  String name;
		  int  accountNo;
		  int balance;
		  Scanner sc=new Scanner(System.in);
		  void deposit(int n){
		 
		  balance=balance+n;
		  }
		  
		  
		  void withdraw(int a){
		  
		  if(balance>=a) balance=balance-a;
		  else System.out.println("not sufficient balance");
		  }
		  
		  void checkBalance(){
		  System.out.println(balance);
		  }
		  
		  BankAccount(){
		     		  System.out.println("enter the details");
					  name=sc.nextLine();
					 accountNo =sc.nextInt();
					  balance=sc.nextInt();

		  }
		}
         
        public static void main(String[] args){
		    Code2.BankAccount obj=new BankAccount();
			
			obj.deposit(200);
			obj.withdraw(1000);
			obj.checkBalance();
		
		}
}