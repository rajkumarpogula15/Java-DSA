public class TreeTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " "); // Visit the root
        preorderTraversal(root.left);       // Traverse left subtree
        preorderTraversal(root.right);      // Traverse right subtree
    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);        // Traverse left subtree
        System.out.print(root.val + " ");   // Visit the root
        inorderTraversal(root.right);       // Traverse right subtree
    }

    public void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);      // Traverse left subtree
        postorderTraversal(root.right);     // Traverse right subtree
        System.out.print(root.val + " ");   // Visit the root
    }

   public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        TreeTraversal traversal = new TreeTraversal();

        System.out.print("Preorder Traversal: ");
        traversal.preorderTraversal(root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        traversal.inorderTraversal(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        traversal.postorderTraversal(root);
        System.out.println();
    }
}
