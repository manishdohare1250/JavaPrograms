public class _113_reverse_array {
    public static void main(String[] args) {
        int arr[]={2,3,6,4,7,9,5,8};
        jadu(arr);
        System.out.print("(");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(")");

    }
    public static void jadu(int arr[]) {
     int first=0;int last=arr.length-1;
    while(first<last){
        int temp=arr[last];
        arr[last]=arr[first];
        arr[first]=temp;
        first++;
        last--;
     }
        
    }
    
}
