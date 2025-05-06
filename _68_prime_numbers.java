// check wheather a number is prime or not
import java.util.*;
public class _68_prime_numbers {
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        System.out.println("enter your number:");
        int n=k.nextInt();
        if(n==2){
            System.out.println("n is prime");
        } else{
            boolean isprime=true;
            for(int count=2;count<=n-1;count++){//condition---count<=Math.sqrt(n);
                if(n%count==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime==true){
                System.out.println("n is prime");
            }
            else{
                System.out.println("n is not prime");
            }
        }
        k.close();
       
    }
    
}
