public class Solution {
    public int JumpFloorII(int target) {
        if(target<2){
            return target;
        }
        int[] arr = new int[target+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < target+1; i++){
            for(int j = 0; j <i;j++){
                arr[i]+=arr[j];
            }
        }
        return arr[target];
    }
}