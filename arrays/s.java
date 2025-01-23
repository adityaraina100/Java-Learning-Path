        // 0(2n) approach 
public class secondlargest {
    public int getSecondLargest(int[] arr) {
        int largest_num = 0;
        int second_largest=-1;
        for(int num : arr){
            if(num > largest_num){
                largest_num = num;
            }
        }
        for(int num:arr){
            if(num>second_largest && num!=largest_num){
                second_largest = num;
            }
        }
        // code here
           return second_largest;
    }
 
}

    
