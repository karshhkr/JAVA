 
 
 //tum aur threads banate ho, to program ek hi waqt me multiple tasks concurrently kar sakta hai.
 

 class A extends Thread{  // extends thread
public void run(){       // run meth loop to print hii 10 time
     for (int i =1; i<=10; i++){
    System.out.println("hii");
    try {
        Thread.sleep(10);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
     }
}
 }

class B extends Thread {   // extends thread
    public void run(){      //  run() thread ka task ko loop to print hii 10 time     
        for( int i =1; i<=10;i++){
            System.out.println("hello");
             try {
        Thread.sleep(10);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block

        e.printStackTrace();
    }
        }
    }
}






//Thread = ek lightweight process.
//Ek program ke andar ek se zyada threads ho sakte hain jo parallel / concurrently kaam karte hain.
public class Threads {//Threads ka use hota hai jab tumhe multitasking karni ho ek hi program ke andar.
    public static void main(String[] args) {
          
         A obj1 = new A();
         B obj2 = new B();

           obj1.start();// run method excetues
            try{
            Thread.sleep(2);
            } catch(InterruptedException e){
                  e.printStackTrace();
            }
               obj2.start();




    }
}
