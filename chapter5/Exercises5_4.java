public class Exercises5_4 {
  
  public static void main(String[] args) {
    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積:" + triangleArea + "㎠");
    
    double circleArea = calcCircleArea(5.0);
    System.out.println("円の面積：" + circleArea + "㎠");
  }
  
  public static double calcTriangleArea(double bottom, double height) {
    double triangleArea = (bottom * height) / 2;
    return triangleArea;
  }
  
  public static double calcCircleArea(double radius) {
    final double PI = 3.14;
    double circleArea = (radius * radius * PI);
    return circleArea;
  }
  
}