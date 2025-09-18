public class TransformToSumTree {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Function to transform tree to Sum Tree
    public static int toSumTree(Node node) {
        if (node == null) return 0;

        // Recursively convert left and right subtrees
        int oldVal = node.data;
        int leftSum = toSumTree(node.left);
        int rightSum = toSumTree(node.right);

        // Set new value = sum of left and right subtree
        node.data = leftSum + rightSum;

        // Return old value + new value (so parent gets correct sum)
        return node.data + oldVal;
    }

    // Utility to print inorder traversal
    public static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);

        toSumTree(root);

        System.out.println("Inorder traversal of the Sum Tree:");
        inorder(root);
    }
}
