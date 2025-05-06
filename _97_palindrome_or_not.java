import java.util.Scanner;
public class _97_palindrome_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number: ");
        int n1=sc.nextInt();
        boolean result=palindrome_number(n1);
        if(result){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
        
        sc.close();
    }    public static boolean palindrome_number(int n){
        int reverse=0;int num=n;
        int lastdigit;
        while(n>0){
            lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;
        }
        return reverse==num;}
}
