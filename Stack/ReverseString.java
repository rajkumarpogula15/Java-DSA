import java.util.*;

public class ReverseString {
    public static String ReverseString(String s) {
        Stack<Character> stk = new Stack<>();
        for (int idx = 0; idx < s.length(); idx++) {
            stk.push(s.charAt(idx));
        }
        String newString = "";
        while (!stk.isEmpty()) {
            newString += stk.pop();
        }
        return newString;
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = ReverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
