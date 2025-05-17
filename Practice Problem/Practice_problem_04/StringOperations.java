package Practice_problem_04;

import java.util.Scanner;

class StringOperations {

    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    static boolean isPalindrome(String str) {
        String reverse = reverseString(str);
        return str.equalsIgnoreCase(reverse);
    }

    static int countCharacter(String str, char ch) {
        int cnt = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = scanner.nextLine();

        System.out.println("Reversed String: " + reverseString(str));
        System.out.println("Is Palindrome: " + isPalindrome(str));

        System.out.print("Enter a character to count: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Occurrences of '" + ch + "': " + countCharacter(str, ch));

        scanner.close();
    }
}
