import java.util.*;
public class _44_odd_or_even_using_bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your number: ");
        int n1=sc.nextInt();
        
        if((n1&1)==1)
        {System.out.println("nummber is odd");}
        else{
            System.out.println("nnumber  is even");
        }
        sc.close();
    }

}
