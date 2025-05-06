import java.util.*;
public class _90_sum_of_all_odd_num_in_given_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
        int sum=oddsum( n1);
        System.out.println("oddsum till "+n1+" is: "+sum);
      sc.close();
    }
    public static int  oddsum(int n){
        int sum=0;
        for(int i=1;i<=n;i=i+2){
            sum=sum+i;
        }
        return sum;
    }

}
