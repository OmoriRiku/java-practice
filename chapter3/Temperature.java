public class Temperature {
  public static void main (String[] args) {
    int temp = 26;
    do {
      temp--;
      System.out.println("温度を一度下げました。");
    } while (temp > 25);
  }
}