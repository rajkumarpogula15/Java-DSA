public class SubTreeCheck {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }
    static boolean areIdentical(Node root1, Node root2) {
        // Both trees are empty
        if (root1 == null && root2 == null) {
            return true;
        }
        // Both trees are non-empty and data matches
        if (root1 != null && root2 != null) {
            return (root1.data == root2.data) &&
                   areIdentical(root1.left, root2.left) &&
                   areIdentical(root1.right, root2.right);
        }
        // One tree is empty, and the other is not
        return false;
    }
    public static boolean isSubtree(Node tree, Node subTree) {
        if (subTree == null) {
            return true; // An empty subtree is always a subtree
        }
        if (tree == null) {
            return false; // Non-empty subtree can't be in an empty tree
        }
        // Check if the current tree and subtree are identical
        if (areIdentical(tree, subTree)) {
            return true;
        }
        // Recur for left and right subtrees
        return isSubtree(tree.left, subTree) || isSubtree(tree.right, subTree);
    }
    public static void main(String[] args) {
        // Example usage
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);

        Node subTree = new Node(2);
        subTree.left = new Node(4);
        subTree.right = new Node(5);

        System.out.println(isSubtree(tree, subTree)); // Output: true
    }
}
