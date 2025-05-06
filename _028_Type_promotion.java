// type promotion in expression
public class _028_Type_promotion {
    public static void main(String[] args) {
        char a='a';
        char b='b';
       System.out.println(b-a);//(byte,short,char) are converted into int first and then exprssions are solved

        int m=10;
        float n=20.25f;
        long c=25l;
        double d=45.67;
        double ans= m+n+c+d;
        System.out.println(ans);//(long, float,double) exist then converted into larger and then expresions are solved
    }
    
}
