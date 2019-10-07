public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;
        int index = Partition(array, start, end);
        while (index != mid) {
            if(index < mid) {
                index = Partition(array, index + 1, end);
            } else {
                index = Partition(array, start, index - 1);
            }
        }
        int result = array[mid];
        if (!CheckIsHalf(array, result)) {
            result = 0;
        }
        return result;
    }
    public int Partition(int[] array, int start, int end) {
        int sand = array[start];
        while (start < end) {
            while (start < end && array[end] >= sand) {
                end--;
            }
            array[start] = array[end];
            while (start < end && array[start] < sand) {
                start++;
            }
            array[end] = array[start];
        }
        array[start] = sand;
        return start;
    }
    public boolean CheckIsHalf(int[] array, int result) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == result) {
                num ++;
            }
        }
        if (num * 2 > array.length) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        MoreThanHalfNum mt = new MoreThanHalfNum();
        int[] array = {1,2,3,2,2,2,5,4,2};
        mt.MoreThanHalfNum_Solution(array);
    }
}