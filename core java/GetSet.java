 class Human
 {
   private  int age;// instance var  outside the 
    private  String name;
    public int getAge() {// getter method to read   var value 
        return age;
    }
    public void setAge(int age) {// setter method to upadate the var value
        
//         java community me ek naming convention follow hota hai:

// Setter methods me parameter ka naam aur instance variable ka naam same hota hai.

// Aur unko differentiate karne ke liye this use hota hai.
        
        
        this.age  = age;// age (method ka parameter hai jo local var hai)
        //age(class ka instance var hai)


        //  Dono ka naam same hai → compiler confuse ho jaata.
// Isliye this.age likhkar aap compiler ko batate ho:
// 👉 "Bhai, mujhe object ke instance variable ko update karna hai, na ki method ke local variable ko."
//    


 }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
}

 public class GetSet {
    
    // getter setter methods
public static void main(String[] args) {

    Human obj = new Human();// obj create
    obj.setAge(18);// setter ke through value set
      obj.setName("karshhkr");// setter ke through value set
       System.out.println(obj.getAge()+":"+obj.getName());
}
}
