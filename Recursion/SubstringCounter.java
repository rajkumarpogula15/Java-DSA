public class SubstringCounter {

    // Recursive function to count substrings starting and ending with same char
    public static int countSubstrings(String s, int i, int j) {
        // Base case: if invalid indices
        if (i > j) return 0;

        // If single character substring
        if (i == j) return 1;

        // Count for smaller substring
        int result = countSubstrings(s, i + 1, j) 
                   + countSubstrings(s, i, j - 1) 
                   - countSubstrings(s, i + 1, j - 1);

        // If current substring [i..j] starts and ends with same char
        if (s.charAt(i) == s.charAt(j)) {
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "abcab";
        int n = s.length();
        int count = countSubstrings(s, 0, n - 1);
        System.out.println("Count = " + count);
    }
}
