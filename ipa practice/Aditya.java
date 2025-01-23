import java.util.Scanner;

public class Aditya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int original_number = sc.nextInt();
        int reversed_number = 0;
        int last_digit = 0;
        int temp = original_number;

        // Reverse the number completely
        while (temp != 0) {
            last_digit = temp % 10; // Get the last digit
            reversed_number = reversed_number * 10 + last_digit; // Build the reversed number
            temp = temp / 10; // Remove the last digit from temp
        }

        // Check if the reversed number matches the original after the loop
        if (reversed_number == original_number) {
            System.out.println("This is a palindrome number.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}
