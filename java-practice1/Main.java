public class Main {
  public static void main(String[] args) {
    int count = new java.util.Random().nextInt(10) + 1;
    
    System.out.println("数値を入力してください");
    for (int i = 0; i < 5; i++) {
      int input = new java.util.Scanner(System.in).nextInt();
      
      if (count == input) {
        System.out.println("アタリ！");
        break;
      } else {
        System.out.println("違います。");
        if (input > count) {
          System.out.println("小さな値です。");
        } else if (input < count) {
          System.out.println("大きな値です。");
        }
      }
    }
    
    System.out.println("終了します。");
  }
}