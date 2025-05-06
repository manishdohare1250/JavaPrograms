                        //   Create a program to check wheather a number is armstrong or not
                        //  153,370,371,407,1634 are examples of armstrong numbers.
import java.util.*;
 public class _096_armstrong_numbere {
    public static void main(String[] args) {    // main method 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number: ");
        int n1=sc.nextInt();digits(n1);
        boolean result=isarmstrong(n1);
        if(result){
            System.out.println("your number is armstrong");
        }else{
            System.out.println("your number is not armstrong");
        }
        sc.close();
    }

    public static boolean isarmstrong(int num){      // method for checking number is armstrong number or not
        int numcopy=num;
        int result=0;
        int lastdigit=0;
        int noofdigits=digits(num);
        while(num>0){
            lastdigit=num%10;
            result=result+pow(lastdigit,noofdigits );
            num=num/10;
        }
        if(result==numcopy){
            return true;
        }else{
            return false;
        }

        
    }

    public static int digits(int num){    // method for calculating no of  digits of a number
        int sum=0;
        while(num>0){
            sum=sum+1;
            num=num/10;
        }
        return sum;
    }

    public static int pow(int a,int b){    // method for calculating power
        int i=1,pow=1;
        while(i<=b){
            pow=pow*a;
            i++;
        }
        return pow;
    }

}
