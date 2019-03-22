public class Solution {
    public void reOrderArray(int [] array) {
        int left = array.length - 2;
        int right = array.length - 1;
        while(left>-1){
            if(array[left]%2 == 0 && array[right]%2 != 0 && right - left == 1){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left--;
                right--;
            }
            else if(array[left]%2 == 0 && array[right]%2 != 0 && right - left > 1){
                int i = left;
                int temp = array[left];
                while(i < right){
                    array[i] = array[++i];
                }
                array[right] = temp;
                left--;
                right--;
            }
            else if(array[left]%2 != 0 && array[right]%2 != 0){
                left--;
            }
            else{
                left--;
                right--;
            }
        }
    }
}