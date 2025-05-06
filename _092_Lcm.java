import java.util.*;
public class _092_Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter second number: ");
        int n2=sc.nextInt();
        int lcm=lcm(n1, n2);
        System.out.println("your lcm is: "+lcm);
        sc.close();
    }
    public static int lcm(int m,int n){
        int  i=1;
        while(true){
            int factor=m*i;
            if (factor%n==0){
                return factor;
            }
            i++;
        }
        
    }

}
