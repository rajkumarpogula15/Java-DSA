package BackTracking;

public class FindPermutation {
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }

    public static void findPermutations(String str, String curr) {
        if (str.length() == 0) {
            System.out.println(curr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            // choose the character at index i
            char ch = str.charAt(i);
            // remaining string after removing the chosen character
            String remaining = str.substring(0, i) + str.substring(i + 1);
            // recurse with the remaining string and current permutation
            findPermutations(remaining, curr + ch);
        }
    } 
}
