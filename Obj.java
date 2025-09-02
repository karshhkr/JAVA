

// its a class it has method and variable
class Calculator
{
     //outside the method inside the class we call the variable

    int a;
public int add(int n1, int n2)
{
    int r= n1 + n2;
         return  r;
    }
}



public class Obj
 {
    public static void main(String[] args)
     {
        int num1 =20;
         int num2 =30;
         // class name calculator then reference var name calc to acces the method of calculator and new keyword
Calculator calc = new Calculator();// object creation of calculator type



// call the method

  int result = calc.add(num1, num2); 
  System.out.println(result);
       //int result=num1+num2;
      // System.out.println(result);
}
}