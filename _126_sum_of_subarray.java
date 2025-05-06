public class _126_sum_of_subarray {
 public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        jadu(arr);
    }public static void jadu(int arr[]) {
        int total=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                   sum=sum+arr[k];
                      System.out.print(arr[k]+" ");
                }System.out.print(",sum="+sum);
                System.out.println();
                total++;
             }System.out.println();
        }System.out.println("totalsubarray"+total);
    }
    
}

