import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Comparator;

public class getMidNum {
    public PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(50, new Comparator<Integer>() {
        public int compare(Integer i, Integer j) {
            return j.compareTo(i);
        }
    });
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private int count = 0;
    public void Insert(Integer num) {
        if(count%2 == 0) {
            maxHeap.offer(num);
            int max = maxHeap.poll();
            minHeap.offer(max);
        } else {
            minHeap.offer(num);
            int min = minHeap.poll();
            maxHeap.offer(min);
        }
        count++;
    }

    public Double GetMedian() {
        if(count%2 == 0) {
            return new Double((maxHeap.peek() + minHeap.peek()) / 2);
        }
        return new Double(minHeap.peek());
    }


}