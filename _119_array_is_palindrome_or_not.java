 import java.util.*;
 public class _119_array_is_palindrome_or_not {
    public static void main(String[] args) {
        
        Scanner Sc=new Scanner(System.in);
        int arrays[]=ArrayUtil.getArrayFromUser();
        ArrayUtil.printArray(arrays);
        boolean result=ispalindrome(arrays);
        System.out.println();
        if(result){
            System.out.println("Your array is palindrome");
        }else{
            System.out.println("your array is not palindrome");
        }
        Sc.close();

    } public static boolean ispalindrome(int arr[]){
         int i=0;
         while(i<arr.length/2){
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }i++;
         }
        
        return true;
    }
}
