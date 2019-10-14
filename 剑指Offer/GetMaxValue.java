public class GetMaxValue{
    public static void main(String[] args) {
        int[][] arr = {{1,10,3,8},
                        {12,2,9,6},
                        {5,7,4,11},
                        {3,7,16,5}};
        getMax(arr);
    }

    public static void getMax(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int dp[][] = new int[rows][cols];

        dp[0][0] = arr[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0] = arr[i][0] + dp[i-1][0];
        }
        for (int j = 1; j < cols; j++) {
            dp[0][j] = arr[0][j] + dp[0][j-1];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = Math.max(arr[i][j] + dp[i-1][j], arr[i][j] + dp[i][j-1]);
            }
        }
        System.out.println(dp[rows-1][cols-1]);
    }
}