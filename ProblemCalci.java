import java.util.Scanner;

public interface ProblemCalci {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b =sc.nextInt();
     int sum = sc.nextInt();
     int mul = sc.nextInt();
      int div = sc.nextInt();
      int sub = sc.nextInt();
       
  int sum =a+b;
  int mul =a*b;
  int sub =a-b;
  int div = a/b;

   System.out.println("sum");
   System.out.println("mul");
    System.out.println("div");
     System.out.println("sub");

    }
}
