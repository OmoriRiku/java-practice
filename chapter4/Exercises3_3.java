public class Exercises3_3 {
  public static void main (String[] args) {
    
    int isHungry = 1;
    String food = "味噌汁";
    
    System.out.println("こんにちは");
    
    System.out.println(isHungry == 0 ? "お腹いっぱいです" : "腹ぺこです");
    
    if (isHungry == 1) {
      System.out.println(food + "をいただきます。");
    }
    
    System.out.println("ごちそうさまでした。");
    
  }
}