
public class ExcepThrowKeyw  {

    public static void main(String[] args) {

         int i =20;
         int j=0;

         

         try {
            j=19/i;  // 👉 Integer division: 19/20 = 0
            if (j==0) // so j = 0 hoga
        
        
            throw new ArithmeticException( "i dont want to pront zero");
        // 👉 Yahan hum manually exception throw kar rahe hain
                // agar j = 0 hai


         }
         catch(ArithmeticException e){  // only excetues when there is try
j=19/i;
            System.out.println("Something wrong");
         }

         catch(ArrayIndexOutOfBoundsException e){ // means ArrayIndexOutOfBoundsException Ye exception tab hota hai jab aap array me aise index se access karte ho jo valid range me nahi hai.
System.out.println("Something Fishy");
         }

          System.out.println(j);
          System.out.println("bye");
    }
}
