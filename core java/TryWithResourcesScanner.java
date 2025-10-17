

// Java 7 me introduce hua tha.
// Normal try-catch me jab tum koi resource (like Scanner, BufferedReader, FileReader, Connection, etc.) use karte ho, to hamesha close() manually call karna padta hai.
// Agar tum close karna bhool gaye → resource leak ho jata hai (memory/file handle release nahi hota).
// 👉 try-with-resources automatic resource ko close kar deta hai jab block khatam ho jata hai.

import java.util.Scanner;

public class TryWithResourcesScanner {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // yaha declare kiya
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } // yaha Scanner automatically close ho gaya
    }
}

