//A java program to print FibonacciSeries using recursion.
class FibonacciSeries2{
    static int n1=0,n2=1,n3;
    static void printSeries(int count){
        if(count==8){
            System.out.print(n1+" "+n2);
        }
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            count--;
            printSeries(count);
        }
        }
    
          public static void main(String args[]){
            int count=8;
            printSeries(count);
          }
}