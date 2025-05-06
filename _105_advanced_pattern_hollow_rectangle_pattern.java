// printing advanced pattern using function and loops
public class _105_advanced_pattern_hollow_rectangle_pattern {//// it is a class
 ///1. function to print hollow ractangle pattern with asterisk
    public static void HollowRactangle(int totRows,int totCols){
        for(int i=1; i<=totRows;i++ ){
            for(int j=1;j<=totCols;j++){
                if(i==1 || j==1||i==totRows||j==totCols){
                  System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
 // 2.function to print inverted rotated half pyramid pattern with asterisk
    public static void inverted_rotated_half_pyramid(int n){
     for(int i=1;i<=n;i++){
        // spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

     }
    }
 // 3.function to print inverted half pyramid pattern using natural numbers
    public static void inverted_half_pyramid( int n){
        for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
           }
           System.out.println();
        }
    }
 // 4.function to print floyd's triangle with natural numbers
    public static void floydtriangle(int n){
        int counter=1;
        for(int i=1;i<=n ;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;

            }
            System.out.println();
        }
    }
 // 5.function to print 0-1 triangle
    public static void _0_1_triangle(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
 // //6.function to print butterfly pattern using asterisk
    public static void butterfly(int n){
        // 1st half
        for(int i=1;i<=n;i++){
            // stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
             }
            //  spaces-2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i=n;i>=1;i--){
             // stars-i
             for(int j=1;j<=i;j++){
                System.out.print("*");
             }
            //  spaces-2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 // 7.function to print solid Rhombus
    public static void solid_rhombus(int n){
        for( int i=1;i<=n;i++){
            // for spaces
            for( int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for stars
            for( int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 // /8.function to print hollow rhombus usingasterisk
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // hollow rectangle-stars
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                 }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
 // 9.diamond pattern
    public static void diamond_pattern(int n){
        // first half
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=(n-i);j++){
                 System.out.print(" ");
            }
            // for  stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
           }
           System.out.println();


        }
        // second half
        for (int i=n;i>=1;i--){
             // spaces
             for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
           }
           // for  stars
           for(int j=1;j<=(2*i)-1;j++){
               System.out.print("*");
          }
          System.out.println();



        }
    }



    // main method or function in which we will call functions
    public static void main(String[] args) {
         HollowRactangle(4, 5);///calling function 1.
        inverted_rotated_half_pyramid(6);  ///calling function 2.
        inverted_half_pyramid(6); ////      calling functio 3
        floydtriangle(5);         ///calling function 4.
       _0_1_triangle(5);        ////calling function 5
        butterfly(4);              ///calling function 6
        solid_rhombus(4);       ////calling function   7.
        hollow_rhombus(5);       ///calling function 8.
       diamond_pattern(4);       ////calling function 9
     }
}
