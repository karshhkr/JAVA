
//  class Student{
//     int roll;
//     int age ;
//      String name ;
// }

 public class Array5 {
    public static void main(String[] args) {
        int nums[]= new int [4];
         nums[0]=4;
           nums[1]=2;
             nums[2]=3;
               nums[3]=10;
              

                // here we use the counter 
            //    for ( int i =0; i<nums.length; i++){
            //     System.out.println(nums[i]);
            //    }



// enhanced for loop


               // for loop give the values and stores it in n from nums array
               //  no iteration no counter  no incrrement 
               // its only iterate tills nums

               for (int n : nums){
                    System.out.println(n);
                }

    }
}
