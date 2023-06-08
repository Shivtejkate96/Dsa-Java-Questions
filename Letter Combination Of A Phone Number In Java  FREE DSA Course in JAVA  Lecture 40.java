import java.util.*;

public class Main {
    static String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    static void possibleKeywords(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        int digit = Integer.parseInt(String.valueOf(s.charAt(0)));
        String key = keypad[digit];

        for (int i = 0; i < key.length(); i++) {
            possibleKeywords(s.substring(1), ans + key.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numeric string: ");
        String s = sc.next();
        possibleKeywords(s, "");
    }
}
