class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class KthTreeNode {
    int k;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot == null || k == 0) {
            return null;
        }
        this.k = k;
        return KthNodeCore(pRoot, k);
    }
    TreeNode KthNodeCore(TreeNode pRoot, int k) {
        TreeNode res = null;
        if (pRoot.left != null) {
            res = KthNodeCore(pRoot.left, k);
        }
        if (res == null) {
            if (k == 1) {
                res = pRoot;
            }
            k--;
        }
        if (res == null && pRoot.right != null) {
            res = KthNodeCore(pRoot.right, k);
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode one = new TreeNode(6);
        TreeNode two = new TreeNode(10);
        TreeNode three = new TreeNode(5);
        TreeNode four = new TreeNode(7);
        TreeNode five = new TreeNode(9);
        TreeNode six = new TreeNode(11);
        root.left = one;
        root.right = two;
        one.left = three;
        one.right = four;
        two.left = five;
        two.right = six;

        KthTreeNode ktn = new KthTreeNode();
        ktn.KthNode(root, 2);
    }
}