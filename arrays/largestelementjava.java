public class largestelementjava{
    public static int largest(int[] arr) {
        int largest_num = 0;
        for(int num : arr){
            if(num > largest_num){
                largest_num = num;
            }
        }
        // code here
           return largest_num;
    }
 
}
