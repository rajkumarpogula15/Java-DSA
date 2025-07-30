public class MaxSum {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -1, 5};
        //intialize max-subarray sum 
        int maxSum = Integer.MIN_VALUE;
        int start=0,end=0;
        for (int i = 0; i < arr.length; i++) {//start index loop
            for (int j = i; j < arr.length; j++) {//end index loop
                int currentSum = 0;//intial sun array sum=0
                // Loop to calculate sum of elements from index i to j
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];  // Add each element to current sum
                }
                // Update maxSum if current subarray sum is greater
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start=i;
                    end=j;
                }
            }
        }
        System.err.println("max sum sub array is");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Max subarray sum: " + maxSum);
    }
}
