public class HeightofTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int item) {
            val = item;
            left = right = null;
        }
    }
    int height(TreeNode node) {
        if (node == null)
            return 0;
        else {
            int lheight = height(node.left);
            int rheight = height(node.right);
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
    public static void main(String[] args) {
        HeightofTree tree = new HeightofTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        System.out.println("Height of tree is : " + tree.height(root));
    }
}
