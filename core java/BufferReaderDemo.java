
import java.io.BufferedInputStream;
import java.io.BufferedReader;   //fast text reading ke liye
import java.io.IOException;//input/output ke waqt error ho sakta hai, isko handle karna zaroori hai.
import java.io.InputStreamReader; //bytes ko characters me convert karta hai.

public class BufferReaderDemo{ //fast text reading ke liye
     public static void main(String[] args) throws IOException {
      
        System.out.println("Enter a number");
        InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader bf = new  BufferedReader (in);
       int num = Integer.parseInt(bf.readLine());
       System.out.println(num);
       bf.close();
     }

}