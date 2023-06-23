public class Main3_3 {
  public static void main(String[] args) {
    int isHungry = 1;
    String food = "チャーハン";
    
    System.out.println("こんにちは");
    
    System.out.println(isHungry == 0 ? "お腹いっぱいです" : "はらぺこです");
    
    if (isHungry == 1) {
      System.out.println(food + "をいただきます");
    }
    
    System.out.println("ごちそうさまでした");
  }
}