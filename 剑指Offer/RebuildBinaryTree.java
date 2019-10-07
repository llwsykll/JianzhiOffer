import java.util.function.Predicate;

import sun.reflect.generics.tree.Tree;

class TreeNode {
    private int value;

    private TreeNode left;

    private TreeNode right;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

public class RebuildBinaryTree{
    public static TreeNode  rebuildBinaryTree(int[] preOrder, int[] inOrder, int len) {
        if (preOrder == null || inOrder == null || len <= 0) {
            return null;
        }
        return subRebuild(preOrder, inOrder, 0, len - 1, 0, len - 1);
    }
    public static TreeNode subRebuild(int[] preOrder, int[] inOrder, int startPre, int endPre, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) return null;
        TreeNode root = new TreeNode(preOrder[startPre]);

        for(int i = startIn; i <= endIn; i++) {
            if (preOrder[startPre] == inOrder[i]) {
                root.setLeft(subRebuild(preOrder,inOrder,startPre+1,startPre+i,startIn,startIn+i-1));
                root.setRight(subRebuild(preOrder,inOrder,startPre+i+1,endPre,startIn+i,endIn));
                break;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[] preOrder = {1,2,4,7,3,5,6,8};
        int[] inOrder = {4,7,2,1,5,3,8,6};
        rebuildBinaryTree(preOrder, inOrder, preOrder.length);
    }
}