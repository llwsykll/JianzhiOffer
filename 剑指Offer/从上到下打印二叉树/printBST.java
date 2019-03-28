import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
 
    public TreeNode(int val) {
        this.val = val;
 
    }
 
}
*/
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        que.offer(root);
        while(que.size()>0){
            TreeNode node = que.poll();
            if(node.left!=null){
                que.offer(node.left);
            }
            if(node.right!=null){
                que.offer(node.right);
            }
            res.add(node.val);
        }
        return res;
    }
}

import java.util.ArrayList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
 
    public TreeNode(int val) {
        this.val = val;
 
    }
 
}
*/
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<TreeNode> que = new ArrayList<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        que.add(root);
        while(que.size()>0){
            TreeNode node = que.remove(0);
            if(node.left!=null){
                que.add(node.left);
            }
            if(node.right!=null){
                que.add(node.right);
            }
            res.add(node.val);
        }
        return res;
    }
}