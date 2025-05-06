public class _27_Type_conversion_or_Type_casting {
    public static void main(String[] args) {
        // int a=25;
        // float b=a;
        // System.out.println(b);//25.0--widening/implicit conversion
        float m=78.989f;
        // int n=m;  //this will give error
        int n=(int)m;// this convert float to int errr free-----narrowing/explicit conversion/lossy conversion
        System.out.println(n);//78



        /*
         * Type casting or type conversion
              *1. Widening/ Implicit / Nonlossy/ Small to large ,conversion
                        (byte < short < int < long < float < double) 

               2. Narrowing/ Explicit/ lossy /large to small  ,conversion    
                        (double  > float > long > int > short > byte )          
         */
     }
    

    
}
