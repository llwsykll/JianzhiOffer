import java.util.ArrayList;
public class PrintMatrix {
    private ArrayList<Integer> res = new ArrayList<Integer>();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix == null) {
            return null;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        while (cols > start * 2 && rows > start *2){
            printMatrixNum(matrix, cols, rows, start);
            start++;
        }
        return res;
    }
    public void printMatrixNum(int[][] matrix, int cols, int rows, int start) {
        int endX = cols - 1 - start;
        int endY = rows - 1 - start;
        for (int i = start; i <= endX; i++) {
            res.add(matrix[start][i]);
        }
        if (start < endY) {
            for (int i = start + 1; i<= endY; i++) {
                res.add(matrix[i][endX]);
            }
        }
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--) {
                res.add(matrix[endY][i]);
            }
        }
        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start+ 1; i--) {
                res.add(matrix[i][start]);
            }
        }
    }

    public static void main(String[] args) {
        PrintMatrix pm = new PrintMatrix();
        int[][] arr = new int[][]{{1}};
        pm.printMatrix(arr);
    }
}