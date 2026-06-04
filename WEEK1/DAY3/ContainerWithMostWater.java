public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxwater = 0;
        int lp = 0;
        int rp = height.length - 1;

        while (lp < rp) {
            int width = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            int area = width * ht;

            maxwater = Math.max(area, maxwater);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxwater;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        ContainerWithMostWater obj = new ContainerWithMostWater();
        System.out.println(obj.maxArea(arr));
    }
}