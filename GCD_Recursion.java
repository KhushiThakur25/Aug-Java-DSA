public class GCD_Recursion {
    static int findGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return findGCD(b % a, a);
    }

    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 48;
        int result = findGCD(num1, num2);
        System.out.println("GCD is: " + result);
    }
}
