import java.util.*;
public class _088_prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n1=sc.nextInt();
        boolean result=isprime(n1);
        if(result){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }
        sc.close();
    }public static boolean isprime(int num){
         boolean prime=true;
         if (num==2){
            return prime;
        }else if(num>2){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return prime=false;
                }
            }
        }
        return true;
    }

}
