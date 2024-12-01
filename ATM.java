import java.util.Scanner;
public class ATM
{
public static String name;
public static int amt,wi,dep;
public static void main(String args[])throws Exception
{
int choice;
String yn;
Scanner sx=new Scanner(System.in);
System.out.println("========================");
System.out.println("1.Create Account");
System.out.println("2.Deposit");
System.out.println("3.Withdraw");
System.out.println("4.Bank Balance");
System.out.println("5.Exit");
System.out.println("========================");
while(true)
{
System.out.print("Enter your choice : ");
choice=sx.nextInt();
if(choice==1)
{
createaccount();
}
else if(choice==2)
{
deposit();
}
else if(choice==3)
{
withdraw();
}
else if(choice==4)
{
bankbalance();
}
else if(choice==5)
{
System.out.println("Do you want to Exit?");
yn=sx.next();
if(yn.equals("yes"))
{
break;
}
else
{
continue;
}
}
if(choice>5)
{
System.out.println("Invalid input..enter again..");
}
}
}
public static void createaccount()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name : ");
String name=sc.next();
System.out.println("Enter the amount for minimum deposit (in Rs.) : ");
amt=sc.nextInt();
System.out.println("Name : "+name);
System.out.println("Amount in your Account : Rs."+amt);
System.out.println("*****************************");
System.out.println(name+", Your account is created");
System.out.println("*****************************");
}
public static void deposit()
{
Scanner dw=new Scanner(System.in);
System.out.println("Enter the amount to deposit (in Rs.) : ");
dep=dw.nextInt();
amt=amt+dep;
System.out.println("Deposited Amount : Rs."+dep);
System.out.println("********************************");
System.out.println("Amount deposited successfully");
System.out.println("********************************");
}
public static void withdraw()
{
Scanner wd=new Scanner(System.in);
System.out.println("Enter the amount to be withdrawn (in Rs.) :");
wi=wd.nextInt();
if(amt<wi)
{
System.out.println("Your withdrawing amount is greater than the amount in your account!");
}
else
{
System.out.println("Withdrawn amount = Rs."+wi);
amt=amt-wi;
System.out.println("********************************");
System.out.println("Amount withdrawn successfully");
System.out.println("********************************");
}
}
public static void bankbalance()
{
System.out.println("Your Current balance = Rs."+amt);
}
}