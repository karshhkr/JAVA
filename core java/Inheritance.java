

// in Java multiple inheritance  is not implied

class Calc{
    public int add (int n, int m){
        return n+m;

    }
     public int sub (int n, int m){
        return n-m;
     }
     public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
     }
}



 public class Inheritance {
    public static void main(String[] args) {
        
        
        AdvCalc obj = new AdvCalc();  // we inherit the properties of class AdvCalc to this Calc class 


        int r= obj.add(120, 45);
        int r1= obj.sub(46, 48);
         int r2= obj.multi(12, 12);
          int r3= obj.div(18, 6);
         
         System.out.println(r+" "+r1+" "+r2+" "+r3);
    }
}
