import java.util.*;

class SwapElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        // Take indexes from user
        System.out.print("Enter first index: ");
        int index1 = sc.nextInt();

        System.out.print("Enter second index: ");
        int index2 = sc.nextInt();

        // Check if indexes are valid
        if (index1 >= 0 && index1 < numbers.size() &&
            index2 >= 0 && index2 < numbers.size()) {

            // Swap manually
            int temp = numbers.get(index1);
            numbers.set(index1, numbers.get(index2));
            numbers.set(index2, temp);

            System.out.println("After swapping: " + numbers);
        } else {
            System.out.println("Invalid indexes! Please enter values between 0 and " + (numbers.size() - 1));
        }

        sc.close();
    }
}
