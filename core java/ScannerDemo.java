import java.util.Scanner;

public class ScannerDemo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // java.util.Scanner ka object
   //ek Scanner object banata hai jo input handle karega.
        System.out.println("enter a number");     
        int num =sc.nextInt(); // user se int input lega
        System.out.println(num);
        sc.close();  // resource close karna good practice hai
    }
}
