import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;



public class Sorting {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();
      
// interface to put our logic to sort
         Comparator com= new Comparator<Integer>(){
            public int compare (Integer i , Integer j){
                 if (i%10>j%10)
                return 1;
                 else
                 return -1;

            }
         };
         nums.add(49);
         nums.add(30);
         nums.add(14);
         nums.add(94);


         Collections.sort(nums, com);
         System.out.println(nums);
    }
}
