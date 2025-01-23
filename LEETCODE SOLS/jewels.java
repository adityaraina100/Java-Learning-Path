//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. 
//Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//Letters are case sensitive, so "a" is considered a different type of stone from "A".
class Solution {
    public int numJewelsInStones(String jewels, String stones) { 
        int counter = 0;
    
        for(int i=0; i<jewels.length(); i++){
            for(int j= stones.length()-1;j>=0;j--){
                if(stones.charAt(j)==jewels.charAt(i)){
                    counter++;
                }

            }

        }
        return counter;
        
    }
}
