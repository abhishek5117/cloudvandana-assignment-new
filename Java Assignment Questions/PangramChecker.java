import java.util.Scanner;

public class PangramChecker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        boolean[] alphabet = new boolean[26];
        int index = 0;
        int flag = 1;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z') {
                index = sentence.charAt(i) - 'A';
            } else if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
                index = sentence.charAt(i) - 'a';
            }
            alphabet[index] = true;
        }

        for (int i = 0; i <= 25; i++) {
            if (!alphabet[i]) {
                flag = 0;
            }
        }

        if (flag == 1) {
            System.out.println("The entered sentence is a pangram.");
        } else {
            System.out.println("The entered sentence is not a pangram.");
        }
    }
}
