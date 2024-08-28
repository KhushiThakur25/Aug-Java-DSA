public class Reverse_Digit1 {
    static void reverseDigit(int n, int rev) {
        if (n == 0) {
            System.out.println("Reverse value is: "+rev);
            return;
        }
        rev = rev * 10 + n % 10;

        reverseDigit(n / 10, rev);
    }

    public static void main(String[] args) {
        reverseDigit(2365, 0);

    }
}
