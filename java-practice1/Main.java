public class Main {
  public static void main(String[] args) {
    System.out.println("名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    
    System.out.println("年齢を入力してください");
    int age = new java.util.Scanner(System.in).nextInt();
    
    System.out.println(age + "歳の" + name + "さん、こんにちは");
  }
}