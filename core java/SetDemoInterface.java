
// set Interface  is used to contains the unique value
//Duplicate elements allow nahi karta
//Indexing nahi hoti (tum .get(index) use nahi kar sakte)
//Har Set ke implementation ki apni ordering hoti hai

//1. HashSet :Fastest implementation.Elements unordered hote hain (jis order me daloge, usi order me print ho yeh guarantee nahi hai).
//2. LinkedHashSet: Same as HashSet but insertion order maintain karta hai.
//3. TreeSet: Elements ko sorted order me store karta hai (ascending by default).


import java.util.HashSet;
import java .util.Set;

public class SetDemoInterface {
    public static void main(String[] args) {
        Set <Integer> nums= new HashSet<Integer>();
         nums.add(6);
        nums.add(8);
          nums.add(2);
            nums.add(2);
// nums.add(6) cannot have repeated value

 for ( Integer n:nums ){   // foreach loop -> har element n me aayega
     
   System.out.println(n);
    }

    }
}
