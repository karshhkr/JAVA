class Comp
{
   public  void  playMusic()
   {
System.out.println("playing music.... ");
   }


public String getMeAPen(int cost)
{
     if (cost>=10)
         return "Pen";
    else 
         return "Nothing";
}

}

public class Obj2 {
    // main is the method 
 public static void main(String[] args) 
 {
    Comp obj  = new Comp();
     obj.playMusic();
     String str =  obj.getMeAPen(3);
     // asking for pass integer value and return string so put that in string
System.out.println(str);
    

 }   
}
