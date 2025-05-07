import java.util.Scanner;

public class _050_age {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int n1=sc.nextInt();
        if(n1>=65){
            System.out.println("senior");
        }else if(n1>=20){
            System.out.println("adult");

        }
        else if(n1>=13){
            System.out.println("Teen");

        }else {
            System.out.println("child");

        

        }sc.close();
    }
    
}
