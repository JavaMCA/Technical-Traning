import java.util.Scanner;
class CheckAlphabet{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter any Alphabet");
char ch=sc.next().charAt(0);
if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
{
System.out.println(ch+ " is an Alphabet");
}
else
{
System.out.println(ch+ "is not an Alphabet");
}
}
}
/* The ASCII value of lowercase alphabets are from 97 to 122. And, the ASCII value of uppercase alphabets are from 65 to 90. That is, alphabet a is stored as 97 and alphabet z is stored as 122. Similarly, alphabet A is stored as 65 and alphabet Z is stored as 90. */