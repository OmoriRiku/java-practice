// 定数の学習用

public class Constant2 {
  public static void main (String[] args) {
    double pi = 3.14;
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
    System.out.println("パイの半径を倍にします。");
    pi = 10;  // 誤り、代入すべき変数は「pie」
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
  }
}