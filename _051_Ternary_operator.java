// Ternary operator     
// check student is pass or failby entering his number
import java.util.*;
public class _051_Ternary_operator {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
         System.out.println("enter number:");
         int n=k.nextInt();
         String type=(n>=33)?"pass":"fail";//ternary operator,,,datatype variable=(condition)?"statement1":"statement2";
         System.out.println(type); 
         k.close();   
    }
    
}
