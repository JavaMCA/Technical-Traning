/* write a program print following  number Pyramid
123456789
 1234567
  12345
   123
    1
 */
class NumberPyramid14{
    public static void main(String args[]){
        int num=1;
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
                
            }
            for(int k=1;k<(i*2);k++){
            System.out.print(k); 
        }
        System.out.println();
    }

    }
}