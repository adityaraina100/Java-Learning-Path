import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize a counter for vowels
        int vowelCount = 0;

        // Convert the input string to lowercase to handle both upper and lowercase vowels
        input = input.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;  // Increment the vowel count
            }
        }

        // Print the number of vowels
        System.out.println("Number of vowels: " + vowelCount);

        // Close the scanner
        scanner.close();
    }
}
