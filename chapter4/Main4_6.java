public class Main4_6 {
  public static void main (String[] args) {
    int[] array = {1, 2, 3};
    array = null;
    array[0] = 10;
    
    System.out.println(array[0]);
  }
}