public class ReshapeMatrix {
    public static int[][] Matrix(int arr[][], int r, int c) {
        int m = arr.length;
        int n = arr[0].length;

        if (m * n != r * c) {
            return arr;
        }

        int res[][] = new int[r][c];

        int row = 0;
        int col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[row][col] = arr[i][j];
                col++;

                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1, 2},
            {3, 4}
        };

        int ans[][] = Matrix(arr, 2, 2);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
