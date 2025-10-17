
//Jab multiple enum values check karni ho, tab switch-case better hai (cleaner aur fast).


enum Status{
    Running,Failed, Pending, Success;    // constants names
}



   
public class EnumSwitchCase {
     public static void main(String[] args) {
    Status s= Status.Pending;
    
     System.out.println(s.getClass().getSuperclass());//  enum extend class enum in java
     
     switch (s)
     {
        case Running:
        System.out.println("All Good");
        break;  
        case Pending:
          System.out.println("Compelete it");  
          break;
          case Failed:
          System.out.println("Try Again");
            break;
              case Success:
              System.out.println("Try Again");
              break;
default: System.out.println("Done");
break;
     }
    
}
}
