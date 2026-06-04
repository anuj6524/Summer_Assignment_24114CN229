
public class SquareOfASortedArray {
    public static void Square(int nums[]) {
        int l = 0;
        int n = nums.length;
        int r = n - 1;
        int res[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                res[i] = nums[l] * nums[l];
                l++;
            } else {
                res[i] = nums[r] * nums[r];
                r--;
            }
        }

       for(int i = 0; i < n; i++){
    System.out.print(res[i] + " ");
}
    }

    public static void main(String[] args) {
        int arr[] = {-4, -2, -1, 0, 5};
        Square(arr);
    }
}

      
