 final class  Clac{ // so here what happens is we make our class final so no ther can inherit the class Calc 
   final   public void show(){ // so in this also we make method final so it cant be override 
        System.out.println("in Calc Show");
    }
    public void add (int a, int b){
        System.out.println(a+b);
    }
 }
//  class AdvCalc extends Calc{
                                 // here we inherit the class calc but  clac is final class so we camt inherit the class   
//  }
public class FinalMethod {
    public static void main(String[] args) {
        Clac obj= new Clac();
         obj.show();
          obj.add(8, 9);
         

    }
}
