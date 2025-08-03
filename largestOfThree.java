public class Largest {
  public static void main(String[] args) {
    int a = 25, b = 78, c = 87;
    int largest = (a > b && a > c) ? a : (b > c ? b : c);
    System.out.println("Largest: " + largest);
  }
}