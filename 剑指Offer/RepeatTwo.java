import java.util.*;

public class RepeatTwo {
    public static int count(int[] arr, int length, int start, int end) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] >= start && arr[i] <= end) {
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 3, 2, 6, 7};
        if (arr == null || arr.length == 0) {
            System.out.println("无重复元素");
        }
        int start = 1;
        int end = arr.length - 1;
        while (end >= start) {
            int mid = (end - start) / 2 + start;
            int res = count(arr, arr.length, start, mid);
            if (end == start) {
                if (res > 1) {
                    System.out.println(start);
                    break;
                } else {
                    break;
                }
            }
            if (res > (mid - start + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("-1");
    }
}