// Capitalize the first letter of each word in a given string
public class Uppercase {
    public static void main(String[] args) {
        // Create a StringBuilder with the input string
        StringBuilder str = new StringBuilder("hi, i am raj kumar");

        // Capitalize the 1st char of the string
        char ch = Character.toUpperCase(str.charAt(0));
        str.replace(0, 1, String.valueOf(ch)); // Replace the first character with its uppercase version

        // Loop through the rest of the string
        for (int i = 1; i < str.length(); i++) {
            // If the previous character is a space and the current one is a letter
            if (str.charAt(i - 1) == ' ' && Character.isLetter(str.charAt(i))) {
                // Convert current character to uppercase
                char upper = Character.toUpperCase(str.charAt(i));
                // Replace the current character with its uppercase version
                str.replace(i, i + 1, String.valueOf(upper));
            }
        }

        // Print the final result
        System.out.println(str);  // Output: Hi, I Am Raj Kumar
    }
}
