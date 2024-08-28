public class Reverse_number_recursion {
    static int reverseDigit(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + n % 10;
        return reverseDigit(n / 10, rev);
    }

    public static void main(String[] args) {
        int result = reverseDigit(2365, 0);
        System.out.println("Reverse of value is: " + result);
    }
}
