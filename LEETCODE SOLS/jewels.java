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