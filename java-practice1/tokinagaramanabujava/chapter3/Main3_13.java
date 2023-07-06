import java.util.Scanner;

public class Main3_13 {
  public static void main(String[] args) {
    System.out.print("整数a:"); int a = new Scanner(System.in).nextInt();
    System.out.print("整数b:"); int b = new Scanner(System.in).nextInt();
    
    int diff;
    if (a > b) {
      diff = a - b;
    } else {
      diff = b - a;
    }
    
    System.out.println("それらの差は" + diff + "です。");
  }
}