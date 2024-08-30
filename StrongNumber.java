public class StrongNumber {
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int sumOfFactorial(int n) {
        if (n == 0) {
            return 0;
        }
        return factorial(n % 10) + sumOfFactorial(n / 10);
    }

    static boolean isStrong(int n) {
        int fact = sumOfFactorial(n);
        return n == fact;
    }

    public static void main(String[] args) {
        int n = 145;
        if (isStrong(n)) {
            System.out.println("Number is Strong..");
        } else {
            System.out.println("Number is not Strong..");
        }
    }
}
