public class Main5_10 {
  // 1つめのaddメソッド
  public static int add(int x, int y) {
    return x + y;
  }
  
  // 2つめのaddメソッド
  public static double add(double x, double y) {
    return x + y;
  }
  
  // 3つめのaddメソッド
  public static String add(String x, String y) {
    return x + y;
  }
  
  public static void main (String[] args) {
    // 1つめのaddの呼び出し
    System.out.println(add(10, 20));
    
    // 2つめのaddの呼び出し
    System.out.println(add(3.5, 2.7));
    
    // 3つめのaddの呼び出し
    System.out.println(add("Hello", "World"));
  }
}