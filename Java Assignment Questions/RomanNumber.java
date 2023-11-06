import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String s = scanner.nextLine();

        int int_val = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && roman.get(s.charAt(i)) > roman.get(s.charAt(i - 1))) {
                int_val += roman.get(s.charAt(i)) - 2 * roman.get(s.charAt(i - 1));
            } else {
                int_val += roman.get(s.charAt(i));
            }
        }

        System.out.println("Integer value: " + int_val);
    }
}
