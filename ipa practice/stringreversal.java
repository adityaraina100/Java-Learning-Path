
import java.util.Scanner;
public class stringreversal {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String user_string = sc.nextLine();
        String reversed_string = "";
        for (int i=user_string.length()-1;i>=0; i--){
             reversed_string = reversed_string + user_string.charAt(i);
        }
        System.out.println(" this is the reversed string: " + reversed_string);
    }
}  