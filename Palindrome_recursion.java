public class Palindrome_recursion {
    static int reverseDigit(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + n % 10;
        return reverseDigit(n / 10, rev);
    }

    public static void main(String[] args) {
        int n = 1221;
        int result = reverseDigit(n, 0);
        if (n == result) {
            System.out.println("Number is palindrome..");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
}
