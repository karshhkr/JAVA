import java.util.Arrays;
import java.util.List;

public class StreamAPI4 {
   
    
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5 ,6,7,8);//aList is method which give us a list  
    
    
// we can use stream in one more ways:-



    int result=nums.stream()// it gives me all the value
.filter (n->n%2==0)// it give a new stream and filter according to even
//filter need an obj of predicate  


.map(n -> n*2)// it give a new stream and map
// it needs an obj of fuction and have method apply and its ian fuctional interface



.reduce(0,(c,e)->c+e);// same it will reduce and give new stream



System.out.println(result);




    
    
    }}
