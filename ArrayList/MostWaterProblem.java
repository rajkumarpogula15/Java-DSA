package ArrayList;
import java.util.ArrayList;
public class MostWaterProblem {
    public static int maxArea(ArrayList<Integer> height) {
        int maxArea = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int area = Math.min(height.get(i), height.get(j)) * (j - i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        //1 8 6 2 5 4 8 3 7
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
