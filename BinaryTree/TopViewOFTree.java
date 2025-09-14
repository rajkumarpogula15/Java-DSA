import java.util.*;
public class TopViewOFTree {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }
    static void printTopView(Node root) {
        if (root == null) {
            return;
        }
        Map<Integer, Integer> topViewMap = new TreeMap<>();
        Queue<AbstractMap.SimpleEntry<Node, Integer>> queue = new LinkedList<>();
        queue.add(new AbstractMap.SimpleEntry<>(root, 0));

        while (!queue.isEmpty()) {
            AbstractMap.SimpleEntry<Node, Integer> entry = queue.poll();
            Node node = entry.getKey();
            int hd = entry.getValue();

            // If this horizontal distance is not already present in the map
            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, node.data);
            }

            // Enqueue left and right children with updated horizontal distances
            if (node.left != null) {
                queue.add(new java.util.AbstractMap.SimpleEntry<>(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.add(new java.util.AbstractMap.SimpleEntry<>(node.right, hd + 1));
            }
        }

        // Print the top view
        for (Integer value : topViewMap.values()) {
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
        root.right.right = new Node(6);

        printTopView(root);
    }
}
