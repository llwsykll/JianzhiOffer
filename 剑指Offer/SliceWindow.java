import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
public class SliceWindow {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (num.length >= size && size >= 1) {
            Deque<Integer> que = new ArrayDeque<Integer>();
            for (int i = 0; i < size; i++) {
                while (!que.isEmpty()&& num[i] >= num[que.peekLast()]) {
                    que.pollLast();
                }
                que.offerLast(i);
            }
            for (int i  = size; i < num.length; i++) {
                res.add(num[que.peekFirst()]);
                while (!que.isEmpty() && num[i] >= num[que.peekLast()]) {
                    que.pollLast();
                }
                if (!que.isEmpty() && i - size >= que.peekFirst()) {
                    que.pollFirst();
                }
                que.offerLast(i);
            }
            res.add(num[que.peekFirst()]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {2,3,4,2,6,2,5,1};
        SliceWindow sw = new SliceWindow();
        sw.maxInWindows(num, 3);
    }
}