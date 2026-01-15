package Z_pratica;

import java.util.Scanner;

public class palindrome {

        static boolean isPalindrome(String word) {
            int left = 0;
            int right = word.length() - 1;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    System.out.println("A palavra não é um palíndromo.");
                    return false;
                }
                left++;
                right--;
            }
            System.out.println("A palavra é um palíndromo.");
            return true;
        }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String word = scanner.nextLine();

        isPalindrome(word);
        scanner.close();
    }
}
