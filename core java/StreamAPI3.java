

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
 public class StreamAPI3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
   
//    for(int i =0; i<nums.size();i++){
//     System.out.println(nums.get(i));
//    }
   
   
   
//    for(int n:nums){
//     System.out.println(n);
//    }


   
// nums.forEach(n ->System.out.println(n));
 Consumer<Integer>con = new Consumer <Integer>(){// its an functional interface where we create an obj 


    public void accept(Integer n){ //and the obj con is having an method call accept
// accept an accept the number 
 System.out.println(n);
}
 };

// Consumer<Integer>con=n ->System.out.println(n); can be done in this way to because of lambda Exp. 


nums.forEach(con);






    }
}
