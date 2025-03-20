package Arrays;
import java.util.*;

public class spiralmatrix {
    public static void Spiralmatrix(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1; // Fixed index out-of-bounds issue

        while (startrow <= endrow && startcol <= endcol) {
            // Top row
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }

            // Right column
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }

            // Bottom row
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) break;
                System.out.print(matrix[endrow][j] + " ");
            }

            // Left column
            for (int i = endrow - 1; i > startrow; i--) {  // Fixed condition (i > startrow)
                if (startcol == endcol) break;
                System.out.print(matrix[i][startcol] + " ");
            }

            // Move towards inner spiral
            startcol++;
            startrow++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }

    public static void main(String args[]) { // Fixed main method
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        Spiralmatrix(matrix);
    }
}

