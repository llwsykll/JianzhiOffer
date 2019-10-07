public class arrayFid {
    public static boolean Find(int target, int [][] array) {
        int rowSum = array.length;
        int colSum = array[0].length;
        int i = rowSum-1;
        int j = 0;
        while(i>=0 && j<colSum){
            if(target == array[i][j]){
                return true;
            }
            if(target < array[i][j]){
                i--;
                continue;
            }
            if(target > array[i][j]){
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 8, 9},
                        {2,4, 9,12},    
                        {4,7,10,13},
                        {6,8,11,15}};
        System.out.println(Find(5, arr));
    }
}
