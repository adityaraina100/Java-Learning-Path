public class pattern9 {
        public static void main(String args[] ) {
            int n=3;
            for(int i=1;i<=n;i++){
                for(int j=i;j<n;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
                for(int j=i;j<n;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
    
            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*n-(2*i+1);j++){
                    System.out.print("*");
                }
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
            // Write your code here
        }
        
    }
    

