public class pattern13 {
    public static void main(String args[]) {
        int number=1;
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number+=1;
            }
            System.out.println();
        }
        // Write your code here
    }
}