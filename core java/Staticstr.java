class Mobile
{
    String brand;
    int price;
    static String name;// without having idv variable  for every obj we have static variable for all the obj
    //so if we change the variable it will show for all the obj

    static{      //static variable
name = "phone";// it would call static block once when class is loaded
System.out.println("in static block");
}

 public Mobile(){// constructor
     brand=" ";
     price=200;
     name = "phone";
     
 }

     public void show ()
     {
System.out.println(brand+" : "+ price + " :" + name);
     }


public static void show1()// static method(insid a class mobile)
{
    System.out.println("in sattic method");
}
}
 public class Staticstr {
    public static void main(String[] args) 
    {
        Mobile obj1 = new Mobile();
        obj1.brand= "apple";
        obj1.price=1500;
        Mobile.name="SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand= "samsung";
        obj2.price=1400;
        Mobile.name="SmartPhone";


Mobile.name= "Phone";// we can acces through class name  
        obj1.name = "Phone";// here we use the static variable that change the  variable for all obj
         obj1.show();
         obj2.show();
                   Mobile.show1(); //claling Static method 
         
    }
}
