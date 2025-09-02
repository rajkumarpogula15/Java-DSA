import java.util.Stack;
public class MaxAreaHistogram {
    public static int maxArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        //next smaller left
        int[] left = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=stack.peek();
            }
            stack.push(i);
        }
        //next smaller right
        stack.clear();
        int[] right = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                right[i]=heights.length;
            }
            else{
                right[i]=stack.peek();
            }
            stack.push(i);
        }
        //calculate max area
        for (int i = 0; i < heights.length; i++) {
            int area = (right[i] - left[i] - 1) * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Max Area in Histogram: " + maxArea(heights));
    }
}
