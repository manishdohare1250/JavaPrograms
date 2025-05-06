// product of two numbers using functions
public class _83_product_of_two_numbers_using_functions {
    static int multiplication(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int prod=multiplication(a, b);
        System.out.println("a*b:"+prod);
        prod=multiplication(4, 5);
        System.out.println("a*b:"+prod);
    }
}
