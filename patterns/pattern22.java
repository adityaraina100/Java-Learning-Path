public class pattern22 {
    public static void main(String[] args) {
        int n=6;
    int size=2*n-1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int top=i;
                int bottom=j;
                int right=(size-1)-j;
                int left=(size-1)-i;
                System.out.print(n-(Math.min(Math.min(top,bottom),Math.min(right, left))));
            }
            System.out.println();
        }
        // Write your code here.
    }
}
    
