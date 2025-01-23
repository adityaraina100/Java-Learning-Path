import java.util.Arrays;

public class missingnumberinrange {
        public static int missingNumber(int []a, int N) {
        Arrays.sort(a);
        for(int i=0; i<N; i++){
            if(i!=a[i]){
                return i;
            }

        }
        return N;
        // Write your code here.
    }
}
