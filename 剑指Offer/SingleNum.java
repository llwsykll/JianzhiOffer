public class SingleNum {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array == null || array.length < 2) {
            return ;
        }
        int res = 0;
        for (int num: array) {
            res ^= num;
        }
        int index = 0;
        while ((res & 1) == 0) {
            index++;
            res >>>= 1;
        }
        for (int num :array) {
            if ((num>>index & 1) != 0){
                num1[0] ^= num;
            } else {
                num2[0] ^= num;
            }
        }
    }

    public static void main(String[] main) {
        int[] array = {2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];

        SingleNum sn = new SingleNum();
        sn.FindNumsAppearOnce(array, num1, num2);
    }
}