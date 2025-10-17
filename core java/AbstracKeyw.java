// abstract keyword:-
// Ek class jisko object banaya nahi jaa sakta (cannot be instantiated).

// Ye mainly base class (blueprint) hoti hai jisme:

// Abstract methods (without body, only declaration) ho sakte hain.

// Normal methods (with body) bhi ho sakte hain.

// Child classes ko ye abstract methods implement (override) karne padte hain.





abstract class Car {// having Drive () as abstract so class is to be abstract
     public abstract void drive();// declaring  abstract method by using abstract keyword
    

      public void playMusic(){
System.out.println("Play music");
      }

}
 class WagonR extends Car{
       public void drive()// it wants to define the drive() or as implemented
     {
System.out.println("Driving");
     }
 }

public class AbstracKeyw{
       public static void main(String[] args) {
            
// cant create obj of abstract class Car
             
       // Car obj = new Car(); ❌ error (abstract class ka object nahi banta)
         
            Car obj = new WagonR(); // refence of abstrcat class WagonR
             obj.drive();
             obj.playMusic();
              
       }
}