import java.util.Scanner;
public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int original_number = sc.nextInt();
        
        int reversed_number = 0;
        int last_digit = 0;
        int temp =original_number;
        while(temp>0){
            last_digit = temp%10;
            reversed_number = reversed_number*10 + last_digit; 
            temp = temp/10;
        }
        System.out.println("this is the reversed number" + reversed_number);
    }
}