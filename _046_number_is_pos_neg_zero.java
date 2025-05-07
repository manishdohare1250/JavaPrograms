import java.util.*;
public class _046_number_is_pos_neg_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number: ");
        int n1=sc.nextInt();  
        if(n1>0){
            System.out.println("number is positive");
        }  else if(n1<0){
            System.out.println("number is negative");

        }else{
            System.out.println("number is zero");

        }
        sc.close();
    }
}
