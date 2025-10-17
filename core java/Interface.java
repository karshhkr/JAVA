//Interface ek pure abstract class jaisa hai.Java me ek blueprint hota hai jo 100% abstraction provide karta tha
//Interface ek pure abstract class jaisa hai.
//Java me ek blueprint hota hai jo 100% abstraction provide karta tha
//Matlab interface me jo method banate ho uska body nahi hota, subclass ko usko implement karna hi padta hai.


// Java me ek class sirf ek class ko extend kar sakti hai (single inheritance).
// 👉 But ek class multiple interfaces implement kar sakti hai.


interface A{  

    int age=23;
    String area= "noida";

    public abstract void show(); // abstract meth so use only in body
    public abstract  void config();// abstract meth so use only in body
}
 class B implements A {// it implemts class  A so method of class is to be defined here
public void show()
{
    System.out.println("in show");
}
 public void config()
 {
    System.out.println("in config");
}
 
 }
public class Interface {
    public static void main(String[] args) {
        A obj;    // refernce obj
        obj = new B();//  Ab obj actually B class ke object ko point kar raha hai. means upcasting
         obj.show();
         obj.config();
          System.out.println(A.area);
    }
}
