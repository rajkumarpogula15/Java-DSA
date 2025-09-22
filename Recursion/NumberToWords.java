public class NumberToWords {
    // Array to map digits to words
    static String[] words = {"zero", "one", "two", "three", "four", 
                             "five", "six", "seven", "eight", "nine"};
    // Recursive function to convert number to words
    static void numberToWords(int n) {
        if (n == 0) {
            return;
        }
        // Process all digits except the last one first
        numberToWords(n / 10);

        // Print the word for the last digit
        int digit = n % 10;
        System.out.print(words[digit] + " ");
    }
    public static void main(String[] args) {
        int number = 1947;
        numberToWords(number);
    }
}
