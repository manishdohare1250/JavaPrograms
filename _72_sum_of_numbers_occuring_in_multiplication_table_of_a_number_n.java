import java.util.*;
public class _72_sum_of_numbers_occuring_in_multiplication_table_of_a_number_n {
    public static void main(String[] args) {
     Scanner k=new Scanner(System.in);
     System.out.println("enter a  number:");
     int n=k.nextInt();
      int sum=0;
      System.out.println("multilpication table of a  number:");
     for(int i=1;i<=10;i++){
        sum=sum+(n*i);
        System.out.println(n+"*"+i+":"+(n*i));
    }
    System.out.println("sum of numbers is:"+sum);
    k.close();
}
}
