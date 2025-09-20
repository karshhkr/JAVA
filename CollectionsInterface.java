//collection API:- concept  Collection API = Java me ek framework jo data ko store aur manipulate karne ke liye ready-made classes & interfaces provide karta hai.
//Isme mainly interfaces hote hain (Collection, List, Set, Queue, Map) aur unke implementations hote hain (ArrayList, HashSet, LinkedList, HashMap etc.).

//collection  :-interface Ye ek root interface hai jo List, Set, Queue ka parent hai.

//collections   :- class Collections ek utility class hai jo helper methods deti hai jaise:
                  // Collections.sort(list);
                 // Collections.reverse(list);
                // Collections.max(list);

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsInterface {
    public static void main(String[] args) {

 Collection<Integer> nums= new ArrayList<Integer>();// Collection type ka reference bana rahe ho jo ArrayList object ko point kar raha hai.
// array list in which Integer are only stored 

 nums.add(6);
  nums.add(8);
   nums.add(2);


    for ( Object n:nums ){   // foreach loop -> har element n me aayega
         int num= (Integer)n; // object ko Integer me cast kiya
   System.out.println((Integer)n);
    }

}

}
