public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};
        int n = start.length;

        // Step 1: Store activities as pairs in 2D array
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i]; // start
            activities[i][1] = end[i];   // end
        }

        // Step 2: Sort by end time (using simple selection sort)
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (activities[j][1] < activities[minIndex][1]) {
                    minIndex = j;
                }
            }
            // swap
            int tempStart = activities[i][0];
            int tempEnd = activities[i][1];
            activities[i][0] = activities[minIndex][0];
            activities[i][1] = activities[minIndex][1];
            activities[minIndex][0] = tempStart;
            activities[minIndex][1] = tempEnd;
        }

        // Step 3: Greedy activity selection
        int count = 1; // first activity always selected
        int lastEndTime = activities[0][1];

        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= lastEndTime) {
                count++;
                lastEndTime = activities[i][1];
            }
        }

        System.out.println("Maximum number of activities: " + count);
    }
}
