// Streams API Java 8 me introduce hui thi.
// Ye functional style operations allow karta hai collections (List, Set, Map) pe.
// Streams data ko iterate karne ke liye ek pipeline provide karta hai.
// Streams data ko modify nahi karte, original collection immutable rehta hai.







import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        
      List<Integer> nums = Arrays.asList(4,5 ,6,7,8,9,2);//aList is method which give us a list  
     
      int sum=0;// intialize sum
        for(int n :nums){   // what we want to do is even numbers ko double karke sum kar raha hai
        if (n%2==0)// check even
        {
            n= n*2;// mult by 2
             sum=sum+n;
        }
      }
        System.out.println(sum);
    }
}
