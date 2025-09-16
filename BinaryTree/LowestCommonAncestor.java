import java.util.*;

public class LowestCommonAncestor {
    // Node definition for Binary Tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Helper function to find path from root to a given node
    private static boolean findPath(Node root, int n, Stack<Node> path) {
        if (root == null)
            return false;

        // Push current node
        path.push(root);

        // If current node is the target
        if (root.data == n)
            return true;

        // Recurse into left or right
        if (findPath(root.left, n, path) || findPath(root.right, n, path)) {
            return true;
        }

        // Backtrack
        path.pop();
        return false;
    }

    // Function to find LCA using two stacks
    public static Node findLCA(Node root, int n1, int n2) {
        Stack<Node> path1 = new Stack<>();
        Stack<Node> path2 = new Stack<>();

        // If either node not found
        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
            return null;
        }

        // Convert stacks to lists for comparison
        List<Node> list1 = new ArrayList<>(path1);
        List<Node> list2 = new ArrayList<>(path2);

        Node lca = null;
        int i = 0, j = 0;

        // Compare paths until mismatch
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).data == list2.get(j).data) {
                lca = list1.get(i);
            } else {
                break;
            }
            i++;
            j++;
        }
        return lca;
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
        Node lca = findLCA(root, n1, n2);
        if (lca != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is " + lca.data);
        } else {
            System.out.println("One or both nodes not found in the tree.");
        }
    }
}
