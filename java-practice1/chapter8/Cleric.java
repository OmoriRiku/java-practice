public class Cleric {
  String name;
  
  int hp = 50;
  final int MAX_HP = 50;
  
  int mp = 10;
  final int MAX_MP = 10;
  
  public void selfAid() {
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println(this.name + "はMPを5消費した！");
    System.out.println(this.name + "のHPが" + this.hp + "に回復した！");
  }
  
  public int pray(int sec) {
    System.out.println(this.name + "は、" + sec + "秒天に祈った！");
    int recover = new java.util.Random().nextInt(3) + sec;
    int recoverActual = Math.min(this.MAX_HP - this.mp, recover);
    System.out.println("MPが" + recoverActual + "回復した！");
    return recoverActual;
  }
}