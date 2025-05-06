import java.util.*;
public class _103_isEven {
 public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        System.out.println("Enter your number:");
        int a=k.nextInt();
        if (isEven(a)) {
            System.out.println("Number is Even");

            
        }
        else{
            System.out.println("Number is odd");
        }
       k.close();

    }
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    

    
}
