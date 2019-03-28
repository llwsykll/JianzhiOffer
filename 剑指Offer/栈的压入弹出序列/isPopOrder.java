2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
	
import java.util.ArrayList;
import java.util.Stack;
 
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> sta = new Stack<Integer>();
        int popIn = 0;
        for(int i = 0;i < pushA.length;i++){
            sta.push(pushA[i]);
            while(!sta.empty() && sta.peek() == popA[popIn]){
                sta.pop();
                popIn++;
            }
        }
        return sta.empty();
    }
}