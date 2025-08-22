public class Stringsubsets {
    public static void main(String[] args) {
        String str = "abc";
        subsets(str, 0, "");
    }

    public static void subsets(String str, int idx, String curr) {
        if (idx == str.length()) {
            System.out.println(curr);
            return;
        }
        // include the current character at index idx
        subsets(str, idx + 1, curr + str.charAt(idx));
        // exclude the current character at index idx   
        subsets(str, idx + 1, curr);
    }
}