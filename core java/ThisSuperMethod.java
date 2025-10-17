class A extends Object // superClass   // every class in java extends Object class
{

     public A(){    // constructor


         super();     // every constructor has this method
                        // it call the default constructor  annd after that execute B constructor

        System.out.println( "in A");
     }


      public A(int n){      // paarmetrised constructor  

       


        super();   // every constructor has this method
        System.out.println("in A int ");
      }
}


 class B  extends A   //sub class 
 {
public B(){  // constructor




    super();   // every constructor has this method
               // this method means calling the constructor of the super classs the default constructor
System.out.println("in B");
}


 public B(int n) {   // paarmetrised constructor   


   // this() calling the constructor of class B  and  then super() it call Constructor of A  and then B


   
   super(n);  // by passing the parameter we can get the paramaterized constructor of super class A then sub class B
    System.out.println("in B int");
 }


 }

 class ThisSuperMethod
{
public static void main(String[] args) {

   // B obj = new B();  //not passing any value here calling a default constructor 
   B obj = new B (5);  // this is the parameterized constructor and will call it which take int 
                             // calling the constructor B
}
}