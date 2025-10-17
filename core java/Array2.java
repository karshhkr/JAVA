
 import java.util.*;
 public class Array2
{
    public static void main(String[] args) {
        // taking two int size array 
        int nums [][]= new int [3][4]; 


// // jagged array 
// nums[0] = new int[4];
// nums[1] = new int[2];
// nums[2] = new int[5];






          // i  loop fore each rows
        for (int i=0 ;i<3; i++){
            // j loop for each columns
            nums[i] = new int[4]; // initialize each row
            for (int j=0; j<4; j++){
                // printing the array 
                //print in matrix form we give " " space 
                 System.out.print(nums[i][j] + " ");
                nums[i][j] = i + j;
            }
            // after printing i and j comes to new line
             System.out.println();
        }
   

        
        // enhanced for loop is used to iterate through the array

          for (int n[]:nums)
          {
          for(int m:n){
                System.out.print(m + " ");
            } 
            System.out.println();
         }
        
    }
}

            