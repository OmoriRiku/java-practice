public class Main {
  public static void main(String[] args) {
    int[] scores = new int[] {27, 37, 47, 50, 57};
    int count = 0;
    
    for (int value : scores) {
      if (value >= 50) {
        count++;
      }
    }
    
    System.out.println("50点以上の科目：" + count);
  }
}