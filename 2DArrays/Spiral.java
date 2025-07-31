public class Spiral {
    public static void spiralArray(int arr[][]) {
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Top
            for (int j = colStart; j <= colEnd; j++) {
                System.out.print(arr[rowStart][j] + " ");
            }

            // Right
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");
            }

            // Bottom
            if (rowStart < rowEnd) {
                for (int j = colEnd - 1; j >= colStart; j--) {
                    System.out.print(arr[rowEnd][j] + " ");
                }
            }

            // Left
            if (colStart < colEnd) {
                for (int i = rowEnd - 1; i > rowStart; i--) {
                    System.out.print(arr[i][colStart] + " ");
                }
            }
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4, 17},
            {5, 6, 7, 8, 18},
            {9, 10, 11, 12, 19},
            {13, 14, 15, 16, 20},
            {13, 14, 15, 16, 20}
        };
        spiralArray(arr);
    }
}
