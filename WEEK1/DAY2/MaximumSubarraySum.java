public class MaximumSubarraySum{
    public static int SubarraySum(int arr[]) {
       int maxsum = Integer.MIN_VALUE;
       int cs = 0;
       int n = arr.length;
       for(int i = 0 ; i<n;i++){
             cs += arr[i];
             if(cs<0){
                cs = 0;
             }
             maxsum = Math.max(maxsum, cs);
       }
       return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,-1,7,8};
        System.out.println(SubarraySum(arr));
    }
}
