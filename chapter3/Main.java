public class Main {
  
  public static void main (String[] args) {
    System.out.println("ようこそ、占いの館へ");
    
    System.out.println("あなたの名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    
    System.out.println("あなたの年齢を入力してください");
    String ageString = new java.util.Scanner(System.in).nextLine();
    
    int age = Integer.parseInt(ageString);
    
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    
    if (fortune == 1) {
      System.out.println(age + "歳の" + name + "さん、あなたの運気は大吉です。");
    } else if (fortune == 2) {
      System.out.println(age + "歳の" + name + "さん、あなたの運気は中吉です。");
    } else if (fortune == 3) {
      System.out.println(age + "歳の" + name + "さん、あなたの運気は吉です。");
    } else if (fortune == 4) {
      System.out.println(age + "歳の" + name + "さん、あなたの運気は凶です。");
    }
  }
  
}