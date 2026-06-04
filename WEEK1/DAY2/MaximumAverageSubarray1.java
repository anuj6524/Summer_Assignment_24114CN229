public class MaximumAverageSubarray1 {
    public static double   SubarraySum(int arr[],int k) {
       int maxsum = 0;
       if(k>arr.length){
        return 0;
       }
       int cs = 0;
       for(int i = 0;i<k;i++){
        cs += arr[i];
       }
       maxsum = cs;
       for(int i = k;i<arr.length;i++){
        cs += arr[i]-arr[i-k];
        if(maxsum<cs){
            maxsum = cs;
        }
       }
      
       return (double)maxsum/k;
    }
    public static void main(String[] args) {
        int arr[] = {5};
        int k = 1;
        System.out.println(SubarraySum(arr,k));
    }
}


