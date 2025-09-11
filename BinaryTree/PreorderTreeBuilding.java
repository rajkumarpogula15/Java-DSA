import java.util.LinkedList;
import java.util.List;

public class PreorderTreeBuilding {
    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val); // Visit the root
        preorderHelper(node.left, result); // Traverse left subtree
        preorderHelper(node.right, result); // Traverse right subtree
    }

    public static void main(String[] args) {
        PreorderTree tree = new PreorderTree();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = tree.preorderTraversal(root);
        System.out.println(result); // Output: [1, 2, 3]
    }
}
