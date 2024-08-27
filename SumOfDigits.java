public class SumOfDigits {
    public static int sumNumber(int n) {

        if (n == 0) {
            return 0;
        }

        return n % 10 + sumNumber(n / 10);
    }


    // public static int sumNumber(int n,int sum) {

    //     if (n == 0) {
    //         return 0;
    //     }
        // sum  = n%10;
    //     return sum + sumNumber(n / 10);
    // }

    public static void main(String[] args) {
        int result = sumNumber(12345);
        // int result = sumNumber(12345,0);
        System.out.println("Sum of digit is: " + result);
    }
}
