import java.util.Scanner;

public class duplicateString {
    public static StringBuilder RemoveDuplicate(String s, int index, StringBuilder newstr, boolean[] map) {
        if (index == s.length()) {
            return newstr;
        }

        char presentChar = s.charAt(index);
        if (!map[presentChar - 'a']) {//it only work for a string in small letters only
            map[presentChar - 'a'] = true;
            newstr.append(presentChar); //Append the character
        }

        return RemoveDuplicate(s, index + 1, newstr, map);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        StringBuilder str2 = RemoveDuplicate(str, 0, new StringBuilder(), new boolean[26]);
        System.out.println("String without duplicate values: " + str2);
        sc.close();
    }
}
