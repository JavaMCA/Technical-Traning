import java.util.Scanner;
class MultipicationTable{
    public static void main(String args[]){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print table : ");
        number=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(number+ "*" +i+ "=" +(number*i));
        }
       
    }
}