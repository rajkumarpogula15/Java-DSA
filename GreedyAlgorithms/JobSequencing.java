public class JobSequencing {
    static class Job {
        int deadline;
        int profit;

        Job(int deadline, int profit) {
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int[] deadlines = {4, 1, 1, 1};
        int[] profits = {20, 10, 40, 30};
        int n = deadlines.length;

        // Create an array of jobs with their deadlines and profits
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(deadlines[i], profits[i]);
        }

        // Sort jobs by profit in descending order
        java.util.Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find the maximum deadline to determine the size of the schedule
        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        // Create a schedule array to keep track of occupied time slots
        boolean[] schedule = new boolean[maxDeadline];
        int totalProfit = 0;

        // Schedule jobs greedily
        for (Job job : jobs) {
            // Find a free slot for this job (starting from its deadline)
            for (int j = Math.min(maxDeadline, job.deadline) - 1; j >= 0; j--) {
                if (!schedule[j]) {
                    schedule[j] = true; // Mark this slot as occupied
                    totalProfit += job.profit; // Add profit
                    break; // Move to the next job
                }
            }
        }

        System.out.println("Total Profit: " + totalProfit);
    }
    
}
