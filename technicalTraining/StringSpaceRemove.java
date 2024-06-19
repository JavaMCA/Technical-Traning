class StringSpaceRemove{
    public static void main(String args[]){
        String s="     hello    java welcome to world of programming  ";
       String s1=s.replaceAll("\\s","");
        System.out.println(s1);

        String n="hello 123 wellcome 456";
        String n1=n.replaceAll("\\d","*");
        System.out.println(n1);

        String m="hello@ 123 wellcome@";
        String m1=m.replaceAll("@","java");
        System.out.println(m1);


    }
}