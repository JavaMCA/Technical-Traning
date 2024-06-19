//
import  java.util.Scanner;
class PrintDaysOfMonth{
    public static void main(String[] args) {
        int month,year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month number:");
        month=sc.nextInt();
        System.out.println("Enter Year: ");
        year=sc.nextInt();
        if((month==2) && (year%4==0) || (year%100!=0) && (year%400==0)){
            System.out.println("number of day 29");
        }
        else if (month==2){
            System.out.println(" Number of Month Days : 28");
        }
        else if(month==1|| month==3 || month== 5||month==7 ||month==8|| month==10 || month==12){
            System.out.println(" Number of Month days: 31");

        }
        else{
            System.out.println("Number of Month Days: 30");
        }
    }
}