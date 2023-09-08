// banking system
import java.util.*;
class Transiction
{
   void account()
   {
      System.out.println("welcome to SBI ");
	  System.out.println("enter your name");
	  Scanner sc =new Scanner(System.in);
	  String name = sc.next();
	  System.out.println("enter your father's name");
	  String name1 = sc.next();
	  System.out.println("enter your mother's name");
	  String name2 = sc.next();
	  System.out.println("enter  village's name");
	  String vill = sc.next();
	  System.out.println("enter PIN CODE");
	  int a=sc.nextInt();
	  System.out.println("enter nearest town");
	  String town = sc.next();
	  
	  System.out.println("\n \tCONGRATULATIONS YOUR ACCOUNT IS OPEN");
	  System.out.println("-:ACCOUNT DETAILS:-");
	  System.out.println("COUSTOMER'S NAME:-"+name);
	  System.out.println("ACCOUNT NO :-12345678901");
	  System.out.println("S/O:-"+name2+"AND"+name1);
	  System.out.println("VILLAGE'S NAME:-"+vill);
	  System.out.println("PIN CODE"+a);
	  System.out.println("BRANCH NAME:-"+town);
	  System.out.println("THANK YOU FOR VISITING US	");
   }
   void withdrawl()
   {
	   System.out.println("welcome to SBI ");
	   System.out.println("ENTER AMOUNT ");
	   Scanner sc =new Scanner(System.in);
	   int a= sc.nextInt();
	   System.out.println("ENTER YOUR PIN ");
	   int b= sc.nextInt();
	   if(b==1234)
	   {
		   System.out.println("TRANSICTION SUCCESSFULL");
	   }
	   else
	   {
		   System.out.println("INCORRECT PASSWORD");
	   }  
   }
   void deposit()
   {
	   System.out.println("welcome to SBI ");
	   System.out.println("ENTER AMOUNT ");
	   Scanner sc =new Scanner(System.in);
	   int a= sc.nextInt();
	   System.out.println("ENTER YOUR PIN ");
	   int b= sc.nextInt();
	   if(b==1234)
	   {
		   System.out.println("TRANSICTION SUCCESSFULL");
	   }
	   else
	   {
		   System.out.println("INCORRECT PASSWORD");
	   }  
   }
   void stat()
   {
	   System.out.println("welcome to SBI ");
	   Scanner sc =new Scanner(System.in);
	   System.out.println("ENTER YOUR PIN ");
	   int b= sc.nextInt();
	   if(b==1234)
	   {
		   System.out.println("TRANSICTION SUCCESSFUL");
		   System.out.println("YOUR ACCOUNT STATEMENT HAS BEEN SENT \n BY SMS");
	   }
	   else
	   {
		   System.out.println("INCORRECT PASSWORD");
	   }  
   }
   void balence()
   {
	   System.out.println("welcome to SBI ");
	   Scanner sc =new Scanner(System.in);
	   System.out.println("ENTER YOUR PIN ");
	   int b= sc.nextInt();
	   if(b==1234)
	   {
		   System.out.println("TRANSICTION SUCCESSFUL");
		   System.out.println("YOUR BALENCE STATEMENT HAS BEEN SENT \n BY SMS");
	   }
	   else
	   {
		   System.out.println("INCORRECT PASSWORD");
	   }  
   }
   void help()
   {
	   System.out.println("WELCOME TO HELP SECTION");
	   System.out.println("YOU MUST HAVE TO CALL \n IN OUR HELPLINE NO");
	   System.out.println("1234567890");
   }
   
}
class Bank
{
  public static void main(String args[])
  {
	  System.out.println("WELCOME TO OUR CUSTOMER SERVICES");
	  System.out.println("ENTER YOUR CHOICE");
	  System.out.println("ENTER 1 FOR OPEN YOUR ACCOUNT");
	  System.out.println("ENTER 2 FOR WITHDRAWL");
	  System.out.println("ENTER 3 FOR DEPOSIT");
	  System.out.println("ENTER 4 FOR MINI STATEMENT");
	  System.out.println("ENTER 5 FOR CHECK YOUR BALENCE");
	  System.out.println("ENTER 6 FOR HELP");
	  Scanner sc =new Scanner(System.in);
	  int a = sc.nextInt();
      Transiction ob = new Transiction();
	  switch(a)
	  {
		  case 1: ob.account();
		  break;
		  case 2: ob.withdrawl();
		  break;
		  case 3: ob.deposit();
		  break;
		  case 4: ob.stat();
		  break;
		  case 5: ob.balence();
		  break;
		  case 6: ob.help();
		  break;
		  default : System.out.println("you entered wront choice");
		  
	  }
  }
}