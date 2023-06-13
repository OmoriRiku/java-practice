public class Exercises5_2 {
  
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
  
  public static void main(String[] args) {
    email("お元気ですか", "福岡県福岡市東区箱崎", "お久しぶりです。");
  }
}