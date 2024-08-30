public class DecimalToBinary {
    static String deci_bin(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        // System.out.println(n);
        return deci_bin(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        String result = deci_bin(0);
        System.out.println("Value is: " + result);
    }
}
