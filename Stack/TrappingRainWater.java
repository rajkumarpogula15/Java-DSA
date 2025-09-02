public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped rain water: " + trap(height));
    }

    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        //using stack
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {//check if current height is greater than stack's top
                int top = stack.pop();
                if (stack.isEmpty()) break;
                int distance = i - stack.peek() - 1;
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
                trappedWater += distance * boundedHeight;
            }
            stack.push(i);
        }

        return trappedWater;
    }
}
