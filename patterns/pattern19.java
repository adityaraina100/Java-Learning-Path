import java.util.*;
public class pattern19 {
        public static void main(String args[]) {
            Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    System.out.print("* ");
                }
                for(int j=0;j<2*i;j++){
                    System.out.print("  ");
                }
                for(int j=n-i;j>0;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                for(int j=1;j<2*n-(2*i+1);j++){
                    System.out.print(" ");
                }
                for(int j=i;j>=0;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
    
        }
    }
