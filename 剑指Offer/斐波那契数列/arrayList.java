public class Solution {
    public int Fibonacci(int n) {
        if(n<2){
            return n;
        }
        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        for(int i=2;i<n+1;i++){
            res[i] = res[i-1]+res[i-2];
        }
        return res[n];
    }
}