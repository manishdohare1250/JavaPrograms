import java.util.*;
public class _064_for_loop_print_n_natural_numbers_in_reverse {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        System.out.println("enter value of n:");
        int n=k.nextInt();
        for(int count=n;count>=1;count--){
            System.out.println(count);
        }
        k.close();
    }
}
