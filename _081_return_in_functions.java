// return in functions in java
public class _081_return_in_functions {
    public static void main(String[] args) {
        int averageFromFunction=average(5, 9);
        System.out.println(averageFromFunction);
    }
    public static int average (int a,int b) {
        int avg=(a+b)/2;
        return avg;

    }
    
}
