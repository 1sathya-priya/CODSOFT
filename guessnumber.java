import java.util.*;
public class guessnumber
{
public static void main(String args[])
{
Random rand=new Random();
int random_num=rand.nextInt(100);
int guess;
int chance;
int wincount=0;
int i=1;
Scanner s=new Scanner(System.in);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("You have to guess the random number which is between 1 and 100!!");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Enter no.of chances you want to guess : ");
chance=s.nextInt();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("The number is generated!!");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
while(i<=chance)
{
System.out.println("~~~~~~~~~~~~~~~~~~~");
System.out.println("       ROUND "+i);
System.out.println("~~~~~~~~~~~~~~~~~~~");
System.out.println("Enter your guess : ");
guess=s.nextInt();
if(guess==random_num)
{
System.out.println("****************************");
System.out.println("You found the number!!");
System.out.println("****************************");
wincount+=1;
break;
}
else if(guess<random_num)
{
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Your guess is too low than the random number!!");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

}
else if(guess>random_num)
{
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Your guess is too high than the random number!!");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}
i++;
}
if(wincount==0)
{
System.out.println("****************************************");
System.out.println("You lost!!..the number is "+random_num);
System.out.println("****************************************");
}
}
}