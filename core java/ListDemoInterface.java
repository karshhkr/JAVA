
//List dekha jisme indexing hoti hai aur duplicate values allowed hoti hain.

import java.util.ArrayList;
import java.util.List;
public class ListDemoInterface
 { /// to fetch the index value we can use List
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();/// list implements class of linked list array list
         nums.add(6);
        nums.add(8);
          nums.add(2);
          nums.add(2);
          nums.add(6);// it support the dupilicate value
                    // Indexing 0 se start hoti hai -> 0=6, 1=8, 2=2
System.out.println(nums.get(2));
System.out.println(nums.indexOf(8));// another meth in List Which is index of()
   
for(Object n :nums){
  int num= (Integer)n;
  System.out.println(num*2);
}



}

}
