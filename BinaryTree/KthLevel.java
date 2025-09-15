public class KthLevel {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Print nodes at the kth level (1-based)
    public static void printKthRow(Node node, int k) {
        if (node == null) {
            return;
        }
        if (k == 1) { // row starts from 1
            System.out.print(node.data + " ");
        } else {
            printKthRow(node.left, k - 1);
            printKthRow(node.right, k - 1);
        }
    }
    
    public static void main(String[] args) {
        // Example usage
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3; 
        System.out.print("Nodes at row " + k + ": ");
        printKthRow(root, k);
    }
}
