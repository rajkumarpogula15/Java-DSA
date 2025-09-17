// File: KthAncestor.java

public class KthAncestor {
    // Node definition for Binary Tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Recursive function to find the kth ancestor
    private static int findKthAncestor(Node root, int target, int k, int[] ancestor) {
        if (root == null) return -1;

        // If target node is found
        if (root.data == target) return 0;

        // Search in left and right subtrees
        int left = findKthAncestor(root.left, target, k, ancestor);
        int right = findKthAncestor(root.right, target, k, ancestor);

        int distance = Math.max(left, right);
        if (distance != -1) {
            // If distance from target to current node
            distance++;

            // If this node is the kth ancestor
            if (distance == k) {
                ancestor[0] = root.data;
            }
            return distance;
        }
        return -1;
    }

    // Wrapper function
    public static int getKthAncestor(Node root, int target, int k) {
        int[] ancestor = {-1};
        findKthAncestor(root, target, k, ancestor);
        return ancestor[0];
    }

    // Main for testing
    public static void main(String[] args) {
        // Build example tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int target = 5, k = 2;
        int ancestor = getKthAncestor(root, target, k);

        if (ancestor != -1) {
            System.out.println(k + " ancestor of " + target + " is " + ancestor);
        } else {
            System.out.println("No " + k + " ancestor exists for node " + target);
        }
    }
}
