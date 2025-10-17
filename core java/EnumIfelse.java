
// through enum condindintion can be pass through if else
enum Status{
    Running,Failed, Pending, Success;    // constants names
}


public class EnumIfelse { 
    public static void main(String[] args) {
    Status s= Status.Pending;

     if (s==Status.Running){
System.out.println("All Good");
     }
      else if(s==Status.Failed){
        System.out.println("Try Again");
      }
       else if(s==Status.Pending){
        System.out.println("Compelete it");
       }
        else if (s==Status.Success){
            System.out.println("Congratulations");
        }
}
    
}
