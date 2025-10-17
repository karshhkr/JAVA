public class TryCatchExcep {

    public static void main(String[] args) {

         int i =2;
         int j=0;

          int nums[]= new int[5];

         try {
            j=19/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);//exception because taking index out of array which is 5 so it 
         }
         catch(ArithmeticException e){  // only excetues when there is try
System.out.println("Something wrong");
         }

         catch(ArrayIndexOutOfBoundsException e){ // means ArrayIndexOutOfBoundsException Ye exception tab hota hai jab aap array me aise index se access karte ho jo valid range me nahi hai.
System.out.println("Something Fishy");
         }

          System.out.println(j);
          System.out.println("bye");
    }
}