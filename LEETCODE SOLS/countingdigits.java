class Solution {
    static int evenlyDivides(int n) {
        int counter = 0;
        int temp = n; 
        
        while (temp > 0) {
            int digit = temp % 10;
            
         
            if (digit != 0 && n % digit == 0) {
                counter++;
            }
            
            temp = temp / 10; 
        }
        
        return counter;
    }
}
