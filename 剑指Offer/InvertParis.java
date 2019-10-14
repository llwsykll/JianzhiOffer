public class InvertParis {
    public int InversePairs(int [] array) {
        int length = array.length;

        int[] newArr = new int[length];
        for (int i = 0; i < length; i++) {
            newArr[i] = array[i];
        }

        int count = InversePairsCore(array, newArr, 0, length - 1);
        return count;
    }

    public int InversePairsCore(int[] array, int[] newArr, int start, int end) {
        if (start == end) {
            return 0;
        }
        int length = (end + start) / 2;

        int left = InversePairsCore(array, newArr, start, length + start);
        int right = InversePairsCore(array, newArr, start + length + 1, end);

        int i = start + end;
        int j = end;

        int indexNew = end;
        int count = 0;
        while (i > start && j >= start + length + 1) {
            if (array[i] > array[j]) {
                newArr[indexNew--] = array[i--];
                count += j - length;
            } else {
                array[indexNew--] = array[j--];
            }
        }

        for (; i >= start; i--) {
            newArr[indexNew--] = array[i];
        }

        for (; j >= start + length + 1; j--) {
            newArr[indexNew--] = array[j];
        }

        return left + right + count;
    }

    public static void main(String[] args) {
        int[] arr = {7,5,6,4};
        InvertParis ip = new InvertParis();
        System.out.println(ip.InversePairs(arr));
    }
}