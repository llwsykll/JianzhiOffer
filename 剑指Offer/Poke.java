import java.util.Arrays;

public class Poke {
    public boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }
        Arrays.sort(numbers);
        int numOfZero = 0;
        int numOfNeed = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numOfZero ++;
            } else {
                if (i > 0) {
                    numOfNeed += numbers[i] - numbers[i-1] - 1;
                }
            }
        }
        return numOfZero == numOfNeed;
    }

    public static void main(String[] args) {
        int[] numbers = {}
    }
}