public class CountNodes {
    public static void main(String[] args) {
        // Build the tree with letters instead of numbers
        TreeNode root = new TreeNode('A',
                new TreeNode('B',
                        new TreeNode('D'),
                        new TreeNode('E')),
                new TreeNode('C',
                        null,
                        new TreeNode('F')));

        System.out.println("Count of nodes in binary tree is : " + countNodes(root));
    }

    // TreeNode now stores a char instead of int
    static class TreeNode {
        char val;
        TreeNode left, right;

        TreeNode(char item) {
            val = item;
            left = right = null;
        }

        TreeNode(char item, TreeNode left, TreeNode right) {
            val = item;
            this.left = left;
            this.right = right;
        }
    }

    // Count all nodes recursively
    static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
