import java.lang.Math;
public class CutRope {
    public int cutRope(int target) {
        if (target < 2) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        
        int[] arr = new int[target + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        int max = 0;
        for (int i = 4 ; i <= target; i++) {
            max = 0;
            for (int j = 1; j <= i/2; j++ ) {
                int length = arr[j] * arr[i - j];
                if (max < length) {
                    max = length;
                }
                arr[i] = max;
            }
        }
        max = arr[target];
        return max;
    }

    public int cutRopeTwo(int target) {
        if (target < 2) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }

        int numOfThree = target / 3;

        if (target - numOfThree * 3 == 1) {
            numOfThree -= 1;
        }
        int numOfTwo = (target - numOfThree * 3) / 2;
        int max = (int)Math.pow(3, numOfThree) * (int)Math.pow(2, numOfTwo);
        return max;
    }
}