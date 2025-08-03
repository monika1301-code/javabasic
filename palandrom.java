public class PalindromeNumber {
  public static void main(String[] args) {
    int num = 121, reversed = 0, temp = num;
    while (temp > 0) {
      int digit = temp % 10;
      reversed = reversed * 10 + digit;
      temp /= 10;
    }
    System.out.println(num + " is " + (reversed == num ? "a Palindrome" : "not a Palindrome"));
  }
}