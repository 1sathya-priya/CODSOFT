import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class gradecalculator
{
    public static void main(String args[])throws Exception
    {   
        int n;
        int avg;
        String res;
        String grade;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no.of marks:");
        n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Mark "+(i+1)+" = ");
            a[i]=s.nextInt();
        }
        int sum=0;
        for(int j=0;j<n;j++)
        {
            sum=sum+a[j];
        }
        avg=sum/n;
        res="P";
        for(int r=0;r<n;r++)
        {
            if(a[r]<40)
            {
                res="F";
                break;
            }
        }
        if(res.equals("F"))
        {
            grade="FAIL";
        }
        else if(avg>=90)
        {
            grade="O GRADE";
        }
        else if(avg>=80 && avg<90)
        {
            grade="A GRADE";
        }
        else if(avg>=70 && avg<80)
        {
            grade="B GRADE";
        }
        else if(avg>=60 && avg<70)
        {
            grade="C GRADE";
        }
        else if(avg>=50 && avg<60)
        {
            grade="D GRADE";
        }
        else
        {
            grade="E GRADE";
        }
        System.out.println("The Sum of "+n+" marks = "+sum);
        System.out.println("The Average of "+n+" marks = "+avg);
        System.out.println("The Grade for "+n+" marks ="+grade);
    }
}