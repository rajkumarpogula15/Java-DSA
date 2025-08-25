import java.util.ArrayList;
//Brute Force Approach  
//Finding any pair in sorted arrayList has targeted sum
public class PairSum1 {
    public static boolean hasPairWithSum(ArrayList<Integer> list, int targetSum) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == targetSum) {
                    return true;
                }
                else if (list.get(i) + list.get(j) > targetSum) {
                    break;// no need to check further as the list is sorted
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(3);
        list.add(7);
        int targetSum = 17;
        boolean result = hasPairWithSum(list, targetSum);
        System.out.println("Pair with sum " + targetSum + " exists: " + result); // Output: true
    }
}
