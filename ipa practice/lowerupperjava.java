// write a java code to count the number of lowercase and uppercase letters in the string input by user

import java.util.Scanner;
public class lowerupperjava{   //make this a habit so that i dont cause issues of conflicting main classes
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here-->");
        String user_input = sc.nextLine();
        
        int counter = 0;
        for(int i = 0; i< user_input.length(); i++){   //used this higher end of loop so that it covers all the aphabets in the string; if used -1, it would skip the last
            char c= user_input.charAt(i);
            if(Character.isLowerCase(c)){  //new library/function used here
                counter++;
            }

        }
        System.out.println("the numnber of lowercase alphabets are :"+ counter);
        System.out.println("the number of uppercase alphabets are :"+ (int)(user_input.length()-counter));   // my own new logic
    }
}