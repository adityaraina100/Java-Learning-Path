import java.util.Scanner;

public class practicereverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String word = sc.nextLine();
        String reverse_word = "";
        for(int i = word.length()-1; i>=0 ; i--){
            reverse_word= reverse_word + word.charAt(i);
        }
        if( word.equals(reverse_word)){
            System.out.println("This is a palindrome");
        }
        
        System.out.println("This is the reversed string" + " -- " + reverse_word);

    }
    
}
