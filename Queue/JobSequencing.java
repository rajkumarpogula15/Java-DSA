import java.util.*;

class Job {
    String id;
    int deadline;
    int profit;

    Job(String id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {
    public static void main(String[] args) {
        // Sample Input
        Job[] jobs = {
                new Job("a", 4, 20),
                new Job("b", 1, 10),
                new Job("c", 1, 40),
                new Job("d", 1, 30)
        };

        jobSequencing(jobs);
    }

    public static void jobSequencing(Job[] jobs) {
        // Step 1: Sort jobs in descending order of profit
        Arrays.sort(jobs, (j1, j2) -> j2.profit - j1.profit);

        // Step 2: Find max deadline to create slots
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Step 3: Create a queue of free slots
        Queue<Integer> freeSlots = new LinkedList<>();
        for (int i = 1; i <= maxDeadline; i++) {
            freeSlots.add(i);
        }

        // Step 4: Array to store result
        String[] result = new String[maxDeadline];
        Arrays.fill(result, "");

        // Step 5: Assign jobs to slots
        for (Job job : jobs) {
            int slot = job.deadline;

            // Find the latest available slot before or equal to deadline
            for (int i = slot; i > 0; i--) {
                if (result[i - 1].equals("")) {
                    result[i - 1] = job.id;
                    break;
                }
            }
        }

        // Step 6: Print the scheduled jobs
        System.out.print("Scheduled Jobs: ");
        for (String jobId : result) {
            if (!jobId.equals("")) {
                System.out.print(jobId + " ");
            }
        }
    }
}
