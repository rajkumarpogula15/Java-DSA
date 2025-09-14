import java.util.*;

public class BottomViewOFTree {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    static void printBottomView(Node root) {
        if (root == null) return;

        // TreeMap -> keeps keys sorted (horizontal distances)
        Map<Integer, Integer> bottomViewMap = new TreeMap<>();

        // Queue will hold pairs of (node, horizontal distance)
        Queue<AbstractMap.SimpleEntry<Node, Integer>> queue = new LinkedList<>();
        queue.add(new AbstractMap.SimpleEntry<>(root, 0));

        while (!queue.isEmpty()) {
            AbstractMap.SimpleEntry<Node, Integer> entry = queue.poll();
            Node node = entry.getKey();
            int hd = entry.getValue();

            // Always overwrite -> ensures bottom-most node stays
            bottomViewMap.put(hd, node.data);

            // Enqueue children with updated horizontal distances
            if (node.left != null) {
                queue.add(new AbstractMap.SimpleEntry<>(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.add(new AbstractMap.SimpleEntry<>(node.right, hd + 1));
            }
        }

        // Print the bottom view (sorted by hd)
        for (Integer value : bottomViewMap.values()) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        // Example usage
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(6);

        System.out.print("Bottom View: ");
        printBottomView(root);
    }
}
