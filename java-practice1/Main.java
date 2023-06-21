public class Main {
  public static void main(String[] args) {
    int[] scores = {30, 40, 50, 66, 40};
    int count = 0;
    
    for (int value : scores) {
      if (value >= 50) {
        count++;
      }
    }
    
    System.out.println(count);
  }
}