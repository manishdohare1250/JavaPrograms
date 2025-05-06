import java.util.*;
public class _094_reverse_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number: ");
        int n1=sc.nextInt();
        int result=revrse_number(n1);
        System.out.println("your reversex num  is "+ result);
        sc.close();
    }    public static int revrse_number(int n){
        int reverse=0;
        int lastdigit;
        while(n>0){
            lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;
        }
        return reverse;
    }


}
