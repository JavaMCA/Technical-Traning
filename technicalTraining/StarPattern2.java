/* write a program print following  number Pyramid
 * *****
 * ****
 * ***
 * **
 * *
 */
class StarPattern2{
    public static void main(String args[]){
        
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
                
            }
            System.out.println(); //for line change
        }

    }
}