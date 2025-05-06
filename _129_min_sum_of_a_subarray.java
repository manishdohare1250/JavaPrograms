public class _129_min_sum_of_a_subarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6 };
        jadu(arr);
    }public static void jadu(int arr[]) {
         int sum=0;int minsum=Integer.MAX_VALUE;
         for(int i=0;i<arr.length;i++){
             for(int j=i;j<arr.length;j++){sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                  
                }if(minsum>sum){
                    minsum=sum;
                }
            }
            
        }
        System.out.println("minimum sum of a subarray="+minsum);
    }
}
