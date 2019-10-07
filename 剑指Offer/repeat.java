import java.util.*;

public class repeat {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        if (arr == null || arr.length == 0) {
            System.out.println("没有重复元素");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                continue;
            }
            if (arr[arr[i]] == arr[i]) {
                System.out.println(arr[i]);
                break;
            } else {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
    }
}