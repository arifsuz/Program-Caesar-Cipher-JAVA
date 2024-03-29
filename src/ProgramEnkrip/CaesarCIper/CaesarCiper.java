package ProgramEnkrip.CaesarCIper;

import java.util.Scanner;

public class CaesarCiper {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String text, int shiftKey) {
        text = text.toLowerCase();
        String encryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            int charPosition = ALPHABET.indexOf(text.charAt(i));
            int keyValue = (shiftKey + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyValue);
            encryptedText += replaceVal;
        }
        return encryptedText;
    }

    public static String decrypt(String text, int shiftKey) {
        text = text.toLowerCase();
        String decryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            int charPosition = ALPHABET.indexOf(text.charAt(i));
            int keyValue = (shiftKey + charPosition) % 26;
            if (keyValue < 0) {
                keyValue = ALPHABET.length() + keyValue;
            }
            char replaceVal = ALPHABET.charAt(keyValue);
            decryptedText += replaceVal;
        }
        return decryptedText;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string for encryption : ");
        String message = sc.nextLine();
        System.out.print("Enter the shift key : ");
        int shiftKey = sc.nextInt();
        String encryptedMsg = encrypt(message, shiftKey);
        System.out.println("Encrypted Message : " + encryptedMsg);
        String decryptedMsg = decrypt(encryptedMsg, shiftKey);
        System.out.println("Decrypted Message : " + decryptedMsg);
    }
}