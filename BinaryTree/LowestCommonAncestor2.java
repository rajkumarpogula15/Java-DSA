public class LowestCommonAncestor2 {
    // Node definition
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Recursive LCA function
    public static Node findLCA(Node root, int n1, int n2) {
        // Base case
        if (root == null) return null;

        // If either n1 or n2 matches root’s data → root is part of the answer
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        // Look for nodes in left and right subtrees
        Node leftLCA = findLCA(root.left, n1, n2);
        Node rightLCA = findLCA(root.right, n1, n2);

        // If both sides return non-null → current root is the LCA
        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        // Otherwise, return whichever side is non-null
        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    // Build tree and test
    public static void main(String[] args) {
        /*
                1
               / \
              2   3
             / \  / \
            4  5 6  7
        */
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
            System.out.println("One or both nodes are not present in the tree.");
        }

        n1 = 4; n2 = 6;
        lca = findLCA(root, n1, n2);
        if (lca != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is " + lca.data);
        }

        n1 = 3; n2 = 7;
        lca = findLCA(root, n1, n2);
        if (lca != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is " + lca.data);
        }
    }
}
