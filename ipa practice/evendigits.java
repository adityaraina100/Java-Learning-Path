// write a java code to get the total number of even digits in a number
import java.util.Scanner;
public class evendigits {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("ENTER THE NUMBER ==>");
        int user_input = sc.nextInt();
        int counter = 0;
        int last_digit = 0;
        int temp = user_input;
        while (temp > 0){   //do all the modifications in temp so that we always have the original input to compare
            last_digit = temp%10;
            
            if(last_digit %2==0){
                counter ++;
            }
            temp = temp/10;
        }
            System.out.println("number of even digits are" + counter);

        }
    }
