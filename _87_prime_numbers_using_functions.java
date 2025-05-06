public class _87_prime_numbers_using_functions {
    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2;i<=n-1;i++){//optimezed approach for(int i=2;i<=Math.sqrt(n);i++){}
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        System.out.println(isprime(12));
    }
}
