//java program to break an integer into digits using while loop
class BreakIntegerDigits{
    public static void main(String args[]){
        int number=12321;
        while(number>0){
            int digit=number%10;
            System.out.print(" ");
            System.out.print(digit);
            number=number/10;
        }
    }
}