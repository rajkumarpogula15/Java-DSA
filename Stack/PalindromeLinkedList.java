import java.util.LinkedList;
import java.util.Stack;

public class PalindromeLinkedList {

    public static boolean isPalindrome(LinkedList<Character> lst) {
        Stack<Character> stk = new Stack<>();
        
        // Push all elements into stack
        for (Character ch : lst) {
            stk.push(ch);
        }
        
        // Compare stack pop (reverse order) with list elements
        for (Character ch : lst) {
            if (ch != stk.pop()) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Character> lst = new LinkedList<>();
        lst.add('a');
        lst.add('b');
        lst.add('c');
        lst.add('b');
        lst.add('a');

        System.out.println("Linked list elements: " + lst);
        System.out.println("Is palindrome? " + isPalindrome(lst));

        LinkedList<Character> lst2 = new LinkedList<>();
        lst2.add('a');
        lst2.add('b');
        lst2.add('d');
        System.out.println("Linked list elements: " + lst2);
        System.out.println("Is palindrome? " + isPalindrome(lst2));
    }
}
