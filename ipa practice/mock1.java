import java.util.Scanner;

public class mock1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;

        while (temp > 0) {
            int x = temp % 10;  
            temp = temp / 10;   

            if (x % 2 != 0) {   
                count += 1;
            }
        }
 
        if (count >= 3) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}

 