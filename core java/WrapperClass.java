 class Wrapperclass{
  // collections framework (ArrayList,Hashmap) primitiveobj ko store nhi krte isliye obj ko store krte hai 
   public static void main(String[] args) {


     int num=7;  // to put this value in class type or obj type
  Integer num1 = 8; // boxing -: we assiging value Int class type where we take the primitive value and storing in wrrpper obj
   
  
  // Integer num1=num;      autoboxing:-  its convert automattically       


   
int num2 = num1.intValue();//  Unboxing:-- geting value from obj type to primitive type

  // int num2=  num1; // auto unboxing
 System.out.println(num2);
}


 }
