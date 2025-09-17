
public class MinDistance2Nodes {
    // Node definition for Binary Tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Helper function to find LCA
    public static Node findLCA(Node root, int n1, int n2) {
        if (root == null) return null;

        if (root.data == n1 || root.data == n2)
            return root;

        Node leftLCA = findLCA(root.left, n1, n2);
        Node rightLCA = findLCA(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null)
            return root;

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    // Helper function to find distance from root to given node
    private static int findDistance(Node root, int n, int dist) {
        if (root == null) return -1;

        if (root.data == n) return dist;

        int left = findDistance(root.left, n, dist + 1);
        if (left != -1) return left;

        return findDistance(root.right, n, dist + 1);
    }

    // Function to find minimum distance between two nodes
    public static int findMinDistance(Node root, int n1, int n2) {
        Node lca = findLCA(root, n1, n2);

        if (lca == null) return -1; // One or both nodes not present

        int d1 = findDistance(lca, n1, 0);
        int d2 = findDistance(lca, n2, 0);

        return d1 + d2;
    }

    // Main function for testing
    public static void main(String[] args) {
        // Build example tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;
        int distance = findMinDistance(root, n1, n2);

        if (distance != -1) {
            System.out.println("Minimum distance between " + n1 + " and " + n2 + " is " + distance);
        } else {
            System.out.println("One or both nodes not found in the tree.");
        }
    }
}
