public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi
    static void towerOfHanoi(int n, char source, char helper, char destination) {
        // Base case: Only one disk
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move top n-1 disks from source to helper using destination as helper
        towerOfHanoi(n - 1, source, destination, helper);

        // Step 2: Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from helper to destination using source as helper
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;  // Number of disks
        towerOfHanoi(n, 'A', 'B', 'C');  // A = Source, B = Helper, C = Destination
    }
}
