public class MovingCount {
    public static int movingCount(int threshold, int rows, int cols)
    {
        if (threshold <= 0 || rows <= 0 || cols <= 0) {
            return 0;
        }
        boolean[] visited = new boolean[rows * cols];
        for (int i = 0 ; i < rows * cols; i++) {
            visited[i] = false;
        }
        int res = movingCountCore(threshold, rows, cols, 0, 0, visited);
        return res;
    }
    public static int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] visited){
        int count = 0;
        if (row >= 0 && row < rows 
           && col >= 0 && col < cols && !visited[row * cols + col]
           && isSmaller(row, count, threshold)) {
            visited[row * cols + col] = true;
            count = 1 + movingCountCore(threshold, rows, cols, row - 1, col, visited)
                    + movingCountCore(threshold, rows, cols, row + 1, col, visited)
                    + movingCountCore(threshold, rows, cols, row, col + 1, visited)
                    + movingCountCore(threshold, rows, cols, row, col - 1, visited);
        }
        return count;
    }

    public static boolean isSmaller(int row, int col, int threshold) {
        int sum = 0;
        while(row > 0) {
            sum +=  row % 10;
            row /= 10;
        }
        while (col > 0) {
            sum += col %10;
            col /= 10;
        }
        
        return sum <= threshold;
    }

    public static void main(String[] args) {
        movingCount(2, 3, 3);
    }
}