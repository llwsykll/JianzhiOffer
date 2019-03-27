import java.util.Stack;
import java.util.ArrayList;

public class Solution {
    private ArrayList<Integer> arr = new ArrayList<Integer>();
    private ArrayList<Integer> minList = new ArrayList<Integer>();
    private int min = Integer.MAX_VALUE;
    
    public void push(int node) {
        arr.add(node);
        if(node<=min){
            minList.add(node);
            min = node;
        }else{
            minList.add(min);
        }
    }
    
    public void pop() {
        int end = arr.size()-1;
        arr.remove(end);
        minList.remove(end);
        min = minList.get(minList.size()-1);
    }
    
    public int top() {
        return arr.get(arr.size()-1);
    }
    
    public int min() {
        return min;
    }
}

import java.util.Stack;
import java.util.ArrayList;

public class Solution {
    private Stack<Integer> arr = new Stack<Integer>();
    private ArrayList<Integer> minList = new ArrayList<Integer>();
    private int min = Integer.MAX_VALUE;
    private int size = 0;
    
    public void push(int node) {
        size++;
        arr.push(node);
        if(node<=min){
            minList.add(node);
            min = node;
        }else{
            minList.add(min);
        }
    }
    
    public void pop() {
        arr.pop();
        minList.remove(size-1);
        size--;
        min = minList.get(size-1);
    }
    
    public int top() {
        int res = arr.pop();
        arr.push(res);
        return res;
    }
    
    public int min() {
        return min;
    }
}