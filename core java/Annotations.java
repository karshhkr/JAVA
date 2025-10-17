
class A {
public void showTheDatabBelongsToThisClass(){
    System.out.println("in show A");
}
}
 class B extends A{
@Override // Annotations tells that to overide the parent/interfece class method
public void showTheDatabBelongsToThisClass(){  /// overriding the method of class A
    System.out.println("in show B");
}

 }



public class Annotations {
   public static void main(String[] args) {
     B obj = new B();
     obj. showTheDatabBelongsToThisClass();

   } 


}
