class PrimeNumber{
    public static void main(String args[]){
        int num=5,i=2;
        boolean flag=false;
        for( i=2;i<=num/2;++i){
            if(num%i==0){
                flag=true;
                break;
            }

            }
            if(!flag){
                System.out.println(num+ "  is a prime number");
            }
            else{
                System.out.println(num+ " is not a prime number");
            }
            }
        }
    
