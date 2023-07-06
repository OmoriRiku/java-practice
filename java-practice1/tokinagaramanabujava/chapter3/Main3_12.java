import java.util.Scanner;

public class Main3_12 {
  public static void main(String[] args) {
    System.out.print("実数a:"); double a = new Scanner(System.in).nextDouble();
    System.out.print("実数b:"); double b = new Scanner(System.in).nextDouble();
    
    double max;
    
    if (a > b) {
      max = a;
    } else {
      max = b;
    }
    
    System.out.println("大きいほうの値：" + max);
  }
}