import java.util.Scanner;

public class stringreversal {
    public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the string ");
    String original_string= sc.nextLine();
    String reverse_string= "";
for(int i= original_string.length()-1;i>=0;i--){
    reverse_string= reverse_string + original_string.charAt(i);
}
if(reverse_string.equals(original_string)){  // new point: this is how i am supposed to compare strings
    System.out.println("This is a palindrome");
}
System.out.println("Successfully reversed the string"); // did this so that in either case this prints
}
}
