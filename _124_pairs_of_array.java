public class _124_pairs_of_array {
    public static void main(String[] args) {
        int arr[]={34,23,22,54,67,78};
        jadu(arr);
    }public static void jadu(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
