public class _127_sum_off_subarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6 };
        jadu(arr);
    }public static void jadu(int arr[]) {
         int sum=0;
         for(int i=0;i<arr.length;i++){
             for(int j=i;j<arr.length;j++){sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                  
                }System.out.println(sum);
             }System.out.println();

         }
    }
    
}
