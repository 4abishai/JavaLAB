import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String inputString = scanner.nextLine();

        changeCase(inputString);
        reverseString(inputString);
        compareStrings(inputString, scanner);
        insertString(inputString, scanner);
        checkCharacterPresence(inputString, scanner);
        checkPalindrome(inputString);
        countWordsVowelsConsonants(inputString);

        scanner.close();
    }

    static void changeCase(String inputString) {
        System.out.println("Uppercase: " + inputString.toUpperCase());
        System.out.println("Lowercase: " + inputString.toLowerCase());
    }

    static void reverseString(String inputString) {
        StringBuilder reversedString = new StringBuilder(inputString).reverse();
        System.out.println("The string after reversing is " + reversedString);
    }

    static void compareStrings(String inputString, Scanner scanner) {
        System.out.print("Enter the second string for comparison : ");
        String secondString = scanner.nextLine();
        int difference = inputString.compareTo(secondString);
        System.out.println("The difference between ASCII value is " + difference);
    }

    static void insertString(String inputString, Scanner scanner) {
        System.out.print("Enter the string to be inserted into first string : ");
        String insertedString = scanner.nextLine();
        String modifiedString = inputString + " " + insertedString;
        System.out.println("The string after insertion is : " + modifiedString);
    }

    static void checkCharacterPresence(String inputString, Scanner scanner) {
        System.out.print("Enter a character : ");
        char character = scanner.next().charAt(0);
        int position = inputString.indexOf(character);
        if (position != -1) {
            System.out.println("Position of entered character: " + (position + 1));
        } else {
            System.out.println("Entered character is not present");
        }
    }

    static void checkPalindrome(String inputString) {
        String reverse = new StringBuilder(inputString).reverse().toString();
        if (inputString.equals(reverse)) {
            System.out.println("Entered string is palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }
    }

    static void countWordsVowelsConsonants(String inputString) {
        int words = 0, vowels = 0, consonants = 0;
        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == ' ') {
                words++;
            } else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        // Count the last word
        words++;

        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }

}
