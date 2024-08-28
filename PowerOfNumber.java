public class PowerOfNumber {
    static void powerNumber(int n, int p, int result) {
        if (p == 0) {
            System.out.println("Power is: " + result);
            return;
        }
        result = result * n;
        powerNumber(n, p - 1, result);
    }
    // static int powerNumber(int n, int p) {
    // if (p == 0) {
    // return 1;
    // }
    // return n * powerNumber(n, p - 1);
    // }

    public static void main(String[] args) {
        // int result = powerNumber(2, 3);
        // System.out.println("Power is: " + result);

        powerNumber(2, 3, 1);
    }
}
