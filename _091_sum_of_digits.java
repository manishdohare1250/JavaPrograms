import java.util.*;
public class _091_sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
        int result=digitsum(n1);
        System.out.println("your digit sum is "+ result);
        sc.close();
    }
    public static int digitsum(int n){
        int sum=0;
        int lastdigit;
        while(n>0){
            lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
        }
        return sum;
    }

}
