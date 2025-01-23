class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
          double value=0;
        switch(choice){
             case 1:{
                  value=Math.PI*arr.get(0)*arr.get(0);  
                 break;
             }
             case 2:{
                  value=arr.get(0)*arr.get(1);  
                  break;
             }
        }
         return value;
    }
}