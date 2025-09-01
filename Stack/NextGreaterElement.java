//Next Greater element in an list of elemnets right to the current element
import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = nextGreaterElements(arr);
        System.err.println("List of elements:");
        for (int i : arr) {
            System.err.print(i + " ");
        }
        System.err.println("\nNext Greater Elements:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] nextGreaterElements(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        return result;
    }
}
