public class SingleNumOfThree {
    public int FindNumsAppearOnce(int [] array) {
        if (array == null || array.length < 2) {
            return 0;
        }
        int[] bitSum = new int[32];
        for (int i = 0; i < array.length; i++) {
            int bitMask = 1;
            for (int j = 31; j >= 0; j--) {
                int bit = array[i] & bitMask;
                if (bit != 0) {
                    bitSum[j] += 1;
                }
                bitMask <<= 1;    
            }
        }
        int result = 0;
        for (int k = 0; k < 32; k++) {
            result <<= 1;
            result += bitSum[k] % 3;
        }
        return result;
    }

    public static void main(String[] main) {
        int[] array = {2,2,4,3,3,6,6,6,3,2,5,5,5};

        SingleNumOfThree sn = new SingleNumOfThree();
        String str = "I am a student.";
        str.
        sn.FindNumsAppearOnce(array);
    }
}