//  👉 enum (enumeration) ek special data type hai jisme hum fixed set of constants define karte hain.
// Example: Days of the week, Directions, Status (SUCCESS, FAILED, PENDING).
 

enum Status{
    Running,Failed, Pending, Success;    // constants names
}
 public class Enum {
    public static void main(String[] args) {
        int  i=5;

   
   
        // Status s = Status.Pending;
    // System.out.println(s.ordinal());// method ordinal()to get the of status which is (0,1,2,3)

    Status[] ss = Status.values(); // it give array and print all
  for (Status s:ss){//  suing for loop we print all the status and thier order 
    System.out.println(s+" "+ s.ordinal());
  }
}
    
}
