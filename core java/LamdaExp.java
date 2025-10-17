
@FunctionalInterface
interface  A {
     void show(int i);

}
 

public class LamdaExp {
    public static void main(String[] args) {
    //      A obj = new A(){

    //    public void show(int i)
    //    {

      A obj =(int i) ->  ///-. lambda expression makes code smaller using this 
  System.out.println("in show "+ i);
   // }
    //    }
         obj.show(5);
       
    }
}
