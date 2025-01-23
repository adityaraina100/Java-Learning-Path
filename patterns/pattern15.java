public class pattern15 {
        public static void main(String args[]) {
            int n=5;
             for(char i=65;i<n+65;i++){
                for(char j=65;j<65+n-(i-65);j++){
                    System.out.print((char)j+" ");
                }
                System.out.println();
            }
            // Write your code here
        }
    }
    
    
