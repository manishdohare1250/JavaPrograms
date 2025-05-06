public class _86_function_overloading {
//function overloading- Multiple functions with
                   //  the same name but different parameters.
public static int sum(int a,int b){//fun to calcilate sum of 2 numbers
    return a+b;
}
public static int sum(int a,int b,int c){// fun to calc sum of 3 numbers
    
    return a+b+c;
}// function overloading by <no.>of parameters
public static float sum(float a,float b){//fun to calcilate sum of 2 numbers
    return a+b;
}//function overloading by <datatypes> of parameters
public static void main(String[] args) {
   System.out.println( sum(2,4));
   System.out.println(sum(2,4,3));
   System.out.println(sum(3.2f,4.8f));//
    
    
}
}
