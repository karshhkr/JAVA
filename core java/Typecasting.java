
 class A{
public void show1()
    {
        System.out.println("in show A");
    }

      }
class B extends  A{
public void show2(){
    System.out.println("in show B");
}
                   }
class Typecasting {
 public static void main(String[] args) {
   
 // A obj = new B(); // refernce of super class and obj of sub class 
   
 A obj = (A) new B();   //upcasting // we just typecast the objB of sub class with ObjA of superclass
obj.show1();// we cant call show2() becausse we take reference of A its doesnt know B exist


 B  obj1 =  (B) obj; // downcasting
  // here  what we do is we  take the type b when its assign  and we down casting to child class from parent class

  obj1.show2(); // now we can call the the show2() meth
}

}
