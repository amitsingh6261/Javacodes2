public class WavePattern {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int row = a.length;
        int col = a[0].length;

        for (int j = 0; j < col; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < row; i++)
                    System.out.print(a[i][j] + " ");
            } else {
                for (int i = row - 1; i >= 0; i--)
                    System.out.print(a[i][j] + " ");
            }
        }
    }
}