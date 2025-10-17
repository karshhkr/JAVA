class Human
{
 private int age ;// this var is access in same class outside the clsss not 
private String name ;

public Human(){// constructor same name as class name dont return 
String name = "kiwi";
age = 28;
// System.out.println("in constructor");

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

public class Encap {
    public static void main(String[] args) {
        Human obj = new Human();// obj creation 
  Human obj1 = new Human();// obj creation 

        obj.setName("utkarsh");// set the value through methods
        obj.setAge(18);
 System.out.println(obj.getName()+" : "+obj.getAge());// fetch the data with methods
    }
}
