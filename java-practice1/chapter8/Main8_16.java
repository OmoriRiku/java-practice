public class Main8_16 {
  public static void main (String[] args) {
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    
    Matango m1 = new Matango();
    m1.suffix = 'A';
    m1.hp = 50;
    
    Matango m2 = new Matango();
    m2.suffix = 'B';
    m2.hp = 48;
    
    System.out.println("勇者" + h.name + "を生み出しました！");
    System.out.println("モンスター" + m1.suffix + "を生み出しました！");
    System.out.println("モンスター" + m2.suffix + "を生み出しました！");
    
    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}