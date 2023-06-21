public class Main {
  public static void main(String[] args) {
    double calcArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積：" + calcArea);
  }
  
  public static double calcTriangleArea(double bottom, double height) {
    double area = ((bottom * height) / 2);
    return area;
  }
}