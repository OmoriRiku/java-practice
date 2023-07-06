import java.util.Scanner;

public class Main3_14 {
  public static void main(String[] args) {
    System.out.print("整数A:"); int a = new Scanner(System.in).nextInt();
    System.out.print("整数B:"); int b = new Scanner(System.in).nextInt();
    
    int diff = a > b ? a - b : b - a;
    
    System.out.println(diff <= 10 ? "それらの差は10以下です。" : "それらの差は11以上です。");
  }
}