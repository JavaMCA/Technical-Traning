//program to find the sum of natural number from 1 to 1000 using for loop
class SumOfNaturalNumber9{
    public static void main(String args[]){
        int sum=0;
        int n=1000;
        for (int i=1;i<=n;i++){
            sum +=i;
        }
        System.out.println("sum=" +sum);

    }
}