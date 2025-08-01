
public class Shortestpath {
    public static void shortestPath(String str) {
        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {
            char direction = str.charAt(i);
            if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'E') {
                x++;
            } else if (direction == 'W') {
                x--;
            }
        }

        // Calculate Euclidean distance from origin
        int X2 = x * x;
        int Y2 = y * y;
        double shortestPath = Math.sqrt(X2 + Y2);

        System.out.println("Shortest path length: " + shortestPath);
    }

    public static void main(String[] args) {
        String path = "WSEWNSEWNNESW";
        shortestPath(path);
    }
}
