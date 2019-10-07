import java.util.*;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class PrintTree {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        que.add(root);
        while(!que.isEmpty()) {
            TreeNode node = que.poll();
            if (node.left != null) {
                que.add(node.left);
            } 
            if (node.right != null) {
                que.add(node.right);
            }
            res.add(node.val);
        }
        return res;
    }
}