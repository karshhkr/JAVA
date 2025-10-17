// inner class :- class has inner class

class A {
     int age;
    public void show(){
System.out.println("in show");
    }



    class B{
public void config (){
System.out.println("in config");
}
    }
}






public class InnerClass {
    
     public static void main(String[] args) {
    A obj= new A();
    obj.show();
     A.B obj1 = obj.new B();// we need the obj of B but its in class A so what we do is We have to call were it belongs which is class A and then obj  A
     obj1.config();
     
     }
}
