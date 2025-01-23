public class pattern18 {
        public static void main(String  args[]) {
            int n=8;
            for (int i = 0; i < n; i++) {
                for (int j = n - 1; j >= n - 1 - i; j--) {
                    System.out.print((char)(65 + j) + " ");
                }
                System.out.println();
            }
        }
    }    

