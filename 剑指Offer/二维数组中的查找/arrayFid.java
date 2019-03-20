public class Solution {
    public boolean Find(int target, int [][] array) {
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
}
