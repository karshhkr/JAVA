
//List dekha jisme indexing hoti hai aur duplicate values allowed hoti hain.

import java.util.ArrayList;
import java.util.List;
public class ListDemoInterface
 { /// to fetch the index vlue we can use List
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();/// list implements class of linked list array list
         nums.add(6);
        nums.add(8);
          nums.add(2);
          nums.add(2);
                    // Indexing 0 se start hoti hai -> 0=6, 1=8, 2=2
           System.out.println(nums.get(2));
System.out.println(nums.indexOf(8));// another meth in List Which is index of()
   




}

}
