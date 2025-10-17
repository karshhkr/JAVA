

//Agar tumhe ek class ka sirf ek hi baar use karna hai, to alag subclass banane ki zaroorat nahi.
//Instead, tum ek anonymous inner class bana kar override kar sakte ho.


  class A {
    public void show(){
    System.out.println("in show A");    
    }
}

public class InnerAnnonymousClass {
public static void main(String[] args) {

    A obj = new A() //InnerAnnonymousClass start
    {// A is annonymous sub class
        //show() is override

       public void show(){
       System.out.println("in  new show A");    
    }

    };

obj.show();

}
    }


