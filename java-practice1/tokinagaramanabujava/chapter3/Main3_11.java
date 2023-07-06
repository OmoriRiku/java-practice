import java.util.Scanner;

public class Main3_11 {
  public static void main(String[] args) {
    System.out.print("点数：");
    int score = new Scanner(System.in).nextInt();
    
    if (0 >= score || score <= 59) {
      System.out.println("不可");
    } else if (60 >= score || score < 90) {
      System.out.println("良");
    } else if (90 >= score || score <= 100) {
      System.out.println("優");
    } else {
      System.out.println("不正な値です。");
    }
  }
}
