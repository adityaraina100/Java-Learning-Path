
// write a java code to count the number of words present in a sentence
import java.util.Scanner;
public class wordsinsentence {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the sentence here-->");
        String user_input = sc.nextLine();
        int counter = 0;
        char whitespace =' ';   //crazy logic used by me; simply used whitespace char as the thing which shows that a word is completed
        for(int i=0; i<user_input.length(); i++){
            char x= user_input.charAt(i);
            if(x == whitespace){  // you can directly compare char with == but not string.
                counter ++;
            }
        }
        System.out.println("print the counter: " + (int)(counter+1));  // +1 because there will always be an initial code before we use a whitespace
        

    }
    
}
