import java.util.*;
public class normaltriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");

            }

            //star
            for( int j=0; j<2*i-1; j++){
                System.out.print("*");

            }


            //space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");

            }
            System.out.println(" ");
        }
        

    }
    
}
