
// write a java code which extracts all the characters in a string at odd indexes and gives them all as output as a combined string
import java.util.Scanner;
public class oddindex {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string here -->");
        String user_input = sc.nextLine();
        String output = "";
        for (int i=0; i<user_input.length(); i++){   // basic loop; you just iterate the i from start of string to end. no overthinking; i in a for loop like this always goes char by char so no need to use [i] as thats wrong.
            if(i%2!=0){
                output = output + user_input.charAt(i);    //appending into the new string
            }
    }
        System.out.println(" the answer is :" + output);
}
}
