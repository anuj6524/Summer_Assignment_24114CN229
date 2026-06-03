public class TwoSum{
           public static void Sum(int arr[],int target) {
              int sum = Integer.MIN_VALUE;
              int n = arr.length;
              for(int i =0 ;i<n;i++){
                for(int j = i+1;j<n;j++){
                    sum = arr[i]+arr[j];
                     if(sum==target){
                   System.out.println("The require index are :"+i+","+j);
                }
                }
               
              }
           }
           public static void main(String[] args) {
               int arr[] ={7,2,11,15};
               int target = 26;
               Sum(arr, target);
           }
           
}