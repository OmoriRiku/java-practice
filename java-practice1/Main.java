public class Main {
  public static void main(String[] args) {
    int season = new java.util.Scanner(System.in).nextInt();
    
    switch (season) {
      case 3:
      case 4:
      case 5:
        System.out.println("春です");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("夏です。");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("秋です。");
        break;
      case 12:
      case 1:
      case 2:
        System.out.println("冬です。");
        break;
      default:
        System.out.println("1~12の数値を入力してください");
        break;
    }
  }
}