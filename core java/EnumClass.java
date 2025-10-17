 enum Laptop{
    mackbook(2000),Acer(1000),Asus(1800),Dell(1900);// all are obj and there is constructor where we pass values inside  passing 

private int prices;  //constructor that sets the price for each enum constant.

private Laptop(int prices) {
    this.prices = prices;
    
}

public int getPrices() {
    return prices;
}

public void setPrices(int prices) {
    this.prices = prices;
}

 }
 
 
 
 public class EnumClass{
public static void main(String[] args) {
    // Laptop lap= Laptop.mackbook;
    // System.out.println(lap+": "+ lap.getPrices());


for(Laptop lap: Laptop.values()){// to print the prices of all laptop we uses the for loop 
System.out.println(lap+": "+ lap.getPrices());// values() meth to print all the values


}



}
 }