public class _128_max_sum_of_subarray {
    

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6 };
        jadu(arr);
    }public static void jadu(int arr[]) {
         int sum=0;int maxsum=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
             for(int j=i;j<arr.length;j++){sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                  
                }if(maxsum<sum){
                    maxsum=sum;
                }
            }
            
        }
        System.out.println("maximum sum of a subarray="+maxsum);
    }
    
}

