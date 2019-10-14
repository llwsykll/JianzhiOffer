public class GetFirstK {
    public int GetNumberOfK(int [] array , int k) {
        int length = array.length;
        int first = GetFirstK(array, k, 0, length - 1);
        int last = GetLastK(array, k, 0, length - 1);

        if (last == first) {
            return 0;
        }
        return last - first + 1;
    }

    public static int GetFirstK(int[] array, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int length = array.length;
        int mid = (start + end) / 2;
        if (mid < length && array[mid] == k) {
            if ((mid > 0 && array[mid - 1] != k ) || mid == 0 || mid > length-1) {
                return mid;
            } else {
                end = mid - 1;
            }
        } else if (array[mid] > k) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        return GetFirstK(array, k, start, end);
    }

    public static int GetLastK(int[] array, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int length = array.length;
        int mid = (start + end) / 2;
        if (array[mid] == k) {
            if ((mid < length - 1 && array[mid + 1] != k) || mid == length -1) {
                return mid;
            } else {
                start = mid + 1;
            }
        } else if (array[mid] > k) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        return GetLastK(array, k, start, end);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,3,3,3,4,5};
        GetFirstK gfk = new GetFirstK();
        gfk.GetNumberOfK(arr, 6);
    }
}