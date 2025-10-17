class Ab
 {

public void show()
{


    System.out.println("in show A");
}
//  public void config()
//  {
//    System.out.println("in config ");
//  }
 
}
 class Ba extends Ab
 {
     public void show() // here what we do is we override the method show() from the class Ab 
     {                   // so what it will do  is override the  method  show from class Ab
        System.out.println( " in show B");
     }

 }


public class MethOverRiding {
     public static void main(String[] args) {
        Ba obj = new Ba();

        obj.show();
     }
     
    
}
