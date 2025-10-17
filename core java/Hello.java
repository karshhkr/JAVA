public interface Hello {
    public static void main(String[] args) {

         //int num1 =3;
         // int num2= 10;

        //System.out.println(num1* num2);


      

          float num = 4.7f;

          // by default float is consider as the double so we have to explictly put f with the float value 




         // type casting:-

         float f=7.8f;
         int x = (int)f;
          System.out.println(x);



          // type promotion:-

          // byte range is 256
          byte a = 10;
           byte b = 30;
            
           int result = a*b;
// but here the range is out of byte which is 256 so it will get promoted into integer
          System.out.println(result);

    }
}
