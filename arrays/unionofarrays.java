// method to use tree-set for automatic sorting of the new set/array; - GFG

import java.util.ArrayList;
import java.util.TreeSet;

public class unionofarrays {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        TreeSet<Integer> set = new TreeSet<>();
        ArrayList<Integer> union  = new ArrayList<>();
        
        for (int i =0; i<a.length; i++){
            set.add(a[i]);
        }
        for (int j=0; j<b.length; j++){
            set.add(b[j]);
        }
        for(int nums : set){
            union.add(nums);
        }
        return union; 
        // add your code here
    }
}
// ------------------------------------------------------------------------------------------------------------
// method using collections.sort in arraylist- code360
// import java.util.*;
// public class unionofarrays {
//     public static List< Integer > sortedArray(int []a, int []b) {
//         HashSet<Integer> set = new HashSet<>();
//         ArrayList<Integer> union = new ArrayList<>();
//         for(int i =0; i<a.length; i++){
//             set.add(a[i]);
//         }
//         for(int j =0 ; j<b.length; j++){
//             set.add(b[j]);
//         }

//         for(int nums : set){
//             union.add(nums);
//         }
//         Collections.sort(union);
//         return union;
//         // Write your code here
//     }
// }