public class Omikuzi1 {
  public static void main (String[] args) {
    int fortune = new java.util.Random().nextInt(4) + 1;
    switch (fortune) {
      case 1:
        System.out.println("大吉");
        break;
      case 2:
        System.out.println("中吉");
        break;
      case 3:
        System.out.println("吉");
        break;
      default:
        System.out.println("凶");
    }
  }
}