public class StringCompression {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("aaabbccddddabcd");
        StringBuilder newstr = new StringBuilder("");  // to store the compressed string

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            // Count repeating characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            // Add the character
            newstr.append(str.charAt(i));
            // If count > 1, add the count
            if (count > 1) {
                newstr.append(count);
            }
        }
        System.out.println(newstr);
    }
}
