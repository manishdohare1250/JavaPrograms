import java.util.*;
public class _075_half_pyramid_using_natural_numbers {
      public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=k.nextInt();
        System.out.println("Your pattern is here:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                
            }
            System.out.println();
        }
        k.close();

        
    }
}

    

