//program to swap two number without using a third variable
public class Swapping{
    public static void main(String args[]){
        int a=10;
        int b=20;
        System.out.println("Before swapping a is " +a +" and b is " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping, a is " +a+ " and b is " +b);
    }
}