 class A{
public void show(){
     for (int i =1; i<=10; i++){
    System.out.println("hii");
     }
}
 }

class B {
    public void show(){
        for( int i =1; i<10;i++){
            System.out.println("hello");
        }
    }
}






//Thread = ek lightweight process.
//Ek program ke andar ek se zyada threads ho sakte hain jo parallel / concurrently kaam karte hain.
public class Threads {//Threads ka use hota hai jab tumhe multitasking karni ho ek hi program ke andar.
    public static void main(String[] args) {
          
         A obj1 = new A();
         B obj2 = new B();

           obj1.show();
               obj2.show();
    }
}
