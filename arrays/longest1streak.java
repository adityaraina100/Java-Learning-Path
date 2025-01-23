public class longest1streak {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max_streak=0;
            int counter =0;
            for(int i=0; i<nums.length; i++){
                if(nums[i]==1){
                    counter++;
                    max_streak = Math.max(counter, max_streak);
                }
                else{
                    counter =0;
                }
             
                
            }
            return max_streak;
        }
    }