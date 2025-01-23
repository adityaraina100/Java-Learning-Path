public class pattern7 {
        public static void main(String args[]) {
            int n=3;
            for(int i=1; i<=n;i++){
                for(int j=i; j<n;j++){
                    System.out.print(" ");
                }
               
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            // Write your code here
        }
    }

