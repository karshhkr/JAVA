/// it take only one method 
@FunctionalInterface // annotations to make 
interface A {
    void show();// only one method  in InterfaceFunctional
}


// class B implements A {
// public void show()
// {
//     System.out.println("in show ");
// }
// }

    

public class InterfaceFunctional {
    public static void main(String[] args) {
        A obj = new A(){  // using the Annonymous Inner Class
 public void show()
{
    System.out.println("in show ");
}
        };
         obj.show();

    }
}
