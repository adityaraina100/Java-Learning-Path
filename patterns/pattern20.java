import java.util.*;
import java.util.Scanner;

public class pattern20 {
    Scanner sc= new Scanner(System.in);
    
    public static void main(String args[]) {
        int n= 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<2*n-(2*i+1);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
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
        // Write your code here
    }
}