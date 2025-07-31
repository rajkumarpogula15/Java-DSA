public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {2, -1, 3, 4, -2, 1, 3, -4, 3};
        int PrefixSum[] = new int[arr.length];
        int maxsum = Integer.MIN_VALUE;

        PrefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            PrefixSum[i] = PrefixSum[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentsum;
                if (i == 0) {
                    currentsum = PrefixSum[j];
                } else {
                    currentsum = PrefixSum[j] - PrefixSum[i - 1];
                }
                if (currentsum > maxsum) {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("Maximum sum is " + maxsum);
    }
}
