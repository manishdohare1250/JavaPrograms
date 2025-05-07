import java.util.*;
public class _076_print_half_pyramid_usin_aplhabet_characters {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=k.nextInt();
        char ch='A';
        System.out.println("Your pattern is here:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        k.close();

        
    }
}

    

