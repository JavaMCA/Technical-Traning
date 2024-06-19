/* write a program print following  number Pyramid
    *
    **
    ***
    ****
    *****
 */
class StarPattern3{
    public static void main(String args[]){
        
        for(int i=0;i<=5;i++){
            for(int j=1;j<=6;j++){
                System.out.print(" ");
                
            }
            for(int k=0;k<=i;k++){
            System.out.print("*"); //for line change
            }
            System.out.println("");
        }

    }
}