import java.util.*;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int user_input = sc.nextInt();
        for(int i=1; i<=user_input;i++){
            for(int j=1;j<=user_input;j++){
                System.out.print("*" );
            }
            System.out.println();
        }
    }
    
}
