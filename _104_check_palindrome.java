import java.util.*;
public class _104_check_palindrome {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n1=k.nextInt();
        if(ispalindrome(n1)){
            System.out.println("Number :"+ n1+ " is a palindrome");
        }
        else{
            System.out.println("Number :"+ n1+ " is  not a palindrome");
        }
        k.close();

    }
    public static boolean ispalindrome(int n1){
           int palindrome=n1;
           int reverse=0;
           while(palindrome!=0){
            int remainder=palindrome%10;
            reverse=reverse*10+remainder;
            palindrome=palindrome/10;
           }
           if(n1==reverse){
            return true;
           }
           return false;
    }
}
