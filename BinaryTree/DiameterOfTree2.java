// Node definition
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

    // Helper class to store both height and diameter
    class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    // Function to compute diameter and height in a single recursion
    TreeInfo diameterHelper(Node node) {
        if (node == null) {
            return new TreeInfo(0, 0);
        }

        // Recursively get info from left and right subtrees
        TreeInfo left = diameterHelper(node.left);
        TreeInfo right = diameterHelper(node.right);

        // Height of current node
        int myHeight = 1 + Math.max(left.height, right.height);

        // Diameter passing through this node
        int diameterThroughRoot = left.height + right.height + 1;

        // Maximum diameter so far
        int myDiameter = Math.max(diameterThroughRoot, 
                                  Math.max(left.diameter, right.diameter));

        return new TreeInfo(myHeight, myDiameter);
    }

    // Function to get the diameter of tree
    int diameter(Node root) {
        return diameterHelper(root).diameter;
    }
}

// Main class (must match file name if saved separately)
public class DiameterOfTree2 {
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
