
class Human
{
 private int age ;// this var is access in same class outside the clsss not 
private String name ;

public Human(){             // constructor same name as class name dont return 
 name = "kiwi";
age = 18;

// System.out.println("in constructor");
}
 public Human(int a, String n){//  Parameterized constructor
age =a ;
name = n;
 }


 public int getAge()  // to access the obj  we would do with methods   
 {
 return age;

 }    

 public void setAge(int a)// set methods  through setter 
 {
      age=a;

 } 
  public String getName(){  // to access the obj  we would do with methods 
    return name;

  }

  public void setName(String n )
  {
name = n;

  }
  }

public class Constructor {
    public static void main(String[] args) {
        Human obj = new Human();// default constructor call
        Human obj1 = new Human(18,"karshhkr");//  Parameterized constructor  call
       

// obj.setName("utkarsh");// set the value through methods
//         obj.setAge(18);
 System.out.println(obj.getName()+" : "+obj.getAge());// fetch the data with methods
     System.out.println(obj1.getName()+" : "+obj1.getAge());
}
}
