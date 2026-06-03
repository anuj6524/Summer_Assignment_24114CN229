public class RemoveDuplicateFromSortedArray {
    public static int Array(int arr[]) {
       int i =0;
       for(int j = 1;j<arr.length;j++){
        if(arr[i] != arr[j]){
            i++;
            arr[i] = arr[j];
        }
       }
       return i+1;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,4,6,6};
        int k = Array(arr);
        System.out.println("Number of unique element : "+k);
        for(int i =0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
