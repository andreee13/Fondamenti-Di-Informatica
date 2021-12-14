public class QuadraticEquation {

  final double a, b, c;

  public QuadraticEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getSolution1() {
    return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
  }

  public double getSolution2() {
    return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
  }

  public boolean hasSolutions() {
    return (Math.pow(b, 2) - (4 * a * c)) >= 0;
  }

}
