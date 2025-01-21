

         public class Main{
  
	   
	   public static void main(String[] args){
	    
		
		BankAccount acc1=new BankAccount("Tarun dubey",123456);
		BankAccount acc2=new BankAccount("Manish",654321);
		BankAccount acc3=new BankAccount("Sankalp",324156);
	    BankAccount acc4=new BankAccount("Akhand",543516);
		
		BankAccount.getTotalAccounts();
		System.out.println("\n");
		if(acc1 instanceof BankAccount){
			acc1.getDetail();
		}
		System.out.println("\n");
		if(acc2 instanceof BankAccount){
			acc2.getDetail();
		}
		System.out.println("\n");
		if(acc3 instanceof BankAccount){
			acc3.getDetail();
		}
		System.out.println("\n");
		if(acc4 instanceof BankAccount){
			acc4.getDetail();
		}
		
	   }
	 
   }

  class BankAccount{
       static String bankName="Bank of Baroda";
	   
	   String accountHolderName;
	   final int accountNumber;
	   static int count=0;
	   BankAccount(String accountHolderName, int accountNumber){
	       this.accountHolderName=accountHolderName;
		   this.accountNumber=accountNumber;
		   count++;
	   }
	   
	  public static void getTotalAccounts(){
	      System.out.println("total no of account is "+count);
	   }
	     public void getDetail(){
		   System.out.println("Bank Name:"+bankName);
		   System.out.println("Account Holder Name:"+accountHolderName);
		   System.out.println("Account number:"+accountNumber);
		   
	   }
	   }