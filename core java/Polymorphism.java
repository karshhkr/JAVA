// opps concept menas poly means many  morphism means behaviour
//types of poymohephism:- compile time and run time 
                   //ex;- overloading  ex:- overriding
 class A{
public void show()
    {
        System.out.println("in show A");
    }

      }
class B extends  A{
public void show(){
    System.out.println("in show B");
}
                   }
class Polymorphism{
 public static void main(String[] args) {
   // A obj = new B(); // refernce of super class and obj of sub class 
   A obj = new A();
obj.show();

obj = new B();
obj.show();

}


}