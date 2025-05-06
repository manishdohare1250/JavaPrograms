import java.util.*;
public class _89_multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number: ");
        int n1=sc.nextInt();
        multiplicationtable(n1);
        
        sc.close();
    }
    public static void multiplicationtable(int n1){
        System.out.println("your multiplication table for given number is : ");
        for(int i=1;i<=10;i++){
        System.out.println(n1 +" * "+i+" = "+ (n1*i));
        }
    }

}
