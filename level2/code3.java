import java.util.*;
   
class Code3{

        public static class PalindromeChecker{
		  public
		  String text;
		 
		  Scanner sc=new Scanner(System.in);
		
		
		  
		  void check(){
		      int a=0;
			  int n=text.length();
		      for(int i=0;i<n;i++){
			   if(text.charAt(i)!=text.charAt(n-1-i)){
			   a++;
			   break;
			   }
			  }
			  
			  if(a==0) System.out.println("It is Palindrome");
			  else System.out.println("It is not a Palindrome");
			  
		  }
	
		  
		  PalindromeChecker(){
		     		  System.out.println("enter the string");
					  text=sc.nextLine();
					 

		  }
		}
         
        public static void main(String[] args){
		    Code3.PalindromeChecker obj=new PalindromeChecker();
			
			obj.check();
			
			
		
		}
}