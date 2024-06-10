package ProgramEnkrip.CaesarCIper;

import java.util.Scanner;

public class CaesarCipher {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String text, int shiftKey) {
        StringBuilder encryptedText = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                int position = ALPHABET.indexOf(character);
                int newPosition = (position + shiftKey) % 52;
                encryptedText.append(ALPHABET.charAt(newPosition));
            } else {
                encryptedText.append(character);
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String text, int shiftKey) {
        StringBuilder decryptedText = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                int position = ALPHABET.indexOf(character);
                int newPosition = (position - shiftKey) % 52;
                if (newPosition < 0) {
                    newPosition += ALPHABET.length();
                }
                decryptedText.append(ALPHABET.charAt(newPosition));
            } else {
                decryptedText.append(character);
            }
        }

        return decryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("Do you want to encrypt or decrypt? (E/D): ");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("E")) {
                System.out.print("Enter the text to encrypt: ");
                String text = scanner.nextLine();
                System.out.print("Enter the shift key: ");
                int shiftKey = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Encrypted text: " + encrypt(text, shiftKey));
            } else if (choice.equals("D")) {
                System.out.print("Enter the text to decrypt: ");
                String text = scanner.nextLine();
                System.out.print("Enter the shift key: ");
                int shiftKey = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Decrypted text: " + decrypt(text, shiftKey));
            } else {
                System.out.println("Invalid choice. Please enter 'E' for encryption or 'D' for decryption.");
                continue;
            }

            System.out.print("Do you want to continue? (Y/N): ");
            String continueChoice = scanner.nextLine().toUpperCase();
            if (!continueChoice.equals("Y")) {
                continueProgram = false;
            }
        }

        scanner.close();
    }

}