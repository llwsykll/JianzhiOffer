import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
public class GetLeastNums {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> kNums = new ArrayList<Integer>();
        if (input == null || input.length == 0 || k > input.length || k <= 0) {
            return kNums;
        }
        int len = input.length;
        int start = 0;
        int end = len - 1;
        int index = Partition(input, start, end);
        while(index != k - 1){
            if (index > k-1) {
                index = Partition(input, start ,index - 1);
            } else {
                index = Partition(input, index + 1, end);
            }
        }
        for (int i = 0 ; i < k; i++) {
            kNums.add(input[i]);
        }
        return kNums;
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

    public ArrayList<Integer> GetLeastNumUseHeap (int[] input, int k) {
        ArrayList<Integer> kNums = new ArrayList<Integer>();
        int len = input.length;
        if (k > len || k <= 0) {
            return kNums;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                return j.compareTo(i);
            }
        });
        for (int i = 0; i < len; i++){
            if (maxHeap.size() < k) {
                maxHeap.offer(input[i]);
            } else {
                if (maxHeap.peek() > input[i]) {
                    maxHeap.poll();
                    maxHeap.offer(input[i]);
                }
            }
        }
        for(Integer i : maxHeap) {
            kNums.add(i);
        }
        return kNums;
    }

    public static void main(String[] args) {
        GetLeastNums glm = new GetLeastNums();
        int[] arr = {4,5,1,6,2,7,3,8};
        glm.GetLeastNumUseHeap(arr, 4);
    }
}