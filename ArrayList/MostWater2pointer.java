import java.util.ArrayList;

public class MostWater2pointer {
    public static int maxArea(ArrayList<Integer> heightList) {
        int left = 0;
        int right = heightList.size() - 1;
        int maxArea = 0;
        while (left < right) {
            int area = Math.min(heightList.get(left), heightList.get(right)) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (heightList.get(left) < heightList.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int result = maxArea(height);
        System.out.println("Maximum area: " + result); // Output: 49
    }
}
