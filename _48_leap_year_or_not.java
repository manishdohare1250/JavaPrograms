import java.util.*;
public class _48_leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year: ");
        int y=sc.nextInt();
        if(y%400==0){
            System.out.println("year is leap year");
        }
        else if((y%4==0)&&(y%100 !=0)){
            System.out.println("year is leap year");

        }else{
            System.out.println("year is  not a leap year");

        }
    sc.close();}
}
