public class SumOfNodes {
    public static void main(String[] args) {
        // Build the tree
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3,
                        null,
                        new TreeNode(6)));

        System.out.println("Sum of all nodes in binary tree is : " + sumNodes(root));
    }

    // TreeNode holds integer values
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int item) {
            val = item;
            left = right = null;
        }

        TreeNode(int item, TreeNode left, TreeNode right) {
            val = item;
            this.left = left;
            this.right = right;
        }
    }

    // Recursive function to compute sum
    static int sumNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + sumNodes(root.left) + sumNodes(root.right);
    }
}
