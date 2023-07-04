public class Main {
  public static void main(String[] args) {
    int[] scores = new int[5];
    
    System.out.println("数値を" + scores.length + "入力してください");
    for(int i = 0; i < scores.length; i++) {
      scores[i] = new java.util.Scanner(System.in).nextInt();
    }
    
    System.out.println("出力します");
    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
    }
  }
}