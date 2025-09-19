// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class MaxPathSum {
    // Variable to store the global maximum path sum
    private int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        findMaxPath(root);
        return maxSum;
    }

    // Helper function to calculate max path sum from each node
    private int findMaxPath(TreeNode node) {
        if (node == null)
            return 0;

        // Recursively calculate max path sum from left and right
        int leftMax = Math.max(findMaxPath(node.left), 0); // ignore negative paths
        int rightMax = Math.max(findMaxPath(node.right), 0); // ignore negative paths

        // Path through the current node
        int currentPathSum = node.val + leftMax + rightMax;

        // Update global maximum
        maxSum = Math.max(maxSum, currentPathSum);

        // Return the max gain if we continue the path upwards
        return node.val + Math.max(leftMax, rightMax);
    }

    // Example usage
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaxPathSumBinaryTree solution = new MaxPathSumBinaryTree();
        System.out.println("Maximum Path Sum: " + solution.maxPathSum(root));
    }
}
