public class UniValuedBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Function to check if tree is univalued
    public static boolean isUnivalued(Node root) {
        if (root == null) return true;
        return checkUnivalued(root, root.data);
    }

    private static boolean checkUnivalued(Node node, int value) {
        if (node == null) return true;

        // If current node's value differs, return false
        if (node.data != value) return false;

        // Check left and right recursively
        return checkUnivalued(node.left, value) && checkUnivalued(node.right, value);
    }

    public static void main(String[] args) {
        // Example 1: Univalued Tree
        Node root1 = new Node(1);
        root1.left = new Node(1);
        root1.right = new Node(1);
        root1.left.left = new Node(1);
        root1.left.right = new Node(1);

        System.out.println("Tree 1 is Univalued? " + isUnivalued(root1)); // true

        // Example 2: Not Univalued Tree
        Node root2 = new Node(2);
        root2.left = new Node(2);
        root2.right = new Node(5);
        root2.left.left = new Node(2);

        System.out.println("Tree 2 is Univalued? " + isUnivalued(root2)); // false
    }
}
