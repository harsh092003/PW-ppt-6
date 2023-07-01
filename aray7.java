public class aray7 {
    public static void main(String[] args) {
        int n = 3;
        int output[][] = spiralMatrix(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] spiralMatrix(int n) {
        int matrix[][] = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (num <= n * n) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num;
                num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num;
                num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num;
                num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num;
                num++;
            }
            left++;
        }

        return matrix;
    }
}
