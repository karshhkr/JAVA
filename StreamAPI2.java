

//Stream API ek functional style API hai jo collections/data ko process karne ke liye use hoti hai.
//tum list, set, array pe filter, map, sort, reduce jaise operations easily kar sakte ho without writing loops.
//lazy evaluation karta hai → matlab calculation tabhi hoti hai jab zarurat ho.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamAPI2 {
   
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5 ,6,7,8);//aList is method which give us a list  
  
Stream<Integer>s1= nums.stream();// accept and contain all the values in arraylist
// it not accefect the nums if perform mutation
 Stream<Integer>s2=s1.filter(n ->n%2==0);// s2 have only new value of even no. because s1 is used so s2 needed


s1.forEach(n -> System.out.println(n));
//s1.forEach(n -> System.out.println(n)); its give run time error we cant reuse the stream 













//   for (int i =0; i<nums.size(); i++){
//     System.out.println(nums.get(i));
//   }





 //nums.forEach(n->System.out.println(n));// throgh lamda we can assign n and perform any method 
  
    }
}
