import java.util.ArrayList;

public class PairSum1Pointers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        int targetSum = 6;
        boolean result = hasPairWithSum(list, targetSum);
        System.out.println("Pair with sum " + targetSum + " exists: " + result); // Output: true
    }
    public static boolean hasPairWithSum(ArrayList<Integer> list, int targetSum) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int currentSum = list.get(left) + list.get(right);
            if (currentSum == targetSum) {
                return true;// found the pair
            } else if (currentSum < targetSum) {
                left++;//
            } else {
                right--;//
            }
        }
        return false;
    }
}
