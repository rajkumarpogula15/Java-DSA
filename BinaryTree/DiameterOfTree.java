// Definition for a binary tree node
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Function to compute height of a tree
    int height(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    // Function to compute diameter of tree
    int diameter(Node node) {
        if (node == null) {
            return 0;
        }

        // Get heights of left and right subtrees
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Diameter passing through current node
        int diameterThroughRoot = leftHeight + rightHeight + 1;

        // Diameters of left and right subtrees
        int leftDiameter = diameter(node.left);
        int rightDiameter = diameter(node.right);

        // Maximum of the three
        return Math.max(diameterThroughRoot, Math.max(leftDiameter, rightDiameter));
    }
}

public class DiameterOfTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Build example tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Diameter of the tree is: " + tree.diameter(tree.root));
    }
}
