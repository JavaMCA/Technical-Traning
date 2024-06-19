//Write a program to find factorial of any number
import java.util.Scanner;
class Factorial{
    public static void main(String args[])
{
    int i,fact=1;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter any number to find Factorial");
    int number=s.nextInt();
    for(i=1;i<=number;i++)
{
    fact=fact*i;

}
System.out.println("factorial of "+number+" is "+fact);
}}