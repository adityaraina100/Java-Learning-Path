import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        int sum = 0;
        int temp=0;
        
        while (number>0){
            temp= number%10;
            sum= sum + temp;
            number= number/10;

        }
        System.out.print("This is the sum: " + sum);

    }
    
}
