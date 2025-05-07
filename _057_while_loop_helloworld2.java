// wap to print hello world n times  with numbering
import java.util.*;
public class _057_while_loop_helloworld2 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("enter value of n:");
        int n=k.nextInt();
        int counter=1;
        int numbering=1;
        while(counter<=n && numbering<=n)
        {
            System.out.println(numbering+".hello world");
            counter++;
            numbering++;
           
        }
        System.out.println("well done");
        k.close();
    }
}
