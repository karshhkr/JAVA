


public class Array3
{
    public static void main(String[] args) {
        int  nums[][] = new int [3 ][];      // jagged array of 3 rows

        // columns define of each row
        nums [0]=new int [3];//row 0 has 3 columns
        nums [1]=new int [2];// Row 1 -> 2 columns
        nums [2]=new int [4];// Row 2 -> 4 columns


        //traversal
         System.out.println("enter the elements of  jagged array");
        for (int i=0; i<nums.length;i++){

            for(int j=0; j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            //enhanced for loop 
            for (int n[] : nums) {
                for (int m : n) {
                    System.out.print(m + " ");
                }
                System.out.println();
            }
        }
    }
}
