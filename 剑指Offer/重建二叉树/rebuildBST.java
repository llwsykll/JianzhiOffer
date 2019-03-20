/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = reConstructBinaryTreeIndex(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    public TreeNode reConstructBinaryTreeIndex(int [] pre,int startPre, int endPre, int [] in,int startIn, int endIn) {
        if(startPre > endPre || startIn > endIn){
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);
        for(int index = 0;index<in.length;index++){
            if(in[index] == pre[startPre]){
                root.left = reConstructBinaryTreeIndex(pre,startPre+1,startPre+index-startIn,in,startIn,index-1);
                root.right = reConstructBinaryTreeIndex(pre,index-startIn+startPre+1,endPre,in,index+1,endIn);
                break;
            }
        }
        return root;
    }
}