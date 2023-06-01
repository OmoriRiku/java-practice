import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    System.out.println("ようこそ占いの館へ");

    System.out.println("名前を入力してください");
    String name = new Scanner(System.in).nextLine();

    System.out.println("年齢を入力してください");
    String ageString = new Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);

    int fortune = new Random().nextInt(4);
    fortune++;

    System.out.print(age + "歳の" + name + "さん、あなたの運気は：");

    switch(fortune) {
      case 1 :
        System.out.print("大吉");
        break;
      case 2 :
        System.out.print("中吉");
        break;
      case 3 :
        System.out.print("吉");
        break;
      case 4 :
        System.out.print("凶");
        break;
    };

    System.out.println("です");
  }
}